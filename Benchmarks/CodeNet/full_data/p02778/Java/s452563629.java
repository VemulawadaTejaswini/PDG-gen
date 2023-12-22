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
    BIMissYou solver = new BIMissYou();
    solver.solve(1, in, out);
    out.close();
  }

  static class BIMissYou {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      String s = in.next();
      StringBuffer sb = new StringBuffer();
      for (int i = 0; i < s.length(); i++) {
        sb.append("x");
      }
      out.println(new String(sb));
    }

  }
}

