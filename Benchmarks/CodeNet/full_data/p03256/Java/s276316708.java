
public class Main {

  private static void solve() {
    int n = ni();
    int m = ni();
    char[] s = ns();
    int[] from = new int[m];
    int[] to = new int[m];
    int[][] cnt = new int[n][2];
    for (int i = 0; i < m; i ++) {
      from[i] = ni() - 1;
      to[i] = ni() - 1;
      
      if (s[from[i]] == 'A') {
        cnt[to[i]][0] ++;
      } else {
        cnt[to[i]][1] ++;
      }
      if (s[to[i]] == 'A') {
        cnt[from[i]][0] ++;
      } else {
        cnt[from[i]][1] ++;
      }
    }
    int[][] g = packU(n, from, to);

    boolean[] visited = new boolean[n];
    for (int i = 0; i < n; i ++) {
      dfs(i, g, cnt, s, visited);
    }
    
    for (int i = 0; i < n; i ++) {
      if (cnt[i][0] > 0) {
        System.out.println("Yes");
        return;
      }
    }
    System.out.println("No");
    
  }
  
  private static void dfs(int n, int[][] g, int[][] cnt, char[] s, boolean[] visited) {
    visited[n] = true;
    if (cnt[n][0] == 0 || cnt[n][1] == 0) {

      for (int next : g[n]) {
        cnt[next][s[n] - 'A'] --;
        cnt[n][s[next] - 'A'] --;

        if (cnt[next][0] > 0 || cnt[next][1] > 0) {
          visited[next] = false;
        }
      }
    }


    for (int next : g[n]) {
      if (visited[next]) {
        continue;
      }
      dfs(next, g, cnt, s, visited);
    }
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
