import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final Scanner sc  = new Scanner(System.in);
    static final int MOD = (int) 1E9 + 7;
    static final int INF = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        int N = nint();
        final int A = 1, G = 2, C = 3, T = 4;
        final int[] cs = {A, G, C, T};
        
        int[][][][] dp = new int[N+1][5][5][5]; // [文字列の長さL][L-2文字目][L-1文字目][L文字目]
        dp[0][4][4][4] = 1;
        
        for (int n = 1; n <= N; n++) {
            for (int c3 : cs) {
                for (int c2 : cs) {
                    for (int c1 : cs) {
                        for (int cn : cs) {
                            if (           c2 == A && c1 == G && cn == C) continue;
                            if (           c2 == A && c1 == C && cn == G) continue;
                            if (           c2 == G && c1 == A && cn == C) continue;
                            if (c3 == A &&            c1 == G && cn == C) continue;
                            if (c3 == A && c2 == G            && cn == C) continue;
                            
                            dp[n][c2][c1][cn] += dp[n-1][c3][c2][c1];
                            dp[n][c2][c1][cn] %= MOD;
                        }
                    }
                }
            }
        }
        
        int ans = 0;
        for (int c3 : cs) {
            for (int c2 : cs) {
                for (int c1 : cs) {
                    ans += dp[N][c3][c2][c1];
                    ans %= MOD;
                }
            }
        }
        System.out.println(ans);
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

    private static char[] nchars(int padL, int padR) {
        char[] temp = sc.next().toCharArray();
        char[] ret = new char[temp.length + padL + padR];
        System.arraycopy(temp, 0, ret, padL, temp.length);
        return ret;
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

    private static long[] nlongs(int n) {
        return nlongs(n, 0, 0);
    }

    private static long[] nlongs(int n, int padL, int padR) {
        long[] a = new long[padL + n + padR];
        for (int i = 0; i < n; i++)
            a[padL + i] = nlong();
        return a;
    }
    
    private static double[] ndoubles(int n) {
        return ndoubles(n, 0, 0);
    }
    
    private static double[] ndoubles(int n, int padL, int padR) {
        double[] d = new double[n + padL + padR];
        for (int i = 0; i < n; i++) {
            d[padL + i] = sc.nextDouble();
        }
        return d;
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
