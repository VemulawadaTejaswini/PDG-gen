import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static long rec(int i, int j, long[] b, long[][] dp) {
        if (dp[i][j] != Long.MAX_VALUE) {
            return dp[i][j];
        }

        if (j - i == 1) {
            return dp[i][j] = 0;
        }

        for (int k = 1; k < (j - i); k++) {
            dp[i][j] = Math.min(dp[i][j], rec(i, i + k, b, dp) + rec(i + k, j, b, dp));
        }

        return dp[i][j] = dp[i][j] + b[j] - b[i];
    }

    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int[] a = new int[n];
        long[] b = new long[n + 1];
        for (int i = 0; i < n; i++) {
            a[i] = std.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i + 1] = a[i] + b[i];
        }

        long[][] dp = new long[n+1][n+1];
        for (int i = 0; i < n+1; i++) {
            Arrays.fill(dp[i], Long.MAX_VALUE);
        }

        long res = rec(0, n, b, dp);
        System.out.println(res);
    }
}
