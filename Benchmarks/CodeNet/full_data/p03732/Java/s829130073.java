import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        long[] w = new long[n];
        int[] v = new int[n];
        int maxv = 0;
        for (int i = 0; i < n; i++) {
            w[i] = Integer.parseInt(sc.next());
            v[i] = Integer.parseInt(sc.next());
            if (maxv < v[i]) {
                maxv = v[i];
            }
        }
        long[][] dp = new long[n + 1][maxv * n + 1];
        Arrays.fill(dp[0], 1_000_000_005);
        dp[0][0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < maxv * n + 1; j++) {
                if (j < v[i]) {
                    dp[i + 1][j] = dp[i][j];
                } else {
                    dp[i + 1][j] = Math.min(dp[i][j], dp[i][j - v[i]] + w[i]);
                }
            }
        }
        long ans = 0;
        for (int i = 0; i < maxv * n + 1; i++) {
            if (dp[n][i] <= W) {
                ans = Math.max(ans, i);
            }
        }
        System.out.println(ans);
    }
}