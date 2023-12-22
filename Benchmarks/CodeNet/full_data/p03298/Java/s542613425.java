
public class Main {


  private static void solve() {
//    char[][] buf = {"aba".toCharArray(), {'c'}};
//    int[] p = {3, 1};
//    char[] right = "abca".toCharArray();
//    System.out.println(dp(buf, right, p));
    int n = ni();
    char[] s = ns();
    
    char[] right = new char[n];
    for (int i = 0; i < n; i ++) {
      right[i] = s[n * 2 - i - 1];
    }

    char[][] buf = new char[2][n];
    long ret = 0;
    for (int i = 0; i < (1 << n); i ++) {
      int[] p = new int[2];
      for (int j = 0; j < n; j ++) {
        int k = (i >> j) & 1;
        buf[k][p[k] ++]  = s[j];
      }
      
      //dp[x][y]
      //buf[0]のx文字目とbuf[1]のy文字目までが一致する個数
      ret += dp(buf, right, p);
    }
    System.out.println(ret);
  }

  private static long dp(char[][] buf, char[] right, int[] p) {
    long[][] dp = new long[p[0] + 1][p[1] + 1];
    dp[0][0] = 1;
    for (int x = 0; x <= p[0]; x ++) {
      for (int y = 0; y <= p[1]; y ++) {
        if (x < p[0] && right[x + y] == buf[0][x]) {
          dp[x + 1][y] += dp[x][y];
        }
        if (y < p[1] && right[x + y] == buf[1][y]) {
          dp[x][y + 1] += dp[x][y];
        }
      }
    }
    return dp[p[0]][p[1]];
  }
  public static int[][] lcsNaive(char[] a, int alen, char[] b)
  {
      int n = alen;
      int m = b.length;
      int[][] dp = new int[n+1][m+1];
      for(int i = 1;i <= n;i++){
          for(int j = 1;j <= m;j++){
              dp[i][j] = a[i-1] == b[j-1] ? dp[i-1][j-1] + 1 : Math.max(dp[i-1][j], dp[i][j-1]);
          }
      }
      return dp;
  }

  public static long[][] lcscount(char[] s, int slen, char[] t, int[][] L)
  {
      int n = slen, m = t.length;
      long[][] D = new long[n+1][m+1];
      for(int i = 0;i <= n;i++)D[i][0] = D[0][i] = 1;
      for(int i = 1;i <= n;i++){
          for(int j = 1;j <= m;j++){
              if(s[i-1] == t[j-1]){
                  D[i][j] = D[i-1][j-1];
              }else{
                  if(L[i][j] == L[i-1][j])D[i][j] += D[i-1][j];
                  if(L[i][j] == L[i][j-1])D[i][j] += D[i][j-1];
                  if(L[i][j] == L[i-1][j-1])D[i][j] -= D[i-1][j-1];
//                if(D[i][j] >= 1E18)D[i][j] = 1000000000000000000L;
              }
          }
      }
      return D;
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
