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
        int[] A = new int[N];
        int ans = 0;
        for (int i = 0; i < N; ++i) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < N; ++i) {
            if (i > 0) {
                if (A[i - 1] < A[i]) {
                    while (i < N && A[i - 1] <= A[i]) {
                        ++i;
                    }
                    if (i < N) {
                        ++ans;
                    }
                } else if (A[i - 1] > A[i]) {
                    while (i < N && A[i - 1] >= A[i]) {
                        ++i;
                    }
                    if (i < N) {
                        ++ans;
                    }
                } else {
                    while (i < N && A[i - 1] == A[i]) {
                        ++i;
                    }
                }
            } else {
                ++ans;
            }
        }

        _out.println(ans);
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