import java.util.Scanner;

public class Main {
    static final Scanner sc = new Scanner(System.in);
    static final int MOD = (int) 1E9 + 7;
    
    public static void main(String[] args) {
        int N = nint();
        int K = nint();
        char[] S = nsToChars();
        
        int[] c = new int[N+2];
        int i_c = 0;
        char cur = '0';
        for (int n = 0; n < N; n++) {
            if (cur != S[n]) {
                i_c++;
                cur = S[n];
            }
            c[i_c]++;
        }
        if (cur == '1') {
            i_c++;
        }
        
        int[] c2 = new int[i_c+3];
        System.arraycopy(c, 0, c2, 1, i_c+1);
        
        int[] sum = new int[c2.length];
        for (int i = 1; i < sum.length; i++) {
            sum[i] = sum[i-1] + c2[i];
        }
        
        int range = 2*K;
        if (range >= sum.length) {
            System.out.println(N);
            return;
        }
        
        int ans = sum[range];
        for (int i = 2; i + range < sum.length; i += 2) {
            ans = Math.max(ans, sum[i+range] - sum[i-1]);
        }
        System.out.println(ans);
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

    private static char[] nsToChars() {
        return sc.next().toCharArray();
    }

    private static long[] nlongs(int n) {
        return nlongs(n, 0, 0);
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

    private static long[] nlongs(int n, int padL, int padR) {
        long[] a = new long[padL + n + padR];
        for (int i = 0; i < n; i++)
            a[padL + i] = nlong();
        return a;
    }

    private static String[] nstrs(int n) {
        String[] a = new String[n];
        for (int i = 0; i < n; i++)
            a[i] = nstr();
        return a;
    }

    private static char[][] nsToChars2D(int h, int w) {
        return nsToChars2D(h, w, 0);
    }

    private static char[][] nsToChars2D(int h, int w, int pad) {
        char[][] a2 = new char[h + pad * 2][w + pad * 2];
        for (int i = 0; i < h; i++)
            System.arraycopy(nsToChars(), 0, a2[pad + i], pad, w);
        return a2;
    }
}
