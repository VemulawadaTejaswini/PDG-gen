import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static Node root;
  static int N;
  static int left, right, v;

  public static void main(String[] args) {
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N - 1; i++) {
      A[i] = Integer.parseInt(sc.next());
    }
    int M = sc.nextInt();
    if (M > 1) return;
    A[N - 1] = sc.nextInt();
    root = new Node(0, N);
    add(N - 1, N, A[N - 1]);
    for (int i = N - 2; i > 0; i--) {
      add(i + 2, N, -A[i + 1]);
      Pos max = max(i + 1, N);
//      System.out.println(i + " " + max.idx + " " + max.val);
      add(i, i + 1, -max.val + A[i]);
    }
    System.out.println(max(2, N).val + A[0] - A[1]);
  }

  static void add(int l, int r, int val) {
    left = l;
    right = r;
    v = val;
    root.add();
  }

  static Pos max(int l, int r) {
    left = l;
    right = r;
    return root.max();
  }

  static class Node {
    Node l, r;
    int all;
    int lower, upper;
    Pos mp;

    Node(int lower, int upper) {
      this.lower = lower;
      this.upper = upper;
      if (upper - lower > 1) {
        int mid = (lower + upper) / 2;
        this.l = new Node(lower, mid);
        this.r = new Node(mid, upper);
      }
      all = 0;
    }

    void add() {
      if (left <= lower && upper <= right) {
        this.all += v;
        if (mp != null) mp.val += v;
        return;
      }
      if (right <= lower || upper <= left) return;
      if (left < l.upper) {
        l.add();
        mp = null;
      }
      if (r.lower < right) {
        r.add();
        mp = null;
      }
    }

    Pos max() {
      if (right <= lower || upper <= left) return null;
      if (l == null && r == null) {
        return new Pos(lower, all);
      }
      if (mp != null && left <= lower && upper <= right) {
        return mp;
      }
      Pos p1 = l.max();
      Pos p2 = r.max();
      Pos ret;
      if (p1 == null) {
        ret = p2;
      } else if (p2 == null) {
        ret = p1;
      } else {
        ret = p1.val > p2.val ? p1 : p2;
      }
      ret.val += all;
      mp = ret;
      return new Pos(mp.idx, mp.val);
    }

  }

  static class Pos {
    int idx, val;

    public Pos(int idx, int val) {
      this.idx = idx;
      this.val = val;
    }
  }

}


