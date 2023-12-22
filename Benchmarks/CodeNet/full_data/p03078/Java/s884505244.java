
import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Main {


  private static void solve() {
    int x = ni();
    int y = ni();
    int z = ni();
    int k = ni();
    long[] a = nal(x);
    long[] b = nal(y);
    long[] c = nal(z);
    
    Arrays.sort(a);
    Arrays.sort(b);
    Arrays.sort(c);
    
    PriorityQueue<int[]> q = new PriorityQueue<>((o1, o2)-> {
      long s = a[o1[0]] + b[o1[1]] + c[o1[2]];
      long t = a[o2[0]] + b[o2[1]] + c[o2[2]];
      if (s == t) {
        for (int i = 0; i < 3; i ++) {
          if (o1[i] != o2[i]) return o1[i] - o2[i];
        }
        return 0;
      } else {
        return Long.compare(t, s);
      }
    });
    Set<Long> used = new HashSet<>();
    int[] start = new int[] {x-1,y-1,z-1};
    q.add(start);
    used.add(h(start));
    
    while (k > 0 && q.size() > 0) {
      int[] v = q.poll();
      
      System.out.println(a[v[0]] + b[v[1]] + c[v[2]]);
      for (int i = 0; i < 3; i ++) {
        if (v[i] > 0) {
          int[] na = Arrays.copyOf(v, 3);
          na[i] --;
          if (used.contains(h(na))) continue;
          
          q.add(na);
          used.add(h(na));
        }
      }
      k --;
    }
  }

  private static long h(int[] a) {
    long inf = 1000000;
    long ret = a[0];
    ret += a[1] * inf;
    ret += a[2] * inf * inf;
    return ret;
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
