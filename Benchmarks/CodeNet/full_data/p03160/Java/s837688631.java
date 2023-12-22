import java.io.*;
import java.util.*;


public class Main {
  public static void main(String[] args) {
    MyScanner sc = new MyScanner();
    out = new PrintWriter(new BufferedOutputStream(System.out));


    int numInput = sc.nextInt();

    int[] cost = new int[numInput];

    for (int i = 0; i < cost.length; i ++) {
      cost[i] = sc.nextInt();
    }

    int[] dp = new int[numInput];
    dp[0] = 0;
    dp[1] = Math.abs(cost[0] - cost[1]);

    for (int i = 2; i < numInput; i ++) {
      dp[i] = Math.min(
            Math.abs(cost[i] - cost[i - 1]) + dp[i - 1],
            Math.abs(cost[i] - cost[i - 2]) + dp[i - 2]);
    }

    out.println(dp[numInput - 1]);

    // Start writing your solution here. -------------------------------------

    /*
    int n      = sc.nextInt();        // read input as integer
    long k     = sc.nextLong();       // read input as long
    double d   = sc.nextDouble();     // read input as double
    String str = sc.next();           // read input as String
    String s   = sc.nextLine();       // read whole line as String

    int result = 3*n;
    out.println(result);                    // print via PrintWriter
    */

    // Stop writing your solution here. -------------------------------------
    out.close();
  }


  //-----------PrintWriter for faster output---------------------------------
  public static PrintWriter out;

  //-----------MyScanner class for faster input----------
  public static class MyScanner {
    BufferedReader br;
    StringTokenizer st;

    public MyScanner() {
      br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }

    long nextLong() {
      return Long.parseLong(next());
    }

    double nextDouble() {
      return Double.parseDouble(next());
    }

    String nextLine(){
      String str = "";
      try {
        str = br.readLine();
      } catch (IOException e) {
        e.printStackTrace();
      }
      return str;
    }

  }
  //--------------------------------------------------------
}