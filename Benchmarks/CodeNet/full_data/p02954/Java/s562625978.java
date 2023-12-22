
public class Main {

  private static void solve() {
    char[] s = ns();
    int n = s.length;
    int[] ret = new int[n];

    int[] nr = new int[2];
    for (int i = 0; i < n; i++) {
      if (s[i] == 'R') {
        nr[i % 2]++;
      } else {
        if (i % 2 == 0) {
          ret[i] += nr[0];
          ret[i - 1] += nr[1];
        } else {
          ret[i] += nr[1];
          ret[i - 1] += nr[0];
        }
        nr[0] = 0;
        nr[1] = 0;
      }
    }

    int[] nl = new int[2];
    int[] ret2 = new int[n];
    for (int i = 0; i < n; i++) {
      if (s[n - i - 1] == 'L') {
        nl[i % 2]++;
      } else {
        if (i % 2 == 0) {
          ret2[i] += nl[0];
          ret2[i - 1] += nl[1];
        } else {
          ret2[i] += nl[1];
          ret2[i - 1] += nl[0];
        }
        nl[0] = 0;
        nl[1] = 0;
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      sb.append(ret[i] + ret2[n - i - 1] + " ");
    }
    System.out.println(sb.substring(0, sb.length() - 1));
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

