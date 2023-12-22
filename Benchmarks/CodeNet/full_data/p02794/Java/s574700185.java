
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
  private static void solve() {
    int n = ni();

    int[] from = new int[n - 1];
    int[] to = new int[n - 1];
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < n - 1; i++) {
      from[i] = ni() - 1;
      to[i] = ni() - 1;
      map.put(h(from[i], to[i]), i);
    }
    int[][] g = packU(n, from, to);
    int[] hist = new int[n];
    int[][][] table = new int[n][n][];
    for (int i = 0; i < n; i++) {
      dfs(i, -1, 0, g, hist, table[i], map);
    }

    long[] f = new long[n + 1];
    f[0] = 1;
    for (int i = 1; i <= n; i++) {
      f[i] = f[i - 1] * 2;
    }

    int m = ni();
    int[][] q = ntable(m, 2);
    for (int[] p : q) {
      p[0]--;
      p[1]--;
    }

    long ret = 0;
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < (1 << m); i++) {
      set.clear();
      for (int j = 0; j < m; j++) {
        if (((i >> j) & 1) == 1) {
          int u = q[j][0];
          int v = q[j][1];

          for (int e : table[u][v]) {
            set.add(e);
          }
        }
      }
      int e = (n - 1) - set.size();
      int sgn = Integer.bitCount(i) % 2 == 0 ? 1 : -1;
      ret += sgn * f[e];
    }
    System.out.println(ret);
  }

  private static void dfs(int cur, int pre, int ptr, int[][] g, int[] hist, int[][] table,
      Map<Integer, Integer> map) {

    table[cur] = Arrays.copyOf(hist, ptr);

    for (int nex : g[cur]) {
      if (nex == pre)
        continue;
      hist[ptr] = map.get(h(cur, nex));
      dfs(nex, cur, ptr + 1, g, hist, table, map);
    }
  }

  private static int h(int u, int v) {
    return Math.min(u, v) * 100 + Math.max(u, v);
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
