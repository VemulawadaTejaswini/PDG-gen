import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.Reader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * The Java template file for AtCoder online judge.
 */
public class Main {

  private static FastScanner scanner;
  private static PrintWriter printer;

  private static class BIT {
    int size;
    long[] values;

    public BIT(int size) {
      this.size = size;
      this.values = new long[size];
    }

    public void update(int index, long newValue) {
      while (index < size) {
        values[index] = Math.max(values[index], newValue);
        index += (index & -index);
      }
    }

    public long getMax(int a, int b) {
      return Math.max(getMax(a - 1), getMax(b));
    }

    private long getMax(int index) {
      long result = 0L;
      while (index > 0) {
        result = Math.max(result, values[index]);
        index -= (index & -index);
      }
      return result;
    }

  }

  public static void solve() {
    int n = scanner.nextInt();
    int[] heights = new int[n];
    for (int i = 0; i < n; i++) {
      heights[i] = scanner.nextInt();
    }
    int[] beauty = new int[n];
    for (int i = 0; i < n; i++) {
      beauty[i] = scanner.nextInt();
    }
    BIT bit = new BIT(n + 5);
    // dp[i] - is the maximum beauty with last height as i
    long[] dp = new long[n + 1];
    long result = Long.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      int currH = heights[i];
      int currB = beauty[i];
      long maxResult = bit.getMax(1, currH + 1);
      dp[currH] = Math.max(dp[currH], maxResult + currB);
      bit.update(currH + 1, dp[currH]);
      result = Math.max(result, dp[currH]);
      // for (int h = 0; h < currH; h++) {
      //   dp[currH] = Math.max(dp[currH], dp[h] + currB);
      // }
    }
    // for (int i = 0; i < n; i++) {
    //   result = Math.max(result, dp[heights[i]]);
    // }
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
