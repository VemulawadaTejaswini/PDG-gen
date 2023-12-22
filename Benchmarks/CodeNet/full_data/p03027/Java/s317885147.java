import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            long mod = 1000003L;
            long[] fact = new long[(int) mod];
            fact[0] = 1;
            for (int i = 1; i < fact.length; i++) {
                fact[i] = (i * fact[i - 1]) % mod;
            }
            int Q = in.nextInt();
            long[] x = new long[Q];
            long[] d = new long[Q];
            long[] n = new long[Q];
            for (int i = 0; i < Q; i++) {
                x[i] = in.nextInt();
                d[i] = in.nextInt();
                n[i] = in.nextInt();

                if (n[i] >= mod) {
                    System.out.println(0);
                    continue;
                }
                if (d[i] == 0) {
                    long res = AntBook.modPow(x[i], n[i], mod);
                    System.out.println(res);
                    continue;
                }

                long dPowN = modPow(d[i], n[i], mod);
                long invD = modInverseByFermatsLittleTheorem(d[i], mod);
                long x2 = (x[i] * invD) % mod;
                long fact1 = fact[(int) ((x2 + n[i] - 1 + mod) % mod)];
                long fact2 = fact[(int) ((x2 - 1 + mod) % mod)];
                long mm = (fact1 * modInverseByFermatsLittleTheorem(fact2, mod)) % mod;
                System.out.println((dPowN * mm) % mod);
            }
        }
    }

    public static long modInverseByFermatsLittleTheorem(long x, long modulo) {
        return modPow(x, modulo - 2, modulo);
    }

    public static final long modPow(long x, long n, long modulo) {
        long res = 1L;
        while (n > 0) {
            if ((n & 1L) != 0) {
                res = res * x % modulo;
            }
            x = x * x % modulo;
            n >>= 1;
        }
        return res;
    }
}
