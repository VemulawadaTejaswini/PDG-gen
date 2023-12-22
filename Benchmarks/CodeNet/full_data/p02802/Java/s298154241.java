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
    ABC151C solver = new ABC151C();
    solver.solve(1, in, out);
    out.close();
  }

  static class ABC151C {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int n = in.nextInt();
      int m = in.nextInt();
      boolean[] ac = new boolean[n];
      int[] waCnt = new int[n];
      int acNum = 0;
      int waNum = 0;

      for (int i = 0; i < m; i++) {
        // 提出
        int num = in.nextInt() - 1;
        String s = in.next();
        if (s.equals("AC")) {
          ac[num] = true;
        } else {
          if (ac[num]) {
            // nop
          } else {
            waCnt[num]++;
          }
        }
      }

      for (int i = 0; i < n; i++) {
        if (ac[i]) {
          acNum++;
          waNum += waCnt[i];
        }
      }

      out.println(acNum + " " + waNum);

    }

  }
}

