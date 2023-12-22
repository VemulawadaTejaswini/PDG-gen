import java.io.*;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
  private static PrintWriter out;

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
    out = new PrintWriter(new BufferedOutputStream(System.out));
    int n = sc.nextInt();
    int t = sc.nextInt();
    double a = sc.nextDouble();

    Double[] temps = IntStream.range(0, n).boxed().map(dumy-> t-(sc.nextInt()*0.006)).toArray(Double[]::new);
    
    int ans = 0;
    double min = Double.MAX_VALUE;
    for (int i = 0; i < temps.length; i++) {
        double sub = 0;
        if (a>temps[i]){
            sub = a - temps[i];
        }else{
            sub = temps[i] - a;
        }

        double accu = Math.abs(sub);
        if (accu<min){
            min = accu;
            ans = i+1;
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
