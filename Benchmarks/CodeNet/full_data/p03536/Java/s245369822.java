
import java.util.Arrays;

public class Main {
  private static void solve() {
    int n = ni();
    int[][] p = ntable(n, 2);
    Arrays.sort(p, (o1, o2) -> {
      int d = o1[1] - o2[1];
      return d == 0 ? o1[0] - o2[0] : d;
    });

    //n人目まででk人載せたときの最小枚数
    long inf = Long.MAX_VALUE / 3;
    long[][] dp = new long[2][n + 1];
    Arrays.fill(dp[0], inf);
    dp[0][0] = 0;

    int ret = 0;
    for (int i = 0; i < n; i ++) {
      int from = i % 2;
      int to = (i + 1) % 2;
      Arrays.fill(dp[to], inf);
      for (int j = 0; j <= i; j ++) {
        dp[to][j] = dp[from][j];
        if (dp[from][j] <= p[i][0]) {
          dp[to][j + 1] = Math.min(dp[to][j + 1], dp[from][j] + p[i][1]);
          ret = Math.max(ret, j + 1);
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


