import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static long rec(int i, int j, int n, int[] a, long[][] dp) {
        if (dp[i][j] != Long.MAX_VALUE) {
            return dp[i][j];
        }

        int turn = n - (j - i);
        long d;
        if (turn % 2 == 0) {
            d = Math.max(rec(i + 1, j, n, a, dp) + a[i],
                    rec(i, j - 1, n, a, dp) + a[j - 1]);
        } else {
            d = Math.min(rec(i + 1, j, n, a, dp) - a[i], rec(i, j - 1, n, a, dp) - a[j - 1]);
        }

        return dp[i][j] = d;
    }

    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int[] a = new int[n];
        long[][] dp = new long[n + 1][n + 1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], Long.MAX_VALUE);
        }

        for (int i = 0; i < n; i++) {
            a[i] = std.nextInt();
        }

        for (int i = 0; i <= n; i++) {
            dp[i][i] = 0;
        }

        rec(0, n, n, a, dp);


        System.out.println(dp[0][n]);
    }
}
