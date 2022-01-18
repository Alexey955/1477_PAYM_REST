package hello.classes.parsers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//    Описание:
//    1. Берет шаблон из файла
//    2. Создает dom с JSON, записывает его в rootNode
public class JSONParser {

    private JsonNode rootNode;

    public JSONParser (Path path){
        String jsonStr = null;
        try {
            jsonStr = new String(Files.readAllBytes(path));
        } catch (IOException e) {
            e.printStackTrace();
        }

        ObjectMapper mapper = new ObjectMapper();
        try {
            rootNode = mapper.readValue(jsonStr, JsonNode.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public JSONParser (String jsonStr){
        ObjectMapper mapper = new ObjectMapper();
        try {
            rootNode = mapper.readValue(jsonStr, JsonNode.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public JsonNode getRootNode() {
        return rootNode;
    }

    public void setRootNode(JsonNode rootNode) {
        this.rootNode = rootNode;
    }
}
//-------------------------------------------------------------------------------------------------------
//  Пример:
//      Path path = Paths.get("src\\main\\resources\\test_data\\json_test.json");
//      JsonNode rootNode = new JSONParser(path).getRootNode();
//
//      JsonNode childNode =  rootNode.get("user"); //получаем объект user
//      ((ObjectNode) childNode).put("activeClient", "321"); //Меняем значение объекта user
//
//      return String.valueOf(rootNode);
//-------------------------------------------------------------------------------------------------------