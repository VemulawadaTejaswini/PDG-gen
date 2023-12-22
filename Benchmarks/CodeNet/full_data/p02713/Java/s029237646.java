import java.io.*;
import java.util.Map;
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

    int K = sc.nextInt();
    int ans = 0;
    for (int i = 1; i <= K; i++) {
      for (int j = 1; j <= K; j++) {
        for (int k = 1; k <= K ; k++) {
          int ij = dpf(i, j);
          int ijk = dpf(ij, k);
          ans += ijk;
        }
      }
    }

    out.println(ans);
    out.close();
  }

  int dpf(int i, int j){
    if (j>i){
      int k = i;
      i = j;
      j = k;
    }
    int rest = i%j;
    if (rest==0){
      return j;
    }
    return dpf(j, rest);
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
