package hello.classes.controllers;

import hello.classes.bodies.KOTP_1479_bodies;
import hello.classes.elements.Request;
import hello.classes.elements.StringToInfluxDB;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static hello.classes.utils.Utils.*;
import static hello.classes.utils.Utils.printLogs;

@RestController
public class KOTP_1479 {

    private KOTP_1479_bodies kotp_1479_bodies = new KOTP_1479_bodies();

    @PostMapping("/api/v1/calculation")
    public String postCalculation(HttpServletRequest request, HttpServletResponse response,
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
        //setHeaderFromFile("./Header_postValidate_debug.txt", response);

        //генерируем timestamp
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'.000000+03:00'");
        String timestampResult = dateFormat.format(new Date());

        //получаем doc_no из тела запроса
        Pattern pattern = Pattern.compile("\"doc_no\":\"(.*?)\"");
        Matcher matcher = pattern.matcher(body);
        matcher.find();
        String doc_no = body.substring(matcher.start() + 10, matcher.end() - 1);

        //получаем doc_date из тела запроса
        pattern = Pattern.compile("\"doc_date\":\"(.*?)\"");
        matcher = pattern.matcher(body);
        matcher.find();
        String doc_date = body.substring(matcher.start() +12, matcher.end() - 1);

        //получаем order_id из тела запроса
        pattern = Pattern.compile("\"order_id\":\"(.*?)\"");
        matcher = pattern.matcher(body);
        matcher.find();
        String order_id = body.substring(matcher.start() + 12, matcher.end() - 1);

        //устанавливаем castomer_tarrif
        String castomer_tarrif = "6235255";

        //Добавляем тело для ответа
        String responseBody = kotp_1479_bodies.getBodyPostCalculation(timestampResult, doc_no, doc_date, order_id, castomer_tarrif);
        try {
            response.getWriter().write(responseBody);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //debug; Добавляем тело для ответа
//        String bodyStr = setBodyFromFile("./Body_postCalculation_debug.txt", response);

        pause(200); //Из тестов

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
