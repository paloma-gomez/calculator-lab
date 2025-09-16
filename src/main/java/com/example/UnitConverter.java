package com.example;
public class UnitConverter {
    //Implements temperature and angle conversions.
    //method: Celsius to Fahrenheit
    //Formula: F = (C × 9/5) + 32
    //Parameter: double celsius
    //Output: double fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }   
    //method: Fahrenheit to Celsius
    //Formula: C = (F - 32) × 5/9
    //Parameter: double fahrenheit
    //Output: double celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }
    //method: Degrees to Radians
    //Formula: radians = degrees × (π / 180)
    //Parameter: double degrees
    //Output: double radians
    public static double degreesToRadians(double degrees) {
        return degrees * (Math.PI / 180.0);
    }
    //method: Radians to Degrees
    //Formula: degrees = radians × (180 / π)
    //Parameter: double radians
    //Output: double degrees
    public static double radiansToDegrees(double radians) {
        return radians * (180.0 / Math.PI); }
}
