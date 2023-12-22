import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {
    static int n;
    static int W;
    static long[][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        W = sc.nextInt();
        dp = new long[n + 1][1000 * n + 1];
        for (int i = 0; i < n+1; i++) {
            for (int j = 1; j < dp[i].length; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        for (int i = 0; i < n; i++) {
            int w = sc.nextInt();
            int v = sc.nextInt();
            dp[i + 1][v] = Math.min(w, dp[i][v]);
            for (int j = v; j < dp[0].length; j++) {
                dp[i + 1][j] = Math.min(dp[i][j], dp[i][j - v] + w);
            }


        }
        int max = 0;
        for (int i = 0; i < dp[n].length; i++) {
            if (dp[n][i] <= W) max = i;
        }
        System.out.println(max);
    }

}
