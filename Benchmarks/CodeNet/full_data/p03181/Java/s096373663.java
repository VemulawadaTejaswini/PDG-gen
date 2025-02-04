
public class Main {
  private static void solve() {
    int n = ni();
    int m = ni();
    int[] from = new int[n - 1];
    int[] to = new int [n -1];
    
    for (int i = 0; i < n-1; i ++) {
      from[i]=ni()-1;
      to[i]=ni()-1;
    }
    int[][] g = packU(n,from,to);
    long[][][] dp = new long[n][][];
    dfs(0, -1, g, dp, m);
    dfs2(0, -1, 1, g, dp, m);
    
    for (int i = 0; i < n; i ++) {
      out.println(dp[i][2][0]);
    }
  }

  private static void dfs2(int v, int pre, long top, int[][] g, long[][][] dp, int m) {
    int k = g[v].length;
    dp[v][2][0] = top * dp[v][0][k];

    for (int i = 0; i < k; i ++) {
      int u = g[v][i];
      if (u == pre) {
        continue;
      }

      long next = top * dp[v][0][i] % m * dp[v][1][i + 1] % m;
      dfs2(u, v, (next + 1) % m, g, dp, m);
    }
  }

  private static long dfs(int v, int pre, int[][] g, long[][][] dp, int m) {
    int k = g[v].length;
    long[] a = new long[k];
    long ret = 1;
    for (int i = 0; i < k; i ++) {
      int u = g[v][i];
      if (u == pre) {
        a[i] = 1;
        continue;
      }
      a[i] = dfs(u, v, g, dp, m) + 1;
      ret *= a[i];
      ret %= m;
    }
    
    dp[v] = new long[3][];
    dp[v][0] = new long[k + 1];
    dp[v][1] = new long[k + 1];
    dp[v][2] = new long[1];
    dp[v][0][0] = dp[v][1][k] = 1;
    for (int i = 0; i < k; i ++) {
      dp[v][0][i + 1] = dp[v][0][i] * a[i] % m;
    }
    for (int i = k; i > 0; i --) {
      dp[v][1][i - 1] = dp[v][1][i] * a[i - 1] % m;
    }
    
    return ret;
  }

  
  public static int[][] packU(int n, int[] from, int[] to){ return packU(n, from, to, from.length); }
  public static int[][] packU(int n, int[] from, int[] to, int sup)
  {
      int[][] g = new int[n][];
      int[] p = new int[n];
      for(int i = 0;i < sup;i++)p[from[i]]++;
      for(int i = 0;i < sup;i++)p[to[i]]++;
      for(int i = 0;i < n;i++)g[i] = new int[p[i]];
      for(int i = 0;i < sup;i++){
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
