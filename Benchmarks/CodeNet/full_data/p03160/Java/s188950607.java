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
  static int INF = (int) 1e7 + 9;
  static int mod = 998244353;
  
  static int T, n, m, k, count, cur;
  static boolean flag;
  static int[] a, b;
  static int[][] map;

  static int[] par;
  static int[] dp;

  static void solve() throws Exception {
    n = in.nextInt();
    
    a = new int[n];
    for (int i = 0; i < n; i++) {a[i] = in.nextInt();}

    dp = new int[n];
    // dp[i]: the min cost to jump to from i to (n - 1)
    // for (int i = n - 2; i >= 0; i--) {
    //   dp[i] = Math.min(dp[i + 1] + Math.abs(a[i] - a[i + 1]), (i == n - 2) ? INF : dp[i + 2] + Math.abs(a[i] - a[i + 2]));
    // }
    // out.println(dp[0]);

    // dp[i]: the min cost to jump from 0 to i
    for (int i = 1; i < n; i++) {
      dp[i] = Math.min(dp[i - 1] + Math.abs(a[i] - a[i - 1]), 
                      i == 1 ? INF : dp[i - 2] + Math.abs(a[i] - a[i - 2]));
    }
    out.println(dp[n - 1]);
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