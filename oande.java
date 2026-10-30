
import java.util.Arrays;

public class oande {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] even = new int[6];
        int[] odd = new int[6];
        int e = 0, o = 0;

        for (int n : numbers) {
            if (n % 2 == 0)
                even[e++] = n;
            else
                odd[o++] = n;
        }

        System.out.println("Even: " + Arrays.toString(Arrays.copyOf(even, e)));
        System.out.println("Odd: " + Arrays.toString(Arrays.copyOf(odd, o)));
    }
}