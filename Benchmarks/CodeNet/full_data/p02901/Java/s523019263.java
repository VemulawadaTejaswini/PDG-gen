import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int[] cost = new int[M];
    int[] open = new int[M];
    for (int i = 0; i < M; i++) {
      cost[i] = scanner.nextInt();
      int b = scanner.nextInt();
      for (int j = 0; j < b; j++) {
        int c = scanner.nextInt();
        open[i] |= 1 << (c - 1);
      }
    }
    int[] dp = new int[1 << N];
    int INF = 1_000_000_000;
    Arrays.fill(dp, INF);
    dp[0] = 0;
    for (int i = 0; i < M; i++) {
      for (int j = 0; j < 1 << N; j++) {
        int k = j | open[i];
        dp[k] = Math.min(dp[k], dp[j] + cost[i]);
      }
    }
    if (dp[(1 << N) - 1] == INF) {
      System.out.println(-1);
    } else {
      System.out.println(dp[(1 << N) - 1]);
    }
  }
}
