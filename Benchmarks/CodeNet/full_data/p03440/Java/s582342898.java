
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

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
    int m = ni();
    long[] a = nal(n);


    UnionFind uf = new UnionFind(n);
    for (int i = 0; i < m; i++) {
      uf.union(ni(), ni());
    }
    int[] rootMap = new int[n];
    int[] size = new int[n];
    Arrays.fill(rootMap, -1);
    int rootSize = 0;
    List<List<Long>> lists = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      int root = uf.find(i);
      if (root == i) {
        rootMap[root] = rootSize++;
        lists.add(new ArrayList<Long>());
      }
      size[root]++;
    }
    
    if (rootSize == 1) {
      System.out.println(0);
      return;
    }

    for (int i = 0; i < n; i++) {
      int root = uf.find(i);
      int rootIdx = rootMap[root];
      lists.get(rootIdx).add(a[i]);
    }

    for (List<Long> list : lists) {
      Collections.sort(list);
    }

    PriorityQueue<PriorityQueue<Long>> q =
        new PriorityQueue<>((o1, o2) -> Long.compare(o1.peek(), o2.peek()));
    
    List<Long> one = new ArrayList<>();
    for (List<Long> list : lists) {
      if (list.size() > 1) {
        q.add(new PriorityQueue<Long>(list));
      } else {
        one.add(list.get(0));
      }
    }
    
    long ret = 0;
    while (q.size() >= 2) {
      PriorityQueue<Long> o1 = q.poll();
      PriorityQueue<Long> o2 = q.poll();
      
      ret += o1.poll() + o2.poll();
      
      if (o1.size() > o2.size()) {
        PriorityQueue<Long> tmp = o1;
        o1 = o2;
        o2 = tmp;
      }

      for (Long v : o1) {
        o2.add(v);
      }
      
      if (o2.size() == 0) {
        if (q.size() > 0) {
          System.out.println("Impossible");
          return;
        } else {
          break;
        }
      } else if (o2.size() == 1) {
        one.add(o2.peek());
      } else {
        q.add(o2);
      }
    }
    if (q.size() == 0) {
      if (one.size() == 2) {
        System.out.println(ret + one.get(0) + one.get(1));
      } else if (one.size() == 0) {
        System.out.println(ret);
      } else {
        System.out.println("Impossible");
      }
    } else {
      for (Long v : one) {
        if (q.peek().size() == 0) {
          System.out.println("Impossible");
          return;
        }
        ret += q.peek().poll() + v;
      }
      System.out.println(ret);
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
