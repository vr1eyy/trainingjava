
public class LogicalOperators {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // 1. Logical AND (&&)
        System.out.println("AND Operator: " + (a < b && a > 0));

        // 2. Logical OR (||)
        System.out.println("OR Operator: " + (a > b || a < b));

        // 3. Logical NOT (!)
        System.out.println("NOT Operator: " + !(a < b));
    }
}
