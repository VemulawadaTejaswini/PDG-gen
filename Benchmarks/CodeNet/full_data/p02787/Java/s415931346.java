import java.util.*;
import java.io.*;

public class Main {

  int[] dp;
  void solve(InputReader in, PrintWriter out) {
    int h = in.nextInt();
    int n = in.nextInt();
    int[][] arr = new int[n][2];

    for (int i = 0; i < n; ++i) {
      arr[i][0] = in.nextInt();
      arr[i][1] = in.nextInt();
    }

    dp = new int[h + 1];
    Arrays.fill(dp, Integer.MAX_VALUE);

    out.println(solve(h, arr));
  }

  public int solve(int h, int[][] arr) {
    if (h <= 0) return 0;
    if (dp[h] != Integer.MAX_VALUE) return dp[h];

    for (int i = 0; i < arr.length; ++i) {
      dp[h] = Math.min(dp[h], solve(h - arr[i][0], arr) + arr[i][1]);  
    }

    return dp[h];
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
