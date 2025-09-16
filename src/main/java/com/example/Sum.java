package com.example;

public class Sum {
    public static int sum(int a, int b) {
        return a + b;
    }   
    //sum of two double nummbers
    public static double sum(double a, double b) {
        return a + b;
    }
    // sum of three double integers
    public static double sum3(double a, double b, double c) {
        return a + b + c;}
    
    //(EXTRA) Accumulated sum (like a calculator with “M+”)
    //Parameter: 1 number (added to the stored value)
    //The class should keep an internal accumulated value.
    private static double accumulatedSum = 0; // internal accumulated value
    public static double addToAccumulatedSum(double a) {
        accumulatedSum += a; // add the input to the accumulated sum
        return accumulatedSum; // return the updated accumulated sum
    }

}
    