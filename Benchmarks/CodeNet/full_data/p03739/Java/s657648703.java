import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final Scanner sc    = new Scanner(System.in);
    static final int     MOD   = (int) 1E9 + 7;
    static final long    INF_L = (long) 4E18;

    public static void main(String[] args) {
        int n = nint();
        int[] a = nints(n);
        
        boolean a0was0 = a[0] == 0;
        if (a0was0) {
            a[0] = 1;
        }
        long ans = solve(a);
        a[0] = -a[0];
        ans = min(solve(a) + 2*abs(a[0]), ans);
        if (a0was0) ans++;
        
        System.out.println(ans);
    }
    
    static long solve(int[] a) {
        if (a[0] == 0) throw new AssertionError();
        
        int n = a.length;
        long currentSum = a[0];
        long count = 0;
        
        for (int i = 1; i < n; i++) {
            long nextSumTemp = currentSum + a[i];
            
            if (nextSumTemp == 0) {
                nextSumTemp = (currentSum > 0) ? -1 : 1; // いま正なら負になるように操作する
                count++;
                
            } else if (currentSum > 0 == nextSumTemp > 0) {
                nextSumTemp = currentSum > 0 ? -1 : 1;
                count += abs(-a[i] + nextSumTemp - currentSum);
            }
            currentSum = nextSumTemp;
        }
        return count;
    }

    @Deprecated
    static int nint() {
        return sc.nextInt();
    }

    @Deprecated
    static int[] nints(int N) {
        return nints(N, 0, 0);
    }

    @Deprecated
    private static int[] nints(int N, int padL, int padR) {
        int[] a = new int[padL + N + padR];
        for (int i = 0; i < N; i++)
            a[padL + i] = nint();
        return a;
    }

    static long nlong() {
        return sc.nextLong();
    }

    static long[] nlongs(int N) {
        return nlongs(N, 0, 0);
    }

    static long[] nlongs(int N, int padL, int padR) {
        long[] a = new long[padL + N + padR];
        for (int i = 0; i < N; i++)
            a[padL + i] = nlong();
        return a;
    }

    static double ndouble() {
        return sc.nextDouble();
    }

    static double[] ndoubles(int N) {
        return ndoubles(N, 0, 0);
    }

    static double[] ndoubles(int N, int padL, int padR) {
        double[] d = new double[N + padL + padR];
        for (int i = 0; i < N; i++) {
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

    static char[][] nchars2(int H, int W) {
        return nchars2(H, W, 0, 0);
    }

    static char[][] nchars2(int H, int W, int padLU, int padRD) {
        char[][] a2 = new char[H + padLU + padRD][W + padLU + padRD];
        for (int i = 0; i < H; i++)
            System.arraycopy(nchars(), 0, a2[padLU + i], padLU, W);
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
