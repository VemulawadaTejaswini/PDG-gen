
public class Main {


  private static void solve() {
    int d = ni();
    int ret = 0;
    for (int n = 2; n <= 10; n ++) {
      ret += dfs(0, n, d);
    }
    System.out.println(ret);
  }

  private static long[] TEN;
  private static int[] CMB1;
  private static int[] CMB2;
  static {
    TEN = new long[11];
    TEN[0] = 1;
    for (int i = 1; i <= 10; i ++) {
      TEN[i] = TEN[i - 1] * 10;
    }
    CMB1 = new int[20];
    for (int i = 0; i < 10; i ++) {
      for (int j = 0; j < 10; j ++) {
        CMB1[i - j + 10] ++;
      }
    }
    CMB2 = new int[20];
    for (int i = 0; i < 10; i ++) {
      for (int j = 1; j < 10; j ++) {
        CMB2[i - j + 10] ++;
      }
    }
  }
  

  private static int dfs(int i, int n, long v) {
    long coe = TEN[n - i - 1] - TEN[i];
    if (n / 2 == i) {
      if (v == 0) {
        return n % 2 == 0 ? 1 : 10;
      } else {
        return 0;
      }
    }

//    if (coe == 0) {
//      return dfs(i + 1, n, v) * 10;
//    }
    int ret = 0;
    for (int j = i == 0 ? -8 : -9; j <= 9; j ++) {
      ret += dfs(i + 1, n,  v - j * coe) * (i == 0 ? CMB2[j + 10] : CMB1[j + 10]);
    }
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
