package com.example.HelloTest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/Hello")
    public String helloWorld() {
       return "hello world";
    }
}
