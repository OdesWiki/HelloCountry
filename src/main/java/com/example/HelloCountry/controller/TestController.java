package com.example.HelloCountry.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@RestController
public class TestController {




    @GetMapping(path = "/test",produces = MediaType.APPLICATION_JSON_VALUE)
    public String test(){
        return "{\"codigoPais\":\"DO\",\"nombre\":\"Republica Dominicana\"}";
    }
}
