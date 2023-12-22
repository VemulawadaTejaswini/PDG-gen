import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Collections;

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
    ABC141DPowerfulDiscountTickets solver = new ABC141DPowerfulDiscountTickets();
    solver.solve(1, in, out);
    out.close();
  }

  static class ABC141DPowerfulDiscountTickets {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int n = in.nextInt();
      int m = in.nextInt();
      PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
      for (int i = 0; i < n; i++) {
        pq.add(in.nextLong());
      }

      for (int i = 0; i < m; i++) {
        Long tmp = pq.poll();
        tmp /= 2;
        pq.add(tmp);
      }

      long res = 0;
      for (long l : pq) {
        res += l;
      }
      out.println(res);
    }

  }
}

