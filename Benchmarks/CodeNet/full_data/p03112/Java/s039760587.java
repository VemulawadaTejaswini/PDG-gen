import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int Q = sc.nextInt();
    long[] S = new long[A];
    long[] T = new long[B];
    long[] X = new long[Q];
    for (int i = 0; i < A; i++) {
      S[i] = sc.nextLong();
    }
    for (int i = 0; i < B; i++) {
      T[i] = sc.nextLong();
    }
    for (int i = 0; i < Q; i++) {
      X[i] = sc.nextLong();
    }
    Main abc119D = new Main();
    abc119D.solve(S, T, X);
  }

  public void solve(long[] S, long[] T, long[] X) {
    ABC119DSolve abc119DSolve = new ABC119DSolve(S, T);
    for (long x : X) {
      System.out.println(abc119DSolve.solve(x));
    }
  }

  class ABC119DSolve {
    BinaryTree shrine;
    BinaryTree temple;
    long INF = (long) Math.pow(10, 18);

    public ABC119DSolve(long[] S, long[] T) {
      Arrays.sort(S);
      this.shrine = aveTree(S, 0, S.length);
      Arrays.sort(T);
      this.temple = aveTree(T, 0, T.length);
    }

    private BinaryTree aveTree(long[] x, int start, int end) {
      int center = start + ((end - start) / 2);
      BinaryTree root = new BinaryTree(x[center]);
      if (center > start) {
        root.setLeft(aveTree(x, start, center - 1));
      }
      if (end - center > 1) {
        root.setRight(aveTree(x, center + 1, end));
      }
      return root;
    }

    public long solve(long x) {
      long ans = INF;
      for (BinaryTree i : this.shrine.search(x)) {
        if (i == null) continue;
        for (BinaryTree j : this.temple.search(i.value)) {
          if (j == null) continue;
          long a = Math.abs(x - i.value) + Math.abs(i.value - j.value);
          if (ans > a) ans = a;
        }
      }
      for (BinaryTree i : this.temple.search(x)) {
        if (i == null) continue;
        for (BinaryTree j : this.shrine.search(i.value)) {
          if (j == null) continue;
          long a = Math.abs(x - i.value) + Math.abs(i.value - j.value);
          if (ans > a) ans = a;
        }
      }
      return ans;
    }
  }

  class BinaryTree {
    long value;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(long value) {
      this.value = value;
    }

    public void setLeft(BinaryTree left) {
      this.left = left;
    }

    public void setRight(BinaryTree right) {
      this.right = right;
    }

    public BinaryTree[] search(long k) {
      if (this.value >= k) {
        if (this.left == null) {
          BinaryTree[] ret = {null, this};
          return ret;
        } else {
          BinaryTree[] lefts = this.left.search(k);
          if (lefts[1] == null || lefts[1].value > this.value) {
            lefts[1] = this;
          }
          return lefts;
        }
      } else {
        if (this.right == null) {
          BinaryTree[] ret = {this, null};
          return ret;
        } else {
          BinaryTree[] rights = this.right.search(k);
          if (rights[0] == null || rights[0].value < this.value) {
            rights[0] = this;
          }
          return rights;
        }
      }
    }
  }
}

