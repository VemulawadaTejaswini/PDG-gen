import java.util.*;
import java.io.*;
import java.math.BigInteger;

 
class Main implements Runnable {
  // static Scanner in;
  static FastReader in;
  static PrintWriter out;
  static int[][] dirs8 = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1, 1}, {-1, -1}, {-1, 1}, {1, -1}};
  static int[][] dirs = {{0, -1}, {1, 0}, {0, +1}, {-1, 0}};
 
  static int[][] E;
  // static List<int[]>[] adj;
  static List<Integer>[] adj;
  static int[] vis;
 
  static long INFL = (long) 1e15 + 7;
  static int INF = (int) 1e9 + 7;
  static int mod = 998244353;
  
  static int T, n, m, k, count, cur, w;
  static boolean flag;
  static int[] a, b;
  static int[][] map;

  static int[] par;
  static long[] dp;

  static void solve() throws Exception {
    n = in.nextInt();
    int W = in.nextInt();
    int[][] items = new int[n][2];
    int ttw = 0, ttv = 0;
    for (int i = 0; i < n; i++) {
      items[i][0] = in.nextInt();
      items[i][1] = in.nextInt();
      ttw += items[i][0];
      ttv += items[i][1];
    }

    dp = new long[ttv + 1];
    // dp[i]: min weight to gain value i
    Arrays.fill(dp, INFL);
    dp[0] = 0;

    for (int i = 0; i < n; i++) {
      int w = items[i][0];
      int v = items[i][1];

      for (int j = ttv - v; j >= 0; j--) {
        dp[j + v] = Math.min(dp[j + v], dp[j] + w);
      }
    }

    for (int v = ttv; v >= 0; v--) {
      if (dp[v] <= W) {out.println(v); return;}
    }



  }

 

  public static void main(String[] args) throws Exception {
 
    // in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    in = new FastReader();
    out = new PrintWriter(System.out);
 
    // int numOfTests = in.nextInt();
    // for (int caseNum = 1; caseNum <= numOfTests; caseNum++) {
    //   // Thread t = new Thread(null, new Main(), "Main", 1 << 28);
    //   // t.start();
    //   // t.join();
    //   solve();
    // }
 
    // // Thread t = new Thread(null, new Main(), "Main", 1 << 28);
    // // t.start();
    // // t.join();
    solve();
 
    out.flush();
    out.close();
  }
 
  @Override
  public void run() {
    try {
      solve();
    } catch (Exception e) {
      e.printStackTrace(); 
    }
  }
 
  static class FastReader {
    public BufferedReader br; 
    StringTokenizer st; 
    public FastReader() {br = new BufferedReader(new InputStreamReader(System.in));} 
    String next() { 
      while (st == null || !st.hasMoreElements()) { 
          try {st = new StringTokenizer(br.readLine());} 
          catch (IOException e) {e.printStackTrace();} 
      } 
      return st.nextToken(); 
    } 
    int nextInt() {return Integer.parseInt(next());} 
    long nextLong() {return Long.parseLong(next());} 
    double nextDouble() {return Double.parseDouble(next());} 
    String nextLine() {
      String str = ""; 
        try {str = br.readLine();} 
        catch (IOException e) {e.printStackTrace();} 
        return str; 
    }
  }

  static void as(boolean result) throws Exception {
    if (!result) {
      throw new Exception();
    }
  }

  static int modInverse(int a, int m) { 
    int m0 = m; 
    int y = 0, x = 1; 
    if (m == 1) {return 0;} 
    while (a > 1) { 
      // q is quotient 
      int q = a / m; 
      int t = m; 
      // m is remainder now, process 
      // same as Euclid's algo 
      m = a % m; 
      a = t; 
      t = y; 
      // Update x and y 
      y = x - q * y; 
      x = t; 
    } 
    // Make x positive 
    if (x < 0) 
      x += m0; 
    return x; 
  } 
} 