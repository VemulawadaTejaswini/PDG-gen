import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final Scanner sc    = new Scanner(System.in);
    static final int     MOD   = (int) 1E9 + 7;
    static final long    INF_L = (long) 4E18;

    public static void main(String[] args) {
        char[] s = nchars(1, 0);
        char[] t = nchars(1, 0);
        
        int sLen = s.length - 1; // パディング分を相殺
        int tLen = t.length - 1; // 同上
        
        long[][] lcsLen = new long[sLen + 1][tLen + 1];
        
        for (int si = 1; si <= sLen; si++) {
            for (int ti = 1; ti <= tLen; ti++) {
                if (s[si] == t[ti]) {
                    lcsLen[si][ti] = lcsLen[si-1][ti-1] + 1;
                } else {
                    lcsLen[si][ti] = max(lcsLen[si-1][ti], lcsLen[si][ti-1]);
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int si = sLen, ti = tLen; si > 0 && ti > 0; ) {
            if (s[si] == t[ti]) {
                sb.append(s[si]);
                si--;
                ti--;
                
            } else {
                if (lcsLen[si-1][ti] < lcsLen[si][ti]) {
                    ti--;
                } else {
                    si--;
                }
            }
        }
        
        System.out.println(sb.reverse().toString());
    }

    @Deprecated
    static int nint() {
        return sc.nextInt();
    }

    @Deprecated
    private static int[] nints(int n) {
        return nints(n, 0, 0);
    }

    @Deprecated
    private static int[] nints(int n, int padL, int padR) {
        int[] a = new int[padL + n + padR];
        for (int i = 0; i < n; i++)
            a[padL + i] = nint();
        return a;
    }

    static long nlong() {
        return sc.nextLong();
    }

    static long[] nlongs(int n) {
        return nlongs(n, 0, 0);
    }

    static long[] nlongs(int n, int padL, int padR) {
        long[] a = new long[padL + n + padR];
        for (int i = 0; i < n; i++)
            a[padL + i] = nlong();
        return a;
    }

    static double ndouble() {
        return sc.nextDouble();
    }

    static double[] ndoubles(int n) {
        return ndoubles(n, 0, 0);
    }

    static double[] ndoubles(int n, int padL, int padR) {
        double[] d = new double[n + padL + padR];
        for (int i = 0; i < n; i++) {
            d[padL + i] = ndouble();
        }
        return d;
    }

    static String nstr() {
        return sc.next();
    }

    static char[] nchars() {
        return sc.next().toCharArray();
    }

    static char[] nchars(int padL, int padR) {
        char[] temp = sc.next().toCharArray();
        char[] ret = new char[temp.length + padL + padR];
        System.arraycopy(temp, 0, ret, padL, temp.length);
        return ret;
    }

    static char[][] nchars2(int h, int w) {
        return nchars2(h, w, 0, 0);
    }

    static char[][] nchars2(int h, int w, int padLU, int padRD) {
        char[][] a2 = new char[h + padLU + padRD][w + padLU + padRD];
        for (int i = 0; i < h; i++)
            System.arraycopy(nchars(), 0, a2[padLU + i], padLU, w);
        return a2;
    }

    static long min(long... ls) {
        return Arrays.stream(ls).min().getAsLong();
    }

    static long max(long... ls) {
        return Arrays.stream(ls).max().getAsLong();
    }

    static long abs(long a) {
        return Math.abs(a);
    }
}
