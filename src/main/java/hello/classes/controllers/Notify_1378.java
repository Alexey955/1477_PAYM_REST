package hello.classes.controllers;

import hello.classes.bodies.Notify_1378_bodies;
import hello.classes.elements.Request;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static hello.classes.utils.Utils.*;
import static hello.classes.utils.Utils.printLogs;

@RestController
public class Notify_1378 {

    Notify_1378_bodies notify_1378_bodies = new Notify_1378_bodies();

    @PostMapping("/v1/gateway/message")
    public String postGatewayMessage(HttpServletRequest request, HttpServletResponse response,
                                     @RequestHeader Map<String, String> headers, @RequestBody(required = false) String body) {

        //фиксируем время поступления сообщения
//        long timeStart = System.currentTimeMillis();

        //debug; наполнение объекта Request для запроса и записываем в файл
//        Request requestLog = new Request();
//        fillRequest(requestLog, request, headers, "false", body);
//        printLogs("./1477_PAYM_REST_logs/logs.txt", requestLog.toString());

        //Добавляем заголовки для ответа
        response.setHeader("Content-Type", "application/json;charset=utf-8");

        //debug; Добавляем заголовки для ответа
//        setHeaderFromFile("./templates/Header_postTemplateList_debug.txt", response);

//        Добавляем тело для ответа
        String responseBody = notify_1378_bodies.getBodyPostGatewayMessage();
        try {
            response.getWriter().write(responseBody);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //debug; Добавляем тело для ответа
//        String bodyStr = setBodyFromFile("./templates/Body_postGatewayMessage_debug.txt", response);

//        pause(300); //default

//        responseLog.setBody(responseBody);

        //debug; наполнение объекта Request для ответа и записываем в файл
//        Request responseLog = new Request();
//        fillResponse(responseLog, requestLog, response, "false", responseBody);
//        printLogs("./1477_PAYM_REST_logs/logs.txt", responseLog.toString());

        //Записываем в файл для дальнейшей отправки в InfluxDB
//        StringToInfluxDB stringToInfluxDB = new StringToInfluxDB();
//        stringToInfluxDB.setMethod("GET_/session/{sessionId}/SMBIB/default");
//        stringToInfluxDB.setTimestamp(String.valueOf(System.currentTimeMillis()));
//        printLogs("./1477_PAYM_REST_logs/logs.txt", stringToInfluxDB.toString());

        return null;
    }
}
