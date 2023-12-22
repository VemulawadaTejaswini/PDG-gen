import java.util.*;
import java.math.*;
 
public class Main {
  private static int[][] dp;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    char[][] f = new char[m][n];
    int[][] num = new int[m][n];
    dp = new int[m][n];
    for(int i = 0; i < m; ++i) {
      String s = sc.next();
      f[i] = s.toCharArray();
      for(int j = n - 1; j >= 0; --j) {
        dp[i][j] = Integer.MAX_VALUE;
        if(f[i][j] == '#') {
          if(j == n - 1) num[i][j] = 1;
          else num[i][j] = num[i][j + 1] + 1;
        }
      }
    }
    solve(f, num, 0, 0, 0);
    System.out.println(dp[m - 1][n - 1]);
  }
  private static void solve(char[][] f, int[][] num, int x, int y, int step) {
      if(x == f.length || y == f[0].length) return;
      if(step < dp[x][y]) {
        if(f[x][y] == '.') {
            dp[x][y] = step;
        } else {
          step++;
          dp[x][y] = step;
          int mlen = num[x][y];
          for(int i = x + 1; i < f.length && num[i][y] != 0; ++i) {
              mlen = Math.min(mlen, num[i][y]);
              for(int j = y; j < mlen; ++j) {
                  dp[i][j] = Math.min(step, dp[i][j]);
              }
          }
        }
      }
      solve(f, num, x + 1, y, step);
      solve(f, num, x, y + 1, step);
    }
}