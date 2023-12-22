import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        long[][] dp = new long[n + 1][n + 1];
        dp[0][0] = 0;
        dp[0][1] = -(1l<<60);
        for (int i = 0; i < n; i++) {
            dp[i + 1][0] = Math.max(dp[i][0] + a[i], dp[i][1] - a[i]);
            dp[i + 1][1] = Math.max(dp[i][0] - a[i], dp[i][1] + a[i]);
        }

        System.out.println(dp[n][0]);
    }
}
