import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final Scanner sc  = new Scanner(System.in);
    static final int MOD = (int) 1E9 + 7;
    static final int INF = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        int N = nint();
        int W = nint();
        int maxV = 0;
        int[] ws = new int[N+1];
        int[] vs = new int[N+1];
        
        for (int i = 1; i <= N; i++) {
            ws[i] = nint();
            vs[i] = nint();
            maxV += vs[i];
        }
        
        long[][] dp = new long[N+1][maxV+1];
        for (int i = 0; i <= N; i++) {
            Arrays.fill(dp[i], INF);
        }
        for (int i = 1; i <= N; i++) {
            for (int v = 0; v <= maxV; v++) {
                if (v <= vs[i]) {
                    dp[i][v] = min(dp[i-1][v], ws[i]);
                } else {
                    dp[i][v] = min(dp[i-1][v], dp[i-1][v-vs[i]] + ws[i]);
                }
            }
        }
        for (int i = maxV; i >= 0; i--) {
            if (dp[N][i] <= W) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
    
    static long max(long... longs) {
        return Arrays.stream(longs).max().getAsLong();
    }
    
    static long min(long... longs) {
        return Arrays.stream(longs).min().getAsLong();
    }

    private static long nlong() {
        return sc.nextLong();
    }

    private static int nint() {
        return sc.nextInt();
    }

    private static String nstr() {
        return sc.next();
    }

    private static char[] nchars() {
        return sc.next().toCharArray();
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

    private static char[][] nchars2(int h, int w) {
        return nchars2(h, w, 0);
    }

    private static char[][] nchars2(int h, int w, int pad) {
        char[][] a2 = new char[h + pad * 2][w + pad * 2];
        for (int i = 0; i < h; i++)
            System.arraycopy(nchars(), 0, a2[pad + i], pad, w);
        return a2;
    }
}
