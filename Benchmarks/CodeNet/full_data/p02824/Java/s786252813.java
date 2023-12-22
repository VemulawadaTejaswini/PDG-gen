
import java.util.Arrays;

public class Main {

  private static void solve() {
    int n = ni();
    int m = ni();
    int v = ni();
    int p = ni();
    int[] a = na(n);

    Arrays.sort(a);
    for (int i = 0, j = n - 1; i < j; i++, j--) {
      int tmp = a[i];
      a[i] = a[j];
      a[j] = tmp;
    }


    int ok = p - 1;
    int ng = n;
    int[][] b = new int[n][2];
    while (Math.abs(ok - ng) > 1) {
      int k = (ok + ng) / 2;

      long vote = (long) m * v;

      for (int i = 0; i < n; i++) {
        b[i][0] = i == k ? -1 : i;
        b[i][1] = a[i];
      }

      for (int i = 0; i < p - 1; i++) {
        b[i][1] += m;
        vote -= m;
      }
      vote -= m;
      b[k][1] += m;
      int x = b[k][1];

      for (int i = 0; i < n; i++) {
        if (i == k)
          continue;

        int d = Math.min(m, Math.max(0, x - a[i]));
        vote -= d;
        b[i][1] += d;
      }

      Arrays.sort(b, (o1, o2) -> {
        if (o1[1] == o2[1]) {
          return o1[0] - o2[0];
        } else {
          return o2[1] - o1[1];
        }
      });

      boolean suc = false;
      for (int i = 0; i < p; i++) {
        if (b[i][0] < 0) {
          suc = true;
          break;
        }
      }

      if (suc && vote <= 0) {
        ok = k;
      } else {
        ng = k;
      }
    }

    System.out.println(ok + 1);
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

