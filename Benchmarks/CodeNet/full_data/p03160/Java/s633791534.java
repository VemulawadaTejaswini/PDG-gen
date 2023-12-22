import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static long[] dp = new long[100010];
    static long rec(int i, int[] hs) {
        if (dp[i] < Long.MAX_VALUE) {
            return dp[i];
        }

        if (i == 0) {
            return 0;
        }

        long min = rec(i - 1, hs) + Math.abs(hs[i] - hs[i - 1]);
        if (i >= 2) {
            long b2 = rec(i - 2, hs) + Math.abs(hs[i] - hs[i - 2]);
            min = Math.min(min, b2);
        }

        dp[i] = min;
        return dp[i];
    }

    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int[] hs = new int[n];
        for (int i = 0; i < n; i++) {
            hs[i] = std.nextInt();
        }

        Arrays.fill(dp, Long.MAX_VALUE);
        dp[0] = 0;
        
        System.out.println(rec(n - 1, hs));
    }
}
