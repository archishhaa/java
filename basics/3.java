import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        
        System.out.println("Welcome to Java Programming!");

       
        int number = 10;
        double price = 99.99;
        char grade = 'A';
        String message = "Hello, Java!";
        boolean isJavaFun = true;

        System.out.println("Integer: " + number);
        System.out.println("Double: " + price);
        System.out.println("Character: " + grade);
        System.out.println("String: " + message);
        System.out.println("Boolean: " + isJavaFun);

        // Take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        if (name.isEmpty()) {
            System.out.println("You didn't enter your name!");
        } else {
            System.out.println("Hello, " + name + "!");
        }

        System.out.println("Counting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
