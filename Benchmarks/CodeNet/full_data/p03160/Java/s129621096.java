import java.util.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = Math.abs(h[1] - h[0]);
        for (int i = 2; i < n; i++) {
            int h1 = (int) Math.abs(h[i - 1] - h[i]);
            int h2 = (int) Math.abs(h[i - 2] - h[i]);
            dp[i + 1] = Math.min(dp[i] + h1, dp[i - 1] + h2);
        }
        System.out.println(dp[n]);
        sc.close();
    }
}
