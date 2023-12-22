
import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    static final Scanner sc  = new Scanner(System.in);
    static final int     MOD = (int) 1E9 + 7;
    
    static long[][] memo;
    static long[][] sum;
    
    public static void main(String[] args) {
        int N = nint();
        int[] a = nints(N, 1, 0);
        sum = new long[N+1][N+1];
        
        for (int h = 1; h <= N; h++) {
            sum[1][h] = sum[1][h-1] + a[h];
        }
        for (int h = 2; h <= N; h++) {
            for (int w = h; w <= N; w++) {
                sum[h][w] = sum[h-1][w] - sum[h-1][h-1];
            }
        }
        memo = new long[N+1][N+1];
        
        System.out.println(calcCost(1, N));
    }
    
    private static long calcCost(int from, int  to) {
        if (from == to) {
            return 0;
        }
        
        if (memo[from][to] != 0) {
            return memo[from][to];
        }
        
        long cost = Long.MAX_VALUE;
        for (int bet = from; bet < to; bet++) {
            long temp = calcCost(from, bet) + sum[from][to] + calcCost(bet + 1, to);
            cost = min(temp, cost);
        }
        memo[from][to] = cost;
        return cost;
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

    private static long min(long... ls) {
        return Arrays.stream(ls).min().getAsLong();
    }

    private static int min(int... is) {
        return Arrays.stream(is).min().getAsInt();
    }

    private static long max(long... ls) {
        return Arrays.stream(ls).max().getAsLong();
    }

    private static int max(int... is) {
        return Arrays.stream(is).max().getAsInt();
    }

    private static long abs(long a, long b) {
        return Math.abs(a - b);
    }
}
