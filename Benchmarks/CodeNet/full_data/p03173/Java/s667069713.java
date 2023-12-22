import java.util.*;
import java.io.*;

public class Main {

  private static void solve() {
    int n = nextInt();

    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = nextInt();
    }

    long[][] dp = new long[n][n];

    for (int i = 0; i < n; i++) {
      dp[i][i] = a[i];
      if (i + 1 < n) {
        dp[i][i + 1] = a[i] + a[i + 1];
      }
    }

    for (int len = 3; len <= n; len++) {
      for (int i = 0; i < n; i++) {
        int j = i + len - 1;
        if (j >= n) break;

        long ans = Long.MAX_VALUE;
        for (int k = i; k < j; k++) {
          long temp = a[k] + a[k + 1];
          if (i != k) {
            temp += dp[i][k - 1];
          }
          if (j - 1 != k) {
            temp += dp[k + 2][j];
          }
          ans = Math.min(ans, temp);
        }
        dp[i][j] = ans;
      }
    }

    System.out.println(dp[0][n - 1]);
  }

  private static void run() {
    br = new BufferedReader(new InputStreamReader(System.in));
    out = new PrintWriter(System.out);

    solve();

    out.close();
  }

  private static StringTokenizer st;
  private static BufferedReader br;
  private static PrintWriter out;

  private static String next() {
    while (st == null || !st.hasMoreElements()) {
      String s;
      try {
        s = br.readLine();
      } catch (IOException e) {
        return null;
      }
      st = new StringTokenizer(s);
    }
    return st.nextToken();
  }

  private static int nextInt() {
    return Integer.parseInt(next());
  }

  private static long nextLong() {
    return Long.parseLong(next());
  }

  public static void main(String[] args) {
    run();
  }
}