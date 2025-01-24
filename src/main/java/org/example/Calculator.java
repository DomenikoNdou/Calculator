package org.example;

public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int subtract(int x, int z){
        return x - z;
    }
    public int multiply(int s, int d){
        return s * d;
    }
    public int divide(int a, int b){
        if (b==0){
            throw new IllegalArgumentException("Divide by zero not allowed");
        }
        return a / b;
    }
    public double sqrt(double x){
        if (x < 0){
            throw new IllegalArgumentException("Square root of negative number not allowed");
        }
        return Math.sqrt(x);
    }
}