import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();


    UnionFind uf = new UnionFind(N);
    HashMap<Integer, PointSet> map = new HashMap<>();
    for (int i = 0; i < N; i++) {
      PointSet ps = new PointSet(i);
      map.put(i, ps);
    }

    for (int i = 0; i < M; i++) {
      int left = scanner.nextInt() - 1;
      int right = scanner.nextInt() - 1;
      int dist = scanner.nextInt();

      if(uf.find(left) == uf.find(right)) {
        int g = uf.find(left);
        int d = map.get(g).get(right).pos - map.get(g).get(left).pos;
        if (d != dist) {
          System.out.println("No");
          return;
        }
      } else {
        int lg = uf.find(left);
        int[] newGroups = uf.union(left, right);
        int fg = newGroups[1];
        int tg = newGroups[0];

        int from = left, to = right, d = dist;
        if (lg != fg) {
          from = right;
          to = left;
          d = -dist;
        }

        int newPos = map.get(tg).get(to).pos - d;
        int oldPos = map.get(fg).get(from).pos;
        int delta = newPos - oldPos;
        for (Point p : map.get(fg).list) {
          p.pos += delta;
        }
        map.get(tg).addAll(map.get(fg));
      }
    }

    System.out.println("Yes");
  }

  static class UnionFind {
    private final int[] table;
    private final int[] ranks;
    private final int[] sizes;

    public UnionFind(int size) {
      this.table = new int[size];
      this.ranks = new int[size];
      this.sizes = new int[size];
      for (int i = 0; i < size; i++) {
        table[i] = i;
        sizes[i] = 1;
      }
    }

    public int find(int x) {
      if (table[x] != x) {
        table[x] = find(table[x]);
      }
      return table[x];
    }

    public int[] union(int x, int y) {
      int xRoot = find(x);
      int yRoot = find(y);
      if (xRoot == yRoot) return null;

      if (ranks[xRoot] < ranks[yRoot]) {
        int tmp = xRoot;
        xRoot = yRoot;
        yRoot = tmp;
      }

      table[yRoot] = xRoot;
      sizes[xRoot] += sizes[yRoot];
      if (ranks[xRoot] == ranks[yRoot]) ranks[xRoot]++;
      return new int[]{xRoot, yRoot};
    }
  }

  static class PointSet {
    List<Point> list = new ArrayList<>();
    HashMap<Integer, Point> map = new HashMap<>();

    public PointSet(int id) {
      Point p = new Point(id);
      list.add(p);
      map.put(id, p);
    }

    public void addAll(PointSet set) {
      list.addAll(set.list);
      map.putAll(set.map);
      Collections.sort(list);
    }

    public Point get(int id) {
      return map.get(id);
    }
  }

  static class Point implements Comparable<Point> {
    public final int id;
    public int pos;

    Point(int id) {
      this.id = id;
    }

    @Override public int compareTo(Point o) {
      return pos - o.pos;
    }
  }
}
