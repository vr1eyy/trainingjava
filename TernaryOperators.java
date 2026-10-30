<<<<<<< HEAD

public class TernaryOperator {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // 1. Check whether a number is positive or not
        String result1 = (a > 0) ? "Positive" : "Not Positive";
        System.out.println("Number Check: " + result1);

        // 2. Find the largest of two numbers
        int largest = (a > b) ? a : b;
        System.out.println("Largest Number: " + largest);

        // 3. Check even or odd
        String result2 = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println("Even/Odd: " + result2);

        // 4. Check eligibility to vote
        int age = 18;
        String result3 = (age >= 18) ? "Eligible" : "Not Eligible";
        System.out.println("Voting Status: " + result3);

        // 5. Check equal or not equal
        String result4 = (a == b) ? "Equal" : "Not Equal";
        System.out.println("Equality: " + result4);

        // 6. Find the largest of three numbers
        int c = 15;
        int max = (a > b)
                ? ((a > c) ? a : c)
                : ((b > c) ? b : c);
        System.out.println("Largest of Three: " + max);

        // 7. Nested ternary: positive, negative, or zero
        int n = -5;
        String result5 = (n > 0) ? "Positive"
                : (n < 0) ? "Negative" : "Zero";
        System.out.println("Sign Check: " + result5);
    }
=======

public class TernaryOperator {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // 1. Check whether a number is positive or not
        String result1 = (a > 0) ? "Positive" : "Not Positive";
        System.out.println("Number Check: " + result1);

        // 2. Find the largest of two numbers
        int largest = (a > b) ? a : b;
        System.out.println("Largest Number: " + largest);

        // 3. Check even or odd
        String result2 = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println("Even/Odd: " + result2);

        // 4. Check eligibility to vote
        int age = 18;
        String result3 = (age >= 18) ? "Eligible" : "Not Eligible";
        System.out.println("Voting Status: " + result3);

        // 5. Check equal or not equal
        String result4 = (a == b) ? "Equal" : "Not Equal";
        System.out.println("Equality: " + result4);

        // 6. Find the largest of three numbers
        int c = 15;
        int max = (a > b)
                ? ((a > c) ? a : c)
                : ((b > c) ? b : c);
        System.out.println("Largest of Three: " + max);

        // 7. Nested ternary: positive, negative, or zero
        int n = -5;
        String result5 = (n > 0) ? "Positive"
                : (n < 0) ? "Negative" : "Zero";
        System.out.println("Sign Check: " + result5);
    }
>>>>>>> 2e5003e42cd8cfa5ea21232290f7ca6b70554fb7
}