package com.example.HelloTest.mock;

import com.example.HelloTest.CalculateService;
import com.example.HelloTest.add.AddExample;
import org.junit.Before; // Junit4
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
// Mockito import
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class) // Junit 5 extension
// @Runwith(MockitoJunitRunner.class) Junit 4
public class AddExampleMockTest {

    // 해당 어노테이션들을 사용하지 않았더라면 각 메서드에서 반복되는 코드가 발생했을 것이다.
    // AddExample은 비즈니스 클래스이다.
    @InjectMocks // 인스탠스화 하려고 할 때마다 필요하다. @Mock이 붙은 목객체를 @InjectMocks이 붙은 객체에 주입시킬 수 있다.
            // 해당 클래스를 인스탠스화 할 뿐 아니라 @Mock이 붙은 목객체를 주입할 수도 있다.
    AddExample addExample = new AddExample();
    @Mock
    CalculateService calculateService; //= mock(CalculateService.class);

    @BeforeEach // 테스트 케이스 실행 전에 수행된다.
    public void before() {
        addExample.setCalculateService(calculateService);
    }

    @Test
    public void calculateSumTest() {
        // 아래 코드 때문에 스텁 사용할 필요가 없어졌다. CalulateService 인터페이스 하나만 사용할 수 있어졌다.
        when(calculateService.retrieveSum()).thenReturn(new int[] {1,2,3});
        // 아래 메서드에서 CalculateService 호출하여 사용한다.
        assertEquals(6, addExample.getSumService());
    }
    @Test
    public void calculateSumEmptyTest() {
        // 비즈니스 클래스 객체를 생성한다.
        // 1) AddExample addExample = new AddExample();
        // CalculateService 목객체를 생성해준다.
        // 2) CalculateService calculateService = mock(CalculateService.class);
        when(calculateService.retrieveSum()).thenReturn(new int[] {});
        // 비즈니스 클래스에 생성한 서비스 목객체 주입해준다.
        // 3) addExample.setCalculateService(calculateService);

        assertEquals(0, addExample.getSumService());
    }
    @Test
    public void calculateSumSingleTest() {
        // 1) AddExample addExample = new AddExample();

        // 2) CalculateService calculateService = mock(CalculateService.class);
        when(calculateService.retrieveSum()).thenReturn(new int[] {1});
        // 3) addExample.setCalculateService(calculateService);

        assertEquals(1, addExample.getSumService());
    }
}
