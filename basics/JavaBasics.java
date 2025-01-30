// Java Basics: Control Structures, Methods, and Arrays
import java.util.Scanner;

public class JavaBasics {

    // Method to find the largest number in an array
    public static int findLargest(int[] numbers) {
        int largest = numbers[0];
        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }
        return largest;
    }

    // Method to calculate the factorial of a number using recursion
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Conditional Statement Example
        System.out.print("Enter a number to check if it's positive or negative: ");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Loop Example: Print first 5 factorials
        System.out.println("\nFirst 5 factorials:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Factorial of " + i + " is " + factorial(i));
        }

        // Array Example: Finding the largest number
        int[] array = {5, 12, 7, 3, 15, 2};
        int largest = findLargest(array);
        System.out.println("\nLargest number in the array is: " + largest);

        scanner.close();
    }
}

