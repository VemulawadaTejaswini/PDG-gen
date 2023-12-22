import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static final long MOD = 998244353;
  static int K;

  public static void main(String[] args) {
    char[] A = sc.next().toCharArray();
    char[] B = sc.next().toCharArray();
    int N = A.length;
    int diff = 0;
    int same = 0;
    for (int i = 0; i < N; i++) {
      if (A[i] != B[i]) ++diff;
      if (A[i] == '1' && B[i] == '1') ++same;
    }
    diff /= 2;
    K = diff + same;
    long[][][] dp = new long[same + 1][same + 1][diff + 1]; // clean, dirty, diff
    dp[0][0][0] = 1;
//    for (int i = 1; i <= diff; i++) {
//      dp[0][0][i] = dp[0][0][i - 1] * i % MOD * i % MOD;
//    }
//    for (int i = 1; i <= same; i++) {
//      dp[i][0][0] = dp[i - 1][0][0] * i % MOD * i % MOD;
//    }
//    for (int i = 1; i < same; i++) {
//      dp[0][i][0] = dp[0][i - 1][0] * i % MOD * i % MOD;
//    }
    for (int i = 0; i <= same / 2; i++) {
      for (int j = 0; j <= same; j++) {
        for (int k = 0; k <= diff; k++) {
          if (i == 0 && j == 0) {
            if (k > 0) dp[i][j][k] = dp[i][j][k - 1] * k % MOD * k % MOD;
            continue;
          }
          if (i == 0 && k == 0) {
            if (j > 0) dp[i][j][k] = dp[i][j - 1][k] * j % MOD * j % MOD;
            continue;
          }
          if (j == 0 && k == 0) {
            if (i > 0) dp[i][j][k] = dp[i - 1][j][k] * i % MOD * i % MOD;
            continue;
          }
          if (k > 0) dp[i][j][k] += dp[i][j][k - 1] * k % MOD * k % MOD; // diff, diff
          if (i > 0) dp[i][j][k] += dp[i - 1][j][k] * i % MOD * k % MOD; // clean, diff
          if (i > 0) dp[i][j][k] += dp[i - 1][j][k] * i % MOD;           // clean(self)
          if (i > 1 && j < same) dp[i][j][k] += dp[i - 2][j + 1][k] * i % MOD * (i - 1) % MOD; // clean, clean
          if (i > 0) dp[i][j][k] += dp[i - 1][j][k] * j * 2 % MOD * i % MOD; // dirty, clean
          if (j > 0) dp[i][j][k] += dp[i][j - 1][k] * j % MOD * j % MOD; // dirty, dirty
          dp[i][j][k] %= MOD;
        }
      }
    }
    System.out.println(dp[same][0][diff]);
  }

}
