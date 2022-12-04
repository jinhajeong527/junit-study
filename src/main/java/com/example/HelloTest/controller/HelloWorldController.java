package com.example.HelloTest.controller;

import com.example.HelloTest.vo.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/Hello")
    public String helloWorld() {
       return "hello world";
    }
    @GetMapping("/Sample-Student")
    public Student getStudentDetails() {
        return new Student(100, "Peter", "England");
    }
}
