import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int W = std.nextInt();
        long[][] dp = new long[n + 1][W + 1];
        int[] w = new int[n];
        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            w[i] = std.nextInt();
            v[i] = std.nextInt();
        }

        dp[0][0] = 0;

        for (int i = 0; i < n; i++) {
            for (int sum_w = 0; sum_w <= W; sum_w++) {
                if (sum_w - w[i] >= 0) {
                    dp[i + 1][sum_w] = Math.max(dp[i][sum_w], dp[i][sum_w - w[i]] + v[i]);
                } else {
                    dp[i + 1][sum_w] = dp[i][sum_w];
                }
            }
        }

        System.out.println(dp[n][W]);
    }
}