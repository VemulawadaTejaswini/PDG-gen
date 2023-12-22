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
    ABC054DMixingExperiment solver = new ABC054DMixingExperiment();
    solver.solve(1, in, out);
    out.close();
  }

  static class ABC054DMixingExperiment {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int n = in.nextInt();
      int ma = in.nextInt();
      int mb = in.nextInt();
      int[] a = new int[n];
      int[] b = new int[n];
      int[] c = new int[n];
      // i個選んだ時にj,k(g)になるようなコスト
      int[][][] dp = new int[n + 1][401][401];

      for (int i = 0; i < n; i++) {
        a[i] = in.nextInt();
        b[i] = in.nextInt();
        c[i] = in.nextInt();
      }

      for (int i = 0; i <= n; i++) {
        for (int j = 0; j < 401; j++) {
          for (int k = 0; k < 401; k++) {
            dp[i][j][k] = 1919810;
          }
        }
      }
      dp[0][0][0] = 0;
      for (int i = 1; i <= n; i++) {
        for (int j = 0; j < 401; j++) {
          for (int k = 0; k < 401; k++) {
            int jj = j - a[i - 1];
            int kk = k - b[i - 1];
            if (jj >= 0 && kk >= 0) {
              dp[i][j][k] = Math.min((dp[i - 1][jj][kk] + c[i - 1]), dp[i - 1][j][k]);
            }
          }
        }
      }

      int res = (int) 1e9;
      for (int i = 1; i < 401; i++) {
        for (int j = 1; j < 401; j++) {
          if (ma * j == mb * i) {
            res = Math.min(res, dp[n][i][j]);
          }
        }
      }
      if (res >= 1919810) {
        res = -1;
      }

    /*
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        out.print(dp[n][i][j] + " ");
      }
      out.println();
    }
     */

      out.println(res);


    }

  }
}

