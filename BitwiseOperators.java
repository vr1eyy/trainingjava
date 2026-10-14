
public class BitwiseOperators {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // 1. Bitwise AND (&)
        System.out.println("Bitwise AND (&): " + (a & b));

        // 2. Bitwise OR (|)
        System.out.println("Bitwise OR (|): " + (a | b));

        // 3. Bitwise XOR (^)
        System.out.println("Bitwise XOR (^): " + (a ^ b));

        // 4. Bitwise Complement (~)
        System.out.println("Bitwise Complement (~): " + (~a));

        // 5. Left Shift (<<)
        System.out.println("Left Shift (<<): " + (a << 1));

        // 6. Signed Right Shift (>>)
        System.out.println("Signed Right Shift (>>): " + (a >> 1));

        // 7. Unsigned Right Shift (>>>)
        System.out.println("Unsigned Right Shift (>>>): " + (a >>> 1));

        // 8. Bitwise AND Assignment (&=)
        int x = 10;
        x &= 5;
        System.out.println("AND Assignment (&=): " + x);

        // 9. Bitwise OR Assignment (|=)
        x = 10;
        x |= 5;
        System.out.println("OR Assignment (|=): " + x);

        // 10. Bitwise XOR Assignment (^=)
        x = 10;
        x ^= 5;
        System.out.println("XOR Assignment (^=): " + x);

        // 11. Left Shift Assignment (<<=)
        x = 10;
        x <<= 1;
        System.out.println("Left Shift Assignment (<<=): " + x);

        // 12. Right Shift Assignment (>>=)
        x = 10;
        x >>= 1;
        System.out.println("Right Shift Assignment (>>=): " + x);

        // 13. Unsigned Right Shift Assignment (>>>=)
        x = 10;
        x >>>= 1;
        System.out.println("Unsigned Right Shift Assignment (>>>=): " + x);
    }
}
