import java.util.*;

public class Main {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int Z = scanner.nextInt();
        int W = scanner.nextInt();
        int[] a = new int[N + 2];
        a[0] = Z;
        a[1] = W;
        for (int i = 0; i < N; i++) {
            a[2 + i] = scanner.nextInt();
        }
        System.out.println(solve(a, 0, 1));
    }

    final static int MAX_N = 2048;

    static Integer[][] memo = new Integer[MAX_N][MAX_N];

    /**
     * それぞれ z 枚目, w 枚目を持っている局面での最適解。
     */
    static int solve(int[] a, int z, int w) {
        int n = Math.max(z, w) + 1;  // 取り終わっている枚数
        if (n == a.length) return Math.abs(a[z] - a[w]);

        // memoization
        if (memo[z][w] != null) return memo[z][w];

        // 差が何枚でも1枚差と結果は同じ
        if (Math.abs(z - w) > 1) {
            return z < w ? solve(a, w - 1, w) : solve(a, z, z - 1);
        }

        int m = z < w ? 0 : Integer.MAX_VALUE;
        int zz = z;
        int ww = w;
        for (int i = n; i < a.length; i++) {
            if (z < w) { zz = i; }
            else       { ww = i; }
            int mx = solve(a, zz, ww);
            m = z < w ? Math.max(m, mx) : Math.min(m, mx);
        }
        memo[z][w] = m;
        return m;
    }
}
