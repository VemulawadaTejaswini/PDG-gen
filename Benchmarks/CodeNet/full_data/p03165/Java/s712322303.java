import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final Scanner sc  = new Scanner(System.in);
    static final int MOD = (int) 1E9 + 7;
    static final int INF = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        char[] s = nchars(1, 0);
        char[] t = nchars(1, 0);
        solve(s, t);
    }
    
    static void solve(char[] s, char[] t) {
        int ls = s.length;
        int lt = t.length;
        
        int[][] len = new int[ls][lt];
        int[][] prev = new int[ls][lt];
        final int PREV_ST = 1;
        final int PREV_S = 2;
        final int PREV_T = 3;
                    
        for (int is = 1; is < ls; is++) {
            for (int it = 1; it < lt; it++) {
                
                if (s[is] == t[it]) {
                    len[is][it] = len[is-1][it-1] + 1;
                    prev[is][it] = PREV_ST;
                    
                } else {
                    if (len[is-1][it] >= len[is][it-1]) {
                        len[is][it] = len[is-1][it];
                        prev[is][it] = PREV_S;
                    } else {
                        len[is][it] = len[is][it-1];
                        prev[is][it] = PREV_T;
                    }
                }
            }
        }
        StringBuffer sb = new StringBuffer();
        int is = ls-1;
        int it = lt-1;
        while (true) {
            if (s[is] == t[it]) {
                sb.append(s[is]);
            }
            int p = prev[is][it];
            if (p == PREV_S || p == PREV_ST) is--;
            if (p == PREV_T || p == PREV_ST) it--;
            if (is <= 0 || it <= 0) {
                break;
            }
        }
        String ans = sb.reverse().toString();
        System.out.println(ans.length());
        System.out.println(sb.reverse().toString());
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
