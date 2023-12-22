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
    ABC045CManyFormulas solver = new ABC045CManyFormulas();
    solver.solve(1, in, out);
    out.close();
  }

  static class ABC045CManyFormulas {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      String s = in.next();
      long res = 0;
      for (int i = 0; i < s.length(); i++) {
        for (int j = i + 1; j <= s.length(); j++) {
          // out.println(s.substring(i, j));
          String tmps = s.substring(i, j);
          long tmp = Long.parseLong(tmps);
          int pow = s.length() - 1 - (tmps.length() + 1);
          if (i == 0) {
            pow++;
          }
          if (j == s.length()) {
            pow++;
          }
          res += tmp * (long) Math.pow(2, pow);
          // out.println(res);
        }
      }

      out.println(res);
    }

  }
}

