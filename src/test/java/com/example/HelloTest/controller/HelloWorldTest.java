package com.example.HelloTest.controller;

import com.example.HelloTest.Bo.StudentBusinessService;
import com.example.HelloTest.vo.Student;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class) // Junit5
@WebMvcTest(HelloWorldController.class)
public class HelloWorldTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private StudentBusinessService studentBusinessService;

    @Test
    public void helloWorld() throws Exception {
        // RequestBuilder의 사용
        RequestBuilder requestBuilder =
                MockMvcRequestBuilders.get("/Hello")
                        .accept(MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder)
                            .andExpect(MockMvcResultMatchers.status().isOk()) //200
                            .andExpect(MockMvcResultMatchers.content().string("hello world"))
                            .andReturn();

        // 컨텐츠 타입을 json으로 지정했기 때문에 getContentAsString() 필요하다.
        assertEquals("hello world", result.getResponse().getContentAsString());
    }

    @Test
    public void getStudnetTest() throws Exception {
        // RequestBuilder의 사용
        RequestBuilder requestBuilder =
                MockMvcRequestBuilders.get("/Sample-Student")
                        .accept(MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk()) //200
                .andExpect(MockMvcResultMatchers.content().string("{\"id\":100,\"stdName\":\"Peter\",\"stdAddress\":\"England\"}"))
                .andReturn();

        // 컨텐츠 타입을 json으로 지정했기 때문에 getContentAsString() 필요하다.
        // assertEquals("hello world", result.getResponse().getContentAsString());
    }

    @Test
    public void getStudnetBusinessTest() throws Exception {
        when(studentBusinessService.getStudentDetails()).thenReturn(new Student(100, "Seinivas", "Hyderavad"));
        RequestBuilder requestBuilder =
                MockMvcRequestBuilders.get("/Student-business")
                        .accept(MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk()) //200
                .andExpect(MockMvcResultMatchers.content().string("{\"id\":100,\"stdName\":\"Seinivas\",\"stdAddress\":\"Hyderavad\"}"))
                .andReturn();

        // 컨텐츠 타입을 json으로 지정했기 때문에 getContentAsString() 필요하다.
        // assertEquals("hello world", result.getResponse().getContentAsString());
    }

}
