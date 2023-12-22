import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int N = sc.nextInt();
    int M = sc.nextInt();
    boolean[] used = new boolean[M];
    UnionFind uf = new UnionFind(N + M);
    for (int i = 0; i < N; i++) {
      int K = Integer.parseInt(sc.next());
      for (int j = 0; j < K; j++) {
        int L = Integer.parseInt(sc.next()) - 1;
        uf.union(i, N + L);
        used[L] = true;
      }
    }
    int size = uf.size(0);
    for (int i = 0; i < M; i++) {
      if (!used[i]) ++size;
    }
    System.out.println(size == N + M ? "YES" : "NO");
  }

  static class UnionFind {
    int[] set;

    UnionFind(int n) {
      set = new int[n];
      Arrays.fill(set, -1);
    }

    void union(int a, int b) {
      int rtA = root(a);
      int rtb = root(b);
      if (rtA == rtb) {
        return;
      }
      set[rtA] += set[rtb];
      set[rtb] = rtA;
    }

    boolean find(int a, int b) {
      return root(a) == root(b);
    }

    int root(int a) {
      if (set[a] < 0) {
        return a;
      } else {
        set[a] = root(set[a]);
        return set[a];
      }
    }

    int size(int a) {
      return -set[root(a)];
    }
  }

}
