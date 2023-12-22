import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    final long INF = 1_000_000_000;
    int N = scanner.nextInt();
    int M = scanner.nextInt();
    char[] s = scanner.next().toCharArray();

    long[] dp = new long[N + 1];
    int[] prev = new int[N + 1];
    Arrays.fill(dp, INF);
    Arrays.fill(prev, -1);
    prev[0] = 0;
    dp[0] = 0;
    for (int i = 1; i <= N; i++) {
      if (s[i] == '0') {
        for (int j = Math.max(i - M, 0); j < i; j++) {
          if (dp[i] > dp[j] + 1) {
            dp[i] = dp[j] + 1;
            prev[i] = j;
          }
        }
      }
    }
    if (dp[N] == INF) {
      System.out.println(-1);
    } else {
      StringBuilder sb = new StringBuilder();
      int last = N;
      while (last > 0) {
        int p = prev[last];
        sb.append(last - p).append(' ');
        last = p;
      }
      sb.setLength(sb.length() - 1);
      sb.reverse();
      System.out.println(sb.toString());
    }
  }
}