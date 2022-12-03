package com.example.HelloTest.mock;

import com.example.HelloTest.CalculateService;
import com.example.HelloTest.add.AddExample;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
// Mockito import
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AddExampleMockTest {
    //서비스 implementaion이 Stub과 함께 테스트 될 수 있는 방법이다.
    @Test
    public void calculateSumTest() {
        AddExample addExample = new AddExample();

        /*
        스텁 서비스는 아래와 같이 작성한다.
        addExample.setCalculateService(new CalculateServiceStub());
        */
        // CalculateService를 위한 mock 서비스를 만듦.
        CalculateService calculateService = mock(CalculateService.class);
        when(calculateService.retrieveSum()).thenReturn(new int[] {1,2,3});
        // 이렇게 하지 않으면 널포인터 익셉션이 떨어진다.
        // AddExample은 비즈니스 클래스이다.
        addExample.setCalculateService(calculateService);
        // 아래 메서드에서 CalculateService 호출하여 사용한다.
        int actualResult = addExample.getSumService();

        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void calculateSumEmptyTest() {
        AddExample addExample = new AddExample();

        CalculateService calculateService = mock(CalculateService.class);
        when(calculateService.retrieveSum()).thenReturn(new int[] {});
        addExample.setCalculateService(calculateService);

        int actualResult = addExample.getSumService();
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void calculateSumSingleTest() {
        AddExample addExample = new AddExample();

        CalculateService calculateService = mock(CalculateService.class);
        when(calculateService.retrieveSum()).thenReturn(new int[] {1});
        addExample.setCalculateService(calculateService);

        int actualResult = addExample.getSumService();
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }
}
