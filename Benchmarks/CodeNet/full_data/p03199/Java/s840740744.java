
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {


  static Map<Long, Integer> map = new HashMap<>();
  static int[][] tbl = new int[1 << 9][2];


  private static void solve() {
    int n = ni();
    int m = ni();

    int mod = 998244353;

    long cnt = (long) (n - 3) * (n - 2) / 2;
    for (int i = 0; i < m; i++) {
      int a = ni() - 1;
      int b = ni() - 1;
      int c = ni();
      map.put(h(a, b), c);

      if (Math.abs(a - b) >= 3) {
        if (!eq(b, a, c)) {
          System.out.println(0);
          return;
        } else {
          cnt--;
        }
      }
    }

    int[][] p = new int[n - 2][2];
    for (int i = 0; i < n - 2; i++) {
      for (int a = 0; a < 3; a++) {
        for (int b = 0; b < 3; b++) {
          if (map.containsKey(h(i + a, i + b))) {
            p[i][map.get(h(i + a, i + b))] |= 1 << (a * 3 + b);
          }
        }
      }
    }

    int k = 0;
    for (int i = 0; i < (1 << 9); i++) {
      int b1 = Integer.bitCount(i);
      int b2 = ((i >> 0) & 1) + ((i >> 1) & 1) + ((i >> 3) & 1) + ((i >> 4) & 1);
      int b3 = ((i >> 4) & 1) + ((i >> 5) & 1) + ((i >> 7) & 1) + ((i >> 8) & 1);
      if (b1 % 2 == 0 && b2 % 2 == 0 && b3 % 2 == 0) {
        tbl[k][1] = i;
        tbl[k][0] = (~i) & ((1 << 9) - 1);
        k++;
      }
    }
    tbl = Arrays.copyOf(tbl, k);

    long[][] dp = new long[n - 2][k];
    for (int i = 0; i < k; i++) {
      if (check(p[0], i)) {
        dp[0][i] = 1;
      }
    }

    int[][] to = new int[k][k];
    int[] pt = new int[k];
    for (int s = 0; s < k; s++) {
      for (int t = 0; t < k; t++) {
        int xs = (tbl[s][0] >> 4) & 3;
        int xt = (tbl[t][0] >> 0) & 3;
        int ys = (tbl[s][0] >> 7) & 3;
        int yt = (tbl[t][0] >> 3) & 3;

        if (xs != xt || ys != yt) {
          continue;
        }

        to[s][pt[s]++] = t;
      }
      to[s] = Arrays.copyOf(to[s], pt[s]);
    }


    for (int i = 1; i < n - 2; i++) {
      for (int s = 0; s < k; s++) {
        for (int t : to[s]) {
          if (!check(p[i], t)) {
            continue;
          }
          dp[i][t] += dp[i - 1][s];
          dp[i][t] %= mod;
        }
      }
    }

    System.out.println(Arrays.stream(dp[n - 3]).sum() % mod *

        pow(2, cnt, mod) % mod);
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

  private static boolean check(int[] p, int i) {
    return (p[0] & tbl[i][0]) == p[0] && (p[1] & tbl[i][1]) == p[1];
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
