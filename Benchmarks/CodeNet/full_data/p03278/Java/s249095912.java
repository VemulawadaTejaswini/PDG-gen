
public class Main {

  private static void solve() {
    int n = ni();
    int[] from = new int[n - 1];
    int[] to = new int[n - 1];
    for (int i = 0; i < n - 1; i++) {
      from[i] = ni() - 1;
      to[i] = ni() - 1;
    }
    int mod = (int) 1e9 + 7;
    long[] f2 = new long[n + 1];
    f2[1] = 1;
    for (int i = 3; i <= n; i += 2) {
      f2[i] = f2[i - 2] * i % mod;
    }

    tmp = new long[2][n + 1];
    int[][] g = packU(n, from, to);
    long[][][] dp = new long[n][2][n + 1];
    dfs(0, -1, g, dp, f2);

    long ret = 0;
    for (int i = 1; i <= n; i++) {
      ret += (dp[0][0][i] + mod - dp[0][1][i]) * f2[i - 1];
      ret %= mod;
    }
    System.out.println(ret);
  }

  private static long[][] tmp;

  private static int dfs(int now, int pre, int[][] g, long[][][] dp, long[] f2) {
    int mod = (int) 1e9 + 7;

    int m = g[now].length;
    int ptr = 0;
    int[] len = new int[m];
    for (int next : g[now]) {
      if (next == pre) {
        continue;
      } else {
        len[ptr++] = dfs(next, now, g, dp, f2);;
      }
    }

    long[][] tmp = Main.tmp;
    ptr = 0;
    int s = 1;
    dp[now][0][1] = 1;
    for (int next : g[now]) {
      if (next == pre) {
        continue;
      }
      s += len[ptr];
      for (int i = 1; i <= s; i++) {
        tmp[0][i] = tmp[1][i] = 0;
        for (int j = 1; j <= len[ptr]; j++) {
          if (i >= j) {
            tmp[0][i] += dp[next][0][j] * dp[now][0][i - j] % mod;
            tmp[0][i] += dp[next][1][j] * dp[now][1][i - j] % mod;
            tmp[1][i] += dp[next][0][j] * dp[now][1][i - j] % mod;
            tmp[1][i] += dp[next][1][j] * dp[now][0][i - j] % mod;
          }
          tmp[1][i] += dp[next][0][j] * dp[now][0][i] % mod * f2[j - 1] % mod;
          tmp[1][i] += dp[next][1][j] * dp[now][1][i] % mod * f2[j - 1] % mod;
          tmp[0][i] += dp[next][0][j] * dp[now][1][i] % mod * f2[j - 1] % mod;
          tmp[0][i] += dp[next][1][j] * dp[now][0][i] % mod * f2[j - 1] % mod;
          tmp[0][i] %= mod;
          tmp[1][i] %= mod;
        }
      }
      ptr ++;

      long[][] t = tmp;
      tmp = dp[now];
      dp[now] = t;
    }
    Main.tmp = tmp;
    return s;
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
