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

  private static int[][] DIRS = new int[][]{ {+1, 0}, {0, +1}};
  private static long MOD = (long)1e9 + 7;

  private static long update(long a, long b) {
    long sum = a + b;
    if (sum >= MOD) {
      sum -= MOD;
    }
    return sum;
  }

  private static boolean isValidMove(char[][] grid, int nx, int ny) {
    if (nx < 0 || nx >= grid.length || ny < 0 || ny >= grid[0].length || grid[nx][ny] == '#') {
      return false;
    }
    return true;
  }

  public static void solve() {
    int h = scanner.nextInt();
    int w = scanner.nextInt();
    char[][] grid = new char[h][w];
    for (int i = 0; i < h; i++) {
      grid[i] = scanner.next().toCharArray();
    }
    long[][] ways = new long[h][w];
    ways[0][0] = 1L;
    for (int i = 1; i < h; i++) {
      if (grid[i][0] != '#') {
        ways[i][0] = update(ways[i][0], ways[i - 1][0]);
      }
    }
    for (int i = 1; i < w; i++) {
      if (grid[0][i] != '#') {
        ways[0][i] = update(ways[0][i], ways[0][i - 1]);
      }
    }
    for (int i = 1; i < h; i++) {
      for (int j = 1; j < w; j++) {
        if (grid[i][j] == '#') {
          continue;
        }
        ways[i][j] = update(ways[i][j], ways[i - 1][j]);
        ways[i][j] = update(ways[i][j], ways[i][j - 1]);
      }
    }
    printer.println(ways[h - 1][w - 1]);
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
