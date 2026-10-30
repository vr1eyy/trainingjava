<<<<<<< HEAD
import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scan.nextInt();
        int mark[] = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            mark[i] = scan.nextInt();
        }
        int largest = mark[0];
        for (int i = 1; i < n; i++) {
            if (mark[i] > largest) {
                largest = mark[i];
            }
        }
        System.out.println("Largest number = " + largest);
        scan.close();
    }
=======
import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scan.nextInt();
        int mark[] = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            mark[i] = scan.nextInt();
        }
        int largest = mark[0];
        for (int i = 1; i < n; i++) {
            if (mark[i] > largest) {
                largest = mark[i];
            }
        }
        System.out.println("Largest number = " + largest);
        scan.close();
    }
>>>>>>> 2e5003e42cd8cfa5ea21232290f7ca6b70554fb7
}