import java.io.*;
import java.util.StringTokenizer;

public class Main {
  private static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
  private MyScanner sc = new MyScanner();

  public static void main(String[] args) {
    Main main = new Main();
    Runtime.getRuntime().addShutdownHook(new Thread(() -> out.close()));
    try {
      main.run(args);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }


  private void run(String[] arguments) throws Exception {
    long a = sc.nextLong(), b = sc.nextLong(), k = sc.nextLong();

    if (a> k){
      a = a - k;
    }else {
      k = k - a;
      a = 0;
    }

    if (b>k){
      b = b -k;
    }else {
      b = 0;
    }

    StringBuilder ans = new StringBuilder();
    ans.append(a).append(" ").append(b);
    out.println(ans);
    out.close();
  }

  /*          
   * Form: http://codeforces.com/blog/entry/7018
   */
  private class MyScanner implements AutoCloseable{
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

    @Override
    public void close() throws Exception {
      out.close();
    }
  }
}
