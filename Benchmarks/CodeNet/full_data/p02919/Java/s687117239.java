
import java.util.BitSet;


public class Main {

  private static void solve() {
    int n = ni();
    int[] p = na(n);
    int[] inv = new int[n];
    for (int i = 0; i < n; i++) {
      p[i]--;
      inv[p[i]] = i;
    }

    int[][] left = new int[n][2];
    int[][] right = new int[n][2];

    BitSet bs = new BitSet();
    for (int i = n - 1; i >= 0; i--) {
      int pos = inv[i];
      left[i][0] = pos == 0 ? -1 : bs.previousSetBit(pos - 1);
      left[i][1] = left[i][0] <= 0 ? -1 : bs.previousSetBit(left[i][0] - 1);
      right[i][0] = bs.nextSetBit(pos + 1);
      right[i][1] = right[i][0] < 0 ? -1 : bs.nextSetBit(right[i][0] + 1);

      if (right[i][0] < 0)
        right[i][0] = n;
      if (right[i][1] < 0)
        right[i][1] = n;

      bs.set(pos);
    }


    long ret = 0;

    for (int i = 0; i < n; i++) {
      {
        int r = right[i][1] - right[i][0];
        int l = inv[i] - left[i][0];
        ret += (long) (i + 1) * r * l;
      }
      {
        int r = right[i][0] - inv[i];
        int l = left[i][0] - left[i][1];
        ret += (long) (i + 1) * r * l;
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

