import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long M = 1_000_000_007;
    char[] K = scanner.next().toCharArray();
    int D = scanner.nextInt();

    long[][][] dp = new long[K.length + 1][D][2];
    dp[0][0][0] = 1;
    for (int i = 0; i < K.length; i++) {
      for (int j = 0; j < D; j++) {
        for (int k = 0; k < 10; k++) {
          dp[i + 1][(j + k) % D][1] += dp[i][j][1];
          if (dp[i + 1][(j + k) % D][1] > M) dp[i + 1][(j + k) % D][1] -= M;
        }
        int d = K[i] - '0';
        for (int k = 0; k < d; k++) {
          dp[i + 1][(j + k) % D][1] += dp[i][j][0];
          if (dp[i + 1][(j + k) % D][1] > M) dp[i + 1][(j + k) % D][1] -= M;
        }
        dp[i + 1][(j + d) % D][0] += dp[i][j][0];
        if (dp[i + 1][(j + d) % D][0] > M) dp[i + 1][(j + d) % D][0] -= M;
      }
    }
    System.out.println((dp[K.length][0][0] + dp[K.length][0][1] - 1) % M);
  }
}
