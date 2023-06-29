package com.example.crudapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CrudApplication {


    public static void main(String[] args) {
        SpringApplication.run(CrudApplication.class, args
        );

    }

    @GetMapping("/test")
    public String greeting(){
        return "Hello world";
    }

}




