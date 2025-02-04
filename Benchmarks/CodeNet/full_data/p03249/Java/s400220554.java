
import java.util.Arrays;
import java.util.TreeSet;

public class Main {
  private static void solve() {
    int n = ni();
    long[][] d = new long[n][2];
    for (int i = 0; i < n; i++) {
      d[i][0] = i;
      d[i][1] = nl();
    }
    Arrays.sort(d, (o1, o2) -> Long.signum(o1[1] - o2[1]));
    TreeSet<long[]> map = new TreeSet<>((o1, o2) -> {
      if (o1[1] == o2[1]) {
        return Long.compare(o1[0], o2[0]);
      } else {
        return Long.compare(o1[1], o2[1]);
      }
    });
    for (int i = 0; i < n; i++) {
      map.add(d[i]);
    }

    long[] x = new long[n];
    Arrays.fill(x, 1);

    long[][] e = new long[n - 1][2];
    int ptr = 0;
    for (int i = n - 1; i > 0; i--) {
      map.remove(d[i]);
      long v = d[i][1] + 2 * x[(int)d[i][0]] - n;
      long[] u = map.ceiling(new long[] {-1, v});
      if (u != null && u[1] == v) {
        e[ptr++] = new long[] {d[i][0] + 1, u[0] + 1};
        x[(int)u[0]] += x[(int)d[i][0]];
      } else {
        out.println(-1);
        return;
      }
    }

    for (long[] v : e) {
      out.println(v[0] + " " + v[1]);
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
