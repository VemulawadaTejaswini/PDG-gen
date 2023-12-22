
import java.util.Arrays;
import java.util.TreeSet;

public class Main {

  private static void solve() {
    int n = ni();
    int m = ni();
    int s = ni();

    int[] from = new int[m];
    int[] to = new int[m];
    int[] a = new int[m];
    int[] b = new int[m];
    for (int i = 0; i < m; i++) {
      from[i] = ni() - 1;
      to[i] = ni() - 1;
      a[i] = ni();
      b[i] = ni();
    }
    long[] c = new long[n];
    long[] d = new long[n];
    for (int i = 0; i < n; i++) {
      c[i] = ni();
      d[i] = ni();
    }
    int[][][] g = packWU(n, from, to, a, b);

    long[][] ret = dijk(g, new int[] {0, Math.min(2500, s)}, c, d);

    for (int i = 1; i < n; i++) {
      long ans = Long.MAX_VALUE;
      for (int j = 0; j <= 2500; j++) {
        ans = Math.min(ans, ret[i][j]);
      }
      out.println(ans + " ");
    }
  }

  public static long[][] dijk(int[][][] g, int[] from, long[] c, long[] d) {
    int n = g.length;
    int max = 2500;
    final long[][] td = new long[n][3000];
    for (long[] v : td)
      Arrays.fill(v, Long.MAX_VALUE);

    TreeSet<int[]> q = new TreeSet<>((a, b) -> {
      if (td[a[0]][a[1]] - td[b[0]][b[1]] != 0)
        return Long.signum(td[a[0]][a[1]] - td[b[0]][b[1]]);
      return a[0] == b[0] ? a[1] - b[1] : a[0] - b[0];
    });

    q.add(from);
    td[from[0]][from[1]] = 0;

    while (q.size() > 0) {
      int[] v = q.pollFirst();
      int cur = v[0];
      int s = v[1];
      for (int i = 0; i < g[cur].length; i++) {
        int u = g[cur][i][0];
        int cost = g[cur][i][1];
        long time = g[cur][i][2];

        if (s >= cost) {
          long nd = td[cur][s] + time;
          int[] next = {u, s - cost};
          if (nd < td[next[0]][next[1]]) {
            q.remove(next);
            td[next[0]][next[1]] = nd;
            q.add(next);
          }
        }

        int nexCos = Math.min(max, (int) (s + c[cur]));
        int[] next = {cur, nexCos};
        long nd = td[cur][s] + d[cur];
        if (nd < td[next[0]][next[1]]) {
          q.remove(next);
          td[next[0]][next[1]] = nd;
          q.add(next);
        }
      }
    }

    return td;

  }


  public static int[][][] packWU(int n, int[] from, int[] to, int[] a, int[] b) {
    int[][][] g = new int[n][][];
    int[] p = new int[n];
    for (int f : from)
      p[f]++;
    for (int t : to)
      p[t]++;
    for (int i = 0; i < n; i++)
      g[i] = new int[p[i]][3];
    for (int i = 0; i < from.length; i++) {
      --p[from[i]];
      g[from[i]][p[from[i]]][0] = to[i];
      g[from[i]][p[from[i]]][1] = a[i];
      g[from[i]][p[from[i]]][2] = b[i];
      --p[to[i]];
      g[to[i]][p[to[i]]][0] = from[i];
      g[to[i]][p[to[i]]][1] = a[i];
      g[to[i]][p[to[i]]][2] = b[i];
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

