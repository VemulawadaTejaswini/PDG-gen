import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * The Java template file for AtCoder online judge.
 */
public class Main {

  private static FastScanner scanner;
  private static PrintWriter printer;

  private static long MOD = (long)1e9 + 7;

  private static long addModulo(long a, long b, long mod) {
    long sum = a + b;
    if (sum >= mod) {
      sum -= mod;
    }
    return sum;
  }

  private static long multModulo(long a, long b, long mod) {
    return (a * b) % mod;
  }

  /** The solution to the problem. */
  public static void solve() {
    int n = scanner.nextInt();
    List<Integer>[] edges = new ArrayList[n];
    for (int i = 0; i < n; i++) {
      edges[i] = new ArrayList<>();
    }
    for (int i = 0; i < n - 1; i++) {
      int u = scanner.nextInt() - 1;
      int v = scanner.nextInt() - 1;
      edges[u].add(v);
      edges[v].add(u);
    }
    long[] result = recur(edges, 0, -1);
    printer.println(addModulo(result[0], result[1], MOD));
  }

  private static long[] recur(List<Integer>[] edges, int u, int parent) {
    long cntBlack = 1;
    long cntWhite = 1;
    for (int v : edges[u]) {
      if (v == parent) {
        continue;
      }
      long[] res = recur(edges, v, u);
      cntBlack = multModulo(cntBlack, res[0], MOD);
      cntWhite = multModulo(cntWhite, addModulo(res[0], res[1], MOD), MOD);
    }
    return new long[]{cntWhite, cntBlack};
  }

  /**
   * The main method.
   *
   * @param args arguments
   */
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
