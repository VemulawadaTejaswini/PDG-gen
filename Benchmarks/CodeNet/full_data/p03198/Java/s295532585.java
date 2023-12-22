
import java.util.ArrayDeque;

public class Main {
  private static void solve() {
    int n = ni();
    int[] a = na(n);
    System.out.println(solve(a));
  }

  private static int solve(int[] a) {
    int n = a.length;
    int[] pcnt = f(a);
    rev(a);
    int[] ncnt = f(a);
    rev(ncnt);
    rev(a);
    
    
    int ret = Integer.MAX_VALUE;

    for (int i = 0; i <= n; i ++) {
      int now = 0;
      if (i < n) {
        now += pcnt[i];
      }
      if (i > 0) {
        now += ncnt[i - 1] + i;
      }
      
    
      ret = Math.min(ret, now);
    }
    return ret;
  }

  private static void rev(int[] a) {
    int n = a.length;
    for (int i = 0, j = n - 1; i < j; i ++, j --) {
      int tmp = a[i];
      a[i] = a[j];
      a[j] = tmp;
    }
  }

  private static int[] f(int[] a) {
    int n = a.length;
    int[] pcnt = new int[n];
    int[] inf = new int[] {n - 1, Integer.MAX_VALUE};
    ArrayDeque<int[]> q = new ArrayDeque<>();
    for (int i = n - 2; i >= 0; i --) {
      long y = a[i + 1];
      long x = a[i];
      pcnt[i] = pcnt[i + 1];
      if (x > y) {
        while (x > y) {
          int[] e = q.size() > 0 ? q.peek() : inf;
          y *= 4;
          pcnt[i] += 2 * (e[0] - (i - 1) - 1);
          e[1] --;
          if (e[1] == 0) {
            q.poll();
          }
        }
      } else {
        int af = 0;
        while (x * 4 <= y) {
          af ++;
          x *= 4;
        }
        if (af > 0) {
          q.add(new int[] {i, af});
        }
      }
    }
    return pcnt;
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
