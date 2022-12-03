package com.example.HelloTest.add;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AddExampleTest {

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

    //Calculate with empty single
    @Test
    public void calculateSumTestEmpty() {
        AddExample addExample = new AddExample();
        int actualResult = addExample.calculationSum(new int[] {});
        int expectedResult = 0; // 빈 배열을 넘겼기 때문에
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void calculateSumTestOne() {
        AddExample addExample = new AddExample();
        int actualResult = addExample.calculationSum(new int[] {1});
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }
}
