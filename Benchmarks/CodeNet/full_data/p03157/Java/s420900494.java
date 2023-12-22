
public class Main {


  private static void solve() {
    int h = ni();
    int w = ni();
    char[][] map = new char[h][w];
    for (int i = 0; i < h; i ++) {
      map[i] = ns();
    }
    
    boolean[][] visited = new boolean[h][w];
    long ans = 0;
    for (int i = 0; i < h; i ++) {
      for (int j = 0; j < w; j ++) {
        long[] ret = dfs(i, j, map, visited);
        if (ret != null) {
          ans += ret[0] * ret[1];
        }
      }
    }
    System.out.println(ans);
  }
  
  static int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
  private static long[] dfs(int y, int x, char[][] map, boolean[][] visited) {
    if (visited[y][x]) return null;

    int h = map.length;
    int w = map[0].length;
    visited[y][x] = true;

    long[] ret = {0, 0};
    if (map[y][x] == '#') {
      ret[0] ++;
    } else {
      ret[1] ++;
    }
    

    for (int[] d : dir) {
        
        int ny = d[0] + y;
        int nx = d[1] + x;
        if (ny < 0 || ny >= h || nx < 0 || nx >= w) {
          continue;
        }
        if (!visited[ny][nx] && map[y][x] != map[ny][nx]) {
          long[] v = dfs(ny, nx, map, visited);
          ret[0] += v[0];
          ret[1] += v[1];
        }
        
    }
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
