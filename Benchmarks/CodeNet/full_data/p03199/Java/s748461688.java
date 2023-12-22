
import java.util.HashMap;
import java.util.Map;

public class Main {


  static Map<Long, Integer> map = new HashMap<>();
  static int[][][] table = {{{0, 0}, {0, 0}}, {{1, 1}, {0, 0}}, {{1, 0}, {1, 0}}, {{1, 0}, {0, 1}},
      {{0, 1}, {1, 0}}, {{0, 1}, {0, 1}}, {{0, 0}, {1, 1}}, {{1, 1}, {1, 1}},};


  private static void solve() {
    int n = ni();
    int m = ni();

    int[][] p = ntable(m, 3);
    for (int i = 0; i < m; i++) {
      p[i][0]--;
      p[i][1]--;
      map.put(h(p[i][0], p[i][1]), p[i][2]);
    }

    int mod = 998244353;
    long[][] dp = new long[n][2];
    if (map.containsKey(h(0, 0))) {
      dp[0][map.get(h(0, 0))] = 1;
    } else {
      dp[0][0] = dp[0][1] = 1;
    }


    long cnt = (long) (n - 2) * (n - 1) / 2;
    for (int[] v : p) {
      int d = Math.abs(v[0] - v[1]);
      if (d <= 1) {
        continue;
      }

      if (d > 2 && !eq(v[1], v[0], v[2])) {
        System.out.println(0);
        return;
      }
      cnt--;
    }


    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < 2; j++) {
        for (int k = 0; k < 2; k++) {
          if (i >= 1 && i <= n - 2 && map.containsKey(h(i + 1, i - 1))
              && map.containsKey(h(i - 1, i + 1))) {
            int a = map.get(h(i + 1, i - 1));
            int b = map.get(h(i - 1, i + 1));

            if (k == 0 && a != b || k == 1 && a == b) {
              continue;
            }
          }

          if (!eq(i + 1, i + 1, k))
            continue;

          for (int[][] v : table) {

            if (v[0][0] != j || v[1][1] != k || !eq(i + 1, i, v[1][0]) || !eq(i, i + 1, v[0][1])) {
              continue;
            } else {
              dp[i + 1][k] += dp[i][j];
              dp[i + 1][k] %= mod;
            }
          }
        }
      }
    }

    System.out.println((dp[n - 1][0] + dp[n - 1][1]) * pow(2, cnt, mod) % mod);
  }

  public static long pow(long a, long n, long mod) {
    // a %= mod;
    long ret = 1;
    int x = 63 - Long.numberOfLeadingZeros(n);
    for (; x >= 0; x--) {
      ret = ret * ret % mod;
      if (n << 63 - x < 0)
        ret = ret * a % mod;
    }
    return ret;
  }


  private static boolean eq(int y, int x, int v) {
    return !map.containsKey(h(y, x)) || map.get(h(y, x)) == v;
  }

  private static long h(int y, int x) {
    return 1000000000000L * y + x;
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
