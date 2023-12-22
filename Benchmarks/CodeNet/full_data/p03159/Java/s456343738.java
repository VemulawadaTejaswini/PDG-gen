
import java.util.Arrays;

public class Main {
  private static void solve() {
    int n = ni();
    long[] a = nal(n);
    int[] from = new int[n - 1];
    int[] to = new int[n - 1];
    for (int i = 0; i < n - 1; i ++) {
      from[i] = ni() - 1;
      to[i] = ni() - 1;
    }
    int[][] g = packU(n, from, to);
    int[][] pars = parents3(g, 0);
    long[][][] dp = new long[n][2][];
    int[] ord = pars[1];
    int[] par = pars[0];
    
    for (int i = n - 1; i >= 0; i --) {
      int cur = ord[i];
      long[][] ldp = new long[2][1];
      ldp[0][0] = a[cur];
      ldp[1][0] = a[cur] < 0 ? Long.MAX_VALUE / 2 : a[cur];
      for (int e : g[cur]) {
        if (par[cur] == e) continue;
        long[][] nldp = conv(ldp, dp[e]);
        ldp = nldp;
      }
      dp[cur] = ldp;
    }
    
    for (int i = 0; i < dp[0][0].length;  i++) {
      if (dp[0][0][i] < 0 || dp[0][1][i] < Long.MAX_VALUE / 3) {
        out.println(i);
        return;
      }
    }
  }
  

  private static long[][] conv(long[][] a, long[][] b) {
    int n = a[0].length;
    int m = b[0].length;
    long[][] c = new long[2][n + m];
    for (long[] v: c) Arrays.fill(v, Long.MAX_VALUE / 2);
    for (int i = 0; i < n; i ++) {
      for (int j = 0; j < m; j ++) {
        c[0][i + j] = Math.min(c[0][i + j], a[0][i] + b[0][j]);
        c[1][i + j] = Math.min(c[1][i + j], a[1][i] + b[1][j]);
        
        if (b[0][j] < 0 || b[1][j] <= Long.MAX_VALUE / 3) {
          c[0][i + j + 1] = Math.min(c[0][i + j + 1], a[0][i]);
          c[1][i + j + 1] = Math.min(c[1][i + j + 1], a[1][i]);
        }
      }
    }
    return c;
  }


  public static int[][] parents3(int[][] g, int root) {
    int n = g.length;
    int[] par = new int[n];
    Arrays.fill(par, -1);

    int[] depth = new int[n];
    depth[0] = 0;

    int[] q = new int[n];
    q[0] = root;
    for (int p = 0, r = 1; p < r; p++) {
        int cur = q[p];
        for (int nex : g[cur]) {
            if (par[cur] != nex) {
                q[r++] = nex;
                par[nex] = cur;
                depth[nex] = depth[cur] + 1;
            }
        }
    }
    return new int[][] { par, q, depth };
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
