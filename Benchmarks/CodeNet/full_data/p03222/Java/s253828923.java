import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int k = sc.nextInt() - 1;
    long MOD = (long)Math.pow(10, 9) + 7;
    long[][][] dp = new long[w][w][h + 1];
    if(w == 1) {
      System.out.println(1);
    } else {
      long r1 = (long)Math.pow(2, w - 2);
      long r2 = 1;
      if(w >= 3) r2 = (long)Math.pow(2, w - 3);
      dp[0][0][1] = r1;
      dp[0][1][1] = r2;
      dp[w - 1][w - 1][1] = r1;
      dp[w - 1][w - 2][1] = r2;
      for(int i = 1; i < w - 1; i++) {
        dp[i][i][1] = r2;
        dp[i][i - 1][1] = r2;
        dp[i][i + 1][1] = r2;
      }
      for(int s = 2; s <= h; s++) {
        for(int i = 0; i < w; i++) {
          for(int j = 0; j < w; j++) {
            if(i == 0) {
              dp[0][j][s] = (r1 * dp[0][j][s - 1]) % MOD;
              long t = (r2 * dp[1][j][s - 1]) % MOD;
              dp[0][j][s] = (dp[0][j][s] + t) % MOD;
            } else if(i == (w - 1)) {
              dp[w - 1][j][s] = (r1 * dp[w - 1][j][s - 1]) % MOD;
              long t = (r2 * dp[w - 2][j][s - 1]) % MOD;
              dp[w - 1][j][s] = (dp[w - 1][j][s] + t) % MOD;              
            } else {
              long t1 = (r2 * dp[i][j][s - 1]) % MOD;
              long t2 = (r2 * dp[i - 1][j][s - 1]) % MOD;
              long t3 = (r2 * dp[i + 1][j][s - 1]) % MOD;
              dp[i][j][s] = (t1 + t2) % MOD;
              dp[i][j][s] = (dp[i][j][s] + t3) % MOD;
            }
          }
        }
      }
      System.out.println(dp[0][k][h]);
    }
  }
}
