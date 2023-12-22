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
    ABC150A solver = new ABC150A();
    solver.solve(1, in, out);
    out.close();
  }

  static class ABC150A {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int n = in.nextInt();
      int x = in.nextInt();
      out.println(500 * n >= x ? "Yes" : "No");
    }

  }
}

