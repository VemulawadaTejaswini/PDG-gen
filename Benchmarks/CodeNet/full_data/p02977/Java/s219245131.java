
import java.util.ArrayList;
import java.util.List;

public class Main {

  private static void solve() {
    int n = ni();
    if (n == 1) {
      out.println("No");
      return;
    }
    List<int[]> ret = new ArrayList<>();
    int d = n % 2 == 0 ? 1 : 0;
    for (int i = 2; i <= n - d; i++) {
      ret.add(new int[] {1, i});
    }

    for (int i = 2; i <= n - d; i++) {
      ret.add(new int[] {i, i + n + (i % 2 == 0 ? 1 : -1)});
    }

    if (d == 1) {
      boolean flg = false;
      for (int a = 2; a <= n - 1; a++) {
        int b = n ^ 1 ^ a;

        if (a < b && b <= n - 1) {
          ret.add(new int[] {a, n});
          ret.add(new int[] {b, n + n});
          flg = true;
          break;
        }
      }
      if (!flg) {
        out.println("No");
        return;
      }
    }

    ret.add(new int[] {n + 3, n + 1});

    out.println("Yes");
    for (int[] e : ret) {
      out.println(e[0] + " " + e[1]);
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

