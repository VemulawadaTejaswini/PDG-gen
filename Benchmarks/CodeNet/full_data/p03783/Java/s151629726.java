import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static final int INF = 1 << 29;

  public static void main(String[] args) {
    int N = sc.nextInt();
    if (N >= 500) return;
    int[] L = new int[N];
    int[] R = new int[N];
    for (int i = 0; i < N; i++) {
      L[i] = sc.nextInt();
      R[i] = sc.nextInt();
    }
    int[][] dp = new int[N][401];
    for (int i = 0; i < N; i++) {
      Arrays.fill(dp[i], INF);
    }
    for (int i = 1; i <= 400 - (R[0] - L[0]); i++) {
      dp[0][i] = Math.abs(L[0] - i);
    }
    for (int i = 1; i < N; i++) {
      for (int l = 1; l <= 400 - (R[i] - L[i]); l++) {
        int r = l + R[i] - L[i];
        for (int l2 = 1; l2 <= 400; l2++) {
          if (dp[i - 1][l2] == INF) continue;
          int r2 = l2 + R[i - 1] - L[i - 1];
          if (r < l2 || r2 < l) continue;
          dp[i][l] = Math.min(dp[i][l], dp[i - 1][l2] + Math.abs(L[i] - l));
        }
      }
    }
    int ans = INF;
    for (int i = 1; i <= 400; i++) {
      ans = Math.min(ans, dp[N - 1][i]);
    }
    System.out.println(ans);
  }

}
