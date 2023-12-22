
public class Main {

  private static void solve() {
    int n = ni();
    int m = ni();
    char[] s = ns();
    int[] from = new int[m];
    int[] to = new int[m];
    for (int i = 0; i < m; i++) {
      from[i] = ni() - 1;
      to[i] = ni() - 1;
    }
    int[][] g = packU(n, from, to);
    int[] state = new int[n];
    for (int i = 0; i < n; i++) {
      if (state[i] == 0) {
        boolean ret = dfs(i, s[i] == 'A' ? 0 : 2, false, i, state, g, s);
        if (ret) {
          System.out.println("Yes");
          return;
        }
      }
    }
    System.out.println("No");
  }

  private static boolean dfs(int cur, int cs, boolean loop, int start, int[] state, int[][] g,
      char[] s) {
    if (loop && cur == start) {
      return true;
    }
    state[cur] |= 1 << cs;

    for (int nex : g[cur]) {
      boolean ret = false;
      if (cs == 0 && s[nex] == 'A') {
        ret = dfs(nex, 1, false, start, state, g, s);
      } else if (cs == 1 && s[nex] == 'B') {
        ret = dfs(nex, 2, false, start, state, g, s);
      } else if (cs == 2 && s[nex] == 'B') {
        ret = dfs(nex, 3, false, start, state, g, s);
      } else if (cs == 3 && s[nex] == 'A') {
        ret = dfs(nex, 0, true, start, state, g, s);
      }
      if (ret) {
        return true;
      }
    }
    return false;
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

