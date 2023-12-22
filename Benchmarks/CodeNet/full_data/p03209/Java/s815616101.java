import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int[] f = new int[n + 1];
    f[0] = 1;
    for(int i = 1; i <= n; i++) {
      f[i] = 2 * f[i - 1] + 3;
    }
    int[][] dp = new int[n + 1][f[n] + 1];
    dp[0][1] = 1;
    for(int i = 1; i <= n; i++) {
      for(int j = 2; j <= f[i]; j++) {
        if(j <= (1 + f[i - 1])) {
          dp[i][j] = dp[i - 1][j - 1];
        } else if(j == (2 + f[i - 1])) {
          dp[i][j] = dp[i - 1][f[i - 1]] + 1;
        } else if(j < f[i]) {
          dp[i][j] = dp[i - 1][f[i - 1]] + 1 + dp[i - 1][j - 2 - f[i - 1]];
        } else {
          dp[i][j] = 2 * dp[i - 1][f[i - 1]] + 1; 
        }
      }
    }
    System.out.println(dp[n][x]);
  }
}