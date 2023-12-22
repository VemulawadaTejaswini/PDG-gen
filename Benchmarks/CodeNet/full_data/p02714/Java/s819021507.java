
public class Main {

  private static void solve() {
    int n = ni();
    char[] s = ns();

    long[] rs = new long[n + 1];
    long[] gs = new long[n + 1];
    long[] bs = new long[n + 1];
    for (int i = 0; i < n; i++) {
      if (s[i] == 'R') {
        rs[i + 1]++;
      } else if (s[i] == 'G') {
        gs[i + 1]++;
      } else {
        bs[i + 1]++;
      }
      rs[i + 1] += rs[i];
      gs[i + 1] += gs[i];
      bs[i + 1] += bs[i];
    }

    long ret = 0;
    for (int i = 1; i < n - 1; i++) {
      if (s[i] == 'R') {
        // GB
        ret += gs[i] * (bs[n] - bs[i]) + bs[i] * (gs[n] - gs[i]);
      } else if (s[i] == 'G') {
        // RB
        ret += bs[i] * (rs[n] - rs[i]) + rs[i] * (bs[n] - bs[i]);
      } else {
        // RG
        ret += gs[i] * (rs[n] - rs[i]) + rs[i] * (gs[n] - gs[i]);
      }

      for (int j = 1; i - j >= 0 && i + j < n; j++) {
        if (s[i] != s[i - j] && s[i] != s[i + j] && s[i + j] != s[i - j]) {
          ret--;
        }
      }
    }
    System.out.println(ret);
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

