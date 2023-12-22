import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    private static boolean debug = false;
    private static boolean elapsed = false;

    private static PrintWriter _out = new PrintWriter(System.out);
    private static PrintWriter _err = new PrintWriter(System.err);

    private void solve(Scanner sc) {
        int N = sc.nextInt();
        int[] s = new int[N];
        for (int i = 0; i < N; ++i) {
            s[i] = sc.nextInt();
        }

        int sum = Arrays.stream(s).sum();
        if (sum % 10 != 0) {
            _out.println(sum);
        } else {
            Arrays.sort(s);
            for (int i = 0; i < N; ++i) {
                if (s[i] % 10 != 0) {
                    int sum2 = 0;
                    for (int j = 0; j < N; ++j) {
                        sum2 += s[j];
                        if (sum2 % 10 != 0 && sum2 < s[i]) {
                            _out.println(sum - sum2);
                            return;
                        }
                    }
                    _out.println(sum - s[i]);
                    return;
                }
            }
            _out.println(0);
        }
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