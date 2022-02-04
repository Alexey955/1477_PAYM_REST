package hello.classes.controllers;

import hello.classes.bodies.UKiS_1410_bodies;
import hello.classes.elements.Request;
import hello.classes.elements.StringToInfluxDB;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

import static hello.classes.utils.Utils.*;

//@RestController
public class UKiS_1410 {

    private UKiS_1410_bodies uKiS_1410_bodies = new UKiS_1410_bodies();

    @GetMapping("api/certificate/byparams")
    public String getCertificate(HttpServletRequest request, HttpServletResponse response,
                             @RequestHeader Map<String, String> headers, @RequestBody(required = false) String body){

        //фиксируем время поступления сообщения
//        long timeStart = System.currentTimeMillis();

        //debug; наполнение объекта Request для запроса и записываем в файл
        Request requestLog = new Request();
        fillRequest(requestLog, request, headers, "false", body);
        printLogs("./1477_PAYM_REST_logs/logs.txt", requestLog.toString());

        //Добавляем заголовки для ответа
        response.setHeader("Content-Type", "application/json;charset=utf-8");

        //debug; Добавляем заголовки для ответа
//        setHeaderFromFile("./Header_getSession_debug.txt", response);

        //Добавляем тело для ответа
        String responseBody = uKiS_1410_bodies.getBodyGetCertificate();
        try {
            response.getWriter().write(responseBody);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //debug; Добавляем тело для ответа
//        String bodyStr = setBodyFromFile("./Body_getCertificate_debug.txt", response);

        pause(300); //Из требований
//        pause(45); //x1.5

//        responseLog.setBody(responseBody);

        //debug; наполнение объекта Request для ответа и записываем в файл
        Request responseLog = new Request();
        fillResponse(responseLog, requestLog, response, "false", responseBody);
        printLogs("./1477_PAYM_REST_logs/logs.txt", responseLog.toString());

        //Записываем в файл для дальнейшей отправки в InfluxDB
//        StringToInfluxDB stringToInfluxDB = new StringToInfluxDB();
//        stringToInfluxDB.setMethod("GET_/session/{sessionId}/SMBIB/default");
//        stringToInfluxDB.setTimestamp(String.valueOf(System.currentTimeMillis()));
//        printLogs("./1477_PAYM_REST_logs/logs.txt", stringToInfluxDB.toString());

        return null;
    }
}
