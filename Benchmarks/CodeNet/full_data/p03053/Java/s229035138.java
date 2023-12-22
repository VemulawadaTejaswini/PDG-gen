import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */

    int h = sc.nextInt();
    int w = sc.nextInt();

    boolean[][] board = new boolean[h][w];

    /**
     int[][] manhattern = new int[h][w];

     for (int y = 0; y < h; y++) {
     for (int x = 0; x < w; x++) {
     manhattern[y][x] = Integer.MAX_VALUE;
     }
     }
     */

    for (int y = 0; y < h; y++) {
      String s = sc.next();
      for (int x = 0; x < w; x++) {
        board[y][x] = s.charAt(x) == '#';
      }
    }

    int count = 0;

    while(true) {
      boolean foundFalse = false;
      for (int y = 0; y < h; y++) {
        for (int x = 0; x < w; x++) {
          if (!board[y][x]) {
            foundFalse = true;
          }
        }
      }
      if (!foundFalse) {
        break;
      }
      for (int y = 0; y < h; y++) {
        for (int x = 0; x < w; x++) {
          if (!board[y][x]) {
            board[y][x] =
                check(x - 1, y, w, h, board) ||
                    check(x + 1, y, w, h, board) ||
                    check(x, y - 1, w, h, board) ||
                    check(x, y + 1, w, h, board);
          }
        }
      }
      count++;
    }

    os.println(count);
  }

  private static int calcNearestManhattern(int x, int y, int w, int h, boolean[][] board) {
    int m = 0;

    while (true) {
      for (int my = 0; my <= m; my++) {
        int mx = m - my;

        if (check(x + mx, y + my, w, h, board)) {
          return m;
        }

        if (check(x - mx, y + my, w, h, board)) {
          return m;
        }

        if (check(x - mx, y - my, w, h, board)) {
          return m;
        }

        if (check(x + mx, y - my, w, h, board)) {
          return m;
        }
      }
      m++;
    }
  }

  private static boolean check(int x, int y, int w, int h, boolean[][] board) {
    if (x < 0 || w <= x) {
      return false;
    }
    if (y < 0 || h <= y) {
      return false;
    }
    return board[y][x];
  }
}