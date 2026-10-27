public class star {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i += 2) {
            for (int j = 1; j <= (5 - i) / 2; j++)
                System.out.print("  ");

            for (int j = 1; j <= i; j++)
                System.out.print("* ");

            System.out.println();
        }

        for (int i = 3; i >= 1; i -= 2) {
            for (int j = 1; j <= (5 - i) / 2; j++)
                System.out.print("  ");

            for (int j = 1; j <= i; j++)
                System.out.print("* ");

            System.out.println();
        }
    }
}