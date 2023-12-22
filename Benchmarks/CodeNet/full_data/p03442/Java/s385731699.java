
import java.util.Arrays;

public class Main {

  private static void solve() {
    int n = ni();
    int[] b = new int[n];
    for (int i = 0; i < n - 1; i++) {
      int x = ni();
      int y = ni();
      int a = ni();
      b[x] ^= a;
      b[y] ^= a;
    }

    int bm = 15;
    int[] cnt = new int[bm + 1];
    for (int v : b) {
      cnt[v]++;
    }
    cnt[0] = 0;
    int ret = 0;
    int s = 0;
    int t = 0;
    int f = 1;
    for (int i = 1; i <= bm; i++) {
      ret += cnt[i] / 2;
      if (cnt[i] % 2 == 1) {
        s++;
        t += f * 2;
      }
      f *= 3;
    }
    int m = (int) Math.pow(3, bm);
    int[] dp = new int[m];
    Arrays.fill(dp, Integer.MIN_VALUE / 2);
    dp[t] = 0;

    for (int i = t; i >= 0; i--) {
      int x = i;
      int y = 0;
      int h = 1;
      int to = i;
      for (int j = 0; j < bm; j++) {
        int z = x % 3;
        x /= 3;
        if (z == 1) {
          y ^= (j + 1);
          to -= h;
        } else if (z == 2) {
          dp[i - h] = Math.max(dp[i - h], dp[i]);
        }
        h *= 3;
      }
      if (to < i && y == 0) {
        dp[to] = Math.max(dp[to], dp[i] + 1);
      }
    }
    System.out.println(s - dp[0] + ret);
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

