// https://atcoder.jp/contests/abc139/submissions/7356715

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int n = sc.nextInt();
    List<Xy> l = new LinkedList<>();
    for (int i = 0; i < n; i++) {
      l.add(new Xy(sc.nextInt(), sc.nextInt()));
    }
    l.sort(Xy::hencom); // Sort by angle.

    long max2 = 0;
    for (int i = 0; i < n; i++) {
      int rx = 0;
      int ry = 0;
      for (int j = 0; j < n; j++) {
        rx += l.get(j).x;
        ry += l.get(j).y;
        max2 = Math.max(rx * rx + ry * ry, max2);
      }
      Xy r = l.remove(0);
      l.add(r);
    }
    System.out.println(Math.sqrt(max2));
  }

  static class Xy {
    int x;
    int y;

    Xy(int x, int y) {
      this.x = x;
      this.y = y;
    }

    public static int hencom(Xy s1, Xy s2) {
      return (int) Math.signum(Math.atan2(s1.y, s1.x) - Math.atan2(s2.y, s2.x));
    }

    public String toString() {
      return "[" + x + "," + y + "]";
    }
  }
}
