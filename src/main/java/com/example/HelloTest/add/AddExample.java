package com.example.HelloTest.add;

public class AddExample {
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
}
