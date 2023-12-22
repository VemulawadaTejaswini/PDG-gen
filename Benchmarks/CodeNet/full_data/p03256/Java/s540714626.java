
import java.util.HashSet;
import java.util.Set;




public class Main {


  static long inf = 100000000000L;

  private static void solve() {
    int n = ni();
    int m = ni();
    char[] s = ns();
    int[] from = new int[m];
    int[] to = new int[m];

    Set<int[]> edgeH = new HashSet<>();
    Set<Integer> edgeA = new HashSet<>();
    Set<Integer> edgeB = new HashSet<>();
    for (int i = 0; i < m; i++) {
      from[i] = ni() - 1;
      to[i] = ni() - 1;


      if (s[from[i]] == s[to[i]]) {
        if (s[from[i]] == 'A') {
          edgeA.add(from[i]);
          edgeA.add(to[i]);
        } else {
          edgeB.add(from[i]);
          edgeB.add(to[i]);
        }
      } else {
        if (s[from[i]] == 'B') {
          int tmp = from[i];
          from[i] = to[i];
          to[i] = tmp;
        }
        edgeH.add(new int[] {from[i], to[i]});
      }
    }
    int[][] g = packU(n, from, to);

    for (int[] e : edgeH) {
      int va = e[0];
      int vb = e[1];
      
      Set<Integer> setA = new HashSet<>();
      for (int v : g[va]) {
        if (s[v] == 'A') {
          setA.add(v);
        }
      }
      for (int v : g[vb]) {
        if (s[v] == 'B') {
          for (int u : g[v]) {
            if (setA.contains(u)) {
              System.out.println("Yes");
              return;
            }
          }
        }
      }
    }
    System.out.println("No");


  }

  static int[][] packU(int n, int[] from, int[] to) {
    int[][] g = new int[n][];
    int[] p = new int[n];
    for (int f : from)
        p[f]++;
    for (int t : to)
        p[t]++;
    for (int i = 0; i < n; i++)
        g[i] = new int[p[i]];
    for (int i = 0; i < from.length; i++) {
        g[from[i]][--p[from[i]]] = to[i];
        g[to[i]][--p[to[i]]] = from[i];
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
