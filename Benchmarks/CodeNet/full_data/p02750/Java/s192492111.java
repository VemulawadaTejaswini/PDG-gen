import java.math.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int T = sc.nextInt();
    int[] a = new int[N + 1];
    int[] b = new int[N + 1];
    for (int i = 1; i < N + 1; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }
    sc.close();

    int[][] dp = new int[T + 1][N + 1];
    int[] cost = new int[T + 1];

    for (int i = 1; i < T + 1; i++) {
      for (int j = 1; j < N + 1; j++) {
        int w = a[j] * i + b[j];
        if (T < i + w) continue;
        cost[i] = cost[i] == 0 ? w : Math.min(cost[i], w);
        dp[i][j] = w;
      }
    }

    long ans = 0;
    Deque<int[]> q = new ArrayDeque<>();
    q.addLast(new int[] {0, 0});
    while (!q.isEmpty()) {
      int[] r = q.pollLast();

      if (cost[r[0]] == 0 && r[0] < T) {
        q.addLast(new int[] {r[0] + 1, r[1]});
        continue;
      }

      int n = r[0] + cost[r[0]];
      if (T <= r[0] || T < n) {
        ans = Math.max(ans, r[1]);
        continue;
      }
      q.addLast(new int[] {n, r[1] + 1});
    }

    System.out.println(Math.min(N, ans));
  }
}