import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] a = new int[N];
    for(int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
    }
    int ans = 0;
    for(int i = 0; i < N; i++) {
      // dp[j][k]はajまででaiを使わずに和をkに出来るかどうかを表す。
      boolean[][] dp = new boolean[N][K + 1];
      dp[0][0] = true;
      if(i != 0) dp[0][a[0]] = true;
      for(int j = 1; j < N; j++) {
        for(int k = 0; k < K + 1; k++) {
          if(i == j) {
            dp[j][k] = dp[j - 1][k];
          } else {
            if(k >= a[j]) {
              dp[j][k] = dp[j - 1][k] || dp[j - 1][k - a[j]];
            } else {
              dp[j][k] = dp[j - 1][k];
            }
          }
        }
      }
      boolean flg = false;
      for(int j = K - a[i]; j < K; j++) {
        flg = flg || dp[N - 1][j];
      }
      if(flg) ans++;
    }
    System.out.println(ans);
  }
}