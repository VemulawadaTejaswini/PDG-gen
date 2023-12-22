import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.naming.spi.Resolver;

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

    int a = sc.nextInt();
    int b = sc.nextInt();

    Resolver resolver= new Resolver(a,b);

    int rest = -1;
    ArrayList<Integer> rests = new ArrayList<>();
    while ((rest= resolver.getRest())!=0){
      rests.add(rest);
      resolver.shftBtoAThenBisRest(rest);
    }


    long ans = ((long)a*(long) b)/rests.get(rests.size()-1);
    out.println(ans);
    out.close();
  }

  class Resolver{
    int a;
    int b;

    Resolver(int a, int b){
      this.a = a;
      this.b = b;
    }

    int getRest(){
      swapIfBigger();
      return a%b;
    }

    void swapIfBigger(){
      if (a<b){
        swap();
      }
    }

    void shftBtoAThenBisRest(int b){
      this.a = this.b;
      this.b =b;
    }

    void swap(){
      int beforeA = a;
      int beforeB = b;
      
      a = beforeB;
      b = beforeA;
    }

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
