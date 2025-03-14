package Basics;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 4, 5, 6}; // Basics.Array initialization

        // Sorting the array (optional)
        Arrays.sort(numbers);
        System.out.println("Sorted Basics.Array: " + Arrays.toString(numbers));

        // Find the maximum value
        int maxNumber = numbers[numbers.length - 1]; // Since array is sorted, last element is the max

        // Add the maximum value to all elements
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += maxNumber;
        }

        // Print the updated array
        System.out.println("Updated Basics.Array (After Adding Max): " + Arrays.toString(numbers));
    }

    public static class TerOperatr {
        public static void main (String[] args) {

            Scanner scanner = new Scanner(System.in);

                    // Take user input
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    String result1 = (age >= 18) ?"adult" : "Not adult";
                    System.out.println("You are " + result1);
                    scanner.close();
                }
            }
}
