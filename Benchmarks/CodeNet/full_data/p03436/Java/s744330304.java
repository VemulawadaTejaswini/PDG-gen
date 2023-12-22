
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

  private static void solve() {
    int h = ni();
    int w = ni();
    char[][] map = new char[h + 2][w + 2];
    long white = 0;
    for (int i = 1; i <= h; i ++) {
      char[] line = ns();
      for (int j = 1; j <= w; j ++) {
        char c = line[j - 1];
        
        map[i][j] = c;
        if (c == '.') {
          white ++;
        }
      }
    }
    
    long[][] d = dijkstra(map, new int[] {1,  1});
    System.out.println(white - (d[h][w] + 1));
  }

  private static int[][] DIR = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
  public static long[][] dijkstra(char[][] map, int[] start) {
      int w = map[0].length;
      int h = map.length;
      long[][] len = new long[h][w];
      for (int i = 0; i < h; i ++) {
          for (int j = 0; j < w; j ++) {
              len[i][j] = Long.MAX_VALUE / 2;
          }
      }

      PriorityQueue<long[]> queue = new PriorityQueue<long[]>(new Comparator<long[]>() {
          @Override
          public int compare(long[] o1, long[] o2) {
              return Long.compare(o1[2], o2[2]);
          }
      });

      queue.add(new long[]{start[0], start[1], 0});
      
      boolean[][] visited = new boolean[h][w];

      while (queue.size() > 0) {
          long[] pos = queue.poll();
          int x = (int)pos[0];
          int y = (int)pos[1];
          len[y][x] = pos[2];
          if (visited[y][x]) {
              continue;
          }
          visited[y][x] = true;

          for (int[] d : DIR) {
              int nextX = x + d[0];
              int nextY = y + d[1];
              if (map[nextY][nextX] == '.') {
                  if (!visited[nextY][nextX]) {
                      long newCost = pos[2] + 1;
                      queue.add(new long[]{nextX, nextY, newCost});
                  }
              }
          }
      }
      return len;
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
