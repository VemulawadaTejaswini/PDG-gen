
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

  private static void solve() {
    int n = ni();
    int[] a = na(n);

    long[] neg = new long[n];
    Deque<long[]> q = new ArrayDeque<>();
    for (int i = 0; i < n; i++) {
      long v = a[i];
      if (q.size() == 0 || q.peekLast()[0] >= v) {
        q.addLast(new long[] {v, 1});
      } else {
        long totalCnt = 1;
        while (q.size() > 0 && q.peekLast()[0] < v) {
          long min = q.peekLast()[0];
          long cnt = q.peekLast()[1];
          while (min < v) {
            min *= 4;
            neg[i] += cnt * 2;
          }
          totalCnt += cnt;
          q.pollLast();
        }
        q.addLast(new long[] {v, totalCnt});
      }
      neg[i]++;
      if (i > 0) {
        neg[i] += neg[i - 1];
      }
    }

    long[] posi = new long[n];
    q.clear();
    for (int i = n - 1; i >= 0; i--) {
      int v = a[i];
      if (v < 0) {
        posi[i]++;
        v *= -2;
      }
      if (q.size() == 0 || q.peekLast()[0] >= v) {
        q.addLast(new long[] {v, 1});
      } else {
        long totalCnt = 1;
        while (q.size() > 0 && q.peekLast()[0] < v) {
          long min = q.peekLast()[0];
          long cnt = q.peekLast()[1];
          while (min < v) {
            min *= 4;
            posi[i] += cnt * 2;
          }
          totalCnt += cnt;
          q.poll();
        }
        q.add(new long[] {v, totalCnt});
      }
      if (i < n - 1) {
        posi[i] += posi[i + 1];
      }
    }

    long ret = Math.min(neg[n - 1], posi[0]);
    for (int i = 0; i < n - 1; i++) {
      ret = Math.min(ret, neg[i] + posi[i + 1]);
    }
    // System.out.println(Arrays.toString(neg));
    // System.out.println(Arrays.toString(posi));
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

