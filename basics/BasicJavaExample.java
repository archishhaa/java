import java.util.Scanner;

public class BasicJavaExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2, sum;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();

        sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        scanner.close();
    }
}

