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
  // static int[] a, b;
  static int[][] map;

  static int[] par;
  static double[][][] p;
  static double[][][] ev;

  static void solve() throws Exception {
    n = in.nextInt();
    p = new double[n + 1][n + 1][n + 1];
    ev = new double[n + 1][n + 1][n + 1];

    // dp[i][j][k]: E{# of ops when there are i 1-dish, j 2-dish, k 3-dish}
    int[] start = new int[4];
    for (int i = 0; i < n; i++) {
      start[in.nextInt()]++;
    }

    p[start[1]][start[2]][start[3]] = 1;
    
    for (int c = n; c >= 0; c--) {
      for (int b = n; b >= 0; b--) {
        for (int a = n; a >= 0; a--) {
          if (a + b + c == 0 || a + b + c > n) {continue;}
          double pWaste = (double) (n - a - b- c) / n;
          double evWaste = pWaste / (1 - pWaste) + 1;
          ev[a][b][c] += evWaste * p[a][b][c];

          // out.println(a + " " + b + " " + c + " : " + pWaste + " " + evWaste + " " + p[a][b][c]);

          if (a != 0) {
            double p_go = ((double) a) / (a + b + c);
            p[a-1][b][c] += p[a][b][c] * p_go;
            ev[a-1][b][c] += ev[a][b][c] * p_go;
          }

          if (b != 0) {
            double p_go = ((double) b) / (a + b + c);
            p[a+1][b - 1][c] += p[a][b][c] * p_go;
            ev[a+1][b - 1][c] += ev[a][b][c] * p_go;
          }

          if (c != 0) {
            double p_go = ((double) c) / (a + b + c);
            p[a][b + 1][c - 1] += p[a][b][c] * p_go;
            ev[a][b + 1][c - 1] += ev[a][b][c] * p_go;
          }


        }
      }
    }

    out.println(ev[0][0][0]);





    // out.println(dp(1,1,3));
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
