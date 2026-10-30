<<<<<<< HEAD
import java.util.Scanner;
public class leap {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter a year to check if it is a leap year or not:");
        int year = Input.nextInt(); // Assuming you have a method to read input, like Scanner

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
=======
import java.util.Scanner;
public class leap {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter a year to check if it is a leap year or not:");
        int year = Input.nextInt(); // Assuming you have a method to read input, like Scanner

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
>>>>>>> 2e5003e42cd8cfa5ea21232290f7ca6b70554fb7
}