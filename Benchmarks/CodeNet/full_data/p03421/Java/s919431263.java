
public class Main {
  private static void solve() {
    int n = ni();
    int a = ni();
    int b = ni();

    if (a == 1) {
      if (b != n) {
        System.out.println(-1);
      } else {
        for (int i = n; i >= 1; i --) {
          System.out.print(i);
          if(i > 1) System.out.print(" ");
        }
        System.out.println();
      }
      return;
    }
    if (b == 1) {
      if (a != n) {
        System.out.println(-1);
      } else {
        for (int i = 1; i <= n; i ++) {
          System.out.print(i);
          if(i > 1) System.out.print(" ");
        }
        System.out.println();
      }
      return;
    }
    boolean flg = false;
    if ((n + b - 1) / b != a) {
      if ((n + a - 1) / a == b) {
        flg = true;
      } else {
        System.out.println("-1");
        return;
      }
    }

    StringBuilder sb = new StringBuilder();
    if (flg) {
      for (int j = b - 1; j >= 0; j--) {
        for (int i = 0; i < a; i++) {
          int x = i + j * a + 1;
          if (x <= n) {
            sb.append(x);
            sb.append(" ");
          }
        }
      }
    } else {
      for (int i = 0; i < a; i++) {
        for (int j = b - 1; j >= 0; j--) {
          int x = i * b + j + 1;
          if (x <= n) {
            sb.append(x);
            sb.append(" ");
          }
        }
      }
    }
    sb = sb.deleteCharAt(sb.length() - 1);
    System.out.println(sb);
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
