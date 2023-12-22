import java.util.Arrays;
import java.util.Scanner;

public class Main {
  private static void solve(int n, int t, int[][] ab) {
    long[] dp = new long[t + 1];
    long[] nextDp = new long[t + 1];
    Arrays.fill(dp, -1L);
    dp[0] = 0L;
    for (int i = 0; i < n; i++) {
      Arrays.fill(nextDp, -1L);
      for (int j = 0; j < t + 1; j++) {
        if (dp[j] < 0) continue;
        nextDp[j] = Math.max(nextDp[j], dp[j]);
        if (j < t - 0.5) {
          int target = Math.min(j + ab[i][0], t);
          nextDp[target] = Math.max(nextDp[target], dp[j] + ab[i][1]);
        }
      }
      for (int j = 0; j <= t; j++) dp[j] = nextDp[j];
    }
    long max = 0;
    for (int j = 0; j <= t; j++) max = Math.max(max, dp[j]);
    System.out.println(max);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] ns = sc.nextLine().split(" ");
    int n = Integer.parseInt(ns[0]);
    int t = Integer.parseInt(ns[1]);
    int[][] ab = new int[n][2];
    for (int i = 0; i < n; i++) {
      String[] abs = sc.nextLine().split(" ");
      ab[i][0] = Integer.parseInt(abs[0]);
      ab[i][1] = Integer.parseInt(abs[1]);
    }
    sc.close();
    solve(n, t, ab);
  }
}