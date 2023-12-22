import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[][] happiness = new int[n][3];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < 3; ++j) {
                happiness[i][j] = scan.nextInt();
            }
        }

        int[][] dp = new int[n][3];
        dp[0] = happiness[0];

        for (int i = 1; i < n; ++i) {
            dp[i][0] = happiness[i][0] + Math.max(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] = happiness[i][1] + Math.max(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] = happiness[i][2] + Math.max(dp[i - 1][0], dp[i - 1][1]);
        }

        System.out.println(Math.max(dp[n - 1][0], Math.max(dp[n - 1][1], dp[n - 1][2])));
    }
}
