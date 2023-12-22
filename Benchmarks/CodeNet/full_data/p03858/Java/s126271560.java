
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

class UnionFind {
  private int[] table;
  private int[] rank;

  public UnionFind(int size) {
    this.table = new int[size];
    this.rank = new int[size];
    for (int i = 0; i < size; i++) {
      this.table[i] = i;
      this.rank[i] = 1;
    }
  }

  public boolean isSame(int node1, int node2) {
    return find(node1) == find(node2);
  }

  public int find(int node) {
    if (table[node] == node) {
      return node;
    } else {
      return table[node] = find(table[node]);
    }
  }

  public void union(int node1, int node2) {
    int root1 = find(node1);
    int root2 = find(node2);

    if (rank[root1] < rank[root2]) {
      table[root1] = root2;
    } else if (rank[root1] > rank[root2]) {
      table[root2] = root1;
    } else if (root1 != root2) {
      table[root2] = root1;
      rank[root1]++;
    }
  }
}


public class Main {

  private static void solve() {
    int n = ni();
    int a = ni() - 1;
    int b = ni() - 1;
    int[][] p = ntable(n, 2);

    SortedSet<int[]> s1 = new TreeSet<>((o1, o2) -> {
      if (o1[0] == o2[0]) {
        return o1[1] - o2[1];
      } else {
        return o1[0] - o2[0];
      }
    });

    SortedSet<int[]> s2 = new TreeSet<>((o1, o2) -> {
      if (o1[1] == o2[1]) {
        return o1[0] - o2[0];
      } else {
        return o1[1] - o2[1];
      }
    });

    for (int[] q : p) {
      int x = q[0] + q[1];
      int y = q[0] - q[1];
      q[0] = x;
      q[1] = y;
      s1.add(q);
      s2.add(q);
    }

    UnionFind uf = new UnionFind(n);
    uf.union(a, b);
    int d = Math.max(Math.abs(p[a][0] - p[b][0]), Math.abs(p[a][1] - p[b][1]));
    int[][] dir = {{d, -d, d, d + 1}, {-d, -d, -d, d + 1}, {-d, -d, d + 1, -d}, {-d, d, d + 1, d},};

    dfs(p[a], dir, s1, s2);

    System.out.println(total);
  }


  private static long total = 0;
  private static void dfs(int[] p, int[][] dir, SortedSet<int[]> s1, SortedSet<int[]> s2) {
    s1.remove(p);
    s2.remove(p);

    Set<int[]> next = new HashSet<>();
    for (int[] d : dir) {
      int[] p1 = {p[0] + d[0], p[1] + d[1]};
      int[] p2 = {p[0] + d[2], p[1] + d[3]};

      SortedSet<int[]> sub = d[0] == d[2] ? s1.subSet(p1, p2) : s2.subSet(p1, p2);
      for (int[] q : sub) {
        next.add(q);
      }
    }
    total += next.size();
    for (int[] q : next) {
      dfs(q, dir, s1, s2);
    }
  }

  public static void main(String[] args) {
    new Thread(null, new Runnable() {
      @Override
      public void run() {
        long start = System.currentTimeMillis();
        String debug = System.getProperty("debug");
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
