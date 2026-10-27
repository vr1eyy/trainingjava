import java.util.Scanner;

public class reverse 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        long r = 0;
        while (n != 0) 
        {
            r = r * 10 + n % 10;
            n /= 10;
        }
        System.out.println("Reversed number: " + r);
        scanner.close();
    }
}
