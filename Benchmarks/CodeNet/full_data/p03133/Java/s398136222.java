
public class Main {



  private static void solve() {
    int n = ni();
    int m = ni();
    int[][] mat = ntable(n, m);

    System.out.println(solve(mat));


    // Random gen = new Random();
    // while( true) {
    // int n = gen.nextInt(5) + 1;
    // int m = gen.nextInt(5) + 1;
    // int[][] mat = new int[n][m];
    // for (int i = 0; i < n; i ++) {
    // for (int j = 0; j < m; j ++) {
    // mat[i][j] = gen.nextInt(2);
    // }
    // }
    //
    // long ret2 = solve(mat);
    // long ret = solve(mat);
    // if (ret != ret2) {
    // System.out.println(ret + " " + ret2);
    // System.out.println(Arrays.deepToString(mat));
    // break;
    // }
    // }
  }

  private static long solve2(int[][] mat) {
    int n = mat.length;
    int m = mat[0].length;

    int ret = 0;
    for (int i = 0; i < (1 << n); i++) {
      for (int j = 0; j < (1 << m); j++) {

        int sum = 0;
        for (int p = 0; p < n; p++) {
          if (((i >> p) & 1) == 0)
            continue;
          for (int q = 0; q < m; q++) {
            if (((j >> q) & 1) == 0)
              continue;

            sum += mat[p][q];
          }
        }
        if (sum % 2 == 1) {
          ret++;
        }
      }
    }
    return ret;
  }

  private static long solve(int[][] mat) {

    int n = mat.length;
    int m = mat[0].length;

    int rank = rank(mat, 2);

    int mod = 998244353;
    long[] p2 = new long[1000];
    p2[0] = 1;
    for (int i = 0; i < p2.length - 1; i++) {
      p2[i + 1] = p2[i] * 2 % mod;
    }

    int[][] fif = enumFIF(1000, mod);

    long ret = 0;
    for (int i = 1; i <= rank; i += 2) {
      long now = CX(rank, i, mod, fif) * ((p2[rank - i] + p2[rank - i] - 1) % mod) % mod;
      ret += now * p2[n - rank] % mod * p2[m - rank] % mod;
      ret %= mod;
    }
    return ret;
  }

  public static long CX(long n, long r, int p, int[][] fif) {
    if (n < 0 || r < 0 || r > n)
      return 0;
    int np = (int) (n % p), rp = (int) (r % p);
    if (np < rp)
      return 0;
    if (n == 0 && r == 0)
      return 1;
    int nrp = np - rp;
    if (nrp < 0)
      nrp += p;
    return (long) fif[0][np] * fif[1][rp] % p * fif[1][nrp] % p * CX(n / p, r / p, p, fif) % p;
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

  public static int rank(int[][] M, int p) {
    if (M.length == 0)
      return 0;
    int n = M.length, m = M[0].length;

    // Forward Elimination
    for (int i = 0; i < n; i++) {
      // select pivot
      boolean pivotFound = false;
      out: for (int pi = i; pi < n; pi++) {
        for (int pj = i; pj < m; pj++) {
          if (M[pi][pj] != 0) {
            // pivot found
            if (pj != i) {
              // swap columns
              for (int k = 0; k < n; k++) {
                int d = M[k][pj];
                M[k][pj] = M[k][i];
                M[k][i] = d;
              }
            }
            if (pi != i) {
              // swap rows
              int[] d = M[pi];
              M[pi] = M[i];
              M[i] = d;
            }
            pivotFound = true;
            break out;
          }
        }
      }
      if (!pivotFound)
        return i;

      long ID = invl(M[i][i], p);
      M[i][i] = 1;
      for (int j = i + 1; j < m; j++) {
        M[i][j] = (int) (M[i][j] * ID % p);
      }

      for (int j = i + 1; j < n; j++) {
        long B = p - M[j][i];
        M[j][i] = 0;
        for (int k = i + 1; k < m; k++) {
          M[j][k] = (int) ((M[j][k] + M[i][k] * B) % p);
        }
      }
    }
    return n;
  }

  public static long invl(long a, long mod) {
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
    return p < 0 ? p + mod : p;
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
