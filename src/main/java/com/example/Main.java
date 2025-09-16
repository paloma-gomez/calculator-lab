package com.example;
import java.util.Scanner;;
//Paloma & HUgo
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("\nCalculator Menu:");
            System.out.println("1. Sum");
            System.out.println("2. Subtraction");
            System.out.println("3. Product");
            System.out.println("4. Division");
            System.out.println("5. Module");
            System.out.println("6. Unit Converter");
            System.out.println("7. Exit");
            System.out.print("Choose an operation: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Sum
                    System.out.println("Sum Menu:");
                    System.out.println("1. Sum of two doubles");
                    System.out.println("2. Sum of two integers");
                    System.out.println("3. Sum of three doubles");
                    System.out.println("4. Accumulated sum (M+)");
                    int sumChoice = scanner.nextInt();
                    switch (sumChoice) {
                        case 1:
                            System.out.print("Enter first double: ");
                            double sd1 = scanner.nextDouble();
                            System.out.print("Enter second double: ");
                            double sd2 = scanner.nextDouble();
                            System.out.println("Result: " + Sum.sum(sd1, sd2));
                            break;
                        case 2:
                            System.out.print("Enter first int: ");
                            int si1 = scanner.nextInt();
                            System.out.print("Enter second int: ");
                            int si2 = scanner.nextInt();
                            System.out.println("Result: " + Sum.sum(si1, si2));
                            break;
                        case 3:
                            System.out.print("Enter first double: ");
                            double s3d1 = scanner.nextDouble();
                            System.out.print("Enter second double: ");
                            double s3d2 = scanner.nextDouble();
                            System.out.print("Enter third double: ");
                            double s3d3 = scanner.nextDouble();
                            System.out.println("Result: " + Sum.sum3(s3d1, s3d2, s3d3));
                            break;
                        case 4:
                            System.out.print("Enter number to add to accumulated sum: ");
                            double acc = scanner.nextDouble();
                            System.out.println("Accumulated Sum: " + Sum.addToAccumulatedSum(acc));
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                    break;
                case 2: // Sub
                    System.out.println("Subtraction Menu:");
                    System.out.println("1. Subtract two numbers (double)");
                    System.out.println("2. Subtract two numbers (int)");
                    System.out.println("3. Subtract three numbers (double)");
                    System.out.println("4. Accumulated subtraction (M-)");
                    System.out.print("Choose an option: ");
                    int subOption = scanner.nextInt();
                    switch (subOption) {
                        case 1:
                            System.out.print("Enter the first number (double): ");
                            double d1 = scanner.nextDouble();
                            System.out.print("Enter the second number (double): ");
                            double d2 = scanner.nextDouble();
                            System.out.println("Result: " + Sub.sub(d1, d2));
                            break;
                        case 2:
                            System.out.print("Enter the first number (int): ");
                            int i1 = scanner.nextInt();
                            System.out.print("Enter the second number (int): ");
                            int i2 = scanner.nextInt();
                            System.out.println("Result: " + Sub.sub(i1, i2));
                            break;
                        case 3:
                            System.out.print("Enter the first number (double): ");
                            double d3 = scanner.nextDouble();
                            System.out.print("Enter the second number (double): ");
                            double d4 = scanner.nextDouble();
                            System.out.print("Enter the third number (double): ");
                            double d5 = scanner.nextDouble();
                            System.out.println("Result: " + Sub.sub3(d3, d4, d5));
                            break;
                        case 4:
                            System.out.print("Enter the number to subtract from the accumulated value: ");
                            double acc = scanner.nextDouble();
                            System.out.println("Current accumulated value: " + Sub.accumulatedSubtraction(acc));
                            break;
                        default:
                            System.out.println("Invalid option.");
                    }
                    break;
                case 3: // Product
                    System.out.println("Product Menu:");
                    System.out.println("1. Multiply two numbers (double)");
                    System.out.println("2. Multiply two numbers (int)");
                    System.out.println("3. Multiply three numbers (double)");
                    System.out.println("4. Power (base double, exponent int)");
                    System.out.print("Choose an option: ");
                    int prodOption = scanner.nextInt();
                    switch (prodOption) {
                        case 1:
                            System.out.print("Enter the first number (double): ");
                            double pd1 = scanner.nextDouble();
                            System.out.print("Enter the second number (double): ");
                            double pd2 = scanner.nextDouble();
                            System.out.println("Result: " + Product.product(pd1, pd2));
                            break;
                        case 2:
                            System.out.print("Enter the first number (int): ");
                            int pi1 = scanner.nextInt();
                            System.out.print("Enter the second number (int): ");
                            int pi2 = scanner.nextInt();
                            System.out.println("Result: " + Product.product(pi1, pi2));
                            break;
                        case 3:
                            System.out.print("Enter the first number (double): ");
                            double pd3 = scanner.nextDouble();
                            System.out.print("Enter the second number (double): ");
                            double pd4 = scanner.nextDouble();
                            System.out.print("Enter the third number (double): ");
                            double pd5 = scanner.nextDouble();
                            System.out.println("Result: " + Product.product3(pd3, pd4, pd5));
                            break;
                        case 4:
                            System.out.print("Enter the base (double): ");
                            double base = scanner.nextDouble();
                            System.out.print("Enter the exponent (int): ");
                            int exp = scanner.nextInt();
                            try {
                                System.out.println("Result: " + Product.power(base, exp));
                            } catch (IllegalArgumentException e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                            break;
                        default:
                            System.out.println("Invalid option.");
                    }
                    break;
                case 4: // Division
                    System.out.println("Division Menu:");
                    System.out.println("1. Divide two numbers (double)");
                    System.out.println("2. Divide two numbers (int)");
                    System.out.println("3. Reciprocal of a number (double)");
                    System.out.print("Choose an option: ");
                    int divOption = scanner.nextInt();
                    switch (divOption) {
                        case 1:
                            System.out.print("Enter the dividend (double): ");
                            double dd1 = scanner.nextDouble();
                            System.out.print("Enter the divisor (double): ");
                            double dd2 = scanner.nextDouble();
                            try {
                                System.out.println("Result: " + Division.division(dd1, dd2));
                            } catch (IllegalArgumentException e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                            break;
                        case 2:
                            System.out.print("Enter the dividend (int): ");
                            int di1 = scanner.nextInt();
                            System.out.print("Enter the divisor (int): ");
                            int di2 = scanner.nextInt();
                            try {
                                System.out.println("Result: " + Division.division(di1, di2));
                            } catch (IllegalArgumentException e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                            break;
                        case 3:
                            System.out.print("Enter the number for reciprocal (double): ");
                            double dr = scanner.nextDouble();
                            try {
                                System.out.println("Result: " + Division.reciprocal(dr));
                            } catch (IllegalArgumentException e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                            break;
                        default:
                            System.out.println("Invalid option.");
                    }
                    break;
                case 5: // Module
                    System.out.println("Module Menu:");
                    System.out.println("1. Modulo of two numbers (int)");
                    System.out.println("2. Absolute value (double)");
                    System.out.print("Choose an option: ");
                    int modOption = scanner.nextInt();
                    switch (modOption) {
                        case 1:
                            System.out.print("Enter the first number (int): ");
                            int m1 = scanner.nextInt();
                            System.out.print("Enter the second number (int): ");
                            int m2 = scanner.nextInt();
                            try {
                                System.out.println("Result: " + Module.module(m1, m2));
                            } catch (IllegalArgumentException e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                            break;
                        case 2:
                            System.out.print("Enter the number (double): ");
                            double abs = scanner.nextDouble();
                            System.out.println("Result: " + Module.absoluteValue(abs));
                            break;
                        default:
                            System.out.println("Invalid option.");
                    }
                    break;
                case 6: // Unit Converter
                    System.out.println("Unit Converter Menu:");
                    System.out.println("1. Celsius to Fahrenheit");
                    System.out.println("2. Fahrenheit to Celsius");
                    System.out.println("3. Degrees to Radians");
                    System.out.println("4. Radians to Degrees");
                    int ucChoice = scanner.nextInt();
                    switch (ucChoice) {
                        case 1:
                            System.out.print("Enter Celsius: ");
                            double c = scanner.nextDouble();
                            System.out.println("Fahrenheit: " + UnitConverter.celsiusToFahrenheit(c));
                            break;
                        case 2:
                            System.out.print("Enter Fahrenheit: ");
                            double f = scanner.nextDouble();
                            System.out.println("Celsius: " + UnitConverter.fahrenheitToCelsius(f));
                            break;
                        case 3:
                            System.out.print("Enter Degrees: ");
                            double deg = scanner.nextDouble();
                            System.out.println("Radians: " + UnitConverter.degreesToRadians(deg));
                            break;
                        case 4:
                            System.out.print("Enter Radians: ");
                            double rad = scanner.nextDouble();
                            System.out.println("Degrees: " + UnitConverter.radiansToDegrees(rad));
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                    break;
                case 7: //Exit Calculator
                    running = false;
                    System.out.println("Exiting calculator.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
