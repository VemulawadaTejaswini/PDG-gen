
public class Main {

  private static void solve() {
    double[][] p = new double[][] {
      {ni(), ni()},
      {ni(), ni()},
      {ni(), ni()},
    };

    double[] d = new double[3];
    for (int i = 0; i < 3; i ++) {
      int j = (i + 1) % 3;
      int k = (i + 2) % 3;
      double dx = p[j][0] - p[k][0];
      double dy = p[j][1] - p[k][1];
      d[i] = Math.sqrt(dx * dx + dy * dy);
    }
    
    double[] cos = new double[3];
    double[] tan2 = new double[3];
    for (int i = 0; i < 3; i ++) {
      int j = (i + 1) % 3;
      int k = (i + 2) % 3;
      cos[i] = (d[j] * d[j] + d[k] * d[k] - d[i] * d[i]) / (2 * d[j] * d[k]);
      tan2[i] = Math.sqrt((1 - cos[i]) / (1 + cos[i]));
    }

    double ret = 0;
    for (int i = 0; i < 3; i ++) {
      int j = (i + 1) % 3;
      int k = (i + 2) % 3;
      
      double left = 0;
      double right = 1000;
      for (int b = 0; b < 50; b ++) {
        double r = (left + right) / 2;

        double d1 = r / tan2[j];
        double d2 = r / tan2[k];
        
        if (r * 2 <= d[i] - d1 - d2) {
          left = r;
        } else {
          right = r;
        }
      }
      ret = Math.max(ret, left);
    }
    System.out.printf("%.12f\n", ret);
  }
  
  

  public static void main(String[] args) {
    new Thread(null, new Runnable() {
      @Override
      public void run() {
        long start = System.currentTimeMillis();
        String debug = System.getProperty("debug");
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
