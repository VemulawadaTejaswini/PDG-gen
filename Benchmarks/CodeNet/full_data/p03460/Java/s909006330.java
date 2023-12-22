
public class Main {
  private static void solve() {
    int n = ni();
    int k = ni();
    k *= 2;
    
    int[][] white = new int[k + 1][k + 1];
    int[][] black = new int[k + 1][k + 1];
    int wc = 0;
    int bc = 0;
    for (int i = 0; i < n; i ++) {
      int x = ni() % k + 1;
      int y = ni() % k + 1;
      String c = next();
      if (c.equals("B")) {
        black[y][x] ++;
        bc ++;
      } else {
        white[y][x] ++;
        wc ++;
      }
    }
    for (int i = 1; i <= k; i ++) {
      for (int j = 1; j <= k; j ++) {
        white[i][j] += white[i][j - 1];
        black[i][j] += black[i][j - 1];
      }
      if (i > 1) {
        for (int j = 1; j <= k; j ++) {
          white[i][j] += white[i - 1][j];
          black[i][j] += black[i - 1][j];
        }
      }
    }

    int ret = 0;

    int l = k / 2;
    for (int dy = 0; dy <= l; dy ++) {
      for (int dx = 0; dx <= l; dx ++) {
        int b = 0, w = 0;
        b += count(0, 0, dy, dx, black);
        b += count(dy, dx, l + dy, l + dx, black);
        b += count(0, dx + l, dy, l * 2, black);
        b += count(dy + l, 0, l * 2, dx, black);
        b += count(dy + l, dx + l, l * 2, l * 2, black);

        w += count(0, 0, dy, dx, white);
        w += count(dy, dx, l + dy, l + dx, white);
        w += count(0, dx + l, dy, l * 2, white);
        w += count(dy + l, 0, l * 2, dx, white);
        w += count(dy + l, dx + l, l * 2, l * 2, white);
        
        w = wc - w;
        
        if (w < 0 || b < 0) {
          System.out.println("NG");
        }
        ret = Math.max(ret, b + w);
        
        int rb = bc - b;
        int rw = wc - w;
        
        ret = Math.max(ret, rb + rw);
      }
    }
    
    System.out.println(ret);
  }
  
  static int count(int y1, int x1, int y2, int x2, int[][] sum) {
    return sum[y2][x2] - sum[y1][x2] - sum[y2][x1] + sum[y1][x1];
  }
//  static boolean isBlack(int x, int y, int dx, int dy) {
//    
//  }

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


