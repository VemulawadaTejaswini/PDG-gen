import java.math.BigInteger;
import java.util.*;
//import sun.tools.serialver.resources.serialver;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        long l = kbd.nextLong();
        long a = kbd.nextLong();
        long b = kbd.nextLong();
        BigInteger m = kbd.nextBigInteger();
        String s = "";
        for (long i = 0; i < l; i++) {
            s += String.valueOf(kousa(i, a, b));
        }
        BigInteger tot = new BigInteger(s);
        // long tot = Long.pharseLong(s);
        System.out.println(tot.remainder(m));
    }

    static long kousa(long n, long a, long b) {
        if (n == 0) {
            return a;
        } else {
            // return b + kousa(n - 1, a, b);
            return a + b * n;
        }
    }
}