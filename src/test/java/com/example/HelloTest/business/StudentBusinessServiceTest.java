package com.example.HelloTest.business;

import com.example.HelloTest.Bo.StudentBusinessService;
import com.example.HelloTest.vo.Student;
import com.example.HelloTest.vo.StudentRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
public class StudentBusinessServiceTest {
    @InjectMocks
    private StudentBusinessService studentBusinessService;

    @Mock
    private StudentRepository studentRepository;

    @Test
    public void getAllStudentsTest() {
        when(studentRepository.findAll())
                .thenReturn(Arrays.asList(new Student(10001, "jinha", "seoul"),
                        new Student(10002, "jooyeon", "seoul"),
                        new Student(10003, "eunyoung", "chungcheongdo")));
        List<Student> list = studentBusinessService.getAllStudents();
        assertEquals(10001, list.get(0).getId());
        assertEquals(10002, list.get(1).getId());
        assertEquals(10003, list.get(2).getId());
    }

}
