import java.io.*;
import static java.lang.Math.*;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  private void run() {
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out)) {

          String[] ln;
          int[] v = new int[5];
          for (int i = 0; i < 3; i++) {
            ln =  in.readLine().split(" ");
            int a = atoi(ln[0]);
            int b = atoi(ln[1]);
            v[a] += 1;
            v[b] += 1;
          }

          int res = 0;
          for (int i : v) {
            res = max(res, i);
          }
          
          String ans = res != 3 ? "YES" : "NO";
          System.out.println(ans);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }

  int  atoi(String s) { return Integer.parseInt(s); }
  long atol(String s) { return Long.parseLong(s);   }
}