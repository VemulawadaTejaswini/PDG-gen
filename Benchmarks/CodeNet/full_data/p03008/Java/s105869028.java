
import java.util.Arrays;

public class Main {


  private static void solve() {
    int n = ni();
    int[] a = na(3);
    int[] b = na(3);

    long ret1 = f(n, a, b);
    long ret2 = f(ret1, b, a);

    System.out.println(ret2);   
  }
  
  private static long f(long n, int[] from, int[] to) {
    int[][] rate = new int[3][];
    for (int i = 0; i < 3; i ++) {
      rate[i] = new int[] {from[i], to[i]};
    }
    Arrays.sort(rate, (o1, o2) -> o1[0] * o2[1] - o1[1] * o2[0]);
    
    long k = 0;
    if (rate[0][0] < rate[0][1]) {
      k = Math.max(n - 5000, 0) / rate[0][0] * rate[0][0];
    } else {
      return n;
    }
    
    long m = n - k;
    long max = m;
    for (long g = 0, gd = 0; gd <= m; g ++, gd += rate[0][0]) {
      for (long s = 0, sd = 0; sd + gd <= m; s ++, sd += rate[1][0]) {
        long d = rate[2][0] > rate[2][1] ? 0 : (m - gd - sd) / rate[2][0];
        long dd = d * rate[2][0];
        
        long last = m - gd - sd - dd;
        
        long now = last + g * rate[0][1] + s * rate[1][1] + d * rate[2][1];
        max = Math.max(now, max);
      }
    }

    return max + k / rate[0][0] * rate[0][1];
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
