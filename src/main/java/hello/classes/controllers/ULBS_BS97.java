package hello.classes.controllers;

import hello.classes.bodies.ULBS_BS97_bodies;
import hello.classes.elements.Request;
import hello.classes.elements.StringToInfluxDB;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import static hello.classes.utils.Utils.*;
import static hello.classes.utils.Utils.printLogs;

//@RestController
public class ULBS_BS97 {

    private ULBS_BS97_bodies ulbs_bs97_bodies = new ULBS_BS97_bodies();

    @PostMapping("/soa-infra/services/bo/NotificationBOReqAV1/SendMessageBySMSBOReqAV1Impl_client_ep")
    public String getNotificationSMS(HttpServletRequest request, HttpServletResponse response,
                                       @RequestHeader Map<String, String> headers, @RequestBody(required = false) String body){

        //фиксируем время поступления сообщения
//        long timeStart = System.currentTimeMillis();

        //debug
        //наполнение объекта Request для запроса и записываем в файл
//        Request requestLog = new Request();
//        if(body != null){
//            body = body.replaceAll("\n|\r\n","");
//        }
//        fillRequest(requestLog, request, headers, body);
//        printLogs("./1386_SMEAccountRequestSBOS_REST_logs/logs.txt", requestLog.toString());

        //Добавляем заголовки для ответа
        response.setHeader("Content-Type", "text/xml;charset=utf-8");

        //Добавляем тело для ответа
        String responseBody = ulbs_bs97_bodies.getBodyGetNotificationSMS();
        try {
            response.getWriter().write(responseBody);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        pause(300); //Пауза по умолчанию
        pause(450); //x1.5

        //debug
        //наполнение объекта Request для ответа и записываем в файл
//        Request responseLog = new Request();
//        fillResponse(responseLog, requestLog, response);
//        responseLog.setBody(responseBody);
//        printLogs("./1386_SMEAccountRequestSBOS_REST_logs/logs.txt", responseLog.toString());

        //Записываем в файл для дальнейшей отправки в InfluxDB
        StringToInfluxDB stringToInfluxDB = new StringToInfluxDB();
        stringToInfluxDB.setMethod("POST_/soa-infra/services/bo/NotificationBOReqAV1/SendMessageBySMSBOReqAV1Impl_client_ep");
        stringToInfluxDB.setTimestamp(String.valueOf(System.currentTimeMillis()));
        printLogs("./1386_AccR_REST_logs/logs.txt", stringToInfluxDB.toString());

        return null;
    }

    @PostMapping("/soa-infra/services/bo/NotificationBOReqAV1/SendMessageByEMailBOReqAV1Impl_client_ep")
    public String getNotificationEMAIL(HttpServletRequest request, HttpServletResponse response,
                                     @RequestHeader Map<String, String> headers, @RequestBody(required = false) String body){

        //фиксируем время поступления сообщения
//        long timeStart = System.currentTimeMillis();

        //debug
        //наполнение объекта Request для запроса и записываем в файл
//        Request requestLog = new Request();
//        if(body != null){
//            body = body.replaceAll("\n|\r\n","");
//        }
//        fillRequest(requestLog, request, headers, body);
//        printLogs("./1386_SMEAccountRequestSBOS_REST_logs/logs.txt", requestLog.toString());

        //Добавляем заголовки для ответа
        response.setHeader("Content-Type", "text/xml;charset=utf-8");

        //Добавляем тело для ответа
        String responseBody = ulbs_bs97_bodies.getBodyGetNotificationEMAIL();
        try {
            response.getWriter().write(responseBody);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        pause(300); //Пауза по умолчанию
        pause(450); //x1.5

        //debug
        //наполнение объекта Request для ответа и записываем в файл
//        Request responseLog = new Request();
//        fillResponse(responseLog, requestLog, response);
//        responseLog.setBody(responseBody);
//        printLogs("./1386_SMEAccountRequestSBOS_REST_logs/logs.txt", responseLog.toString());

        //Записываем в файл для дальнейшей отправки в InfluxDB
        StringToInfluxDB stringToInfluxDB = new StringToInfluxDB();
        stringToInfluxDB.setMethod("POST_/soa-infra/services/bo/NotificationBOReqAV1/SendMessageByEMailBOReqAV1Impl_client_ep");
        stringToInfluxDB.setTimestamp(String.valueOf(System.currentTimeMillis()));
        printLogs("./1386_AccR_REST_logs/logs.txt", stringToInfluxDB.toString());

        return null;
    }

    @PostMapping("/soa-infra/services/sbos/OrganizationSMEOnboardingSBOSReqA/organizationsmeonboardingsbosreqa_process_client_ep_ep")
    public String getOrganization(HttpServletRequest request, HttpServletResponse response,
                                     @RequestHeader Map<String, String> headers, @RequestBody(required = false) String body){

        //фиксируем время поступления сообщения
//        long timeStart = System.currentTimeMillis();

        //debug
        //наполнение объекта Request для запроса и записываем в файл
//        Request requestLog = new Request();
//        if(body != null){
//            body = body.replaceAll("\n|\r\n","");
//        }
//        fillRequest(requestLog, request, headers, body);
//        printLogs("./1386_SMEAccountRequestSBOS_REST_logs/logs.txt", requestLog.toString());

        //Добавляем заголовки для ответа
        response.setHeader("Content-Type", "text/xml;charset=utf-8");

        //Добавляем тело для ответа
        String responseBody = ulbs_bs97_bodies.getBodyGetOrganization();
        try {
            response.getWriter().write(responseBody);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        pause(300); //Пауза по умолчанию
        pause(450); //x1.5

        //debug
        //наполнение объекта Request для ответа и записываем в файл
//        Request responseLog = new Request();
//        fillResponse(responseLog, requestLog, response);
//        responseLog.setBody(responseBody);
//        printLogs("./1386_SMEAccountRequestSBOS_REST_logs/logs.txt", responseLog.toString());

        //Записываем в файл для дальнейшей отправки в InfluxDB
        StringToInfluxDB stringToInfluxDB = new StringToInfluxDB();
        stringToInfluxDB.setMethod("POST_/soa-infra/services/sbos/OrganizationSMEOnboardingSBOSReqA/organizationsmeonboardingsbosreqa_process_client_ep_ep");
        stringToInfluxDB.setTimestamp(String.valueOf(System.currentTimeMillis()));
        printLogs("./1386_AccR_REST_logs/logs.txt", stringToInfluxDB.toString());

        return null;
    }
}
