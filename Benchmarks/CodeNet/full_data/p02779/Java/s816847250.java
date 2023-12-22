import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
    CDistinctOrNot solver = new CDistinctOrNot();
    solver.solve(1, in, out);
    out.close();
  }

  static class CDistinctOrNot {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int n = in.nextInt();
      int[] a = new int[n];
      boolean f = true;
      for (int i = 0; i < n; i++) {
        a[i] = in.nextInt();
      }
      Arrays.sort(a);
      for (int i = 0; i < n - 1; i++) {
        f = f && !(a[i] == a[i + 1]);
      }
      out.println(f ? "YES" : "NO");
    }

  }
}

