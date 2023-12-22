
public class Main {

  private static void solve() {
    int n = ni();
    int[] a = na(n);
    int[] b = na(n);

    int[] c = new int[n];
    int[] d = new int[n];
    for (int i = 0; i < n; i++) {
      c[i] = a[i] ^ a[(i + 1) % n];
      d[i] = b[i] ^ b[(i + 1) % n];
    }

    int[] x = new int[n * 3 + 1];
    int p = 0;
    for (int i = 0; i < n; i++) {
      x[p] = d[i];
      p++;
    }
    x[p++] = -1;
    for (int i = 0; i < n; i++) {
      x[p] = x[p + n] = c[i];
      p++;
    }

    int[] z = Z(x);

    for (int i = n + 1, j = 0; j < n; i++, j++) {
      if (z[i] >= n) {
        out.println(j + " " + (a[j] ^ b[0]));
      }
    }
  }

  public static int[] Z(int[] str) {
    int n = str.length;
    int[] z = new int[n];
    if (n == 0)
      return z;
    z[0] = n;
    int l = 0, r = 0;
    for (int i = 1; i < n; i++) {
      if (i > r) {
        l = r = i;
        while (r < n && str[r - l] == str[r])
          r++;
        z[i] = r - l;
        r--;
      } else {
        if (z[i - l] < r - i + 1) {
          z[i] = z[i - l];
        } else {
          l = i;
          while (r < n && str[r - l] == str[r])
            r++;
          z[i] = r - l;
          r--;
        }
      }
    }

    return z;
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

