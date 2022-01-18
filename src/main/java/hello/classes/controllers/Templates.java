package hello.classes.controllers;

import hello.classes.bodies.Auth_center_627_bodies;
import hello.classes.elements.Request;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

import static hello.classes.utils.Utils.*;
import static hello.classes.utils.Utils.printLogs;

public class Templates {

//Шаблон с ответами из файлов
//    @PostMapping("/person/get")
//    public String getPersonFL(HttpServletRequest request, HttpServletResponse response,
//                              @RequestHeader Map<String, String> headers, @RequestBody(required = false) String body){
//
//        //наполнение объекта Request для запроса
//        Request requestLog = new Request();
//        if(body != null){
//            body = body.replaceAll("\n|\r\n","");
//        }
//        fillRequest(requestLog, request, headers, body);
//
//        //запись в файл
//        printLogs("./1386_SMEAccountRequestSBOS_REST_logs/logs.txt", requestLog.toString());
//
//        //пауза
////        pause(5000);
//
//        //Добавляем заголовки для ответа
//        try {
//            BufferedReader buffReader = new BufferedReader(new FileReader("./Header_getPersonFL_debug.txt"));
//
//            String str = buffReader.readLine();
//            String[] strSplit;
//            if(str != null){
//                while(str != null){
//                    strSplit = str.split("'|'");
//                    response.setHeader(strSplit[0], strSplit[2]);
//                    str = buffReader.readLine();
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        //Добавляем тело для ответа
//        StringBuilder stringBuilder = null;
//        try {
//            BufferedReader buffReader = new BufferedReader(new FileReader("./Body_getPersonFL_debug.txt"));
//
//            String str = buffReader.readLine();
//            if(str != null){
//                stringBuilder = new StringBuilder();
//                while(str != null){
//                    stringBuilder.append(str);
//                    str = buffReader.readLine();
//                }
//                response.getWriter().write(stringBuilder.toString());
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        //наполнение объекта Request для ответа
//        Request responseLog = new Request();
//        fillResponse(responseLog, requestLog, response);
//        //добавить body в объект Request для ответа
//        if(stringBuilder != null){
//            responseLog.setBody(stringBuilder.toString());
//        }else {
//            responseLog.setBody(null);
//        }
//
//        //запись в файл
//        printLogs("./1386_SMEAccountRequestSBOS_REST_logs/logs.txt", responseLog.toString());
//
//        return null;
//    }

    //    Шаблон с ответами из переменных
//    @PostMapping("/files")
//    public String files(HttpServletRequest request, HttpServletResponse response,
//                        @RequestHeader Map<String, String> headers, @RequestBody(required = false) String body) {
//
//        //Генерируем uuid для ответа
//        String uuid = String.valueOf(UUID.randomUUID());
//
//        //наполнение объекта Request для запроса
//        Request requestLog = new Request();
//        if (body != null) {
//            body = body.replaceAll("\n|\r\n", "");
//        }
//        fillRequest(requestLog, request, headers, body);
//
//        //запись в файл
//        printLogs("./1386_SMEAccountRequestSBOS_REST_logs/logs.txt", requestLog.toString());
//
//        //Добавляем заголовки для ответа
//        response.setHeader("Content-Type", "application/json;charset=utf-8");
//
//        //Добавляем тело для ответа
//        String responseBody = "{" +
//                "	\"uuid\": \"" + uuid + "\"," +
//                "	\"name\": \"Заявление о предоставлении услуг.docx\"," +
//                "	\"bucket\": \"main\"," +
//                "	\"folder\": \"ACCR-87\"," +
//                "	\"folderOwner\": \"1386\"," +
//                "	\"type\": \"application/octet-stream\"," +
//                "	\"uploadDate\": \"2021-03-23T08:01:05Z\"," +
//                "	\"hashSum\": \"68b29b01ea994fea0d49b8cb56e41cf6fc706feebd44e9f87c08e5dfae7eb32b\"," +
//                "	\"expirationDate\": null," +
//                "	\"_links\": {" +
//                "		\"self\": {" +
//                "			\"href\": \"https://ts-ecm.k3-omni-tech-tsec.apps.kt-oscp.vtb24.ru/files-info/3b64aa99-380c-4c26-b261-fe198d98aab6\"" +
//                "		}" +
//                "	}" +
//                "}";
//
//        try {
//            response.getWriter().write(responseBody);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        //пауза
//        pause(500);
//
//        //наполнение объекта Request для ответа
//        Request responseLog = new Request();
//        fillResponse(responseLog, requestLog, response);
//        //добавить body в объект Request для ответа
//        responseLog.setBody(responseBody);
//
//        //запись в файл
//        printLogs("./1386_SMEAccountRequestSBOS_REST_logs/logs.txt", responseLog.toString());
//
//        return null;
//    }

//Шаблон ответа с InfluxDB
//private Auth_center_627_bodies auth_center_627_bodies = new Auth_center_627_bodies();

//    @PostMapping("/cd/auth/v1/oauth2/token")
//    public String cdAuthV1Oauth2Token(HttpServletRequest request, HttpServletResponse response,
//                                      @RequestHeader Map<String, String> headers, @RequestBody(required = false) String body){
//
//        HttpClient httpClient = new DefaultHttpClient();
//
//        //фиксируем время поступления сообщения
//        long timeStart = System.currentTimeMillis();
//
//        //debug
//        //наполнение объекта Request для запроса и записываем в файл
////        Request requestLog = new Request();
////        if(body != null){
////            body = body.replaceAll("\n|\r\n","");
////        }
////        fillRequest(requestLog, request, headers, body);
////        printLogs("./1386_SMEAccountRequestSBOS_REST_logs/logs.txt", requestLog.toString());
//
//        //Добавляем заголовки для ответа
//        response.setHeader("Content-Type", "application/json;charset=utf-8");
//
//        //Добавляем тело для ответа
//        String responseBody = auth_center_627_bodies.getBodyCdAuthV1Oauth2Token();
//        try {
//            response.getWriter().write(responseBody);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        //пауза
//        pause(2000);
//
//        //Отправляем данные в InfluxDb
//        sendPostRequest(httpClient, "http://ltefra-mk5035wn.test.vtb.ru:8086/write?db=vasilev_aa_test_db&insert", "1386_AccR_rest_dummies POST_/cd/auth/v1/oauth2/token?client_id\\={guid}&grant_type\\=password=1,response=" + (System.currentTimeMillis() - timeStart));
//
//        //debug
//        //наполнение объекта Request для ответа и записываем в файл
////        Request responseLog = new Request();
////        fillResponse(responseLog, requestLog, response);
////        responseLog.setBody(responseBody);
////        printLogs("./1386_SMEAccountRequestSBOS_REST_logs/logs.txt", responseLog.toString());
//
//        return null;
//    }

//Отправка POST запроса
//    import org.apache.http.client.HttpClient;
//    import org.apache.http.impl.client.DefaultHttpClient;
//    private HttpClient httpClient = new DefaultHttpClient();
//    sendPostRequest(httpClient, "http://ltefra-mk5035wn.test.vtb.ru:8086/write?db=vasilev_aa_test_db&insert", "AccR_1386_rest_dummies POST_/cd/auth/v1/oauth2/token?client_id\\={guid}&grant_type\\=password=1");

}
