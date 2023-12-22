import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final Scanner sc  = new Scanner(System.in);
    static final int     MOD = (int) 1E9 + 7;

    public static void main(String[] args) {
        int N = nint();
        int W = nint();
        int[] ws = new int[N+1];
        int[] vs = new int[N+1];
        for (int i = 0; i < N; i++) {
            ws[i+1] = nint();
            vs[i+1] = nint();
        }
        
        long[][] sum = new long[N+1][W+1];
        for (int n = 1; n <= N; n++) {
            for (int w = 1; w <= W; w++) {
                long sumWithN = w - ws[n] >= 0 ? sum[n-1][w-ws[n]] + vs[n] : 0;
                long sumWithoutN = sum[n-1][w];
                sum[n][w] = max(sumWithN, sumWithoutN);
            }
        }
        
        System.out.println(sum[N][W]);
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
