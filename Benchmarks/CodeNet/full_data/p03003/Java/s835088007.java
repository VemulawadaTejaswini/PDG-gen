import java.util.*;

public class Main {
    static final int MOD = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] sArr = new int[n];
        for (int i = 0; i < n; i++) {
            sArr[i] = sc.nextInt();
        }
        int[] tArr = new int[m];
        for (int i = 0; i < m; i++) {
            tArr[i] = sc.nextInt();
        }
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                dp[i][j] = (dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1]) % MOD;
                if (sArr[i - 1] == tArr[j - 1]) {
                    dp[i][j] += dp[i - 1][j - 1] + 1;
                    dp[i][j] %= MOD;
                }
            }
        }
        System.out.println(dp[n][m] + 1);
    }
}