import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static final int MOD = 1_000_000_007;
   	public long countPaths(int h, int w, char[][] grid) {
        int[][] dp = new int[h][w];
        for (int i = h - 1; i >= 0; i--) {
            for (int j = w - 1; j >= 0; j--) {
                if (grid[i][j] == '#') {
                    continue;
                }
                if (i  == h - 1 && j == w - 1) {
                    dp[i][j] = 1;
                } else if (i == h - 1) {
                    dp[i][j] = (dp[i][j + 1]) % MOD;
                } else if (j == w - 1) {
                    dp[i][j] = (dp[i + 1][j]) % MOD;
                } else {
                    dp[i][j] = (dp[i + 1][j] + dp[i][j + 1]) % MOD;
                }
            }
        }
        return dp[0][0];
    }
    public static void main(String[] args)  {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] split = br.readLine().split(" ");
            int h = Integer.parseInt(split[0]);
            int w = Integer.parseInt(split[1]);
          	char[][] grid = new char[h][w];
            for (int i = 0; i < h; i++) {
                grid[i] = br.readLine().toCharArray();
            }
          	Main app = new Main();
            long result = app.countPaths(h, w, grid);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
