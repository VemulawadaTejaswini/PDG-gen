import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Main {
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    new Main().run();
  }

  int[][][] ofs = {
      {
          {-1, -1},
          {-1, 0},
          {0, -1}
      },
      {
          {-1, 1},
          {-1, 0},
          {0, 1}
      },
      {
          {1, -1},
          {0, -1},
          {1, 0}
      },
      {
          {1, 1},
          {0, 1},
          {1, 0}
      }
  };

  int[][] f;
  boolean[][] d;

  boolean decide(int y, int x) {
    for (int j = 0; j < 4; ++j) {
      boolean done = true;
      for (int k = 0; k < 3; ++k) {
        int ny = y + ofs[j][k][0];
        int nx = x + ofs[j][k][1];
        done &= d[ny][nx];
      }
      if (done) {
        int v = 0;
        for (int i = 1; i < 3; ++i) {
          int ny = y + ofs[j][i][0];
          int nx = x + ofs[j][i][1];
          v += f[ny][nx];
          debug(f[ny][nx], "here", j);
        }
        debug(v);
        int ny = y + ofs[j][0][0];
        int nx = x + ofs[j][0][1];
        v -= f[ny][nx];
        if (v < 0) {
          return false;
        } else {
          d[y][x] = true;
          f[y][x] = v;
          debug(y, x, v);
        }
      }
    }
    return true;
  }

  boolean check(int y, int x) {
    for (int j = 0; j < 4; ++j) {
      boolean done = true;
      for (int k = 0; k < 3; ++k) {
        int ny = y + ofs[j][k][0];
        int nx = x + ofs[j][k][1];
        done &= d[ny][nx];
      }
      if (done) {
        int v = 0;
        int w = 0;
        for (int i = 1; i < 3; ++i) {
          int ny = y + ofs[j][i][0];
          int nx = x + ofs[j][i][1];
          v += f[ny][nx];
        }
        int ny = y + ofs[j][0][0];
        int nx = x + ofs[j][0][1];
        w += f[ny][nx];
        w += f[y][x];
        if (v != w) {
          return false;
        }
      }
    }
    return true;
  }

  void run() {
    int r, c;
    r = ni();
    c = ni();
    f = new int[r + 2][c + 2];
    d = new boolean[r + 2][c + 2];
    int n = ni();
    boolean ans = true;
    for (int i = 0; i < n; ++i) {
      int y = ni();
      int x = ni();
      int a = ni();
      if (d[y][x] && f[y][x] != a) {
        ans = false;
      }
      if (!ans) {
        break;
      }
      f[y][x] = a;
      d[y][x] = true;
      for (int j = 0; j < 4; ++j) {
        int cnt = 0;
        int sy = 0;
        int sx = 0;
        for (int k = 0; k < 3; ++k) {
          int ny = y + ofs[j][k][0];
          int nx = x + ofs[j][k][1];
          if (!d[ny][nx]) {
            ++cnt;
            sy = ny;
            sx = nx;
          }
        }
        if (cnt == 1) {
          debug(sy, sx);
          ans &= decide(sy, sx);
        }
      }
      ans &= check(y, x);
    }
    System.out.println(ans ? "Yes" : "No");
  }

  int ni() {
    return Integer.parseInt(sc.next());
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }

}
