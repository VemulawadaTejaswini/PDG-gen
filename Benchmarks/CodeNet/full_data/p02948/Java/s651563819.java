import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;

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
    DSummerVacation solver = new DSummerVacation();
    solver.solve(1, in, out);
    out.close();
  }

  static class DSummerVacation {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int n = in.nextInt();
      int m = in.nextInt();
      int index = 0;
      int res = 0;
      ArrayList<Pair> alp = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        alp.add(new Pair(in.nextInt(), in.nextInt()));
      }
      Collections.sort(alp, (x, y) -> x.compareTo(y, 1, 1));
      PriorityQueue<Integer> pqp = new PriorityQueue<>(Comparator.reverseOrder());
      for (int i = 1; i <= m; i++) {
        while (true) {
          if (index == n) {
            break;
          }
          if (alp.get(index).o1 <= i) {
            pqp.add(alp.get(index).o2);
            index++;
          } else {
            break;
          }
        }
        if (pqp.size() > 0) {
          res += pqp.poll();
        }
      }
      out.println(res);

    }

  }

  static class Pair {

    int o1;
    int o2;

    public Pair(int x, int y) {
      this.o1 = x;
      this.o2 = y;
    }

    public String toString() {
      return "(" + this.o1 + ", " + this.o2 + ")";
    }

    int compareTo(Pair p, int op1, int op2) {
      // 1: NaturalOrder, -1: Reverse Order
      if (this.o1 > p.o1) {
        return op1;
      }
      if (this.o1 < p.o1) {
        return -op1;
      }
      if (this.o2 > p.o2) {
        return op2;
      }
      if (this.o2 < p.o2) {
        return -op2;
      }
      return 0;
    }

  }
}

