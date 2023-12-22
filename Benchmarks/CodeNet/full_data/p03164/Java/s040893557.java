import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int maxW = sc.nextInt();

        int maxV = 100000;

        int[][] dp = new int[n + 1][];
        dp[0] = new int[maxV + 1];

        for (int i = 1; i <= n; i++) {
            int w = sc.nextInt();
            int v = sc.nextInt();
            dp[i] = dp[i - 1].clone();
            for (int j = 1; j <= v; j++) {
                if (dp[i - 1][j] == 0) {
                    dp[i][j] = w;
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], w);
                }
            }
            for (int j = v + 1; j <= maxV - v; j++) {
                if (dp[i - 1][j - v] == 0) {
                    break;
                } else {
                    if (dp[i][j] == 0) {
                        dp[i][j] = dp[i - 1][j - v] + w;
                    } else {
                        dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - v] + w);
                    }
                }
            }
        }

        int ans = 0;

        for (int i = 1; i <= maxV; i++) {
            if (dp[n][i] == 0 || dp[n][i] > maxW) {
                continue;
            }
            ans = Math.max(ans, i);
        }

        System.out.println(ans);
    }
}