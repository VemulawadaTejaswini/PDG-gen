
import java.util.Arrays;

public class Main {
  private static void solve() {
    int k = ni();
    int n = ni();

    int[] ret = new int[n];
    if (k % 2 == 0) {
      Arrays.fill(ret, k);
      ret[0] = k / 2;
    } else {
      Arrays.fill(ret, (k + 1) / 2);
      int last = n / 2;
      
      int[] a = new int[100];
      a[0] = 1;
      for (int i = 1;; i ++) {
        a[i] = a[i - 1] * k + 1;
        if (a[i] > 500000) {
          a = Arrays.copyOf(a, i);
          break;
        }
      }
      
      for (int i = a.length - 1, j = n - i - 1; i >= 0; i --, j ++) {
        int x = last / a[i];
        if (x == 0) continue;
        last -= x * a[i];
        ret[j] -= x;
      }
    }
    

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      sb.append(ret[i] + " ");
    }
    System.out.println(sb.substring(0, sb.length() - 1));
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
