
import java.util.Arrays;

public class Main {


  private static void solve() {
    int h = ni();
    int w = ni();
    char[][] map = new char[h][w];
    for (int i = 0; i < h; i ++) {
      map[i] = ns();
    }
    
    int ptr = 0;
    int[] a = new int[h];
    for (int i = 0; i < h; i ++) {
      if (i > 0) {
        boolean same = true;
        for (int j = 0; j < w; j ++) {
          if (map[i - 1][j] != map[i][j]) {
            same = false;
            break;
          }
        }
        if (same) continue;
      }
      
      int cnt = 1;
      for (int j = 1; j < w; j ++) {
        if (map[i][j - 1] != map[i][j]) cnt ++;
      }
      
      a[ptr] = cnt == 1 ? 0  : 1;
      while ((1 << a[ptr]) < cnt) {
        a[ptr] <<= 1;
      }
      ptr ++;
    }
    a = Arrays.copyOf(a, ptr);
    
    int n = ptr;

    dp = new int[n][n];
    for (int[] v : dp) Arrays.fill(v, -1);
    
    System.out.println(dfs(0, n - 1, a));
  }
  
  static int[][] dp;;
  private static int dfs(int l, int r, int[] a) {
    if (l == r) return a[l];
    int ret = Integer.MAX_VALUE;
    if (dp[l][r] >= 0) return dp[l][r];
    
    for (int i = l; i < r; i ++) {
      ret = Math.min(ret, Math.max(dfs(l, i, a), dfs(i + 1, r, a)) + 1);
    }
    
    dp[l][r] = ret;
    return ret;
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
