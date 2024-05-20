package com.example.cookassistant;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class CookAssistantApplication {


    public static void main(String[] args) {
        SpringApplication.run(CookAssistantApplication.class, args);


    }

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

}
