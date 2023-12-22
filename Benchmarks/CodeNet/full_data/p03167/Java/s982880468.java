
import java.io.*;
import java.util.*;

public class Main {
    private static long solve(int n, int m, char[][] grid, long[][] dp) {
        dp[0][0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '#')
                    continue;
                if (i - 1 >= 0)
                    dp[i][j] = (dp[i][j] + dp[i - 1][j]) % 1000000009;

                if (j - 1 >= 0) {
                    dp[i][j] = (dp[i][j] + dp[i][j - 1]) % 1000000009;
                }
            }
        }
        // System.out.println(Arrays.deepToString(dp));
        return dp[n - 1][m - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        long[][] dp = new long[n][m];
        char[][] grid = new char[n][m];

        for (int i = 0; i < n; i++) {
            String temp = sc.next();
            for (int j = 0; j < m; j++) {
                grid[i][j] = temp.charAt(j);
            }
        }
        // System.out.println(Arrays.deepToString(grid));
        System.out.println(solve(n, m, grid, dp));

    }
}