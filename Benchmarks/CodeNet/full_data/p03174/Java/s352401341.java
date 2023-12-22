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

  public static void solve() {
    int n = scanner.nextInt();
    int[][] match = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        match[i][j] = scanner.nextInt();
      }
    }
    long[] dp = new long[1 << n];
    dp[0] = 1;
    for (int mask = 1; mask < (1 << n); mask++) {
      int man = countSetBits(mask) - 1;
      for (int female = 0; female < n; female++) {
        if (match[man][female] == 1 && (mask & (1 << female)) != 0) {
          dp[mask] = addModulo(dp[mask], dp[mask ^ (1 << female)], MOD);
        }
      }
    }
    printer.println(dp[(1 << n) - 1]);
  }

  private static int countSetBits(int mask) {
    int sum = 0;
    while (mask > 0) {
      if ((mask & 1) != 0) {
        sum++;
      }
      mask >>>= 1;
    }
    return sum;
  }

  private static long MOD = (long)1e9 + 7;

  private static long addModulo(long a, long b, long mod) {
    long sum = a + b;
    if (sum >= mod) {
      sum -= mod;
    }
    return sum;
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
