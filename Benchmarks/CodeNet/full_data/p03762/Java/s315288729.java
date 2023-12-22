import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    private static boolean debug = false;
    private static boolean elapsed = false;

    private static PrintWriter _out = new PrintWriter(System.out);
    private static PrintWriter _err = new PrintWriter(System.err);

    private static final long MOD = 1_000_000_007;

    private void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        long sum1 = 0;
        for (int i = 0; i < n; ++i) {
            long x = sc.nextInt();
            sum1 = (sum1 + (i * x - (n - i - 1) * x)) % MOD;
        }
        long sum2 = 0;
        for (int i = 0; i < m; ++i) {
            long y = sc.nextInt();
            sum2 = (sum2 + (i * y - (m - i - 1) * y)) % MOD;
        }

        _out.println((sum1 * sum2) % MOD);
    }
    private static BigInteger C(long n, long r) {
        BigInteger res = BigInteger.ONE;
        for (long i = n; i > n - r; --i) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        for (long i = r; i > 1; --i) {
            res = res.divide(BigInteger.valueOf(i));
        }
        return res;
    }
    private static BigInteger P(long n, long r) {
        BigInteger res = BigInteger.ONE;
        for (long i = n; i > n - r; --i) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
    /*
     * 10^10 > Integer.MAX_VALUE = 2147483647 > 10^9
     * 10^19 > Long.MAX_VALUE = 9223372036854775807L > 10^18
     */
    public static void main(String[] args) {
        long S = System.currentTimeMillis();

        Scanner sc = new Scanner(System.in);
        new Main().solve(sc);
        _out.flush();

        long G = System.currentTimeMillis();
        if (elapsed) {
            _err.println((G - S) + "ms");
        }
        _err.flush();
    }
}