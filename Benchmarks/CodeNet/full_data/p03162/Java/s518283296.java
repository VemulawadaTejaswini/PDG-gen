import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in Actual solution is at the top
 *
 * @author MaxHeap
 */
public class Main {

  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    FastReader in = new FastReader(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    CVacation solver = new CVacation();
    solver.solve(1, in, out);
    out.close();
  }

  static class CVacation {

    public void solve(int testNumber, FastReader in, PrintWriter out) {
      int n = in.nextInt();
      int[] a = new int[n];
      int[] b = new int[n];
      int[] c = new int[n];
      for (int i = 0; i < n; ++i) {
        a[i] = in.nextInt();
        b[i] = in.nextInt();
        c[i] = in.nextInt();
      }
      int[][] dp = new int[3][n + 1];
      for (int i = 1; i <= n; ++i) {
        dp[0][i] = Math.max(dp[1][i - 1] + a[i - 1], dp[2][i - 1] + a[i - 1]);
        dp[1][i] = Math.max(dp[0][i - 1] + b[i - 1], dp[2][i - 1] + b[i - 1]);
        dp[2][i] = Math.max(dp[1][i - 1] + c[i - 1], dp[0][i - 1] + c[i - 1]);
      }
      out.println(Math.max(dp[0][n], Math.max(dp[1][n], dp[2][n])));
    }

  }

  static class FastReader {

    BufferedReader reader;
    StringTokenizer st;

    public FastReader(InputStream stream) {
      reader = new BufferedReader(new InputStreamReader(stream));
      st = null;
    }

    public String next() {
      while (st == null || !st.hasMoreTokens()) {
        try {
          String line = reader.readLine();
          if (line == null) {
            return null;
          }
          st = new StringTokenizer(line);
        } catch (Exception e) {
          throw new RuntimeException();
        }
      }
      return st.nextToken();
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }

  }
}

