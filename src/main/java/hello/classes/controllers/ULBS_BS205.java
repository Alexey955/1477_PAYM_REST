package hello.classes.controllers;

import hello.classes.bodies.Auth_center_627_bodies;
import hello.classes.bodies.Session_data_1408_bodies;
import hello.classes.bodies.ULBS_BS205_bodies;
import hello.classes.elements.Request;
import hello.classes.elements.RequestAsync;
import hello.classes.elements.StringToInfluxDB;
import org.apache.http.client.methods.HttpPost;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import static hello.classes.utils.Utils.*;
import static hello.classes.utils.Utils.fillResponse;

//@RestController
//public class ULBS_BS205 extends HandlerInterceptorAdapter {
public class ULBS_BS205 {

    private ULBS_BS205_bodies ulbs_bs205_bodies = new ULBS_BS205_bodies();

//    String EBMID = null;
//    String CreationDateTime = null;
//    String SenderMessageID = null;

    @PostMapping("/soa-infra/services/smeloanssbos/OrganizationAccountSMELoansSBOSReqAV1/GetOrganizationAccountListReqAV1_client_proxy")
    public void bs205GetAccounts(HttpServletRequest request, HttpServletResponse response,
                                   @RequestHeader Map<String, String> headers, @RequestBody(required = false) String body){

        //debug; наполнение объекта Request для запроса и записываем в файл
        Request requestLog = new Request();
        fillRequest(requestLog, request, headers, "false", body);
        printLogs("./1477_PAYM_REST_logs/logs.txt", requestLog.toString());

        //Получаем EBMID из body
        String EBMID = body.substring(body.indexOf("<ns5:EBMID>") + 11, body.indexOf("<ns5:EBMID>") + 47);

        //Получаем CreationDateTime из body
        String CreationDateTime = body.substring(body.indexOf("<ns5:CreationDateTime>") + 22, body.indexOf("<ns5:CreationDateTime>") + 41);

        //Получаем SenderMessageID из body
        String SenderMessageID = body.substring(body.indexOf("<ns5:SenderMessageID>") + 21, body.indexOf("<ns5:SenderMessageID>") + 57);

        //Получаем ID из body
        String ID = body.substring(body.indexOf("<ns4:ID>") + 8, body.indexOf("<ns4:ID>") + 20);

        //Генерируем номера счетов
        String account_prefix = "40701";
        int account_postfix_1 = (Integer.parseInt(ID.substring(1, 10)) - 1 ) * 5 + 1;
        int account_postfix_2 = (Integer.parseInt(ID.substring(1, 10)) - 1 ) * 5 + 2;
        int account_postfix_3 = (Integer.parseInt(ID.substring(1, 10)) - 1 ) * 5 + 3;
        int account_postfix_4 = (Integer.parseInt(ID.substring(1, 10)) - 1 ) * 5 + 4;
        int account_postfix_5 = (Integer.parseInt(ID.substring(1, 10)) - 1 ) * 5 + 5;
        StringBuilder account_result_1 = new StringBuilder();
        StringBuilder account_result_2 = new StringBuilder();
        StringBuilder account_result_3 = new StringBuilder();
        StringBuilder account_result_4 = new StringBuilder();
        StringBuilder account_result_5 = new StringBuilder();
        account_result_1.append(account_prefix);
        for(int i = 0; i < (15 - String.valueOf(account_postfix_1).length()); i++){
            account_result_1.append(0);
        }
        account_result_1.append(account_postfix_1);
        account_result_2.append(account_prefix);
        for(int i = 0; i < (15 - String.valueOf(account_postfix_2).length()); i++){
            account_result_2.append(0);
        }
        account_result_2.append(account_postfix_2);
        account_result_3.append(account_prefix);
        for(int i = 0; i < (15 - String.valueOf(account_postfix_3).length()); i++){
            account_result_3.append(0);
        }
        account_result_3.append(account_postfix_3);
        account_result_4.append(account_prefix);
        for(int i = 0; i < (15 - String.valueOf(account_postfix_4).length()); i++){
            account_result_4.append(0);
        }
        account_result_4.append(account_postfix_4);
        account_result_5.append(account_prefix);
        for(int i = 0; i < (15 - String.valueOf(account_postfix_5).length()); i++){
            account_result_5.append(0);
        }
        account_result_5.append(account_postfix_5);

        pause(30); //По умолчанию

        //Отправляем асинхронный ответ
        new Thread() {
            @Override
            public void run() {

                String responseBody = ulbs_bs205_bodies.getBodyGetAccounts(EBMID, CreationDateTime, SenderMessageID,
                        account_result_1.toString(), account_result_2.toString(), account_result_3.toString(), account_result_4.toString(), account_result_5.toString());

                HttpClient httpClient = new DefaultHttpClient();
                HttpPost httpPost = new HttpPost("http://paym.ls1-genr01-paym-lt01.apps.ls1-genr01.test.vtb.ru/api/v1/paym/accounts/responseAccounts");

                //debug
//                HttpPost httpPost = new HttpPost("http://localhost:8080/bs205/debug");

                sendPostRequest(httpPost, httpClient, responseBody);

                //debug; наполнение объекта RequestAsync для ответа и записываем в файл
                RequestAsync requestAsyncLog = new RequestAsync();
                fillRequestAsync(requestAsyncLog, responseBody, httpPost, requestLog.getId());
                printLogs("./1477_PAYM_REST_logs/logs.txt", requestAsyncLog.toString());

                stop();
            }
        }.start();

        //debug; наполнение объекта Request для ответа и записываем в файл
        Request responseLog = new Request();
        fillResponse(responseLog, requestLog, response, "false", null);
        printLogs("./1477_PAYM_REST_logs/logs.txt", responseLog.toString());
    }

//    private Session_data_1408_bodies session_data_1408_bodies = new Session_data_1408_bodies();

   public String bs205Beat(HttpServletRequest request, HttpServletResponse response,
                             @RequestHeader Map<String, String> headers, @RequestBody(required = false) String body){

       //фиксируем время поступления сообщения
//        long timeStart = System.currentTimeMillis();

        //debug
        //наполнение объекта Request для запроса и записываем в файл
        Request requestLog = new Request();
        if(body != null){
            body = body.replaceAll("\n|\r\n","");
        }
        fillRequest(requestLog, request, headers, "false", body);
        printLogs("./1477_PAYM_REST_logs/logs.txt", requestLog.toString());

        //Добавляем заголовки для ответа
        response.setHeader("Content-Type", "application/json;charset=utf-8");

        pause(300); //По умолчанию

        //debug
        //наполнение объекта Request для ответа и записываем в файл
        Request responseLog = new Request();
//        fillResponse(responseLog, requestLog, response, false);
        responseLog.setBody(null);

//        printLogs("./1477_PAYM_REST_logs/logs.txt", responseLog.toString());

        //Записываем в файл для дальнейшей отправки в InfluxDB
//        StringToInfluxDB stringToInfluxDB = new StringToInfluxDB();
//        stringToInfluxDB.setMethod("GET_/session/{sessionId}/SMBIB/default");
//        stringToInfluxDB.setTimestamp(String.valueOf(System.currentTimeMillis()));
//        printLogs("./1386_AccR_REST_logs/logs.txt", stringToInfluxDB.toString());

        return null;
    }

//    @Override
//    public void afterCompletion(
//            HttpServletRequest request,
//            HttpServletResponse response,
//            Object handler, Exception ex) {
//        // your code
//        System.out.println("WTF");
//    }

}
