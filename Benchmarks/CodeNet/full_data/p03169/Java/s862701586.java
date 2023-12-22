
import java.util.Arrays;

public class Main {


  private static void solve() {
    int n = ni();
    int[] a = na(n);
    int[] c = new int[3];
    for (int v : a) {
      c[v - 1] ++;
    }

    dp = new double[n + 1][n + 1][n + 1];
    for (double[][] v : dp) for (double[] u : v)  Arrays.fill(u, -1);
    double ret = e(n, c[0], c[1], c[2]);
    System.out.println(ret);
  }
  
  
  static double[][][] dp;
  private static double e(int n, int i, int j, int k) {
    if (dp[i][j][k] != -1) {
      return dp[i][j][k];
    }
    double ret = 0;
    if (j > 0) {
      double x = (double)n / (i + j + k);
      ret += (e(n, i + 1, j - 1, k) + x) * (double)j / (i + j + k);
    }

    if (k > 0) {
      double x = (double)n / (i + j + k);
      ret += (e(n, i, j + 1, k - 1) + x) * (double)k / (i + j + k);
    }
    
    if (i > 0) {
      double x = (double)n / (i + j + k);
      ret += (e(n, i - 1, j, k) + x) * (double)i / (i + j + k);
    }
    dp[i][j][k] = ret;
    return ret;
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
