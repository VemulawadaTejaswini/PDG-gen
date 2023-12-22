
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {


  private static void solve() {
    int n = ni();
    int m = ni();
    int s = ni() - 1;
    int t = ni() - 1;
    int[] from = new int[m];
    int[] to = new int[m];
    int[] w1 = new int[m];
    int[] w2 = new int[m];
    for (int i = 0; i < m; i ++) {
      from[i] = ni() - 1;
      to[i] = ni() - 1;
      w1[i] = ni();
      w2[i] = ni();
    }
    int[][][] gs = packWU(n, from, to, w1);
    int[][][] gt = packWU(n, from, to, w2);
    
    long[] ds = dijk(gs, s);
    long[] dt = dijk(gt, t);
    
    long[] ret = new long[n];
    
    ret[n - 1] = dt[n - 1] + ds[n - 1];
    for (int i = n - 2; i >= 0; i --) {
      long now = dt[i] + ds[i];
      ret[i] = Math.min(ret[i + 1], now);
    }
    
    for (long v : ret) {
      System.out.println(1000000000000000L - v);
    }
  }

  public static long[] dijk(int[][][] g, int from)
  {
      int n = g.length;
      final long[] td = new long[n];
      Arrays.fill(td, Long.MAX_VALUE);
      TreeSet<Integer> q = new TreeSet<Integer>(new Comparator<Integer>(){
          public int compare(Integer a, Integer b) {
              if(td[a] - td[b] != 0)return Long.signum(td[a] - td[b]);
              return a - b;
          }
      });
      q.add(from);
      td[from] = 0;
      
      while(q.size() > 0){
          int cur = q.pollFirst();
          
          for(int i = 0;i < g[cur].length;i++){
              int next = g[cur][i][0];
              long nd = td[cur] + g[cur][i][1];
              if(nd < td[next]){
                  q.remove(next);
                  td[next] = nd;
                  q.add(next);
              }
          }
      }
      
      return td;
  }

  private static int[][][] packWU(int n, int[] from, int[] to, int[] w) {
    int sup = from.length;
    int[][][] g = new int[n][][];
    int[] p = new int[n];
    for (int i = 0; i < sup; i++)
        if (w[i] > 0)
            p[from[i]]++;
    for (int i = 0; i < sup; i++)
        if (w[i] > 0)
            p[to[i]]++;
    for (int i = 0; i < n; i++)
        g[i] = new int[p[i]][2];
    for (int i = 0; i < sup; i++) {
        if (w[i] > 0) {
            --p[from[i]];
            g[from[i]][p[from[i]]][0] = to[i];
            g[from[i]][p[from[i]]][1] = w[i];
            --p[to[i]];
            g[to[i]][p[to[i]]][0] = from[i];
            g[to[i]][p[to[i]]][1] = w[i];
        }
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
