
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

  private static void solve() {
    int n = ni();
    int m = ni();
    int[] from = new int[m];
    int[] to = new int[m];
    int[] w = new int[m];
    for (int i = 0; i < m; i ++) {
      from[i] = ni() - 1;
      to[i] = ni() - 1;
      w[i] = ni();
    }
    int[][][] g = packWU(n, from, to, w);

    Queue<Integer> q = new ArrayDeque<>();
    q.add(0);
    long[] c1 = new long[n];
    long[] c0 = new long[n];
    c1[0] = 1;
    long fixed = -1;
    while (!q.isEmpty()) {
      int cur = q.poll();
      for (int[] e: g[cur]) {
        int nex = e[0];
        long nc1 = -c1[cur];
        long nc0 = e[1] - c0[cur];
        if (c1[nex] == nc1 && c0[nex] == nc0) continue;
        
        if (c1[nex] == nc1 && c0[nex] != nc0) {
          System.out.println(0);
          return;
        }
        
        if (c1[nex] == 0) {
          c1[nex] = nc1;
          c0[nex] = nc0;
          q.add(nex);
          continue;
        }
        
        
        long num = c0[nex] - nc0;
        long den = nc1 - c1[nex];
        if (num % den != 0) {
          System.out.println(0);
          return;
        }
        
        long val = num / den;
        if (val <= 0) {
          System.out.println(0);
          return;
        }

        if (fixed != -1 && fixed != val) {
          System.out.println(0);
          return;
        }
        fixed = val;
      }
    }
    if (fixed != -1) {
      for (int i = 0; i < n; i ++) {
        long val = c1[i] * fixed + c0[i];
        if (val <= 0) {
          System.out.println(0);
          return;
        }
      }
      out.println(1);
      return;
    }
    
    long inf = 1, sup = Long.MAX_VALUE / 10;
    for (int i = 0; i < n; i ++) {
      if (c1[i] == 1) {
        inf = Math.max(inf, 1 - c0[i]);
      } else if (c1[i] == -1) {
        sup = Math.min(sup, c0[i] - 1);
      }
    }
    if (inf > sup) {
      System.out.println(0);
    } else {
      System.out.println(sup - inf + 1);
    }
  }

  static long INF = Long.MAX_VALUE;
  static long zero = INF;
  private static boolean dfs2(int now, long value, int[][][] g, long[] x) {
    if (value <= 0) {
      return false;
    }
    x[now] = value;
    for (int[] e : g[now]) {
      int next = e[0];
      long nv = e[1] - value;
      if (x[next] != INF) {
        if (x[next] != nv) {
          return false;
        } else {
          continue;
       }
      }
      if (!dfs2(next, nv, g, x)) return false;
    }
    return true;
  }
  
  private static boolean dfs(int now, long value, int c, int[][][] g, long[] x, int[] color) {
    color[now] = c;
    x[now] = value;

    int nc = -c;
    for (int[] e : g[now]) {
      int next = e[0];
      long nv = e[1] - value;
      if (x[next] != INF) {
        if (color[next] != nc) {
          long y = x[next] + nv;
          if (y % 2 == 1) return false;
          zero = y / 2;
          return false;
        } else {
          if (x[next] != nv) return false;
        }
        continue;
      }
      if (!dfs(next, nv, nc, g, x, color)) return false;
    }
    return true;
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
        String debug = System.getProperty("debug");
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
