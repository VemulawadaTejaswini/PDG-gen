
public class Main {

  private static void solve() {
    int n = ni();
    long[] a = nal(n);

    long x = 0;
    long y = 0;

    long emask = 0;

    for (int k = 60; k >= 0; k--) {
      long mask = 1L << k;
      int cnt = 0;
      for (long v : a) {
        if ((mask & v) != 0) {
          cnt++;
        }
      }
      if (cnt > 0 && cnt % 2 == 0) {
        emask |= 1L << k;
      } else if (cnt % 2 == 1) {
        x |= mask;
      }
    }


    for (int i = 0; i < n; i++) {
      a[i] &= emask;
    }
    boolean[] used = new boolean[n];
    for (int k = 60; k >= 0; k--) {
      long mask = 1L << k;
      if ((mask & emask) == 0)
        continue;

      for (int i = 0; i < n; i++) {
        if (!used[i] && (a[i] & mask) != 0) {
          used[i] = true;
          long e = a[i];
          for (int j = 0; j < n; j++) {
            if (i != j && (a[j] & mask) != 0) {
              a[j] ^= e;
            }
          }
          break;
        }
      }
    }
    for (long v : a) {
      x ^= v;
      y ^= v;
    }

    System.out.println(x + y);
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

