import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] hs = new int[n];
        for (int i = 0; i < n; i++) {
            hs[i] = sc.nextInt();
        }

        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = dp[1] = 0;
        dp[2] = Math.abs(hs[1] - hs[0]);
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j <= Math.min(k, i - 1); j++) {
                dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(hs[i - 1] - hs[i - j - 1]));
            }
        }

        System.out.println(dp[n]);
    }
}
