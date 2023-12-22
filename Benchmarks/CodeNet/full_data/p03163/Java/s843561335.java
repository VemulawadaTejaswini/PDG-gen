import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int w = sc.nextInt();
        int [] a = new int[n+1]; int [] v = new int[n+1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt(); v[i] = sc.nextInt();
        }
        long [][] dp = new long[n+1][w+1];
        for (long [] arr: dp) Arrays.fill(arr, Long.MIN_VALUE);
        dp[0][0] = 0; long ans = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                dp[i][j] = Math.max(dp[i][j], dp[i-1][j]);
                if (j - a[i] < 0) continue;
                dp[i][j] = Math.max(dp[i][j], dp[i-1][j - a[i]] + v[i]);
                ans = Math.max(ans, dp[i][j]);
            }
        }
        System.out.println(ans);
    }


}