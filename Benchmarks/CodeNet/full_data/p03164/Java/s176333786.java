import java.util.*;
import java.io.*;

public class Main {

  private static void solve() {
    int n = nextInt();
    int w = nextInt();

    int[] value = new int[n];
    int[] weight = new int[n];

    for (int i = 0; i < n; i++) {
      weight[i] = nextInt();
      value[i] = nextInt();
    }

    long[][] dp = new long[n][100010];

    for (int i = 0; i < n; i++) {
      Arrays.fill(dp[i], Long.MAX_VALUE);
    }

    dp[0][0] = 0;
    dp[0][value[0]] = weight[0];

    for (int i = 1; i < n; i++) {
      for (int j = 0; j <= 100000; j++) {
        dp[i][j] = dp[i - 1][j];
        if (j - value[i] >= 0 && dp[i - 1][j - value[i]] != Long.MAX_VALUE) {
          dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - value[i]] + weight[i]);
        }
      }
    }

    long max = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= 100000; j++) {
        if (dp[i][j] <= w) {
          max = Math.max(max, j);
        }
      }
    }

    System.out.println(max);
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