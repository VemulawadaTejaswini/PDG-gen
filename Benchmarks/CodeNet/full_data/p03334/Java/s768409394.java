
import java.util.ArrayList;
import java.util.List;

public class Main {
  private static void solve() {
    int n = ni();
    int d1 = ni();
    int d2 = ni();
    int[][] cir1 = circle(d1, n);
    int[][] cir2 = circle(d2, n);
    boolean[][] used = new boolean[2 * n][2 * n];

    StringBuilder sb = new StringBuilder();
    int ptr = 0;
    for (int i = 0; i < n * n; i++) {
      for (; ptr < 4 * n * n; ptr++) {
        int y = ptr / (2 * n);
        int x = ptr % (2 * n);
        if (!used[y][x]) {
          used[y][x] = true;
          set(used, y, x, cir1);
          set(used, y, x, cir2);
          sb.append(x + " " + y + "\n");
          break;
        }
      }
    }
    System.out.println(sb);
  }

  private static int[][] circle(int d, int n) {
    List<int[]> ret = new ArrayList<>();
    for (int x = -n * 2; x <= n * 2; x++) {
      for (int y = -n * 2; y <= n * 2; y++) {
        if (x * x + y * y == d) {
          ret.add(new int[] {y, x});
        }
      }
    }
    return ret.stream().toArray(size -> new int[size][]);
  }

  private static void set(boolean[][] used, int y, int x, int[][] cir) {
    int h = used.length;
    int w = used[0].length;

    for (int[] p : cir) {
      int ny = p[0] + y;
      int nx = p[1] + x;
      if (0 <= ny && ny < h && 0 <= nx && nx < w) {
        used[ny][nx] = true;
      }
    }
  }

  public static void main(String[] args) {
    new Thread(null, new Runnable() {
      @Override
      public void run() {
        long start = System.currentTimeMillis();
        String debug = args.length > 0 ? args[0] : null;
        if (debug != null) {
          try {
            is = java.nio.file.Files.newInputStream(java.nio.file.Paths.get(debug));
          } catch (Exception e) {
            throw new RuntimeException(e);
          }
        }
        reader = new java.io.BufferedReader(new java.io.InputStreamReader(is), 32768);
        solve();
        out.flush();
        tr((System.currentTimeMillis() - start) + "ms");
      }
    }, "", 64000000).start();
  }

  private static java.io.InputStream is = System.in;
  private static java.io.PrintWriter out = new java.io.PrintWriter(System.out);
  private static java.util.StringTokenizer tokenizer = null;
  private static java.io.BufferedReader reader;

  public static String next() {
    while (tokenizer == null || !tokenizer.hasMoreTokens()) {
      try {
        tokenizer = new java.util.StringTokenizer(reader.readLine());
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
    return tokenizer.nextToken();
  }

  private static double nd() {
    return Double.parseDouble(next());
  }

  private static long nl() {
    return Long.parseLong(next());
  }

  private static int[] na(int n) {
    int[] a = new int[n];
    for (int i = 0; i < n; i++)
      a[i] = ni();
    return a;
  }

  private static char[] ns() {
    return next().toCharArray();
  }

  private static long[] nal(int n) {
    long[] a = new long[n];
    for (int i = 0; i < n; i++)
      a[i] = nl();
    return a;
  }

  private static int[][] ntable(int n, int m) {
    int[][] table = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        table[i][j] = ni();
      }
    }
    return table;
  }

  private static int[][] nlist(int n, int m) {
    int[][] table = new int[m][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        table[j][i] = ni();
      }
    }
    return table;
  }

  private static int ni() {
    return Integer.parseInt(next());
  }

  private static void tr(Object... o) {
    if (is != System.in)
      System.out.println(java.util.Arrays.deepToString(o));
  }
}


