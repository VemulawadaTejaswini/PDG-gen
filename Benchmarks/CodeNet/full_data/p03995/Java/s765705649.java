import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
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

  boolean decide(int y, int x) {
    for (int j = 0; j < 4; ++j) {
      boolean done = true;
      for (int k = 0; k < 3; ++k) {
        int ny = y + ofs[j][k][0];
        int nx = x + ofs[j][k][1];
        Point p = new Point();
        p.x = nx;
        p.y = ny;
        done &= d.contains(p);
      }
      if (done) {
        int v = 0;
        for (int i = 1; i < 3; ++i) {
          int ny = y + ofs[j][i][0];
          int nx = x + ofs[j][i][1];
          Point p = new Point();
          p.x = nx;
          p.y = ny;
          v += f.get(p);
          debug(f.get(p), "here", j);
        }
        debug(v);
        int ny = y + ofs[j][0][0];
        int nx = x + ofs[j][0][1];
        Point p = new Point();
        p.x = nx;
        p.y = ny;
        v -= f.get(p);
        if (v < 0) {
          return false;
        } else {
          Point atom = new Point();
          atom.x = x;
          atom.y = y;
          d.add(atom);
          f.put(atom, v);
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
        Point p = new Point();
        p.x = nx;
        p.y = ny;
        done &= d.contains(p);
      }
      if (done) {
        int v = 0;
        int w = 0;
        for (int i = 1; i < 3; ++i) {
          int ny = y + ofs[j][i][0];
          int nx = x + ofs[j][i][1];
          Point p = new Point();
          p.x = nx;
          p.y = ny;
          v += f.get(p);
        }
        int ny = y + ofs[j][0][0];
        int nx = x + ofs[j][0][1];
        Point p = new Point();
        p.x = nx;
        p.y = ny;
        Point atom = new Point();
        atom.x = x;
        atom.y = y;
        w += f.get(p);
        w += f.get(atom);
        if (v != w) {
          return false;
        }
      }
    }
    return true;
  }


  HashMap<Point, Integer> f = new HashMap<>();
  HashSet<Point> d = new HashSet<>();

  void run() {
    int r, c;
    r = ni();
    c = ni();
    int n = ni();
    boolean ans = true;
    for (int i = 0; i < n; ++i) {
      int y = ni();
      int x = ni();
      int a = ni();
      Point p = new Point();
      p.x = x;
      p.y = y;
      if (d.contains(p) && f.get(p) != a) {
        ans = false;
      }
      if (!ans) {
        break;
      }
      f.put(p, a);
      d.add(p);
      for (int j = 0; j < 4; ++j) {
        int cnt = 0;
        int sy = 0;
        int sx = 0;
        for (int k = 0; k < 3; ++k) {
          int ny = y + ofs[j][k][0];
          int nx = x + ofs[j][k][1];
          Point np = new Point();
          np.x = nx;
          np.y = ny;
          if (!d.contains(np)) {
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
