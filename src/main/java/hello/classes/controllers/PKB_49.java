package hello.classes.controllers;

import hello.classes.bodies.PKB_49_bodies;
import hello.classes.elements.Request;
import hello.classes.elements.StringToInfluxDB;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import static hello.classes.utils.Utils.*;
import static hello.classes.utils.Utils.printLogs;

//@RestController
public class PKB_49 {

    private PKB_49_bodies pkb_49_bodies = new PKB_49_bodies();

    @PostMapping("/cd/v1/integration/egr/ex")
    public String cdV1IntegrationEgrEx(HttpServletRequest request, HttpServletResponse response,
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
        response.setHeader("Content-Type", "application/json;charset=utf-8");

        //Добавляем тело для ответа
        String responseBody = pkb_49_bodies.getBodyСdV1IntegrationEgrEx();
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
        stringToInfluxDB.setMethod("POST_/cd/v1/integration/egr/ex");
        stringToInfluxDB.setTimestamp(String.valueOf(System.currentTimeMillis()));
        printLogs("./1386_AccR_REST_logs/logs.txt", stringToInfluxDB.toString());

        return null;
    }

    @PostMapping("/cd/v1/integration/rosstat/egr")
    public String cdV1IntegrationRosstatEgr(HttpServletRequest request, HttpServletResponse response,
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
        response.setHeader("Content-Type", "application/json;charset=utf-8");

        //Добавляем тело для ответа
        String responseBody = pkb_49_bodies.getBodyCdV1IntegrationRosstatEgr();
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
        stringToInfluxDB.setMethod("POST_/cd/v1/integration/rosstat/egr");
        stringToInfluxDB.setTimestamp(String.valueOf(System.currentTimeMillis()));
        printLogs("./1386_AccR_REST_logs/logs.txt", stringToInfluxDB.toString());

        return null;
    }

    @PostMapping("/cd/route/{id}/api/v1.0/IncompleteLeads")
    public String cdRouteIdApiV1IncompleteLeads(HttpServletRequest request, HttpServletResponse response,
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
        response.setHeader("Content-Type", "application/json;charset=utf-8");

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
        stringToInfluxDB.setMethod("POST_/cd/route/{id}/api/v1.0/IncompleteLeads");
        stringToInfluxDB.setTimestamp(String.valueOf(System.currentTimeMillis()));
        printLogs("./1386_AccR_REST_logs/logs.txt", stringToInfluxDB.toString());

        return null;
    }
}
