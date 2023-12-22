
import lib.FastScanner;

public class Main {
    public static void main(String[] args) {
        FastScanner fsc = new FastScanner();
        int n = fsc.nextInt();
        int a = fsc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = fsc.nextInt() - a;
        }
        long[][] dp = new long[n][5010];
        int inflation = 2505;
        dp[0][0 + inflation] = 1;
        dp[0][x[0] + inflation] += 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 5010; j++) {
                if (dp[i - 1][j] > 0) {
                    dp[i][j] += dp[i - 1][j];
                    dp[i][j + x[i]] += dp[i - 1][j];
                }
            }
        }
        System.out.println(dp[n - 1][0 + inflation] - 1);
    }
}
