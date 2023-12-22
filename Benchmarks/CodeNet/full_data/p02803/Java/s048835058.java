import java.util.*;
import java.math.*;
 
public class Main {
  private static int[][] dp;
  private static char[][] grid;
  private static int res, m, n;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    m = sc.nextInt();
    n = sc.nextInt();
    grid = new char[m][n];
    dp = new int[m][n];
    int[][] f = new int[m][n];
    for(int i = 0; i < m; ++i) {
      String s = sc.next();
      for(int j = 0; j < n; ++j) {
        grid[i][j] = s.charAt(j);
        dp[i][j] = m * n;
      }
    }
    res = 0;
    for(int i = 0; i < m; ++i) {
      for(int j = 0; j < n; ++j) {
        dfs(i, j, 0);
        update(f);
      }
    }
    
    System.out.println(res);
  }
  private static void update(int[][] f) {
    for(int i = 0; i < m; ++i) {
      for(int j = 0; j < n; ++j) {
        if(dp[i][j] == m * n) continue;
        if(f[i][j] < dp[i][j]) f[i][j] = dp[i][j];
        if(res < f[i][j]) res = f[i][j];
        dp[i][j] = m * n;
      }
    }
  }
  
  private static void dfs(int i, int j, int step) {
    if(i < 0 || j < 0 || i == m || j == n || grid[i][j] == '#') return;
    if(dp[i][j] < step) return;
    dp[i][j] = step;
    dfs(i, j + 1, step + 1);
    dfs(i + 1, j, step + 1);
    dfs(i, j - 1, step + 1);
    dfs(i - 1, j, step + 1);
  }
}