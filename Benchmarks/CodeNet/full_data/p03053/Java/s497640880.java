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

    int w = sc.nextInt();
    int h = sc.nextInt();

    boolean[][] board = new boolean[h][w];

    for (int y = 0; y < h; y++) {
      String s = sc.next();
      for (int x = 0; x < w; x++) {
        board[y][x] = s.charAt(x) == '#';
      }
    }

    int maxManhattern = 0;
    for (int y = 0; y < h; y++) {
      for (int x = 0; x < w; x++) {
        maxManhattern = Math.max(maxManhattern, calcNearestManhattern(x, y, w, h, board));
      }
    }

    os.println(maxManhattern);
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