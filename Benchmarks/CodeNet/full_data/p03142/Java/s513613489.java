
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {


  private static void solve() {
    int n = ni();
    int m = ni();
    int[] from = new int[n + m - 1];
    int[] to = new int[n + m - 1];
    
    int[] cnt = new int[n];
    for (int i = 0; i < n + m - 1; i ++) {
      from[i] = ni() - 1;
      to[i] = ni() - 1;
      
      cnt[to[i]] ++;
    }
    
    int root = 0;
    for (int i = 0; i < n; i ++) {
      if (cnt[i] == 0) {
        root = i;
        break;
      }
    }
    int[][] g = packD(n, from, to);
    dfs(root, -1, g, 0);

    int[] ret = new int[n];
    Arrays.fill(ret, -1);
    for (List<int[]> v : map.values()) {
      if (v.size() == 0) {
        continue;
      }
      Collections.sort(v, (o1, o2) -> o2[2] - o1[2]);
      int[] b = v.get(0);
      ret[b[1]] = b[0];
    }
    

    for (int i = 0; i < n; i ++) {
      out.println(ret[i] + 1);
    }
    
  }
  static long inf = 100000000000L;
  static Map<Integer, List<int[]>> map = new HashMap<>();
  private static void dfs(int now, int pre, int[][] g, int depth) {
    map.putIfAbsent(now, new ArrayList<>());

    map.get(now).add(new int[] {pre, now, depth});
    for (int next : g[now]) {
      dfs(next, now, g, depth + 1);
    }
  }

  public static int[][] packD(int n, int[] from, int[] to){ return packD(n, from, to, from.length);}
  public static int[][] packD(int n, int[] from, int[] to, int sup)
  {
      int[][] g = new int[n][];
      int[] p = new int[n];
      for(int i = 0;i < sup;i++)p[from[i]]++;
      for(int i = 0;i < n;i++)g[i] = new int[p[i]];
      for(int i = 0;i < sup;i++){
          g[from[i]][--p[from[i]]] = to[i];
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
