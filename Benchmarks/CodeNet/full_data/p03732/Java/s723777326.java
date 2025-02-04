import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long W = sc.nextLong();
    long[] w = new long[N];
    long[] v = new long[N];
    for(int i = 0; i < N; i++) {
      w[i] = sc.nextLong();
      v[i] = sc.nextLong();
    }
    long[][][] dp = new long[N][300][N + 1];
    for(int j = 0; j < 300; j++) {
      dp[0][j][1] = v[0];
    }
    for(int i = 1; i < N; i++) {
      long a = w[i] - w[0];
      for(int j = 0; j < 300; j++) {
        for(int k = 1; k < N + 1; k++) {
          if((int)a <= j) {
            dp[i][j][k] = Math.max(dp[i - 1][j][k], dp[i - 1][j - (int)a][k - 1] + v[i]);
          } else {
            dp[i][j][k] = dp[i - 1][j][k];
          }
        }
      }
    }
    long ans = 0;
    for(int k = 1; k < N + 1; k++) {
      if(W - k * w[0] >= 0) ans = Math.max(ans, dp[N - 1][(int)(W - k * w[0])][k]);
    }
    System.out.println(ans);
  }
}