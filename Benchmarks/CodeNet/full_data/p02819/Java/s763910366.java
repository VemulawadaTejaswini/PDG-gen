import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  private static PrintWriter out;

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
    MyScanner sc = new MyScanner();
    out = new PrintWriter(new BufferedOutputStream(System.out));

    int x = sc.nextInt();
    int MAX = 100003;

    boolean[] sift = new boolean[MAX+1];
    Arrays.fill(sift,true);
    sift[0] = false;
    sift[1] = false;

    for (int i = 2; i < sift.length; i++) {
      if (!sift[i]) continue;
      for (int j = i*2; j < sift.length; j=j+i) {
        sift[j] = false;
      }
    }

    int ans = 0;
    for (int i = x; i < sift.length; i++) {
      if (sift[i]){
        ans = i;
        break;
      }
    }
    out.println(ans);
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
