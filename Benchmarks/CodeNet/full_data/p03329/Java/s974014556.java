import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];

        for (int i = 0; i <= n; i++) {
            dp[i] = (int) 1e8;
        }

        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = Math.min(dp[i], dp[i - 1] + 1);
            if (i < 6) { continue; }
            for (int k = 6; k <= n; k *= 6) {
                if (i - k >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - k] + 1);
                }
            }
            for (int l = 9; l <= n; l *= 9) {
                if (i - l >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - l] + 1);
                }
            }
        }
        System.out.println(dp[n]);
    }
}