
import java.util.TreeSet;

public class Main {
  private static void solve() {
    int n = ni();
    long[] a = nal(n);
    long[] b = nal(n);

    int ret = 0;
    TreeSet<Integer> q = new TreeSet<>((o1, o2) -> {
      long l1 = b[(o1 - 1 + n) % n];
      long r1 = b[(o1 + 1) % n];
      long l2 = b[(o2 - 1 + n) % n];
      long r2 = b[(o2 + 1) % n];

      return Long.signum((b[o2] - (l2 + r2)) - (b[o1] - (l1 + r1)));
    });

    int same = 0;
    for (int i = 0; i < n; i++) {
      if (a[i] == b[i]) {
        same++;
      } else {
        q.add(i);
      }
    }

    while (same < n) {
      int i = q.pollFirst();
      int l = (i - 1 + n) % n;
      int r = (i + 1) % n;

      if (b[i] - b[l] - b[r] < a[i]) {
        System.out.println(-1);
        return;
      }
      q.remove(l);
      q.remove(r);
      q.remove(i);
      b[i] -= b[l] + b[r];
      q.add(l);
      q.add(r);
      ret++;
      if (b[i] == a[i]) {
        same++;
      } else {
        q.add(i);
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
