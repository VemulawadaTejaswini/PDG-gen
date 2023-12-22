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
    DGoodGrid solver = new DGoodGrid();
    solver.solve(1, in, out);
    out.close();
  }

  static class DGoodGrid {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      // i+jの同値類に分けておいて,色と数をカウントしておく.
      // あとはコストを各色の組(c_0, c_1, c_2)について考えればいいよねっ☆
      // と思ったけど各グリッドについてやっていたらTLEしそう.個数を持っておけば間に合わん？30個しかないやん
      // そり！
      int n = in.nextInt();
      int c = in.nextInt();
      int[][] dif = new int[c + 1][c + 1];
      HashMap<Integer, Integer>[] hm = new HashMap[3];
      hm[0] = new HashMap<>();
      hm[1] = new HashMap<>();
      hm[2] = new HashMap<>();
      int minCost = Integer.MAX_VALUE;

      for (int i = 1; i <= c; i++) {
        for (int j = 1; j <= c; j++) {
          dif[i][j] = in.nextInt();
        }
      }

      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
          int color = in.nextInt();
          if (hm[(i + j) % 3].containsKey(color)) {
            // 既に存在するので書換
            hm[(i + j) % 3].replace(color, hm[(i + j) % 3].get(color) + 1);
          } else {
            hm[(i + j) % 3].put(color, 1);
          }
        }
      }

      for (int i = 1; i <= c; i++) {
        for (int j = 1; j <= c; j++) {
          for (int k = 1; k <= c; k++) {
            if (i == j || j == k || k == i) {
              continue;
            } else {
              // 書換がいる.
              int tmpCost = 0;
              for (int l = 1; l <= c; l++) {
                if (hm[0].containsKey(l)) {
                  tmpCost += hm[0].get(l) * dif[l][i];
                }
                if (hm[1].containsKey(l)) {
                  tmpCost += hm[1].get(l) * dif[l][j];
                }
                if (hm[2].containsKey(l)) {
                  tmpCost += hm[2].get(l) * dif[l][k];
                }
              }
              minCost = Math.min(minCost, tmpCost);
            }
          }
        }
      }

      out.println(minCost);

    }

  }
}

