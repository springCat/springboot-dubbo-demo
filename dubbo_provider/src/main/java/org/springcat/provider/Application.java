package org.springcat.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by springcat on 16/5/6.
 */
@SpringBootApplication
@ImportResource("classpath:spring/dubbo.xml")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        while(true){

        }
    }
}