
public class Main {


  private static void solve() {
    int n = ni();
    int[] c = new int[3];
    for (int i = 0; i < n; i++) {
      c[ni() - 1]++;
    }

    int max = 300;
    double[][][] dp = new double[max + 2][max + 2][max + 2];

    for (int i3 = 0; i3 <= max; i3++) {
      for (int i2 = 0; i2 <= max - i3; i2++) {
        for (int i1 = 0; i1 <= max - i3 - i2; i1++) {
          int sum = i1 + i2 + i3;
          if (sum == 0) {
            continue;
          }
          dp[i1][i2][i3] = 1.0 * n / sum;
          if (i1 > 0)
            dp[i1][i2][i3] += dp[i1 - 1][i2][i3] * i1 / sum;
          if (i2 > 0)
            dp[i1][i2][i3] += dp[i1 + 1][i2 - 1][i3] * i2 / sum;
          if (i3 > 0)
            dp[i1][i2][i3] += dp[i1][i2 + 1][i3 - 1] * i3 / sum;
        }
      }
    }
    System.out.println(dp[c[0]][c[1]][c[2]]);
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
