
import java.util.Arrays;

public class Main {


  private static void solve() {
    int n = ni();
    int[][] p = new int[n * 2][3];
    for (int i = 0; i < n; i++) {
      p[i * 2 + 0][0] = i;
      p[i * 2 + 0][1] = ni();
      p[i * 2 + 0][2] = 0;

      p[i * 2 + 1][0] = i;
      p[i * 2 + 1][1] = ni();
      p[i * 2 + 1][2] = 1;
    }

    Arrays.sort(p, (o1, o2) -> o1[1] - o2[1]);
    int[] cnt = new int[3];
    boolean[] used = new boolean[n];

    long ret = 0;
    for (int i = 0; i < n; i++) {
      cnt[p[i][2]]++;
      ret += p[i][1];

      if (used[p[i][0]]) {
        cnt[2]++;
      } else {
        used[p[i][0]] = true;
      }
    }

    if (cnt[0] != n && cnt[1] != n && cnt[2] == 0) {
      ret += p[p[n - 1][0] != p[n][0] ? n : (n + 1)][1] - p[n - 1][1];
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
