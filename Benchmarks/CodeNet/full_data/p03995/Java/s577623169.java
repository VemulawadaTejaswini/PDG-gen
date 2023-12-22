
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


class UnionFind {
    private int[] table;
    private int[] rank;
    
    public UnionFind(int size) {
        this.table = new int[size];
        this.rank = new int[size];
        for (int i = 0; i < size; i ++) {
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
            rank[root1] ++;
        }
    }
}


public class Main {
  private static void solve() {
    int R = ni();
    int C = ni();
    int N = ni();
    int[][] p = ntable(N, 3);
    Map<Integer, List<int[]>> map = new TreeMap<>();
    long[] cmin = new long[C];
    Arrays.fill(cmin, Long.MAX_VALUE);
    UnionFind uf = new UnionFind(C);

    for (int[] v : p) {
      v[0] --;
      v[1] --;
      if (!map.containsKey(v[0])) {
        map.put(v[0], new ArrayList<>());
      }
      map.get(v[0]).add(v);
      cmin[v[1]] = Math.min(cmin[v[1]], v[2]);
    }
    
    List<List<int[]>> g = new ArrayList<>();
    for (int i = 0; i < C; i ++) {
      g.add(new ArrayList<>());
    }

    for (List<int[]> list : map.values()) {
      Collections.sort(list, (o1, o2) -> o1[1] - o2[1]);
      int[][] array = list.stream().toArray(size -> new int[size][]);
      int m = array.length;
      
      for (int i = 0; i < m - 1 ; i ++) {
        int from = array[i][1];
        int to = array[i + 1][1];
        int d = array[i + 1][2] - array[i][2];
        g.get(from).add(new int[] {to, d});
        g.get(to).add(new int[] {from, -d});
        uf.union(from, to);
      }
    }
    
    long[] memo = new long[C];
    long[] min = new long[C];
    Arrays.fill(memo, Long.MIN_VALUE);
    Arrays.fill(min, Long.MAX_VALUE);
    for (int i = 0; i < C; i ++) {
      if (cmin[i] < Long.MAX_VALUE) {
        if (memo[i] == Long.MIN_VALUE) {
          if (!dfs(i, 0, memo, min, uf, g)) {
            System.out.println("No");
            return;
          }
        }
        if (min[uf.find(i)] - memo[i] + cmin[i] < 0) {
          System.out.println("No");
          return;
        }
      }
    }
    
    System.out.println("Yes");
  }
  
  private static boolean dfs(int now, long x, long[] memo, long[] min, UnionFind uf, List<List<int[]>> g) {
    if (memo[now] != Long.MIN_VALUE) {
      return memo[now] == x;
    }
    memo[now] = x;
    int root = uf.find(now);
    min[root] = Math.min(min[root], x);
    
    for (int[] v : g.get(now)) {
      boolean ret = dfs(v[0], x + v[1], memo, min, uf, g);
      if (!ret) return false;
    }
    return true;
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


