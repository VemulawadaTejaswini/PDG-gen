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
        System.out.println(minInjured(stones, n - 1, dp));
    }

    public static int minInjured(int[] stones, int n,int[] dp) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return Math.abs(stones[1] - stones[0]);
        }

        if (dp[n] > 0) {
            return dp[n];
        }

        return Math.min(minInjured(stones, n - 1, dp) + Math.abs(stones[n] - stones[n - 1]),
                minInjured(stones, n - 2, dp) + Math.abs(stones[n] - stones[n - 2]));
    }
}