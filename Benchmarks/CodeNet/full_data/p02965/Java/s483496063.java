
public class Main {

  private static void solve() {
    int n = ni();
    int m = ni();

    System.out.println(solve(n, m));
  }

  static int mod = 998244353;
  static int[][] fif = enumFIF(2 * 1000000, mod);

  private static long solve(int n, int m) {
    long ret = 0;
    for (int odd = m % 2; odd <= m; odd += 2) {
      int last = (3 * m - odd) / 2;

      long now = C(n, odd, mod, fif) * C(last + n - 1, n - 1, mod, fif) % mod;

      long ng1 = C(n, odd, mod, fif) * odd % mod * C(last - m + (n - 1), n - 1, mod, fif) % mod;
      long ng2 = C(n, odd, mod, fif) * (n - odd) % mod
          * C(last - (m + 1) + (n - 1), n - 1, mod, fif) % mod;

      now += mod - ng1;
      now += mod - ng2;

      ret += now;
      ret %= mod;
    }
    return ret;
  }



  public static int[][] enumFIF(int n, int mod) {
    int[] f = new int[n + 1];
    int[] invf = new int[n + 1];
    f[0] = 1;
    for (int i = 1; i <= n; i++) {
      f[i] = (int) ((long) f[i - 1] * i % mod);
    }
    long a = f[n];
    long b = mod;
    long p = 1, q = 0;
    while (b > 0) {
      long c = a / b;
      long d;
      d = a;
      a = b;
      b = d % b;
      d = p;
      p = q;
      q = d - c * q;
    }
    invf[n] = (int) (p < 0 ? p + mod : p);
    for (int i = n - 1; i >= 0; i--) {
      invf[i] = (int) ((long) invf[i + 1] * (i + 1) % mod);
    }
    return new int[][] {f, invf};
  }

  public static long C(int n, int r, int mod, int[][] fif) {
    if (n < 0 || r < 0 || r > n)
      return 0;
    return (long) fif[0][n] * fif[1][r] % mod * fif[1][n - r] % mod;
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

