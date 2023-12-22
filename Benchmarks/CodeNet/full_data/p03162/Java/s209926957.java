import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    private static final int INF = (int) 1e9 + 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        solve2(scanner, writer);
        scanner.close();
        writer.close();
    }

    public static void solve2(Scanner scanner, PrintWriter writer) {
        int n = scanner.nextInt();

        int[][] activities = new int[n][];
        for (int i = 0; i < n; i++) {
            activities[i] = new int[3];
            activities[i][0] = scanner.nextInt();
            activities[i][1] = scanner.nextInt();
            activities[i][2] = scanner.nextInt();
        }

        // dp[i][j] denote max points of day i-th if playing activity j
        int[] dp = new int[3];

        // First day
        dp[0] = activities[0][0];
        dp[1] = activities[0][1];
        dp[2] = activities[0][2];

        for (int i = 1; i < n; i++) {
            int[] new_dp = new int[3];
            new_dp[0] = Math.max(dp[1] + activities[i][0], dp[2] + activities[i][0]);
            new_dp[1] = Math.max(dp[0] + activities[i][1], dp[2] + activities[i][1]);
            new_dp[2] = Math.max(dp[0] + activities[i][2], dp[1] + activities[i][2]);

            dp = new_dp;
        }

        int ans = Math.max(dp[0], Math.max(dp[1], dp[2]));
        writer.println(ans);
    }
}
