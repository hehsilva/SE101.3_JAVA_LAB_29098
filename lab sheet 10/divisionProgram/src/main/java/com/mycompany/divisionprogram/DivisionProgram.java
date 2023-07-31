package com.mycompany.divisionprogram;
import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numerator: ");
        int numerator = scanner.nextInt();

        System.out.println("Enter the denominator: ");
        int denominator = scanner.nextInt();

        try {
            int result = divideNumbers(numerator, denominator);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }

    public static int divideNumbers(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }

        return numerator / denominator;
    }
}
