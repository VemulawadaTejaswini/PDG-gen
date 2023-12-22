import java.util.*;
import java.io.*;

public class Main {

  private static void solve() {
    int n = nextInt();

    int[][] act = new int[n][3];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < 3; j++) {
        act[i][j] = nextInt();
      }
    }

    int[][] dp = new int[n][3];
    for (int j = 0; j < 3; j++) {
      dp[0][j] = act[0][j];
    }

    for (int i = 1; i < n; i++) {
      for (int j = 0; j < 3; j++) {
        for (int k = 0; k < 3; k++) {
          if (k != j) {
            dp[i][j] = Math.max(dp[i][j], dp[i - 1][k] + act[i][j]);
          }
        }
      }
    }

    System.out.println(Math.max(dp[n - 1][0], Math.max(dp[n - 1][1], dp[n - 1][2])));
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