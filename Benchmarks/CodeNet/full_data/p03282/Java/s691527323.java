import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String... args) {
        Scanner IN   = new Scanner(System.in);
        String S     = IN.next();
        long K = IN.nextLong();
        System.out.println(calc(K, 0, S));
    }

    public static Character calc(long k, int i, String s) {
        if (k == 1) {
            return s.charAt(i);
        } else {
            if (s.charAt(i) != '1') {
                return s.charAt(i);
            } else {
                return calc(k - 1, i + 1, s);
            }
        }
    }
}
