import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    final long M = 1_000_000_007;
    int N = scanner.nextInt();
    long[][][][] dp = new long[N + 1][4][4][4];
    dp[0][3][3][3] = 1;
    for (int i = 1; i <= N; i++) {
      for (int j = 0; j < 4; j++) {
        for (int k = 0; k < 4; k++) {
          for (int l = 0; l < 4; l++) {
            for (int m = 0; m < 4; m++) {
              if (k == 0 && l == 1 && m == 2) continue;
              if (k == 0 && l == 2 && m == 1) continue;
              if (k == 1 && l == 0 && m == 2) continue;
              if (j == 0 && k == 1 && m == 2) continue;
              if (j == 0 && l == 1 && m == 2) continue;
              dp[i][k][l][m] += dp[i - 1][j][k][l];
              if (dp[i][k][l][m] >= M) dp[i][k][l][m] -= M;
            }
          }
        }
      }
    }
    long res = 0;
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        for (int k = 0; k < 4; k++) {
          res += dp[N][i][j][k];
          if (res >= M) res -= M;
        }
      }
    }
    System.out.println(res);
  }
}
