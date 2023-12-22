import java.util.Scanner;

public class Main {

    static long dp[][];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int W = sc.nextInt();

        long[] wt = new long[N];
        long[] val = new long[N];
        dp = new long[W+1][N+1];

        for (int i = 0; i <= W; i++) {
            for (int j = 0; j <= N; j++) {
                dp[i][j] = -1;
            }
        }

        for (int i = 0; i < N;i++) {
            wt[i] = sc.nextInt();
            val[i] = sc.nextInt();
        }
        System.out.println(knapsack(wt, val, W, N));
    }

    public static long knapsack(long[] wt, long[] val, int W, int N) {
        if (N == 0 || W == 0) {
            return 0;
        }

        if (dp[W][N] != -1) {
            return dp[W][N];
        }

        if (wt[N-1] <= W) {
            dp[W][N] = Math.max(val[N-1] + knapsack(wt, val, (int) (W - wt[N-1]), N-1), knapsack(wt, val, W, N-1));
        } else {
            dp[W][N] = knapsack(wt, val, W, N-1);
        }
        return dp[W][N];
    }

}