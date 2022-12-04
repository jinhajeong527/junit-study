package com.example.HelloTest.Bo;

import com.example.HelloTest.vo.Student;
import com.example.HelloTest.vo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentBusinessService {
    @Autowired
    StudentRepository studentRepository;

    public Student getStudentDetails() {
        return new Student(100, "Seinivas", "Hyderavad");
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
