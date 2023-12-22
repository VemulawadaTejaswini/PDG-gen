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
    AGC002BBoxandBall solver = new AGC002BBoxandBall();
    solver.solve(1, in, out);
    out.close();
  }

  static class AGC002BBoxandBall {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int n = in.nextInt();
      int m = in.nextInt();
      int[] ar = new int[n];
      boolean[] red = new boolean[n];
      for (int i = 0; i < n; i++) {
        ar[i] = 1;
        red[i] = false;
      }
      red[0] = true;
      for (int i = 0; i < m; i++) {
        int a = in.nextInt() - 1;
        int b = in.nextInt() - 1;
        if (red[a]) {
          red[b] = true;
        }
        ar[a]--;
        ar[b]++;
        if (ar[a] == 0) {
          red[a] = false;
        }
      }
      int cnt = 0;
      for (int i = 0; i < n; i++) {
        if (red[i]) {
          cnt++;
        }
      }
      out.println(cnt);
    }

  }
}

