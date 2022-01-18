package hello.classes.parsers;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class XMLParser {
    private Document xmlDoc;
    private String xmlStr;

    public XMLParser (String xmlBody) {
        xmlStr = xmlBody.replaceAll("\n|\r", "");
        xmlDoc = stringToDocument(xmlStr);
    }

    public XMLParser (Path path) {
        String xmlStr = null;
        try {
            xmlStr = new String(Files.readAllBytes(path));
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.xmlStr = xmlStr.replaceAll("\n|\r", "");
        xmlDoc = stringToDocument(this.xmlStr);
    }

    public Document getXmlDoc() {
        return xmlDoc;
    }

    public void setXmlDoc(Document xmlDoc) {
        this.xmlDoc = xmlDoc;
    }

    public String getXmlStr() {
        return xmlStr;
    }

    public void setXmlStr(String xmlStr) {
        this.xmlStr = xmlStr;
    }

    // конвертируем XML Document в строку
    public static String documentToString(Document doc) {
        TransformerFactory tFactory = TransformerFactory.newInstance();
        Transformer transfObject;
        try {
            transfObject = tFactory.newTransformer();
            // здесь мы указываем, что хотим убрать XML declaration:
            // тег <?xml ... ?> и его содержимое
            transfObject.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            StringWriter writer = new StringWriter();
            transfObject.transform(new DOMSource(doc), new StreamResult(writer));

            // возвращаем преобразованный  в строку XML Document
            return writer.getBuffer().toString();
        } catch (TransformerException e) {
            e.printStackTrace();
        }

        return null;
    }

    // парсим строку в XML Document
    public static Document stringToDocument(String xmlStr) {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder;
        try {
            docBuilder = builderFactory.newDocumentBuilder();
            // парсим переданную на вход строку с XML разметкой
            return docBuilder.parse(new InputSource(new StringReader(xmlStr)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
//-------------------------------------------------------------------------------------------------------
//  Пример xml:
//      Path path = Paths.get("src\\main\\resources\\test_data\\xml_test.xml");
//      Document doc = new XMLParser(path).getXmlDoc();

//      Node root = doc.getDocumentElement();
//      NodeList books = root.getChildNodes();
//      Node book = books.item(1);
//      NodeList bookProps = book.getChildNodes();
//      Node bookProp = bookProps.item(3);
//      bookProp.setTextContent("My value"); //изменчем содержимое тега
//
//      return bookProp.getChildNodes().item(0).getTextContent(); //возвращаем значение тэга
//      return XMLParser.documentToString(doc); //возвращаем весь xml
//-------------------------------------------------------------------------------------------------------
//  Пример soap:
//      Path path = Paths.get("src\\main\\resources\\test_data\\soap_test.xml");
//      Document doc = new XMLParser(path).getXmlDoc();
//
//      Node root = doc.getDocumentElement();
//      Node body = root.getChildNodes().item(1);
//      Node processResponse = body.getChildNodes().item(1);
//      Node response = processResponse.getChildNodes().item(1);
//      Node direction = response.getChildNodes().item(1);
//      direction.setTextContent("My value"); //изменчем содержимое тега
//
//      return XMLParser.documentToString(doc); //возвращаем весь xml


