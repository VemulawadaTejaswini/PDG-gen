import java.util.*;
import java.io.*;

public class Main {

  private static final int MOD = 1_000_000_007;

  private static void solve() {
    int h = nextInt();
    int w = nextInt();

    long[][] dp = new long[h][w];

    char[][] g = new char[h][w];

    for (int i = 0; i < h; i++) {
      g[i] = next().toCharArray();
    }

    dp[0][0] = 1;

    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        if (i + 1 < h && g[i + 1][j] == '.') {
          dp[i + 1][j] += dp[i][j];
          dp[i + 1][j] %= MOD;
        }
        if (j + 1 < w && g[i][j + 1] == '.') {
          dp[i][j + 1] += dp[i][j];
          dp[i][j + 1] %= MOD;
        }
      }
    }

    System.out.println(dp[h - 1][w - 1]);
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