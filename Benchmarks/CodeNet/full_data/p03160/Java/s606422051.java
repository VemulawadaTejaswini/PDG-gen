
import java.io.*;
import java.util.*;

/*
dp[i][j] = w ;  w is the min weight with which
		you can get total value j using the first
		i items...
*/
public class Main {

    private static int n;
    private static long c;
    private static long[] w, v;
    private static long[][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        c = sc.nextLong();
        w = new long[n + 1];
        v = new long[n + 1];
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            w[i] = sc.nextLong();
            v[i] = sc.nextLong();
            sum += v[i];
        }
        dp = new long[n + 1][sum + 1];

        System.out.println(findknapsack(sum));

    }

    private static long findknapsack(int sum) {
        for (int i = 0; i <= sum; i++) {
            dp[0][i] = 1000 * 1000 * 1000;
        }

        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (v[i] <= j) {
                    dp[i][j] = Math.min(w[i] + dp[i - 1][j - (int) v[i]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        long ans = 0;
        for (int i = 0; i <= sum; i++) {
            if (dp[n][i] <= c) {
                ans = Math.max(i, ans);
            }
        }
        return ans;
    }

}