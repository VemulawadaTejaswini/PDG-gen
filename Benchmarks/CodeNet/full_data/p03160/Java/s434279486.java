import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] stones = new int[n];
        for (int i = 0; i < n; i++) {
            stones[i] = scanner.nextInt();
        }
        int[] dp = new int[n];
        int[] cal = new int[n];
        System.out.println(minInjured(stones, n - 1, dp, cal));
    }

    public static int minInjured(int[] stones, int n, int[] dp,int[] cal) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return Math.abs(stones[1] - stones[0]);
        }

        if (cal[n] == 1) {
            return dp[n];
        }

        if (cal[n-1] != 1) {
            dp[n - 1] = minInjured(stones, n - 1, dp, cal);
            cal[n - 1] = 1;
        }
        if (dp[n - 2] != 1) {
            dp[n - 2] = minInjured(stones, n - 2, dp, cal);
            cal[n - 2] = 1;
        }
        
        dp[n] = Math.min(dp[n - 1] + Math.abs(stones[n] - stones[n - 1]),
                dp[n - 2] + Math.abs(stones[n] - stones[n - 2]));
        return dp[n];
    }
}