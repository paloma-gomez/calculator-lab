package com.example;
public class Module {
    //Implements modulo and absolute value operations.
    //method called module with parameters int a, int b, output int(a%b)
    public static int module(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a % b;
    }
    //method absolute value
    //parameter: double a
    //output If a ≥ 0: |a| = a If a < 0: |a| = -a
    public static double absoluteValue(double a) {
        if (a >= 0) {
            return a;
        } else {
            return -a;
        }
    }
}
