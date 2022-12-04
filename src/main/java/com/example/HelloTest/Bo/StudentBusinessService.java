package com.example.HelloTest.Bo;

import com.example.HelloTest.vo.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentBusinessService {
    public Student getStudentDetails() {
        return new Student(100, "Seinivas", "Hyderavad");
    }
}
