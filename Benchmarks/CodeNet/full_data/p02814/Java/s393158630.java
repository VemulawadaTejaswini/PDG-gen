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
    ABC150D solver = new ABC150D();
    solver.solve(1, in, out);
    out.close();
  }

  static class ABC150D {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int n = in.nextInt();
      int m = in.nextInt();
      int[] ar = new int[n];
      boolean f = true;
      int cnt2 = 0;
      for (int i = 0; i < n; i++) {
        ar[i] = in.nextInt();
      }

      while (true) {
        for (int i = 0; i < n; i++) {
          if (ar[i] % 2 != ar[0] % 2) {
            // 素因数2の個数が異なる場合はNG
            f = false;
          }
        }
        if (!f) {
          break;
        }
        if (ar[0] % 2 == 0) {
          cnt2++;
          for (int i = 0; i < n; i++) {
            ar[i] /= 2;
          }
        } else {
          break;
        }
      }

      if (!f) {
        out.println(0);
      } else {
        long lcm = arrayLcm(ar);
        if (lcm > m) {
          out.println(0);
        } else {
          out.println((m - lcm) / ((long) (Math.pow(2, cnt2) * lcm)) + 1);
        }
      }

    }

    long arrayLcm(int[] ar) {
      long lcm = ar[0];
      for (int i = 1; i < ar.length; i++) {
        lcm = lcm * ar[i] / gcd(lcm, ar[i]);
      }
      return lcm;
    }

    long gcd(long a, long b) {
      return b == 0 ? a : gcd(b, a % b);
    }

  }
}

