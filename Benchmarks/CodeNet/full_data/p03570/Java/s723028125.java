
import java.util.HashMap;
import java.util.Map;




public class Main {
  
  static int[][] count = null;
  static int[] cc;
  private static void solve() {
    char[] s = ns();
    int n = s.length;
    
    count = new int[26][n + 1];
    cc = new int[n];
    for (int i = 0; i < n; i ++) {
      char c = s[i];
      count[c - 'a'][i + 1] = 1;
      for (int j = 0; j < 26; j ++) {
        count[j][i + 1] += count[j][i];
        
        cc[i] += count[j][i + 1] % 2;
      }
    }

    System.out.println(dfs(0, n));
  }
  

  private static Map<String, Integer> memo = new HashMap<>();
  private static int dfs(int left, int right) {

    String hash = null;
    if (right - left < 500) {
      StringBuilder sb = new StringBuilder();
      for (int i = left + 1; i <= right; i ++) {
        int x = 0;
        for (int j = 0; j < 26; j ++) {
          x += (count[j][i] - count[j][left]) % 2;
        }
        sb.append(x);
        sb.append(",");
      }
  
      hash = sb.toString();
      if (memo.containsKey(hash)) {
        return memo.get(hash);
      }
    }

    int ret = Integer.MAX_VALUE;

    int x = 0;
    for (int i = 0; i < 26; i ++) {
      x += (count[i][right] - count[i][left]) % 2;
    }
    if (x <= 1) {
      ret = 1;
    } else {

      if (left + 1 < right) {
        for (int i = left + 1; i < right ; i ++) {
          ret = Math.min(ret, dfs(left, i) + dfs(i, right));
        }
      }
    }
    if (hash != null) memo.put(hash, ret);
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


