package com.example.HelloTest.add;

import stub.CalculateServiceStub;
import stub.CalculateServiceStubEmpty;
import stub.CalculateServiceStubSingle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddExampleStubTest {
    //서비스 implementaion이 Stub과 함께 테스트 될 수 있는 방법이다.
    @Test
    public void calculateSumTest() {
        AddExample addExample = new AddExample();
        // 아래와 같이 해주지 않으면 널포인터 익셉션이 발생한다.
        addExample.setCalculateService(new CalculateServiceStub());

        int actualResult = addExample.getSumService();
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void calculateSumEmptyTest() {
        AddExample addExample = new AddExample();
        // 아래와 같이 해주지 않으면 널포인터 익셉션이 발생한다.
        addExample.setCalculateService(new CalculateServiceStubEmpty());

        int actualResult = addExample.getSumService();
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void calculateSumSingleTest() {
        AddExample addExample = new AddExample();
        // 아래와 같이 해주지 않으면 널포인터 익셉션이 발생한다.
        addExample.setCalculateService(new CalculateServiceStubSingle());

        int actualResult = addExample.getSumService();
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }
}
