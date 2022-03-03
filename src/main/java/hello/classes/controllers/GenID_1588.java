package hello.classes.controllers;

import hello.classes.elements.Request;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static hello.classes.utils.Utils.*;
import static hello.classes.utils.Utils.printLogs;

@RestController
public class GenID_1588 {
    @PostMapping("/api/v1/template/list")
    public String postTemplateList(HttpServletRequest request, HttpServletResponse response,
                                @RequestHeader Map<String, String> headers, @RequestBody(required = false) String body){

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

        //Добавляем тело для ответа
//        String responseBody = ep_1413_bodies.getBodyPostValidate();
//        try {
//            response.getWriter().write(responseBody);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //debug; Добавляем тело для ответа
//        String bodyStr = setBodyFromFile("./templates/Body_postTemplateList_debug.txt", response);

        //Генерируем id
        Pattern pattern = Pattern.compile("\"string\":\"(..........)\"");
        Matcher matcher = pattern.matcher(body);
        matcher.find();
        String id = body.substring(matcher.start() + 10, matcher.end() - 1);

//        pause(300); //default

//        responseLog.setBody(responseBody);

        //debug; наполнение объекта Request для ответа и записываем в файл
//        Request responseLog = new Request();
//        fillResponse(responseLog, requestLog, response, "false", id);
//        printLogs("./1477_PAYM_REST_logs/logs.txt", responseLog.toString());

        //Записываем в файл для дальнейшей отправки в InfluxDB
//        StringToInfluxDB stringToInfluxDB = new StringToInfluxDB();
//        stringToInfluxDB.setMethod("GET_/session/{sessionId}/SMBIB/default");
//        stringToInfluxDB.setTimestamp(String.valueOf(System.currentTimeMillis()));
//        printLogs("./1477_PAYM_REST_logs/logs.txt", stringToInfluxDB.toString());

        return "[" + id + "]";
    }
}
