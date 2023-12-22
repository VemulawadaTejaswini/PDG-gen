import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int H = in.nextInt();
            int W = in.nextInt();
            int A = in.nextInt();
            int B = in.nextInt();

            boolean[] canUseH = new boolean[H];
            Arrays.fill(canUseH, true);
            for (int i = 0; i < A; i++) {
                canUseH[H - 1 - i] = false;
            }
            boolean[] canUseW = new boolean[W];
            Arrays.fill(canUseW, true);
            for (int i = 0; i < B; i++) {
                canUseW[i] = false;
            }

            long mod = (long) (1e9 + 7);

            long[] w2 = new long[W];
            for (int w = B; w < W; w++) {
                int r = H - A - 1 - (w - B);
                int c = B + (w - B);
                w2[w] = modComb(r + c, r, mod);
            }
            long res = 0;
            for (int w = B; w < W; w++) {
                int r = A + (w - B);
                int c = W - w - 1;
                res += (w2[w] * modComb(r + c, r, mod)) % mod;
                res %= mod;
            }
            System.out.println(res);

        }
    }

    public static final long modComb(long n, long k, long p) {
        if (n < 0 || k < 0 || n < k) {
            return 0;
        }
        long[] e1 = new long[1];
        long[] e2 = new long[1];
        long[] e3 = new long[1];
        long a1 = modFact(n, p, e1);
        long a2 = modFact(k, p, e2);
        long a3 = modFact(n - k, p, e3);
        if (e1[0] > e2[0] + e3[0]) {
            return 0;
        }
        return (a1 * modInverseByFermatsLittleTheorem((a2 * a3) % p, p)) % p;
    }

    private static final int MAX_P = (int) 1e6;
    private static final long[] fact = new long[MAX_P];
    private static final boolean[] first = new boolean[] { true, };

    private static final long modFact(long n, long p, long[] e) {
        if (first[0]) {
            first[0] = false;
            fact[0] = 1;
            for (int i = 1; i < fact.length; i++) {
                fact[i] = (int) ((i * fact[i - 1]) % p);
            }
        }

        e[0] = 0;
        if (n == 0) {
            return 1;
        }

        long res = modFact(n / p, p, e);
        e[0] += n / p;

        if ((n / p) % 2 != 0) {
            return res * (p - fact[(int) (n % p)]) % p;
        }

        return res * fact[(int) (n % p)] % p;
    }

    private static final long modPow(long x, long n, long modulo) {
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

    private static long modInverseByFermatsLittleTheorem(long x, long modulo) {
        return modPow(x, modulo - 2, modulo);
    }

}
