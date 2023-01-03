package com.andrew.sprigbootapp.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @Value("${hello1}")
    private String hello1;

    @GetMapping("/hello")
    public String hello(){
        System.out.println(hello1);
        return "hello";
    }
}
