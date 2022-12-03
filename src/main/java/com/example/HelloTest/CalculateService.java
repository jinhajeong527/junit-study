package com.example.HelloTest;

public interface CalculateService {
    public int[] retrieveSum();
    // 아래와 같이 메서드가 추가된다면 관련 스텁 서비스 클래스에 전부 추가를 해주어야 하기 때문에
    // 스텁을 사용한 테스트는 추천하지 않음. 그래서 MockService를 사용하는 것이다.
    // public void testMethod();
}
