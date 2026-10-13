
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("==============================");
        System.out.println("    NUMBER GUESSING GAME");
        System.out.println("==============================");
        System.out.println("I have selected a number from 1 to 100.");
        System.out.println("Try to guess the number!");

        do {
            System.out.print("\nEnter your guess: ");

            while (!sc.hasNextInt()) {
                System.out.print("Please enter a valid number: ");
                sc.next();
            }

            guess = sc.nextInt();
            attempts++;

            if (guess < 1 || guess > 100) {
                System.out.println("Enter a number between 1 and 100.");
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try a higher number.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try a lower number.");
            } else {
                System.out.println("\nCongratulations! You won!");
                System.out.println("Correct number: " + secretNumber);
                System.out.println("Total attempts: " + attempts);
            }

        } while (guess != secretNumber);

        System.out.println("\nThanks for playing!");

        sc.close();
    }
}

