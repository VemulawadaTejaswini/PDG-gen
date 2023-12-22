
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
  private static void solve() {
    int n = ni();
    int m = ni();
    int q = ni();

    DJSet ds = new DJSet(n);
    int[][] query = ntable(q, 3);
    Arrays.sort(query, (o1, o2) -> o2[0] - o1[0]);


    boolean[] used = new boolean[n];
    for (int[] v : query) {
      if (v[2] == 1) {
        ds.union(v[0], v[1]);
      } else {
        if (ds.equiv(v[0], v[1])) {
          System.out.println("No");
          return;
        }
      }
      used[v[0]] = true;
      used[v[1]] = true;
    }
    Map<Integer, Long> map = new HashMap<>();
    int last = 0;

    int maxArg = -1;
    long maxSize = 0;
    for (int i = 0; i < n; i++) {
      if (used[i]) {
        int r = ds.root(i);
        map.putIfAbsent(r, 0L);
        map.put(r, map.get(r) + 1);
        if (maxSize < map.get(r)) {
          maxArg = r;
          maxSize = map.get(r);
        }
      } else {
        last++;
      }
    }

    for (int v : map.keySet()) {
      if (map.get(v) == 2) {
        last--;
        map.put(v, map.get(v) + 1);

        if (maxSize < map.get(v)) {
          maxArg = v;
          maxSize = map.get(v);
        }
      }
    }

    if (last < 0) {
      System.out.println("No");
      return;
    }


    map.put(maxArg, map.get(maxArg) + last);

    long min = map.size() - 1;
    long max = map.size() - 1;
    for (long v : map.values()) {
      if (v == 1)
        continue;

      min += v;
      max += v * (v - 1) / 2;
    }

    if (min <= m && m <= max) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }


  }

  static class DJSet {
    public int[] upper;

    public DJSet(int n) {
      upper = new int[n];
      Arrays.fill(upper, -1);
    }

    public int root(int x) {
      return upper[x] < 0 ? x : (upper[x] = root(upper[x]));
    }

    public boolean equiv(int x, int y) {
      return root(x) == root(y);
    }

    public boolean union(int x, int y) {
      x = root(x);
      y = root(y);
      if (x != y) {
        if (upper[y] < upper[x]) {
          int d = x;
          x = y;
          y = d;
        }
        upper[x] += upper[y];
        upper[y] = x;
      }
      return x == y;
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
