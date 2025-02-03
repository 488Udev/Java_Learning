import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 4, 5, 6}; // Array initialization

        // Sorting the array (optional)
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        // Find the maximum value
        int maxNumber = numbers[numbers.length - 1]; // Since array is sorted, last element is the max

        // Add the maximum value to all elements
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += maxNumber;
        }

        // Print the updated array
        System.out.println("Updated Array (After Adding Max): " + Arrays.toString(numbers));
    }
}
