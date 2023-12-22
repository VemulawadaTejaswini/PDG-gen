
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {


  private static void solve() {
    int h = ni();
    int w = ni();
    Deque<int[]> q = new ArrayDeque<>();
    for (int i = 0; i < h; i ++) {
      char[] line = ns();
      for (int j = 0; j < w; j ++) {
        if (line[j] == '#') {
          q.add(new int[] {i, j});
        }
      }
    }
    int[][] d = new int[h][w];
    for (int[] v : d) Arrays.fill(v, Integer.MAX_VALUE / 2);

    for (int[] v : q) {
      d[v[0]][v[1]] = 0;
    }
    
    Deque<int[]> next = new ArrayDeque<>();
    int[][] dir = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};

    
    for (int dist = 0; q.size() > 0; dist ++) {
      while (q.size() > 0) {
        int[] p = q.poll();
        for (int[] dd : dir) {
          int[] n = {dd[0] + p[0], dd[1] + p[1]};
          if (n[0] < 0 || n[0] >= h || n[1] < 0 || n[1] >= w) continue;
          if (dist + 1 >= d[n[0]][n[1]]) continue;
          
          d[n[0]][n[1]] = dist + 1;
          next.add(n);
        }
      }

      Deque<int[]> tmp = next;
      next = q;
      q = tmp;
    }
    
    int max = 0;
    for (int i = 0; i < h; i ++) {
      for (int j = 0; j < w; j ++) {
        max = Math.max(max, d[i][j]);
      }
    }
    System.out.println(max);
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
