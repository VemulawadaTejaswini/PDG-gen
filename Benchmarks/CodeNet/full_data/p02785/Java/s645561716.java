import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
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
    CFennecVsMonster solver = new CFennecVsMonster();
    solver.solve(1, in, out);
    out.close();
  }

  static class CFennecVsMonster {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int n = in.nextInt();
      int k = in.nextInt();
      List<Integer> al = new ArrayList<>();
      long ans = 0;
      for (int i = 0; i < n; i++) {
        al.add(in.nextInt());
      }
      al.sort(Comparator.reverseOrder());

      if (k >= n) {
        out.println(0);
      } else {
        for (int i = 0; i < n; i++) {
          if (i >= k) {
            ans += al.get(i);
          }
        }
        out.println(ans);
      }

    }

  }
}

