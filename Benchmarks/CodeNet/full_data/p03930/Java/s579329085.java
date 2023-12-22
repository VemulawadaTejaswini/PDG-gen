import java.io.*;
import java.util.*;

public class Main {
  private static boolean debug = false;
  private static boolean elapsed = false;

  private int H;
        private int W;
        private int K;

  private int score;
  private void solve(Scanner sc, PrintWriter out) {
    H = sc.nextInt();
    W = sc.nextInt();
    K = sc.nextInt();
    sc.nextLine();

    int[][] c = new int[H][W];
    for (int i = 0; i < H; ++i) {
      String s = sc.nextLine();
      String[] tokens = s.split("");
      for (int j = 0; j < W; ++j) {
        c[i][j] = Integer.parseInt(tokens[j]);
      }
    }

    for (int i = 0; i < H; ++i) {
      for (int j = 0; j < W; ++j) {
        int[][] cc = copy(c);
        cc[i][j] = -1;
        for (int k = i; k > 0; --k) {
          cc[k][j] = cc[k - 1][j];
        }
        cc[0][j] = -2;
        int scr = check(cc);
        if (score < scr) {
          score = scr;
        }
      }
    }
    out.println(score);
  }
  private int[][] copy(int[][] c) {
    int[][] cc = new int[H][W];
    for (int i = 0; i < H; ++i) {
      for (int j = 0; j < W; ++j) {
        cc[i][j] = c[i][j];
      }
    }
    return cc;
  }
  private int check(int[][] c) {
    int scr = 0;
    for (int ct = 0; true; ++ct) {
if (debug) {
  System.err.println("========");
  for (int i = 0; i < H; ++i) {
    for (int j = 0; j < W; ++j) {
      System.err.print(" " + c[i][j]);
    }
    System.err.println();
  }
}

      int tmp = 0;
      boolean found1 = false;
      for (int i = 0; i < H; ++i) {
        int prev = -1;
        int cnt = 1;
        for (int j = 0; j < W; ++j) {
          if (c[i][j] >= 0 && prev == c[i][j]) {
            ++cnt;
          } else if (cnt >= K) {
            found1 = true;
            for (int k = j - 1; cnt > 0; --k, --cnt) {
//System.err.println("+1(" + i + ", " + k + ")=" + c[i][k]);
              tmp += c[i][k];
              c[i][k] = -1;
            }
          }
          prev = c[i][j];
        }
        if (cnt >= K) {
          found1 = true;
          for (int k = W - 1; cnt > 0; --k, --cnt) {
//System.err.println("+2(" + i + ", " + k + ")=" + c[i][k]);
            tmp += c[i][k];
            c[i][k] = -1;
          }
        }
      }

      if (!found1) {
        break;
      }
//System.err.println("tmp[" + ct + "]=" + tmp);
      scr += (int)(Math.pow(2, ct) * tmp);

      for (int i = H - 1; i >= 0; --i) {
        for (int j = 0; j < W; ++j) {
          if (c[i][j] == -1) {
            if (i > 0) {
              int k = i - 1;
              for (; k > 0 && c[k][j] == -1; --k) {
              }
              c[i][j] = c[k][j];
              c[k][j] = -1;
            } else {
              c[i][j] = -2;
            }
          }
        }
      }
if (debug) {
  System.err.println("========");
  for (int i = 0; i < H; ++i) {
    System.err.print(">>");
    for (int j = 0; j < W; ++j) {
      System.err.print(" " + c[i][j]);
    }
    System.err.println();
  }
}
    }
    return scr;
  }
  /*
   * 10^10 > Integer.MAX_VALUE = 2147483647 > 10^9
   * 10^19 > Long.MAX_VALUE = 9223372036854775807L > 10^18
   */
  public static void main(String[] args) {
    long S = System.currentTimeMillis();

    Scanner sc = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    new Main().solve(sc, out);
    out.flush();

    long G = System.currentTimeMillis();
    if (elapsed) {
      System.err.println((G - S) + "ms");
    }
  }
}