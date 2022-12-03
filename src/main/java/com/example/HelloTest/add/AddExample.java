package com.example.HelloTest.add;

import com.example.HelloTest.CalculateService;

public class AddExample {
    private CalculateService calculateService;
    public void setCalculateService(CalculateService calculateService) {
        this.calculateService = calculateService;
    }
    public int addMethod(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }
    public int calculationSum(int a[]) {
        int sum = 0;
        for(int i: a) {
            sum += i;
        }
        return sum;
    }

    public int getSumService() {
        int sum = 0;
        // 실제로는 데이터베이스에서 데이터 retrieve하는 부분이 된다.
        int a[] = calculateService.retrieveSum();
        for(int i : a) {
            sum += i;
        }
        return sum;
    }


}
