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
    KEYENCE2020A solver = new KEYENCE2020A();
    solver.solve(1, in, out);
    out.close();
  }

  static class KEYENCE2020A {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int h = in.nextInt();
      int w = in.nextInt();
      int n = in.nextInt();
      int m = Math.max(h, w);
      out.println((n + (m - 1)) / m);

    }

  }
}

