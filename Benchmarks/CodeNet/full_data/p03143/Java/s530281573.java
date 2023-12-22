
import java.util.Arrays;



public class Main {
  static class DisjointSet {
    public int[] upper; 

    public DisjointSet(int n) {
      upper = new int[n];
      Arrays.fill(upper, -1);
      // w = new int[n];
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
        // w[x] += w[y];
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

  private static void solve() {
    int n = ni();
    int m = ni();
    long[] x = nal(n);
    int[][] e = ntable(m, 3);
    for (int i = 0; i < m; i ++) {
      e[i][0] --;
      e[i][1] --;
    }
    Arrays.sort(e, (o1, o2) -> o1[2] - o2[2]);
    
    DisjointSet ds = new DisjointSet(n);
    boolean[] ok = new boolean[m];
    for (int i = 0; i < m; i ++) {
      int[] f = e[i];
      if (!ds.equiv(f[0], f[1])) {
        int a = ds.root(f[0]);
        int b = ds.root(f[1]);
        ds.union(f[0], f[1]);
        x[ds.root(f[0])] = x[a] + x[b];
      }
      if (x[ds.root(f[0])] >= f[2]) {
        ok[i] = true;
      }
    }

    int[] from = new int[m];
    int[] to = new int[m];
    int[] w = new int[m];
    for (int i = 0; i < m; i ++) {
      from[i] = e[i][0];
      to[i] = e[i][1];
      w[i] = e[i][2];
    }
    int[][][] g = packWU(n, from, to, w);
    for (int i = m - 1; i >= 0; i --) {
      if (ok[i]) {
        dfs(e[i][0], g, e[i][2]);
      }
    }
    
    int ret = 0;
    for (int i = 0; i < n; i ++) {
      for (int[] v : g[i]) {
        if (v[1] == Integer.MAX_VALUE) {
          ret ++;
        }
      }
    }
    System.out.println(m - ret / 2);
  }
  
  private static void dfs(int v, int[][][] g, int max) {
    for (int[] u : g[v]) {
      if (u[1] <= max) {
        u[1] = Integer.MAX_VALUE;
        dfs(u[0], g, max);
      }
    }
  }
  
  public static int[][][] packWU(int n, int[] from, int[] to, int[] w){ return packWU(n, from, to, w, from.length); }
  public static int[][][] packWU(int n, int[] from, int[] to, int[] w, int sup)
  {
      int[][][] g = new int[n][][];
      int[] p = new int[n];
      for(int i = 0;i < sup;i++)p[from[i]]++;
      for(int i = 0;i < sup;i++)p[to[i]]++;
      for(int i = 0;i < n;i++)g[i] = new int[p[i]][2];
      for(int i = 0;i < sup;i++){
          --p[from[i]];
          g[from[i]][p[from[i]]][0] = to[i];
          g[from[i]][p[from[i]]][1] = w[i];
          --p[to[i]];
          g[to[i]][p[to[i]]][0] = from[i];
          g[to[i]][p[to[i]]][1] = w[i];
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
