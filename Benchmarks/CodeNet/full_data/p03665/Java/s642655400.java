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
        int P = sc.nextInt();
        int[] A = new int[N];
        int even = 0;
        int odd = 0;
        for (int i = 0; i < N; ++i) {
            A[i] = sc.nextInt();
            if (A[i] % 2 == 0) {
                ++even;
            } else {
                ++odd;
            }
        }
        int sum = Arrays.stream(A).sum();

        if (P == 0) {
            long res = 0;
            for (int i = 0; i <= even; ++i) {
                for (int j = 0; j <= odd; j += 2) {
                    res += C(even, i).multiply(C(odd, j)).longValue();
                }
            }
            _out.println(res);
        } else {
            if (odd > 0) {
                long res = 0;
                for (int i = 0; i <= even; ++i) {
                    for (int j = 1; j <= odd; j += 2) {
                        res += C(even, i).multiply(C(odd, j)).longValue();
                    }
                }
                _out.println(res);
            } else {
                _out.println(0);
            }
        }
    }
    private long calc(int d, int p, int[] a, int sum) {
        if (d == a.length) {
            return (sum % 2 == p ? 1 : 0);
        }

        long res1 = calc(d + 1, p, a, sum);
        long res2 = calc(d + 1, p, a, sum + a[d]);
        return res1 + res2;
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