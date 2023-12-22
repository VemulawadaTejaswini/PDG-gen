import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {

  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    Scanner in = new Scanner(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    DWangoA solver = new DWangoA();
    solver.solve(1, in, out);
    out.close();
  }

  static class DWangoA {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int n = in.nextInt();
      String[] s = new String[n];
      int[] t = new int[n];
      boolean f = false;
      long res = 0;
      for (int i = 0; i < n; i++) {
        s[i] = in.next();
        t[i] = in.nextInt();
      }
      String x = in.next();
      for (int i = 0; i < n; i++) {
        if (f) {
          res += (long) t[i];
        }
        if (x.equals(s[i])) {
          f = true;
        }
      }
      out.println(res);
    }

  }
}

