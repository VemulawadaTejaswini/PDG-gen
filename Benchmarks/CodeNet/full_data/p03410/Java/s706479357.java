
import java.util.Arrays;

public class Main {
  private static void solve() {
    int n = ni();
    int[] a = na(n);
    int[] b = na(n);

    int ret = 0;
    for (int k = 0; k < 30; k ++) {
      int[] na = Arrays.copyOf(a, n);
      int[] nb = Arrays.copyOf(b, n);
      
      for (int i = 0; i < n; i ++) {
        na[i] &= (1 << (k + 1)) - 1;
        nb[i] &= (1 << (k + 1)) - 1;
      }
      Arrays.sort(na);
      Arrays.sort(nb);
      
      int now = 0;
      for (int i = 0; i < n; i ++) {

        int v1 = lowerBound(nb, (1<<k) - na[i]);
        int v2 = lowerBound(nb, (1<<(k + 1)) - na[i]);
        now += v2 - v1;
        if (k >= 1) {
          int v3 = lowerBound(nb, (3<<k) - na[i]);
          now += n - v3;
        }
        now %= 2;
      }
      if (now % 2 == 1) {
        ret |= 1 << k;
      }
    }
    System.out.println(ret);
  }

  public static int lowerBound(int[] a, int v)
  {
      int low = -1, high = a.length;
      while(high-low > 1){
          int h = high+low>>>1;
          if(a[h] >= v){
              high = h;
          }else{
              low = h;
          }
      }
      return high;
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
