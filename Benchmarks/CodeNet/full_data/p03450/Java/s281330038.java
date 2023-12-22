import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();

    UnionFind uf = new UnionFind(N);

    for (int i = 0; i < M; i++) {
      int left = scanner.nextInt() - 1;
      int right = scanner.nextInt() - 1;
      int dist = scanner.nextInt();

      int[] lr = uf.find(left);
      int[] rr = uf.find(right);

      if (lr[0] == rr[0]) {
        if (rr[1] - lr[0] != dist) {
          System.out.println("No");
          return;
        }
      } else {
        uf.union(left, right, dist);
      }
    }

    System.out.println("Yes");
  }

  static class UnionFind {
    private final int[] table;
    private final int[] delta;
    private final int[] ranks;

    public UnionFind(int size) {
      this.table = new int[size];
      this.delta = new int[size];
      this.ranks = new int[size];
      for (int i = 0; i < size; i++) {
        table[i] = i;
      }
    }

    public int[] find(int x) {
      if (table[x] != x) {
        int[] res = find(table[x]);
        table[x] = res[0];
        delta[x] += res[1];
      }
      return new int[] {table[x], delta[x]};
    }

    public void union(int x, int y, int dist) {
      int[] xRoot = find(x);
      int[] yRoot = find(y);
      if (xRoot[0] == yRoot[0]) return;

      if (ranks[xRoot[0]] < ranks[yRoot[0]]) {
        int[] tmp = xRoot;
        xRoot = yRoot;
        yRoot = tmp;
        dist = -dist;
      }

      table[yRoot[0]] = xRoot[0];
      delta[yRoot[0]] = xRoot[1] + dist - yRoot[1];
      if (ranks[xRoot[0]] == ranks[yRoot[0]]) ranks[xRoot[0]]++;
    }
  }
}
