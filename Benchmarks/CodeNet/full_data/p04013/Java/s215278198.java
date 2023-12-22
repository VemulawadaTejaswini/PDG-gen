

import java.math.BigDecimal;
        import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        
        long[][][] dp = new long[n+1][n+1][a*n+1];
        
        dp[0][0][0] = 1;

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                for (int j = 0; j <= a*n; j++) {
                    dp[i + 1][k][j] += dp[i][k][j];
                    if (j >= x[i]) dp[i + 1][k + 1][j] += dp[i][k][j - x[i]];
                }
            }

        }

        long ans = 0;
        for (int k = 1; k <= n; k++) {
            ans += dp[n][k][k * a];
        }
        System.out.println(ans);

    }

}