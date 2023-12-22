import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            // DP(動的計画法)で解く
            int[] dp = new int[n + 1];

            // n <= 100,000
            for (int i = 0; i <= n; i++) {
                dp[i] = i;
                // 6の倍数
                for (int j = 6;; j *= 6) {
                    if (i - j >= 0) {
                        if (dp[i] > dp[i - j] + 1) {
                            dp[i] = dp[i - j] + 1;
                        }
                    } else {
                        break;
                    }
                }
                // 9の倍数
                for (int j = 9;; j *= 9) {
                    if (i - j >= 0) {
                        if (dp[i] > dp[i - j] + 1) {
                            dp[i] = dp[i - j] + 1;
                        }
                    } else {
                        break;
                    }
                }
            }

            System.out.println(dp[n]);
        }
    }

}
