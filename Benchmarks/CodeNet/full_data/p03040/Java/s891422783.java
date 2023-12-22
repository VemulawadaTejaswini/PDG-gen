
import java.util.PriorityQueue;

public class Main {


  private static void solve() {
    int q = ni();
    
    
    PriorityQueue<Long> ql = new PriorityQueue<>();
    PriorityQueue<Long> qr = new PriorityQueue<>();
    
    long lsum = 0;
    long rsum = 0;

    long bsum = 0;
    for (int i = 0; i < q; i ++) {
      int t = ni();
      if (t == 1) {
        long a = nl();
        bsum += nl();
        
        if (ql.size() == 0 || ql.peek() < a) {
          ql.add(a);
          lsum += a;
        } else {
          qr.add(a);
          rsum += a;
        }
        
        while (ql.size() < qr.size()) {
          long x = qr.poll();
          ql.add(x);
          rsum -= x;
          lsum += x;
        }

        while (ql.size() > qr.size()) {
          long x = ql.poll();
          qr.add(x);
          lsum -= x;
          rsum += x;
        }
      } else {
        
        if (qr.size() > ql.size()) {
          long x = qr.peek();
          long n = ql.size();
          long ret = (rsum - x - x * n) + (x * n - lsum) + bsum;
          out.println(x + " " + ret);
        } else {
          long x = ql.peek();
          long n = ql.size();
          long ret = (rsum - x * n) + (x * (n - 1) - (lsum - x)) + bsum;
          out.println(x + " " + ret);
        }
      }
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
