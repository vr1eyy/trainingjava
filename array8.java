import java.util.Scanner;
public class array8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        int count = 0;
        for(int i:arr){
            if(i==target){
                count++;
            }

        }
        System.out.println("Count of target element: " + count);
    }
}