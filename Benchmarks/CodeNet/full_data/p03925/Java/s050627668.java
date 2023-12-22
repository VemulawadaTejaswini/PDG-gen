import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int N = sc.nextInt();
    int Q = sc.nextInt();
    PriorityQueue<E> q = new PriorityQueue<>();
    for (int i = 0; i < Q; i++) {
      int A = Integer.parseInt(sc.next());
      int B = Integer.parseInt(sc.next());
      int C = Integer.parseInt(sc.next());
      q.add(new E(A, B, C, false));
    }
    UnionFind uf = new UnionFind(N);
    int add = 0;
    long ans = 0;
    while (add < N - 1) {
      E e = q.poll();
      if (!uf.find(e.f, e.t)) {
        uf.union(e.f, e.t);
//        System.out.println(e.f + " " + e.t + " " + e.c + " " + add);
        ans += e.c;
        ++add;
      }
      int nf = (e.f + (e.rev ? 0 : 1)) % N;
      int nt = (e.t + (e.rev ? 1 : 0)) % N;
      q.add(new E(nf, nt, e.c + 1, !e.rev));
    }
    System.out.println(ans);
  }

  static class E implements Comparable<E> {
    int f, t, c;
    boolean rev;

    public E(int f, int t, int c, boolean rev) {
      this.f = f;
      this.t = t;
      this.c = c;
      this.rev = rev;
    }

    @Override
    public int compareTo(E o) {
      return Integer.compare(this.c, o.c);
    }
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
