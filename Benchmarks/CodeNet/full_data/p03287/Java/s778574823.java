import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.HashMap;

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
    ABC105D solver = new ABC105D();
    solver.solve(1, in, out);
    out.close();
  }

  static class ABC105D {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int n = in.nextInt();
      int m = in.nextInt();
      int[] ar = new int[n];
      long[] integral = new long[n + 1];
      HashMap<Long, Integer> hm = new HashMap<>();
      long res = 0;
      for (int i = 0; i < n; i++) {
        ar[i] = in.nextInt();
        integral[i + 1] = (ar[i] + integral[i]) % m;
      }

      for (int i = 1; i <= n; i++) {
        if (integral[i] % m == 0) {
          res++;
        }
        if (hm.containsKey(integral[i])) {
          hm.replace(integral[i], hm.get(integral[i]) + 1);
        } else {
          hm.put(integral[i], 1);
        }
      }

      for (long x : hm.values()
      ) {
        res += x * (x - 1) / 2;
      }

      out.println(res);
    }

  }
}

