package com.example;
public class Sub {
    private static double accumulatedSub = 0; // internal accumulated value
    //implement subtraction methods
    //subtraction of two double numbers
    public static double sub(double a, double b) {
        return a - b;
    }
    //subtraction of two integers
    public static int sub(int a, int b) {
        return a - b;}
    //subtraction of three double numbers
    public static double sub3(double a, double b, double c) {
        return a - b - c;}
    //accumulated subtraction (like a calculator with “M-”)
    public static double accumulatedSubtraction(double a) {
        accumulatedSub -= a; // subtract the input from the accumulated subtraction
        return accumulatedSub; // return the updated accumulated subtraction
    }
}
