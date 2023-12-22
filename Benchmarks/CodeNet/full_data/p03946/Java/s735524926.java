import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
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
    DAnInvisibleHand solver = new DAnInvisibleHand();
    solver.solve(1, in, out);
    out.close();
  }

  static class DAnInvisibleHand {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int n = in.nextInt();
      int t = in.nextInt();
      ArrayList<Integer> al = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        al.add(in.nextInt());
      }
      al.add(0);
      int maxDif = 0;
      int tmpLow = al.get(0);
      int cnt = 0;
      int tmpDif = 0;
      for (int i = 1; i < al.size(); i++) {
        if (tmpLow > al.get(i)) {
          tmpLow = al.get(i);
          if (maxDif < tmpDif) {
            maxDif = tmpDif;
            cnt = 1;
          } else if (maxDif == tmpDif) {
            cnt++;
          }
          tmpDif = 0;
        } else {
          tmpDif = Math.max(tmpDif, al.get(i) - tmpLow);
        }
      }

      out.println(cnt);

    }

  }
}

