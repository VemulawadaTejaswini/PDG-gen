
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {


  private static void solve() {
    int n = ni();
    int m = ni();
    int[] from = new int[m];
    int[] to = new int[m];
    int[] w = new int[m];
    for (int i = 0; i < m; i++) {
      from[i] = ni() - 1;
      to[i] = ni() - 1;
      w[i] = 1;
    }
    int s = ni() - 1;
    int t = ni() - 1;
    int[][][] g = packWD(n, from, to, w);
    int[][] d = dijk(g, s);

    if (d[t][0] == Integer.MAX_VALUE) {
      System.out.println(-1);
    } else {
      System.out.println(d[t][0] / 3);
    }
  }

  public static int[][] dijk(int[][][] g, int from) {
    int n = g.length;
    final int[][] td = new int[n][3];
    for (int[] v : td)
      Arrays.fill(v, Integer.MAX_VALUE);
    TreeSet<int[]> q = new TreeSet<>(new Comparator<int[]>() {
      public int compare(int[] a, int[] b) {
        if (td[a[0]][a[1]] - td[b[0]][b[1]] != 0)
          return td[a[0]][a[1]] - td[b[0]][b[1]];
        return a[0] == b[0] ? a[1] - b[1] : a[0] - b[0];
      }
    });
    q.add(new int[] {from, 0});
    td[from][0] = 0;

    while (q.size() > 0) {
      int[] v = q.pollFirst();
      int cur = v[0];
      int mod = v[1];

      for (int i = 0; i < g[cur].length; i++) {
        int next = g[cur][i][0];
        int nd = td[cur][mod] + g[cur][i][1];
        int nm = (mod + 1) % 3;
        if (nd < td[next][nm]) {
          int[] u = new int[] {next, nm};
          q.remove(u);
          td[next][nm] = nd;
          q.add(u);
        }
      }
    }

    return td;
  }

  public static int[][][] packWD(int n, int[] from, int[] to, int[] w) {
    int[][][] g = new int[n][][];
    int[] p = new int[n];
    for (int f : from)
      p[f]++;
    for (int i = 0; i < n; i++)
      g[i] = new int[p[i]][2];
    for (int i = 0; i < from.length; i++) {
      --p[from[i]];
      g[from[i]][p[from[i]]][0] = to[i];
      g[from[i]][p[from[i]]][1] = w[i];
    }
    return g;
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
