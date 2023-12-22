import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    static final Scanner sc  = new Scanner(System.in);
    static final int     MOD = (int) 1E9 + 7;

    public static void main(String[] args) {
        int N = nint();
        final int A = 0, B = 1, C = 2;
        
        long[][] value = new long[3][N+1];
        for (int n = 0; n < N; n++) {
            for (int i = A; i <= C; i++) {
                value[i][n+1] = nlong();
            }
        }
        
        long[][] sum = new long[3][N+1];
        for (int i = A; i <= C; i++) {
            sum[i][1] = value[i][1];
        }
        
        
        for (int n = 2; n <= N; n++) {
            for (int i = A; i <= C; i++) {
                sum[i][n] = max(sum[(i+1)%3][n-1], sum[(i+2)%3][n-1]) + value[i][n];
            }
        }
        
        System.out.println(IntStream.rangeClosed(A, C).mapToLong(i -> sum[i][N]).max().getAsLong());
    }

    @Deprecated
    private static int nint() {
        return sc.nextInt();
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

    private static long min(long... ls) {
        return Arrays.stream(ls).min().getAsLong();
    }

    private static long max(long... ls) {
        return Arrays.stream(ls).max().getAsLong();
    }

    private static long abs(long a) {
        return Math.abs(a);
    }
}
