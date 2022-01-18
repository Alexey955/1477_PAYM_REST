package hello;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.File;

@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        //создаем папку для логов
//        File f = new File("./1386_SMEAccountRequestSBOS_REST_logs");
//        f.mkdir();

        SpringApplication.run(Application.class, args);
    }
}