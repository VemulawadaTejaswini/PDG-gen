
public class Main {

  private static void solve() {
    int n = ni();

    char[][] p3 = { // 0
        "aa.".toCharArray(), // 1
        "..b".toCharArray(), // 2
        "..b".toCharArray(), // 3
    };

    int f = 1;
    while (n % 2 == 0) {
      f *= 2;
      n /= 2;
    }

    char[][] parts = new char[n][n];
    if (n == 1) {
      System.out.println(-1);
      return;
    }

    int c = n / 2 - 1;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        parts[c + i][c + j] = p3[i][j];
      }
    }

    int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    char[][] e = {{'c', 'd'}, {'e', 'f'}};
    for (int l = 5, k = 0; l <= n; l += 2, k++) {

      int y = c - k - 1;
      int x = c - k - 1;
      for (int[] d : dir) {
        for (int s = 0; s < l - 1; s++) {
          parts[y][x] = e[k % 2][s % 4 / 2];
          y += d[0];
          x += d[1];
        }
      }
    }

    char[][] ret = new char[n * f][n * f];
    for (int i = 0; i < f; i++) {
      for (int j = 0; j < f; j++) {
        for (int s = 0; s < n; s++) {
          for (int t = 0; t < n; t++) {
            char d;
            if (parts[s][t] == '.') {
              d = '.';
            } else {
              boolean even = (i + j) % 2 == 0;
              d = (char) ((even ? 0 : 10) + parts[s][t]);
            }
            ret[i * n + s][j * n + t] = d;
          }
        }
      }
    }

    for (char[] l : ret) {
      System.out.println(l);
    }

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

