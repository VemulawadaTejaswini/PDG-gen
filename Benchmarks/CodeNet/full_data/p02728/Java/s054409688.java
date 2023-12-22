
public class Main {

  private static void solve() {
    int n = ni();
    int[] from = new int[n - 1];
    int[] to = new int[n - 1];
    for (int i = 0; i < n - 1; i++) {
      from[i] = ni() - 1;
      to[i] = ni() - 1;
    }
    int[][] g = packU(n, from, to);
    long[][] dp = new long[n][2];
    long[][] dp2 = new long[n][2];
    dfs(0, -1, dp, g);
    dfs2(0, -1, new long[] {1, 0}, dp, dp2, g);
    dp2[0] = dp[0];

    for (long[] v : dp2) {
      out.println(v[0]);
    }
  }

  private static void dfs2(int cur, int pre, long[] x, long[][] dp, long[][] dp2, int[][] g) {
    // x[0] 親の組み合わせ数 x[1] 親のノード数
    // dp[cur][0] 組み合わせ数
    // dp[cur][1] ノード数

    long z =
        x[0] * dp[cur][0] % mod * fif[1][(int) (dp[cur][1] - 1)] % mod * fif[1][(int) x[1]] % mod;

    for (int nex : g[cur]) {
      if (nex == pre) {
        dp2[cur][1] = x[1] + dp[cur][1];
        dp2[cur][0] = z * fif[0][(int) (dp2[cur][1] - 1)] % mod;
      } else {
        long sum = x[1] + dp[cur][1] - dp[nex][1];
        long ret = z * invl(dp[nex][0], mod) % mod * fif[0][(int) dp[nex][1]] % mod
            * fif[0][(int) (sum - 1)] % mod;
        long[] y = {ret, sum};

        dfs2(nex, cur, y, dp, dp2, g);
      }
    }
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


  private static void dfs(int cur, int pre, long[][] dp, int[][] g) {
    dp[cur][0] = 1;
    dp[cur][1] = 1;

    for (int nex : g[cur]) {
      if (nex == pre)
        continue;

      dfs(nex, cur, dp, g);

      dp[cur][1] += dp[nex][1];
      dp[cur][0] *= dp[nex][0] * fif[1][(int) dp[nex][1]] % mod;
      dp[cur][0] %= mod;
    }

    dp[cur][0] *= fif[0][(int) (dp[cur][1] - 1)];
    dp[cur][0] %= mod;
  }

  private static int mod = (int) 1e9 + 7;
  private static int[][] fif = enumFIF(4 * 100000, mod);

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

  static int[][] packU(int n, int[] from, int[] to) {
    int[][] g = new int[n][];
    int[] p = new int[n];
    for (int f : from)
      p[f]++;
    for (int t : to)
      p[t]++;
    for (int i = 0; i < n; i++)
      g[i] = new int[p[i]];
    for (int i = 0; i < from.length; i++) {
      g[from[i]][--p[from[i]]] = to[i];
      g[to[i]][--p[to[i]]] = from[i];
    }
    return g;
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

