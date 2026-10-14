
public class AssignmentOperators {
    public static void main(String[] args) {

        int a;

        // 1. Simple Assignment (=)
        a = 10;
        System.out.println("Simple Assignment (=): " + a);

        // 2. Addition Assignment (+=)
        a = 10;
        a += 5;
        System.out.println("Addition Assignment (+=): " + a);

        // 3. Subtraction Assignment (-=)
        a = 10;
        a -= 5;
        System.out.println("Subtraction Assignment (-=): " + a);

        // 4. Multiplication Assignment (*=)
        a = 10;
        a *= 5;
        System.out.println("Multiplication Assignment (*=): " + a);

        // 5. Division Assignment (/=)
        a = 10;
        a /= 5;
        System.out.println("Division Assignment (/=): " + a);

        // 6. Modulus Assignment (%=)
        a = 10;
        a %= 3;
        System.out.println("Modulus Assignment (%=): " + a);

        // 7. Bitwise AND Assignment (&=)
        a = 10;
        a &= 5;
        System.out.println("AND Assignment (&=): " + a);

        // 8. Bitwise OR Assignment (|=)
        a = 10;
        a |= 5;
        System.out.println("OR Assignment (|=): " + a);

        // 9. Bitwise XOR Assignment (^=)
        a = 10;
        a ^= 5;
        System.out.println("XOR Assignment (^=): " + a);

        // 10. Left Shift Assignment (<<=)
        a = 10;
        a <<= 1;
        System.out.println("Left Shift Assignment (<<=): " + a);

        // 11. Right Shift Assignment (>>=)
        a = 10;
        a >>= 1;
        System.out.println("Right Shift Assignment (>>=): " + a);

        // 12. Unsigned Right Shift Assignment (>>>=)
        a = 10;
        a >>>= 1;
        System.out.println("Unsigned Right Shift Assignment (>>>=): " + a);
    }
}
