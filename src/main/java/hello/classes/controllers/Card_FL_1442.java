package hello.classes.controllers;

import hello.classes.bodies.Auth_center_627_bodies;
import hello.classes.bodies.Card_FL_1442_bodies;
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
public class Card_FL_1442 {

    private Card_FL_1442_bodies card_fl_1442_bodies = new Card_FL_1442_bodies();

    @PostMapping("/person/get")
    public String getPersonFL(HttpServletRequest request, HttpServletResponse response,
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
        String responseBody = card_fl_1442_bodies.getBodyGetPersonFL();
        try {
            response.getWriter().write(responseBody);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        pause(300); //По умолчанию
        pause(450); //x1.5

        //debug
        //наполнение объекта Request для ответа и записываем в файл
//        Request responseLog = new Request();
//        fillResponse(responseLog, requestLog, response);
//        responseLog.setBody(responseBody);
//        printLogs("./1386_SMEAccountRequestSBOS_REST_logs/logs.txt", responseLog.toString());

        //Записываем в файл для дальнейшей отправки в InfluxDB
        StringToInfluxDB stringToInfluxDB = new StringToInfluxDB();
        stringToInfluxDB.setMethod("POST_/person/get");
        stringToInfluxDB.setTimestamp(String.valueOf(System.currentTimeMillis()));
        printLogs("./1386_AccR_REST_logs/logs.txt", stringToInfluxDB.toString());

        return null;
    }
}
