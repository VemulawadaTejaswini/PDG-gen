
import java.util.Arrays;

public class Main {

  private static void solve() {
    int n = ni();
    char[] s = ns();
    int[][] q = new int[n][3];
    int[] p = new int[3];

    for (int i = 0; i < n * 3; i++) {
      char c = s[i];
      if (c == 'R') {
        s[i] = 0;
      } else if (c == 'G') {
        s[i] = 1;
      } else {
        s[i] = 2;
      }
      q[p[s[i]]++][s[i]] = i;
    }

    int[] c = new int[n * 3];
    for (int i = 0; i < n; i++) {
      Arrays.sort(q[i]);
      for (int j = 0; j < 3; j++) {
        c[q[i][j]] = j;
      }
    }

    long ret = 1;
    int mod = 998244353;
    long[] cnt = new long[3];

    for (int i = 0; i < n * 3; i++) {
      if (c[i] == 0) {
        cnt[0]++;
      } else if (c[i] == 2) {
        ret *= cnt[1];
        cnt[1]--;
        cnt[2]++;
      } else {
        ret *= cnt[0];
        cnt[1]++;
        cnt[0]--;
      }
      ret %= mod;
    }

    for (int i = 0; i < n; i++) {
      ret *= i + 1;
      ret %= mod;
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

