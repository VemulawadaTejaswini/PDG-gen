import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int L = scanner.nextInt();

    UnionFind ufk = new UnionFind(N);
    UnionFind ufl = new UnionFind(N);
    for (int i = 0; i < K; i++) {
      int p = scanner.nextInt() - 1;
      int q = scanner.nextInt() - 1;
      ufk.union(p, q);
    }
    for (int i = 0; i < L; i++) {
      int p = scanner.nextInt() - 1;
      int q = scanner.nextInt() - 1;
      ufl.union(p, q);
    }
    int[][] count = new int[N][N];
    for (int i = 0; i < N; i++) count[ufk.find(i)][ufl.find(i)]++;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) sb.append(count[ufk.find(i)][ufl.find(i)]).append(' ');
    System.out.println(sb.toString());
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

    public void union(int x, int y) {
      int xRoot = find(x);
      int yRoot = find(y);
      if (xRoot == yRoot) return;

      if (ranks[xRoot] < ranks[yRoot]) {
        int tmp = xRoot;
        xRoot = yRoot;
        yRoot = tmp;
      }

      table[yRoot] = xRoot;
      sizes[xRoot] += sizes[yRoot];
      if (ranks[xRoot] == ranks[yRoot]) ranks[xRoot]++;
    }
  }
}
