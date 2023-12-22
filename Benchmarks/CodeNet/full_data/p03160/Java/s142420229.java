import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final Scanner sc  = new Scanner(System.in);
    static final int     MOD = (int) 1E9 + 7;
    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        int N = nint();
        int[] h = nints(N, 0, 2);
        
        int[] cost = new int[N+2];
        Arrays.fill(cost, INF);
        cost[0] = 0;
        
        for (int i = 0; i < N; i++) {
            cost[i+1] = Math.min(cost[i] + Math.abs(h[i] - h[i+1]), cost[i+1]);
            cost[i+2] = Math.min(cost[i] + Math.abs(h[i] - h[i+2]), cost[i+2]);
        }
        
        System.out.println(cost[N-1]);
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
