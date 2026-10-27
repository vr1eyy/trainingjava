import java.util.Scanner;
public class c {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        int odd=0;
        for (int i = 1; i <= n; i++) {
            if(i%2!=0){
                odd = odd + i;
            }
        }
        System.out.println("Sum of odd numbers: " + odd);
        sc.close();
    
    int even=0;
    for (int i = 1; i <= n; i++) {
        if(i%2==0){
            even = even + i;
        }
    }
    System.out.println("Sum of even numbers: " + even);
    sc.close();
}
}
