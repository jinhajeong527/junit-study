package com.example.HelloTest.add;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class addExampleTest {

    @Test
    public void addMethodTest() {
        // instance를 생성한다.
        AddExample addExample = new AddExample();
        int actualResult = addExample.addMethod(10, 10, 10);
        int expectedResult = 30;
        assertEquals(expectedResult , actualResult);
    }

    @Test
    public void calculateSumTest() {
        AddExample addExample = new AddExample();
        int actualResult = addExample.calculationSum(new int[] {1, 2, 3});
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }
}
