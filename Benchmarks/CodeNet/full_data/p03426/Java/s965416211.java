import java.util.HashMap;
import java.util.Scanner;

public class Main {

  static class Vec2 {
    int x, y;

    public Vec2(int x, int y) {
      this.x = x;
      this.y = y;
    }

    int diff(Vec2 other) {
      return Math.abs(x - other.x) + Math.abs(y - other.y);
    }

    @Override
    public boolean equals(Object obj) {
      if (obj.getClass() != Vec2.class)
        return false;
      Vec2 o = (Vec2) obj;
      return x == o.x && y == o.y;
    }

    @Override
    public int hashCode() {
      return x ^ (y << 16);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt(), w = sc.nextInt(), d = sc.nextInt();

    Vec2[] map = new Vec2[h * w + 1];
    int[][] A = new int[h][w];
    for (int i = 0; i < A.length; i++) {
      for (int j = 0; j < A[i].length; j++) {
        A[i][j] = sc.nextInt();
        map[A[i][j]] = new Vec2(i, j);
      }
    }

    HashMap<Integer, Vec2> cache = new HashMap<Integer, Vec2>();
    int q = sc.nextInt();
    for (int i = 0; i < q; i++) {
      int l = sc.nextInt(), r = sc.nextInt();
      int cost = 0;
      Vec2 pos = map[l];
      //System.out.println(l + " " + r);
      while (A[pos.x][pos.y] != r) {

        //System.out.println("Debug: " + (A[pos.x][pos.y] + d));
        cost += map[A[pos.x][pos.y] + d].diff(pos);
        pos = map[A[pos.x][pos.y] + d];
      }
      cache.put(l, new Vec2(r, cost));
      System.out.println(cost);
    }
  }

}
