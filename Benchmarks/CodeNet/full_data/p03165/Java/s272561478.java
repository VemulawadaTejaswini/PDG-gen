import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static final Scanner sc  = new Scanner(System.in);
    static final int MOD = (int) 1E9 + 7;
    static final int INF = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        char[] s = nchars(1, 0);
        char[] t = nchars(1, 0);
        int ls = s.length;
        int lt = t.length;
        
        List<Integer>[][] dp = new ArrayList[ls][lt];
        for (int i = 0; i < ls; i++)
            for (int j = 0; j < lt; j++)
                dp[i][j] = new ArrayList<>();
        
        for (int is = 1; is < ls; is++) {
            for (int it = 1; it < lt; it++) {
                if (s[is] == t[it]) {
                    dp[is][it] = new ArrayList<Integer>(dp[is-1][it-1]);
                    dp[is][it].add(is);
                } else if (dp[is-1][it].size() >= dp[is][it-1].size()) {
                    dp[is][it] = new ArrayList<Integer>(dp[is-1][it]);
                } else {
                    dp[is][it] = new ArrayList<Integer>(dp[is][it-1]);
                }
            }
        }
        
        for (int i: dp[ls-1][lt-1]) {
            System.out.print(s[i]);
        }
        System.out.println();
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
