import java.util.*;
import java.io.*;

public class Main {

  private static final int MOD = (int) 1e9 + 7;

  void solve(InputReader in, PrintWriter out) {
    int h = in.nextInt();
    int w = in.nextInt();

    char[][] arr = new char[h][w];
    for (int i = 0; i < h; ++i)
      arr[i] = in.next().toCharArray();

    int[][] dp = new int[h + 1][w + 1];
    dp[0][0] = 1;
    for (int i = 0; i < h; ++i)
      for (int j = 0; j < w; ++j)
        if (arr[i][j] != '#') {
          dp[i + 1][j] = (dp[i + 1][j] + dp[i][j]) % MOD;
          dp[i][j + 1] = (dp[i][j + 1] + dp[i][j]) % MOD;
        }

    out.println(dp[h - 1][w - 1]);
  }

  public static void main(String[] args) throws Exception {
    InputReader in = new InputReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    Main solver = new Main();
    solver.solve(in, out);
    out.close();
  }

  static class InputReader {
    BufferedReader in;
    StringTokenizer st;

    public InputReader(InputStream is) {
      in = new BufferedReader(new InputStreamReader(is));
    }

    public String next() {
      try {
        while (st == null || !st.hasMoreTokens()) {
          st = new StringTokenizer(in.readLine());
        }
        return st.nextToken();
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }

    public long nextLong() {
      return Long.parseLong(next());
    }
  }
}
