<<<<<<< HEAD
import java.util.Scanner;

public class conditionaloperator
{
    public static void main (String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int f = input.nextInt();
        int s = input.nextInt();
        int t = input.nextInt();

        if (f == s && s == t) {
            System.out.println("All three numbers are equal.");
        } else if (f >= s && f >= t) {
            System.out.println("The greatest number is " + f);
        } else if (s >= f && s >= t) {
            System.out.println("The greatest number is " + s);
        } else {
            System.out.println("The greatest number is " + t);
        }

        input.close();
    }
=======
import java.util.Scanner;

public class conditionaloperator
{
    public static void main (String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int f = input.nextInt();
        int s = input.nextInt();
        int t = input.nextInt();

        if (f == s && s == t) {
            System.out.println("All three numbers are equal.");
        } else if (f >= s && f >= t) {
            System.out.println("The greatest number is " + f);
        } else if (s >= f && s >= t) {
            System.out.println("The greatest number is " + s);
        } else {
            System.out.println("The greatest number is " + t);
        }

        input.close();
    }
>>>>>>> 2e5003e42cd8cfa5ea21232290f7ca6b70554fb7
}