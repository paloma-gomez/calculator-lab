package com.example;
public class Division {
    //implements division operations.
    //division of two real numbers
    public static double division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }
    //division of two integers
    public static int division(int a, int b) {  
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;   
    //reciprocal of a real number
    } public static double reciprocal(double a) {
        if (a == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return 1 / a;}
}
