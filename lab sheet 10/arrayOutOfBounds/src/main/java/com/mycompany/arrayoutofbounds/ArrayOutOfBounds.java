package com.mycompany.arrayoutofbounds;
public class ArrayOutOfBounds {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };

        try {
            int index = 6; // Modify this value to test different indices
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index. The array size is " + numbers.length + ".");
        }
    }
}
