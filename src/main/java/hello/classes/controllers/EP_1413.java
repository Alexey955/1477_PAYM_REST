package hello.classes.controllers;

import hello.classes.bodies.EP_1413_bodies;
import hello.classes.bodies.Session_data_1408_bodies;
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


@RestController
public class EP_1413 {
    private EP_1413_bodies ep_1413_bodies = new EP_1413_bodies();

    @PostMapping("/api/signature/file/validate")
    public String postValidate(HttpServletRequest request, HttpServletResponse response,
                             @RequestHeader Map<String, String> headers, @RequestBody(required = false) String body){

        //фиксируем время поступления сообщения
//        long timeStart = System.currentTimeMillis();

        //debug; наполнение объекта Request для запроса и записываем в файл
        Request requestLog = new Request();
        fillRequest(requestLog, request, headers, "false", body);
        printLogs("./templates/1477_PAYM_REST_logs/logs.txt", requestLog.toString());

        //Добавляем заголовки для ответа
        response.setHeader("Content-Type", "application/json;charset=utf-8");

        //debug; Добавляем заголовки для ответа
//        setHeaderFromFile("./templates/Header_postValidate_debug.txt", response);

        //Добавляем тело для ответа
//        String responseBody = ep_1413_bodies.getBodyPostValidate();
//        try {
//            response.getWriter().write(responseBody);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //debug; Добавляем тело для ответа
        String bodyStr = setBodyFromFile("./templates/Body_postValidate_debug.txt", response);

        pause(300); //Из требований

//        responseLog.setBody(responseBody);

        //debug; наполнение объекта Request для ответа и записываем в файл
        Request responseLog = new Request();
        fillResponse(responseLog, requestLog, response, "false", bodyStr);
        printLogs("./templates/1477_PAYM_REST_logs/logs.txt", responseLog.toString());

        //Записываем в файл для дальнейшей отправки в InfluxDB
//        StringToInfluxDB stringToInfluxDB = new StringToInfluxDB();
//        stringToInfluxDB.setMethod("GET_/session/{sessionId}/SMBIB/default");
//        stringToInfluxDB.setTimestamp(String.valueOf(System.currentTimeMillis()));
//        printLogs("./1477_PAYM_REST_logs/logs.txt", stringToInfluxDB.toString());

        return null;
    }
}
