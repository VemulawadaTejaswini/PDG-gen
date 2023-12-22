import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int val = 0;
        int[] weights = new int[n];
        int[] value = new int[n];
        for (int i=0; i<n; i++) {
            weights[i] = sc.nextInt();
            value[i] = sc.nextInt();
            val += value[i];
        }
        long[][] dp = new long[n+1][val+1];
        for (int i=1; i<=val; i++) dp[0][i] = Integer.MAX_VALUE;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=val; j++) {
                dp[i][j] = dp[i-1][j];
                if (j >= value[i-1]) {
                    dp[i][j] = Math.min(dp[i][j], weights[i-1] + dp[i-1][j-value[i-1]]);
                }
            }
        }
        for (int i=val; i>=1; i--) {
            if (dp[n][i] <= w) {
                System.out.println(i);
                break;
            }
        }
    }
}