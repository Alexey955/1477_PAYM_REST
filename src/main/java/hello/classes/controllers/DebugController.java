package hello.classes.controllers;

import hello.classes.elements.Request;
import hello.classes.parsers.XMLParser;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.Document;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.UUID;

import static hello.classes.utils.Utils.*;

@RestController
public class DebugController {

    @RequestMapping("/**")
    public String allRequests(HttpServletRequest request, HttpServletResponse response,
                              @RequestHeader Map<String, String> headers, @RequestBody(required = false) String body){

        //debug; наполнение объекта Request для запроса и записываем в файл
        Request requestLog = new Request();
        fillRequest(requestLog, request, headers, "true", body);
        printLogs("./1477_PAYM_REST_logs/logs.txt", requestLog.toString());


        //пауза
//        pause(5000);

        //debug; Добавляем заголовки для ответа
        setHeaderFromFile("./templates/Header_debug.txt", response);

        //debug; Добавляем тело для ответа
        String bodyStr = setBodyFromFile("./templates/Body_debug.txt", response);

        //debug; наполнение объекта Request для ответа и записываем в файл
        Request responseLog = new Request();
        fillResponse(responseLog, requestLog, response, "true", bodyStr);
        printLogs("./1477_PAYM_REST_logs/logs.txt", responseLog.toString());

        return null;
    }

//    @RequestMapping("/bs205/debug")
//    public String bs205Debug(HttpServletRequest request, HttpServletResponse response,
//                              @RequestHeader Map<String, String> headers, @RequestBody(required = false) String body){
//
//        return null;
//    }
}