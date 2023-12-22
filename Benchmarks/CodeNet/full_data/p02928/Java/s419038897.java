import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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

    long THRESHOLD = (long) Math.pow(10, 9) + 7;

    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] A = new int[n];

    for (int i = 0; i < A.length; i++) {
      A[i] = sc.nextInt();
    }
    long p = 0;
    long q = 0;
    for (int i = 0; i < A.length; i++) {

      long eachP = 0;
      long eachQ = 0;

      for (int j = 0; j < A.length; j++) {
        int ai = A[i];
        int aj = A[j];
        if (ai > aj) {
          eachQ++;
          if (j > i) {
            eachP++;
          }
        }
      }
      p += eachP;
      q += eachQ;
    }

    long totalP = p * k;
    long totalQ = q * (k * (k - 1) / 2);

    long pp = totalP;
    long qq = totalQ;
    long total = (pp + qq) % THRESHOLD;

    out.println(total);
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
