
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
  private static void solve() {
    int R = ni();
    int C = ni();
    int N = ni();
    int[][] p = ntable(N, 3);
    Map<Integer, List<int[]>> map = new TreeMap<>();
    int[] cmin = new int[C];
    Arrays.fill(cmin, Integer.MAX_VALUE);

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
      }
    }
    
    int[] memo = new int[C];
    int[] minIdx = new int[C];
    Arrays.fill(memo, Integer.MIN_VALUE);
    for (int i = 0; i < C; i ++) {
      if (memo[i] == Integer.MIN_VALUE) {
        if (!dfs(i, 0, memo, minIdx, g)) {
          System.out.println("No");
          return;
        }
        if (memo[minIdx[i]] + cmin[i] < 0) {
          System.out.println("No");
          return;
        }
      }
    }
    
    System.out.println("Yes");
  }
  
  private static boolean dfs(int now, int x, int[] memo, int[] minIdx, List<List<int[]>> g) {
    if (memo[now] > Integer.MIN_VALUE) {
      return memo[now] == x;
    }
    memo[now] = x;
    minIdx[now] = now;
    
    for (int[] v : g.get(now)) {
      boolean ret = dfs(v[0], x + v[1], memo, minIdx, g);
      if (!ret) return false;
      
      if (memo[minIdx[v[0]]] < memo[minIdx[now]]) {
        minIdx[now] = minIdx[v[0]];
      }
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


