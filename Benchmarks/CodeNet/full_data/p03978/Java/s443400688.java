
public class Main {

  private static void solve() {
    int n = ni();
    
    char[][] now = new char[2][0];

    boolean flg = false;
    while (true) {
      boolean updated = false;
      for (int i = 0; i < 4; i ++) {
        char[][] next = flg ? catl(now, i) : catr(now, i);
        if (query(next)) {
          if (next[0].length == n) {
            return;
          }
          updated = true;
          now = next;
          break;
        }
      }
      if (!updated) flg = true;
    }
  }

  private static char[][] catl(char[][] src, int v) {
    int n = src[0].length;
    char[][] ret = new char[2][n + 1];
    for (int i = 0; i < 2; i ++) {
      System.arraycopy(src[i], 0, ret[i], 1, n);
    }
    char[] now = dec(v);
    ret[0][0] = now[0];
    ret[1][0] = now[1];
    return ret;
  }

  private static char[][] catr(char[][] src, int v) {
    int n = src[0].length;
    char[][] ret = new char[2][n + 1];
    for (int i = 0; i < 2; i ++) {
      System.arraycopy(src[i], 0, ret[i], 0, n);
    }
    char[] now = dec(v);
    ret[0][n] = now[0];
    ret[1][n] = now[1];
    return ret;
  }

  private static char[] dec(int v) {
    char[] ret = new char[2];
    for (int i = 0; i < 2; i ++) {
      ret[i] = ((v >> i) & 1) != 1 ? '#' : '.';
    }
    return ret;
  }

  private static boolean query(char[][] q) {
    for (char[] s : q) {
      out.println(s);
    }
    out.flush();
    
    String ret = next();
    return ret.equals("T") || ret.equals("end");
  }

  public static void main(String[] args) {
    new Thread(null, new Runnable() {
      @Override
      public void run() {
        long start = System.currentTimeMillis();
        String debug = System.getProperty("debug");
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
      a[i] = ni();
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
