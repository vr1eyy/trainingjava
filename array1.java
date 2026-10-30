<<<<<<< HEAD
import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size of the Array:");
        int n = scan.nextInt();
        int mark[] = new int[n];
        for (int i = 0; i < mark.length; i++) {
            System.out.println("Enter the mark for index " + i + ":");
            mark[i] = scan.nextInt();
        }

        System.out.println("The marks are:");

        for (int i = 0; i < mark.length; i++) {
            System.out.println(mark[i]);
        }

        scan.close();
    }
=======
import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size of the Array:");
        int n = scan.nextInt();
        int mark[] = new int[n];
        for (int i = 0; i < mark.length; i++) {
            System.out.println("Enter the mark for index " + i + ":");
            mark[i] = scan.nextInt();
        }

        System.out.println("The marks are:");

        for (int i = 0; i < mark.length; i++) {
            System.out.println(mark[i]);
        }

        scan.close();
    }
>>>>>>> 2e5003e42cd8cfa5ea21232290f7ca6b70554fb7
}