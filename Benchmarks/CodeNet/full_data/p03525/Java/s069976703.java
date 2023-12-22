import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
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
    CTimeGap solver = new CTimeGap();
    solver.solve(1, in, out);
    out.close();
  }

  static class CTimeGap {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int n = in.nextInt();
      int[] time = new int[n];
      int res = 0;
      for (int i = 0; i < n; i++) {
        time[i] = in.nextInt();
      }

      if (n > 24) {
        // nop
      } else if (n > 12) {
        int[] cnt = new int[13];
        for (int i = 0; i < n; i++) {
          cnt[time[i]]++;
        }
        if (cnt[0] > 0) {
          res = 0;
        } else {
          res = 1;
          for (int i = 0; i < 13; i++) {
            if (cnt[i] > 2) {
              res = 0;
              break;
            }
          }
        }
      } else {
        for (int i = 0; i < Math.pow(2, n); i++) {
          ArrayList<Integer> al = new ArrayList<>();
          al.add(0);
          int x = i;
          for (int j = 0; j < n; j++) {
            if (x % 2 == 1) {
              al.add((24 - time[j]) % 24);
            } else {
              al.add(time[j]);
            }
            x /= 2;
          }
          Collections.sort(al);
          int tmp = Integer.MAX_VALUE;
          for (int j = 1; j < al.size(); j++) {
            // out.print(al.get(j) + " ");
            tmp = Math.min(tmp, al.get(j) - al.get(j - 1));
          }
          // out.println();
          // out.println(tmp);
          res = Math.max(res, tmp);
        }
      }

      out.println(res);

    }

  }
}

