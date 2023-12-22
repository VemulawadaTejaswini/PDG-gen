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
    ABC134DPreparingBoxes solver = new ABC134DPreparingBoxes();
    solver.solve(1, in, out);
    out.close();
  }

  static class ABC134DPreparingBoxes {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int n = in.nextInt();
      boolean[] bool = new boolean[n];
      int[] array = new int[n];
      int cnt = 0;
      ArrayList<Integer> al = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        bool[i] = false;
        array[i] = in.nextInt();
      }

      for (int i = n - 1; i >= 0; i--) {
        int tmpcnt = 0;
        for (int j = i * 2; j < n; j++) {
          if (bool[j]) {
            tmpcnt = (tmpcnt + 1) % 2;
          }
        }
        if (tmpcnt != array[i]) {
          bool[i] = true;
        }
      }

      for (int i = 0; i < n; i++) {
        if (bool[i]) {
          cnt++;
          al.add(i + 1);
        }
      }
      out.println(cnt);
      for (int i = 0; i < al.size(); i++) {
        out.println(al.get(i));
      }
    }

  }
}

