import static java.lang.Math.abs;
import static java.lang.Math.min;

import java.util.Scanner;

public class Main {
    static final Scanner sc  = new Scanner(System.in);
    static final int MOD = (int) 1E9 + 7;
    static final long INF = 1L << 60;
    static int A;
    static int B;
    static int Q;
    static long[] s;
    static long[] t;
    static long[] x;
    
    public static void main(String[] args) {
        A = nint();
        B = nint();
        Q = nint();
        s = nlongs(A, 1, 1);
        t = nlongs(B, 1, 1);
        x = nlongs(Q);
        s[0] = -INF;
        t[0] = -INF;
        s[A+1] = INF;
        t[B+1] = INF;
        
        for (int q = 0; q < Q; q++) {
            System.out.println(solve(q));
        }
    }
    
    static long solve(int q) {
        int bs = lowerBound(s, x[q]);
        int bt = lowerBound(t, x[q]);

        long ans = Long.MAX_VALUE;
        for (int is = bs-1; is <= bs; is++) {
            for (int it = bt-1; it <= bt; it++) {
                long cost1 = abs(s[is] - x[q]) + abs(t[it] - s[is]);
                long cost2 = abs(t[it] - x[q]) + abs(s[is] - t[it]);
                ans = min(cost1, ans);
                ans = min(cost2, ans);
            }
        }
        return ans;
    }
    
    //探索したいkey以上で最小のindexを返す。
    public static int lowerBound(long[] a, long toFind) {
        int l = 0, r = a.length - 1;
        while (r - l >= 0) {
            int c = (l + r) / 2;
            if (toFind <= a[c]) {
                r = c - 1;
            } else {
                l = c + 1;
            }
        }
        return l;
    }
    
    private static int nint() {
        return sc.nextInt();
    }

    private static int[] nints(int n) {
        return nints(n, 0, 0);
    }

    private static int[] nints(int n, int padL, int padR) {
        int[] a = new int[padL + n + padR];
        for (int i = 0; i < n; i++)
            a[padL + i] = nint();
        return a;
    }

    private static long nlong() {
        return sc.nextLong();
    }

    private static long[] nlongs(int n) {
        return nlongs(n, 0, 0);
    }

    private static long[] nlongs(int n, int padL, int padR) {
        long[] a = new long[padL + n + padR];
        for (int i = 0; i < n; i++)
            a[padL + i] = nlong();
        return a;
    }

    private static double ndouble() {
        return sc.nextDouble();
    }
    
    private static double[] ndoubles(int n) {
        return ndoubles(n, 0, 0);
    }
    
    private static double[] ndoubles(int n, int padL, int padR) {
        double[] d = new double[n + padL + padR];
        for (int i = 0; i < n; i++) {
            d[padL + i] = ndouble();
        }
        return d;
    }

    private static String nstr() {
        return sc.next();
    }

    private static char[] nchars() {
        return sc.next().toCharArray();
    }

    private static char[] nchars(int padL, int padR) {
        char[] temp = sc.next().toCharArray();
        char[] ret = new char[temp.length + padL + padR];
        System.arraycopy(temp, 0, ret, padL, temp.length);
        return ret;
    }
    
    private static char[][] nchars2(int h, int w) {
        return nchars2(h, w, 0, 0);
    }

    private static char[][] nchars2(int h, int w, int padLU, int padRD) {
        char[][] a2 = new char[h + padLU + padRD][w + padLU + padRD];
        for (int i = 0; i < h; i++)
            System.arraycopy(nchars(), 0, a2[padLU + i], padLU, w);
        return a2;
    }
}
