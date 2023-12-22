import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int W = sc.nextInt();
    int[] w = new int[N+1];
    int[] v = new int[N+1];

    for (int i = 1; i < N+1; i++) {
      w[i] = sc.nextInt();
      v[i] = sc.nextInt();
    }

    sc.close();

    long[][] dp = new long[N+1][W+1];

    for (int i = 1; i < N + 1; i++) {
      for (int j = 1; j < W + 1; j++) {
        if (w[i] > j) {
          dp[i][j] = dp[i - 1][j];
        } else {
          dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]] + v[i]);
        }
      }
    }

    System.out.println(dp[N][W]);

  }

}