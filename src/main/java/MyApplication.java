package test;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.SpringApplication;

@RestController
@SpringBootApplication
public class MyApplication {

    @RequestMapping("/")
    String home() {
        return "С тебя нюдсы";
    }

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}