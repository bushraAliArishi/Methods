import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("********************************************************");
        System.out.println("Question 1 -Write a Java method to find the smallest number among three numbers.");
        System.out.println("********************************************************");

        // Test Data:
        // Input the first number: 25
        // Input the second number: 37
        // Input the third number: 29
        // Expected Output:
        // The smallest value is 25.0
        SmallestNumber(scanner);
        System.out.println();
        System.out.println("********************************************************");
        System.out.println("Question 2 - Write a Java method that check if the entered number is negative or positive or zero.");
        System.out.println("********************************************************");

        // Test Data:
        // Input a number: -5
        // Expected Output:
        // The number is negative.
        checkNumber(scanner);

        System.out.println();
        System.out.println("********************************************************");
        System.out.println("Question 3 - Write a Java method to check whether a string is a valid password :");
        System.out.println("********************************************************");

        // Test Data:
        // Input a password (You are agreeing to the above Terms and Conditions): abcd1234
        // Expected Output:
        // Password is valid: abcd1234
        validatePassword(scanner);
    }

    // Method for Question 1
    public static void SmallestNumber(Scanner scanner) {
        System.out.print("Input the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Input the second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Input the third number: ");
        double num3 = scanner.nextDouble();

        double smallest = Math.min(num1, Math.min(num2, num3));
        System.out.println("The smallest value is " + smallest);
    }

    // Method for Question 2
    public static void checkNumber(Scanner scanner) {
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }

    // Method for Question 3
    public static void validatePassword(Scanner scanner) {
        System.out.println("Password rules:\n1. A password must have at least ten characters.\n2. A password consists of only letters and digits.\n3. A password must contain at least two digits.");
        System.out.print("Input a password (You are agreeing to the above Terms and Conditions): ");
        String password = scanner.next();

        if (ValidPassword(password)) {
            System.out.println("Password is valid: " + password);
        } else {
            System.out.println("Password is invalid.");
        }
    }

    // Helper Method to Check if Password is Valid
    public static boolean ValidPassword(String password) {
        if (password.length() < 10) {
            return false;
        }

        int digitCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }
        return digitCount >= 2;
    }
}
