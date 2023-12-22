import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in Actual solution is at the top
 *
 * @author NMouad21
 */
public class Main {
  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    InputReader in = new InputReader(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    GLongestPath solver = new GLongestPath();
    solver.solve(1, in, out);
    out.close();
  }

  static class GLongestPath {
    public final void solve(int testNumber, InputReader in, PrintWriter out) {
      int n = in.nextInt();
      int m = in.nextInt();
      int[][] e = in.nextIntMatrix(m, 2);
      int[][] g = GraphUtils.packDirectedUnweighted(e, n);
      int[] order = TopologicalSorter.sort(g, n);
      ArrayReverser.reverse(order);

      int ans = 0;
      int[] dp = new int[n + 1];
      for (int u : order) {
        for (int v : g[u]) {
          dp[u] = Math.max(dp[u], dp[v] + 1);
        }
        ans = Math.max(ans, dp[u]);
      }
      out.println(ans);
    }
  }

  static final class TopologicalSorter {
    private TopologicalSorter() {
      throw new RuntimeException("DON'T");
    }

    public static final int[] sort(int[][] g, int n) {
      int[] order = new int[n];
      int addPoint = 0, pollPoint = 0;

      int[] deg = new int[n + 1];
      for (int i = 1; i <= n; i++) {
        for (int v : g[i]) {
          ++deg[v];
        }
      }
      for (int i = 1; i <= n; i++) {
        if (deg[i] == 0) {
          order[addPoint++] = i;
        }
      }

      while (addPoint > pollPoint) {
        int u = order[pollPoint++];
        for (int v : g[u]) {
          if (--deg[v] == 0) {
            order[addPoint++] = v;
          }
        }
      }

      if (addPoint < n) { // cycle detected
        return null;
      }

      return order;
    }
  }

  static final class InputReader {
    private final InputStream stream;
    private final byte[] buf = new byte[1 << 16];
    private int curChar;
    private int numChars;

    public InputReader() {
      this.stream = System.in;
    }

    public InputReader(final InputStream stream) {
      this.stream = stream;
    }

    private final int read() {
      if (this.numChars == -1) {
        throw new UnknownError();
      } else {
        if (this.curChar >= this.numChars) {
          this.curChar = 0;

          try {
            this.numChars = this.stream.read(this.buf);
          } catch (IOException ex) {
            throw new InputMismatchException();
          }

          if (this.numChars <= 0) {
            return -1;
          }
        }

        return this.buf[this.curChar++];
      }
    }

    public final int nextInt() {
      int c;
      for (c = this.read(); isSpaceChar(c); c = this.read()) {}

      byte sgn = 1;
      if (c == 45) { // 45 == '-'
        sgn = -1;
        c = this.read();
      }

      int res = 0;

      while (c >= 48 && c <= 57) { // 48 == '0', 57 == '9'
        res *= 10;
        res += c - 48; // 48 == '0'
        c = this.read();
        if (isSpaceChar(c)) {
          return res * sgn;
        }
      }

      throw new InputMismatchException();
    }

    private static final boolean isSpaceChar(final int c) {
      return c == 32 || c == 10 || c == 13 || c == 9
          || c == -1; // 32 == ' ', 10 == '\n', 13 == '\r', 9 == '\t'
    }

    public final int[][] nextIntMatrix(final int n, final int m) {
      int[][] arr = new int[n][m];
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          arr[i][j] = nextInt();
        }
      }
      return arr;
    }
  }

  static final class GraphUtils {
    private GraphUtils() {
      throw new RuntimeException("DON'T");
    }

    public static final int[][] packDirectedUnweighted(int[][] edges, int n) {
      int[][] g = new int[n + 1][];
      int[] size = new int[n + 1];
      for (int[] edge : edges) {
        ++size[edge[0]];
      }
      for (int i = 0; i <= n; i++) {
        g[i] = new int[size[i]];
      }
      for (int[] edge : edges) {
        g[edge[0]][--size[edge[0]]] = edge[1];
      }
      return g;
    }
  }

  static class ArrayReverser {
    private ArrayReverser() {
      throw new RuntimeException("DON'T");
    }

    public static void reverse(int[] arr, int from, int to) {
      while (from < to) {
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
        ++from;
        --to;
      }
    }

    public static void reverse(int[] arr) {
      reverse(arr, 0, arr.length - 1);
    }
  }
}
