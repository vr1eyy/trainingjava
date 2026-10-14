
public class DataTypeExplorer {

    // Display the range of integer-based data types
    static void showIntegerRanges() {

        System.out.println("\n+------------------------------------------+");
        System.out.println("|       INTEGER DATA TYPE RANGES           |");
        System.out.println("+------------------------------------------+");

        System.out.printf("%-10s | %-22s | %-22s%n",
                "TYPE", "MINIMUM VALUE", "MAXIMUM VALUE");

        System.out.println("------------------------------------------------------------");

        System.out.printf("%-10s | %-22d | %-22d%n",
                "byte", Byte.MIN_VALUE, Byte.MAX_VALUE);

        System.out.printf("%-10s | %-22d | %-22d%n",
                "short", Short.MIN_VALUE, Short.MAX_VALUE);

        System.out.printf("%-10s | %-22d | %-22d%n",
                "int", Integer.MIN_VALUE, Integer.MAX_VALUE);

        System.out.printf("%-10s | %-22d | %-22d%n",
                "long", Long.MIN_VALUE, Long.MAX_VALUE);
    }

    // Display the character data type range
    static void showCharacterRange() {

        System.out.println("\n+------------------------------------------+");
        System.out.println("|        CHARACTER DATA TYPE RANGE         |");
        System.out.println("+------------------------------------------+");

        System.out.println("Minimum character code : "
                + (int) Character.MIN_VALUE);

        System.out.println("Maximum character code : "
                + (int) Character.MAX_VALUE);
    }

    // Display program information
    static void showWelcomeMessage() {

        System.out.println("==============================================");
        System.out.println("       JAVA DATA TYPE RANGE EXPLORER");
        System.out.println("==============================================");
        System.out.println("Exploring Java's built-in numeric limits");
    }

    public static void main(String[] args) {

        showWelcomeMessage();

        showIntegerRanges();

        showCharacterRange();

        System.out.println("\n==============================================");
        System.out.println("       DATA TYPE ANALYSIS COMPLETED");
        System.out.println("==============================================");
    }
}
