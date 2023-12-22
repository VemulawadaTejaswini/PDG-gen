
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
  private static void solve() {
    int n = ni();
    int[] a = na(n);
    
    int[] p = new int[n / 2 + (n % 2 == 1 ? 1 : 0)];
    int[] q = new int[n / 2];
    
    for (int i = 0; i < n; i ++) {
      if (i % 2 == 0) {
        p[i / 2] = a[i];
      } else {
        q[i / 2] = a[i];
      }
    }

    long max1 = 0;
    long max2 = 0;
    for (int v : p) {
      if (v > 0) max1 += v;
    }
    for (int v : q) {
      if (v > 0) max2 += v;
    }

    List<Integer> list = new ArrayList<>();
    LinkedList<Integer> l = new LinkedList<>();
    for (int v : a) {
      l.add(v);
    }

    long max = max1;
    if (max1 < max2) {
      list.add(1);
      l.remove(0);
      max = 2;
    }

    boolean flg = true;
    while (flg) {
      flg = false;
      for (int i = 1; i < l.size(); i += 2) {
        if (l.get(i) < 0) {
          list.add(i + 1);
          l.set(i, l.get(i + 1) + l.get(i - 1));
          l.remove(i - 1);
          l.remove(i);
          flg = true;
          break;
        }
      }
    }

    while (l.size() > 2) {
      list.add(2);
      l.set(1, l.get(0) + l.get(2));
      l.remove(0);
      l.remove(1);
    }
    
    if (l.size() == 2) {
      if (l.get(0) > l.get(1)) {
        l.remove(1);
        list.add(2);
      } else {
        l.remove(0);
        list.add(1);
      }
    }
    
    System.out.println(max);
    System.out.println(list.size());
    for (int v : list) {
      System.out.println(v);
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


