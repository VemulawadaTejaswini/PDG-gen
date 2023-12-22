
public class Main {

  private static void solve() {
    int n = ni();
    char[] s = ns();

    System.out.println(solve(s));

    //
    // int d = 10;
    // for (int i = 0; i < Math.pow(3, d); i++) {
    // char[] s = new char[d];
    // int v = i;
    // for (int j = 0; j < d; j++) {
    // s[j] = (char) (v % 3 + 1 + '0');
    // v /= 3;
    // }
    //
    // int ret = solve(s);
    // int ret3 = solve3(s);
    // if (ret != ret3) {
    // System.out.println(new String(s) + " " + ret + " " + ret3 + "NG");
    // }
    // }

  }



  private static int solve(char[] s) {

    int odd = 0;
    int n = s.length;
    for (int i = 0; i < n; i++) {
      int d = s[i] - '0';
      odd += d * comb(n - 1, i);
      odd %= 2;
    }

    int[] cnt = new int[4];
    for (char c : s) {
      cnt[c - '0']++;
    }
    if (cnt[1] > 0 && cnt[3] > 0 && cnt[2] == 0) {
      char[] to = new char[n - 1];
      for (int i = 0; i < n - 1; i++) {
        int d = Math.abs(s[i] - s[i + 1]);
        to[i] = (char) ((d == 2 ? 1 : 0) + '0');
      }
      return solve(to) == 1 ? 2 : 0;

    } else {
      return odd;
    }

  }


  private static int solve3(char[] s) {
    int n = s.length;
    int[][] a = new int[n + 1][n];
    for (int i = 0; i < n; i++) {
      a[0][i] = s[i] - '0';
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        a[i + 1][j] = Math.abs(a[i][j] - a[i][j + 1]);
      }
    }
    return a[n - 1][0];
  }

  private static int comb(int n, int r) {
    long c1 = C(n, r, mod1, fif1);
    long c2 = C(n, r, mod2, fif2);

    long x = crt(mod1, c1, mod2, c2);
    return (int) (x % 2);
  }

  public static long crt(long p, long m, long q, long n) {
    long a = p, b = q;
    long pp = 1, qq = 0;
    while (b > 0) {
      long c = a / b;
      long d;
      d = a;
      a = b;
      b = d % b;
      d = pp;
      pp = qq;
      qq = d - c * qq;
    }
    if ((n - m) % a != 0)
      return -1;
    long mod = p / a * q;
    // long ret = (p * pp % mod * ((n - m) / a) + m) % mod;
    long ret = (mul(mul(p, pp, mod), (n - m) / a, mod) + m) % mod;
    if (ret < 0)
      ret += mod;
    return ret;
  }

  public static long mul(long a, long b, long mod) {
    a %= mod;
    if (a < 0)
      a += mod;
    b %= mod;
    if (b < 0)
      b += mod;
    long ret = 0;
    int x = 63 - Long.numberOfLeadingZeros(b);
    for (; x >= 0; x--) {
      ret += ret;
      if (ret >= mod)
        ret -= mod;
      if (b << ~x < 0) {
        ret += a;
        if (ret >= mod)
          ret -= mod;
      }
    }
    return ret;
  }

  static int mod1 = 2042039;
  static int mod2 = 2039179;
  static int[][] fif1 = enumFIF(2000000, mod1);
  static int[][] fif2 = enumFIF(2000000, mod2);

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

