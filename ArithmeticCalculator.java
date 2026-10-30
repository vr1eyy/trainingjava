<<<<<<< HEAD

import java.util.Scanner;

public class ArithmeticCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("     JAVA ARITHMETIC CALCULATOR");
        System.out.println("================================");

        System.out.println("Choose an arithmetic operator:");
        System.out.println("+  Addition");
        System.out.println("-  Subtraction");
        System.out.println("*  Multiplication");
        System.out.println("/  Division");
        System.out.println("%  Modulus");

        System.out.print("\nEnter your operator: ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        double result;

        switch (operator) {

            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Modulus by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid operator! Please use +, -, *, / or %.");
        }

        sc.close();
    }
}
=======

import java.util.Scanner;

public class ArithmeticCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("     JAVA ARITHMETIC CALCULATOR");
        System.out.println("================================");

        System.out.println("Choose an arithmetic operator:");
        System.out.println("+  Addition");
        System.out.println("-  Subtraction");
        System.out.println("*  Multiplication");
        System.out.println("/  Division");
        System.out.println("%  Modulus");

        System.out.print("\nEnter your operator: ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        double result;

        switch (operator) {

            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Modulus by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid operator! Please use +, -, *, / or %.");
        }

        sc.close();
    }
}
>>>>>>> 2e5003e42cd8cfa5ea21232290f7ca6b70554fb7
