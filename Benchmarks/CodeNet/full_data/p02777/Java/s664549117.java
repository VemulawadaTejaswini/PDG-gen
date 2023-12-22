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
    ARemainingBalls solver = new ARemainingBalls();
    solver.solve(1, in, out);
    out.close();
  }

  static class ARemainingBalls {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      String s = in.next();
      String t = in.next();
      int si = in.nextInt();
      int ti = in.nextInt();
      String u = in.next();
      out.println(s.equals(u) ? --si + " " + ti : si + " " + --ti);
    }

  }
}

