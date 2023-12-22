import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) { 
        new Thread(null, () -> {
            Solver solver = new Solver();
            solver.solve();
        }, "please_ac", 1 << 20).start();
    }   

    private static class Solver {
        static final int base = 80 * 80 + 1;
        int[][][] dp;
        int[][] a, b;
        int n, m;

        public void solve() {
            Scanner in = new Scanner(System.in);
            n = in.nextInt();
            m = in.nextInt();
            a = new int[n][m];
            b = new int[n][m];
            
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j) {
                    a[i][j] = in.nextInt();
                }
            }
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j) {
                    b[i][j] = in.nextInt();
                }
            }

            dp = new int[n][m][base * 2 + 123];
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j) {
                    Arrays.fill(dp[i][j], Integer.MAX_VALUE);
                }
            }
            
            System.out.println(dp(0, 0, 0));
        }

        private int dp(int i, int j, int diff) {
            if (i == n - 1 && j == m - 1) {
                return Math.min(
                    Math.abs(diff + a[i][j] - b[i][j]),
                    Math.abs(diff + b[i][j] - a[i][j])
                );
            }

            if (dp[i][j][base + diff] != Integer.MAX_VALUE) 
                return dp[i][j][base + diff];
            
            int min = Integer.MAX_VALUE;
            if (i + 1 < n) {
                min = Math.min(min, dp(i + 1, j, diff + a[i][j] - b[i][j]));
                min = Math.min(min, dp(i + 1, j, diff + b[i][j] - a[i][j]));
            }

            if (j + 1 < m) {
                min = Math.min(min, dp(i, j + 1, diff + a[i][j] - b[i][j]));
                min = Math.min(min, dp(i, j + 1, diff + b[i][j] - a[i][j]));
            }

            return dp[i][j][base + diff] = min;
        }

    }
}