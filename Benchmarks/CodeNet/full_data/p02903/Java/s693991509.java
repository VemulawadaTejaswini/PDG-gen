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
    A01MatrixTask solver = new A01MatrixTask();
    solver.solve(1, in, out);
    out.close();
  }

  static class A01MatrixTask {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      // h w a bなら...
        /*
        0000..01111..1 (a, w-a)
        0000..01111..1
        0000..01111..1
        1111..10000..0
        1111..10000..0
        1111..10000..0
        (b, h-b)
        各列についてa,が少なく,各行についてbが少ない.
         */

      int h, w, a, b;
      h = in.nextInt();
      w = in.nextInt();
      a = in.nextInt();
      b = in.nextInt();

      int[][] ar = new int[h][w];
      for (int i = 0; i < h; i++) {
        for (int j = 0; j < w; j++) {
          ar[i][j] = (i < b) ^ (j < a) ? 1 : 0;
        }
      }

      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < h; i++) {
        for (int j = 0; j < w; j++) {
          sb.append(ar[i][j]);
        }
        sb.append("\n");
      }
      out.println(sb);

    }

  }
}

