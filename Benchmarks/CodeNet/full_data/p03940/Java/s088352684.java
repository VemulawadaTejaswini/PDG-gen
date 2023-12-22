import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int N = sc.nextInt();
    if (N > 2000) {
      return;
    }
    int E = sc.nextInt();
    int T = sc.nextInt();
    int[] X = new int[N + 1];
    for (int i = 0; i < N; i++) {
      X[i + 1] = sc.nextInt();
    }
    long[] dp = new long[N + 1];
    Arrays.fill(dp, 1L << 50);
    dp[0] = 0;
    for (int i = 0; i < N; i++) {
      int cur = X[i];
      for (int j = i + 1; j <= N; j++) {
        int fp = X[i + 1];
        int lp = X[j];
        dp[j] = Math.min(dp[j], dp[i] + (lp - cur) + Math.max((lp - fp) * 2, T));
      }
    }
    System.out.println(dp[N] + E - X[N]);
  }
}
