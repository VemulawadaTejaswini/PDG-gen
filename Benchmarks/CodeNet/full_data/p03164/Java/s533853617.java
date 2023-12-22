import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.Reader;
import java.io.PrintWriter;
import java.util.Arrays;;
import java.util.StringTokenizer;

/**
 * The Java template file for AtCoder online judge.
 */
public class Main {

  private static FastScanner scanner;
  private static PrintWriter printer;

  public static void solve() {
    int n = scanner.nextInt();
    int w = scanner.nextInt();
    int[] weights = new int[n];
    int[] values = new int[n];
    for (int i = 0; i < n; i++) {
      weights[i] = scanner.nextInt();
      values[i] = scanner.nextInt();
    }
    int total_values = 0;
    for (int value : values) {
      total_values += value;
    }
    long[] dp = new long[total_values + 1];
    Arrays.fill(dp, Long.MAX_VALUE/2);
    dp[0] = 0L;
    for (int i = 0; i < n; i++) {
      for (int j = total_values; j >= values[i]; j--) {
        dp[j] = Math.min(dp[j], dp[j - values[i]] + weights[i]);
      }
    }
    int result = 0;
    for (int i = total_values; i >= 0; i--) {
      if (dp[i] <= w) {
        result = i;
        break;
      }
    }
    printer.println(result);
  }

  public static void main(String[] args) {
    scanner = new FastScanner();
    printer = new PrintWriter(System.out);
    solve();
    printer.flush();
  }

  private static class FastScanner {
    BufferedReader br;
    StringTokenizer st;

    public FastScanner(Reader in) {
      br = new BufferedReader(in);
    }

    public FastScanner() {
      this(new InputStreamReader(System.in));
    }

    public String next() {
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }

    public long nextLong() {
      return Long.parseLong(next());
    }

    public double nextDouble() {
      return Double.parseDouble(next());
    }

    public String nextLine() {
      String str = "";
      try {
        str = br.readLine();
      } catch (IOException e) {
        e.printStackTrace();
      }
      return str;
    }

    public int[] readIntArray(int size) {
      int[] ret = new int[size];
      for (int i = 0; i < size; i++) {
        ret[i] = nextInt();
      }
      return ret;
    }
  }
}
