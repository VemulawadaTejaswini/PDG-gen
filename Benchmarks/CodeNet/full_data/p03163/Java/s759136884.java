import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int W = sc.nextInt();
    int[] w = new int[N];
    int[] v = new int[N];
    for (int i = 0; i < N; i++) {
      w[i] = sc.nextInt();
      v[i] = sc.nextInt();
    }
    sc.close();

    long[][] dp = new long[N + 1][W + 1];
    for (long[] a : dp) Arrays.fill(a, -1);
    dp[0][0] = 0;

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < W + 1; j++) {
        long val = dp[i][j];
        if (val < 0) continue;

        long no_select = Math.max(
            dp[i + 1][j], val);
        dp[i + 1][j] = no_select;

        int wi = w[i];
        if (W < j + wi) continue;
        long select = Math.max(
            dp[i + 1][j + wi], val + v[i]);
        dp[i + 1][j + wi] = select;
      }
    }

//    Arrays.stream(dp).forEach(a ->
//      System.out.println(Arrays.toString(a)));

    long ans = 0;
    for (long val : dp[N]) ans = Math.max(ans, val);
    System.out.println(ans);
  }
}