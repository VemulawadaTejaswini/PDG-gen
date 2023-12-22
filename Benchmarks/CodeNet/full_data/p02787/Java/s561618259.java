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
    ECrestedIbisVsMonster solver = new ECrestedIbisVsMonster();
    solver.solve(1, in, out);
    out.close();
  }

  static class ECrestedIbisVsMonster {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int h = in.nextInt();
      int n = in.nextInt();
      int[] atk = new int[n];
      int[] mag = new int[n];
      // x減らすための最小の魔法消費
      int[] dp = new int[h + 1];
      for (int i = 0; i < n; i++) {
        atk[i] = in.nextInt();
        mag[i] = in.nextInt();
      }
      for (int i = 0; i < h + 1; i++) {
        dp[i] = (int) 1e9;
      }

      dp[0] = 0;

      for (int i = 0; i < n; i++) {
        for (int j = 0; j < h + 1; j++) {
          if (atk[i] > j) {
            dp[j] = Math.min(dp[j], mag[i]);
          } else {
            dp[j] = Math.min(dp[j], mag[i] + dp[j - atk[i]]);
          }
        }
      }

      out.println(dp[h]);
    }

  }
}

