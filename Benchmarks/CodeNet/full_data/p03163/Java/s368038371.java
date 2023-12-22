import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;
    long[][] dp;
    boolean A, B, C;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] w = new int[N + 1];
        int[] v = new int[N + 1];
        dp = new long[N+1][W + 1];
        for (int i = 1; i <= N; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <= W; j++) {
                if (j < w[i]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i]] + v[i]);
                }
            }
        }
        System.out.println(dp[N][W]);
    }
}
