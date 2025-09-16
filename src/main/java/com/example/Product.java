package com.example;

public class Product {
    //implement multiplication and exponentiation methods
    // product of two real numbers
    public static double product(double a, double b) {
        return a * b;
    }
    //product of two integers
    public static int product(int a, int b) {
        return a * b;
    }
    //product of three real integers
    public static double product3(double a, double b, double c) {
        return a * b * c;
    }

    //power (exponentiation) method
    //Parameter: base (double), exponent (int)
    public static double power(double base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Exponent must be a non-negative integer."); }// Handle negative exponents if needed      
        else if (exponent == 0) {
            return 1; // Any number to the power of 0 is 1
        } else {
            double result = 1;
            for (int i = 0; i < exponent; i++) {
                result *= base; // Multiply base, exponent times
            }
            return result;
        }
    }
}
