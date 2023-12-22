import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int k = std.nextInt();
        int[] hs = new int[n];
        long[] dp = new long[n + 1];
        for (int i = 0; i < n; i++) {
            hs[i] = std.nextInt();
        }
        Arrays.fill(dp, Long.MAX_VALUE);

        dp[0] = 0;

        long ans = rec(dp, n - 1, k, hs);
        System.out.println(ans);
    }

    static long rec(long[] dp, int i, int step, int[] hs) {
        if (dp[i] < Long.MAX_VALUE) {
            return dp[i];
        }

        if (i == 0) {
            dp[0] = 0;
            return 0;
        }

        long min = Long.MAX_VALUE;
        for (int j = 1; j <= step; j++) {
            if (j > i) {
                continue;
            }
            long cost = rec (dp,i - j, step, hs) + Math.abs(hs[i] - hs[i - j]);
            min = Math.min(cost, min);
        }

        dp[i] = min;
        return dp[i];
    }
}
