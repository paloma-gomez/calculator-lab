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
                case 2: // Subtraction
                    // Similar submenu for Sub class
                    break;
                case 3: // Product
                    // Similar submenu for Product class
                    break;
                case 4: // Division
                    // Similar submenu for Division class
                    break;
                case 5: // Module
                    // Similar submenu for Module class
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
                case 7:
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
