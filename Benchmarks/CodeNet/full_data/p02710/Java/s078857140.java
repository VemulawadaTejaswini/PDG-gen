
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

  private static void solve() {
    int n = ni();
    int[] c = na(n);
    for (int i = 0; i < n; i++) {
      c[i]--;
    }
    int[] from = new int[n - 1];
    int[] to = new int[n - 1];
    for (int i = 0; i < n - 1; i++) {
      from[i] = ni() - 1;
      to[i] = ni() - 1;
    }
    int[][] g = packU(n, from, to);
    List<Integer> et = new ArrayList<>();

    dfs(0, -1, g, et);

    int m = et.size();
    int[] s = new int[m + 1];
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < m; i++) {
      s[i + 1] = s[i] + (!set.contains(et.get(i)) && et.get(i) > 0 ? 1 : 0);
      set.add(et.get(i));
    }

    int[] last = new int[n];
    Arrays.fill(last, -1);
    long[] ans = new long[n];
    long[] cnt = new long[n];
    for (int i = 0; i < m; i++) {
      int v = et.get(i);
      v = Math.abs(v) - 1;
      int nc = c[v];

      if (last[nc] >= 0) {
        long x = s[i] - s[last[nc] + 1];
        if (x > 0) {
          ans[nc] += x * (x + 1) / 2;
        }
      } else {
        long x = s[i];
        cnt[nc] = x;
      }
      last[nc] = i;
    }

    for (int i = 0; i < n; i++) {
      if (last[i] >= 0) {
        long x = s[m] - s[last[i] + 1];
        cnt[i] += x;

        ans[i] += cnt[i] * (cnt[i] + 1) / 2;
      }
    }


    for (int i = 0; i < n; i++) {
      if (last[i] >= 0) {
        out.println((long) n * (n + 1) / 2 - ans[i]);
      } else {
        out.println(0);
      }
    }

  }

  private static void dfs(int cur, int pre, int[][] g, List<Integer> et) {
    boolean flg = false;
    for (int nex : g[cur]) {
      if (nex == pre)
        continue;

      flg = true;
      et.add(cur + 1);
      dfs(nex, cur, g, et);
      et.add(-(cur + 1));
    }

    if (!flg) {
      et.add(cur + 1);
      et.add(-(cur + 1));
    }
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

