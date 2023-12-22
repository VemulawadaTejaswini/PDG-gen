import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;
    long[] dp;
    int[] p;
    int[][] ab;
    int N;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int Q = sc.nextInt();
        ab = new int[N + 1][N + 1];
        dp = new long[N + 1];
        for (int i = 0; i < N - 1; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            ab[x][y] = 1;
        }
        p = new int[N + 1];
        for (int i = 0; i < Q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            p[a] += b;
        }
        dp[1] = p[1];
        ans(1);
        for (int i = 1; i <= N; i++) {
            System.out.println(dp[i]);
        }
    }

    int ans(int n) {
        for (int i = 1; i <= N; i++) {
            if (ab[n][i] == 1) {
                dp[i] += dp[n] + p[i];
                ans(i);
            }
        }
        return 0;
    }

}