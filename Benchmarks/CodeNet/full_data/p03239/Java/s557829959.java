import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    try {
      main.run(args);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void run(String[] arguments) throws Exception {
    MyScanner sc = new MyScanner();
    PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    int n = sc.nextInt();
    int MAX_TIME = sc.nextInt();
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < n; i++) {
      int cost = sc.nextInt();
      int time = sc.nextInt();
      if (time<=MAX_TIME && cost<min){
        min = cost;
      }
    }

    if (min==Integer.MAX_VALUE){
      out.println("TLE");
      out.close();
      return;
    }

    out.println(min);
    out.close();
  }

  /*
   * Form: http://codeforces.com/blog/entry/7018
   */
  private class MyScanner {
    BufferedReader br;
    StringTokenizer st;

    MyScanner() {
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

    String nextLine() {
      String str = "";
      try {
        str = br.readLine();
      } catch (IOException e) {
        e.printStackTrace();
      }
      return str;
    }
  }
}
