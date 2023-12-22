
import java.util.Arrays;

class DisjointSet {
  public int[] upper;

  public DisjointSet(int n) {
    upper = new int[n];
    Arrays.fill(upper, -1);
  }

  public DisjointSet(DisjointSet ds) {
    this.upper = Arrays.copyOf(ds.upper, ds.upper.length);
  }

  public int root(int x) {
    return upper[x] < 0 ? x : (upper[x] = root(upper[x]));
  }

  public boolean equiv(int x, int y) {
    return root(x) == root(y);
  }

  public boolean union(int x, int y) {
    x = root(x);
    y = root(y);
    if (x != y) {
      if (upper[y] < upper[x]) {
        int d = x;
        x = y;
        y = d;
      }
      upper[x] += upper[y];
      upper[y] = x;
    }
    return x == y;
  }

  public int count() {
    int ct = 0;
    for (int u : upper) {
      if (u < 0)
        ct++;
    }
    return ct;
  }

  public int[][] toBucket() {
    int n = upper.length;
    int[][] ret = new int[n][];
    int[] rp = new int[n];
    for (int i = 0; i < n; i++) {
      if (upper[i] < 0)
        ret[i] = new int[-upper[i]];
    }
    for (int i = 0; i < n; i++) {
      int r = root(i);
      ret[r][rp[r]++] = i;
    }
    return ret;
  }
}


public class Main {
  private static void solve() {
    int n = ni();
    int m = ni();
    int[] from = new int[m];
    int[] to = new int[m];
    int[] w = new int[m];
    for (int i = 0; i < m; i++) {
      from[i] = ni() - 1;
      to[i] = ni() - 1;
      w[i] = ni();
    }
    int[][] k = kruskal(from, to, w, n);
    from = k[0];
    to = k[1];
    w = k[2];
    m = k.length;
    long total = 0;
    for (int i = 0; i < m; i ++) {
      total += w[i];
    }

    int[][] d = new int[n][n];
    for (int[] v : d)
      Arrays.fill(v, Integer.MAX_VALUE / 2);
    for (int i = 0; i < m; i++) {
      d[from[i]][to[i]] = d[to[i]][from[i]] = w[i];
    }

    int[][] g = packU(n, from, to);
    int[][] p3 = parents(g, 0);
    int[] par = p3[0];
    int[] depth = p3[2];
    int[][] spar = logstepParents(par);
    int[][] max = new int[n][n];
    dfs(0, -1, g, d, max, par);
    
    int q = ni();
    for (int i = 0; i < q; i ++) {
      int s = ni() - 1;
      int t = ni() - 1;
      int c = lca(s, t, spar, depth);
      
      out.println(total - Math.max(max[c][t], max[c][s]));
    }
  }

  public static int lca(int a, int b, int[][] spar, int[] depth) {
    if (depth[a] < depth[b]) {
      b = ancestor(b, depth[b] - depth[a], spar);
    } else if (depth[a] > depth[b]) {
      a = ancestor(a, depth[a] - depth[b], spar);
    }

    int low = -1;
    int high = depth[a];
    while (high - low > 1) {
      int x = (low + high) / 2;
      if (ancestor(a, x, spar) == ancestor(b, x, spar)) {
        high = x;
      } else {
        low = x;
      }
    }
    return ancestor(a, high, spar);
  }

  protected static int ancestor(int a, int m, int[][] spar) {
    for (; m > 0 && a != -1; m &= m - 1)
      a = spar[Integer.numberOfTrailingZeros(m)][a];
    return a;
  }

  private static void dfs(int v, int pre, int[][] g, int[][] d, int[][] max, int[] pars) {
    int par = v;
    while ((par = pars[par]) >= 0) {
      max[par][v] = Math.max(d[pre][v], max[par][v]);
    }

    for (int u : g[v]) {
      if (u == pre) {
        continue;
      }
      dfs(u, v, g, d, max, pars);
    }
  }

  public static int[][] logstepParents(int[] par) {
    int n = par.length;
    int m = Integer.numberOfTrailingZeros(Integer.highestOneBit(n - 1)) + 1;
    int[][] pars = new int[m][n];
    pars[0] = par;
    for (int j = 1; j < m; j++) {
      for (int i = 0; i < n; i++) {
        pars[j][i] = pars[j - 1][i] == -1 ? -1 : pars[j - 1][pars[j - 1][i]];
      }
    }
    return pars;
  }

  public static int[][] packU(int n, int[] from, int[] to) {
    return packU(n, from, to, from.length);
  }

  public static int[][] packU(int n, int[] from, int[] to, int sup) {
    int[][] g = new int[n][];
    int[] p = new int[n];
    for (int i = 0; i < sup; i++)
      p[from[i]]++;
    for (int i = 0; i < sup; i++)
      p[to[i]]++;
    for (int i = 0; i < n; i++)
      g[i] = new int[p[i]];
    for (int i = 0; i < sup; i++) {
      g[from[i]][--p[from[i]]] = to[i];
      g[to[i]][--p[to[i]]] = from[i];
    }
    return g;
  }

  public static int[][] parents(int[][] g, int root) {
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
    return new int[][] {par, q, depth};
  }

  public static int[][] kruskal(int[] one, int[] other, int[] w, int n) {
    DisjointSet ds = new DisjointSet(n);
    int p = one.length;
    long[] ord = new long[p];
    for (int i = 0; i < p; i++)
      ord[i] = (long) w[i] << 32 | i;
    Arrays.sort(ord);

    int[] none = new int[p];
    int[] nother = new int[p];
    int[] nw = new int[p];
    int q = 0;
    for (int i = 0; i < ord.length; i++) {
      int cur = (int) ord[i];
      if (!ds.equiv(one[cur], other[cur])) {
        ds.union(one[cur], other[cur]);

        none[q] = one[cur];
        nother[q] = other[cur];
        nw[q] = w[cur];
        q ++;
      }
    }
    none = Arrays.copyOf(none, q);
    nother = Arrays.copyOf(nother, q);
    nw = Arrays.copyOf(nw, q);

    return new int[][] {none, nother, nw};
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
