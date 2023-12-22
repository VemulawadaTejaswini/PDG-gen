
import java.util.Arrays;



public class Main {

  private static void solve() {
    int x1 = ni();
    int y1 = ni();
    int x2 = ni();
    int y2 = ni();
    int N = ni();

    if (x1 > x2) {
      int tmpX = x1;
      int tmpY = y1;
      x1 = x2;
      y1 = y2;
      x2 = tmpX;
      y2 = tmpY;
    }
    boolean rf = false;
    int inf = Integer.MAX_VALUE / 2;

    if (y1 > y2) {
      rf = true;
      y1 = inf - y1;
      y2 = inf - y2;
    }

    int[][] p = new int[N][2];
    int ptr = 0;
    for (int i = 1; i <= N; i++) {
      int x = ni();
      int y = ni();
      if (rf) y = inf - y1;

      if (x1 <= x && x <= x2 && y1 <= y && y <= y2)
        p[ptr ++] = new int[] {x, y};
    }
    p = Arrays.copyOf(p, ptr);

    Arrays.sort(p, (o1, o2) -> o1[0] - o2[0]);


    int shFlg = -1;
    int ghFlg = -1;
    int svFlg = -1;
    int gvFlg = -1;
    for (int i = 0; i < ptr; i ++) {
      if (x1 < p[i][0] && p[i][0] < x2) {
        if (y1 == p[i][1]) shFlg = i;
        if (y2 == p[i][1]) ghFlg = i;
      }
      if (y1 < p[i][1] && p[i][1] < y2) {
        if (x1 == p[i][0]) svFlg = i;
        if (x2 == p[i][0]) gvFlg = i;
        
      }
    }

    
    double ret;
    if (y1 == y2) {
      boolean flg = shFlg >= 0 || ghFlg >= 0;
      ret = Math.abs(x1 - x2) * 100.0 + (flg ? Math.PI * 10 - 20 : 0);
    } else if (x1 == x2) {
      boolean flg = svFlg >= 0 || gvFlg >= 0;
      ret = Math.abs(y1 - y2) * 100.0 + (flg ? Math.PI * 10 - 20 : 0);
      
    } else  {
      int[] y = new int[ptr];
      for (int i = 0; i < ptr; i ++) {
        y[i] = p[i][1];
      }
      int lis = lis(y);

      double rad = Math.PI * 5 - 20;
      ret = Math.abs(x1 - x2) * 100.0 + Math.abs(y1 - y2) * 100.0 + rad * lis;
    }
    System.out.printf("%.13f\n", ret);
    
  }

  public static int lis(int[] in)
  {
      int n = in.length;
      int ret = 0;
      int[] h = new int[n + 1];
      Arrays.fill(h, Integer.MIN_VALUE / 2);
      for(int i = 0;i < n;i++){
          int ind = Arrays.binarySearch(h, 0, ret + 1, in[i]);
          if(ind < 0){
              ind = -ind-2;
              h[ind+1] = in[i];
              if(ind >= ret)ret++;
          }
      }
      return ret;
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
      a[i] = ni();
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

