
public class Main {
  private static void solve() {
    int n = ni();
    double l = nl();
    double[][] p = new double[n][2];

    for (int i = 0; i < n; i++) {
      double t = nl();
      double theta = 2 * Math.PI * t / l;
      p[i][0] = Math.cos(theta);
      p[i][1] = Math.sin(theta);
    }

    double[][] d = new double[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        double dx = p[i][0] - p[j][0];
        double dy = p[i][1] - p[j][1];
        d[j][i] = d[i][j] = Math.sqrt(dx * dx + dy * dy);
      }
    }

    double retX = 0;
    double retY = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        for (int k = j + 1; k < n; k++) {
          double a = d[i][j] + d[j][k] + d[k][i];

          double x = d[i][j] * p[k][0] + d[j][k] * p[i][0] + d[k][i] * p[j][0];
          double y = d[i][j] * p[k][1] + d[j][k] * p[i][1] + d[k][i] * p[j][1];

          retX += x / a;
          retY += y / a;
        }
      }
    }
    long total = (long) n * (n - 1) * (n - 2) / 6;
    System.out.printf("%.12f %.12f\n", retX / total, retY / total);
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
