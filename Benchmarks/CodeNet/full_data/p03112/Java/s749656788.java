import java.util.Arrays;
import java.util.Scanner;

public class ABC119D {
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
    long INF = (int) Math.pow(10, 10);

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
      for(long i: this.shrine.search(x)) {
        for(long j: this.temple.search(i)) {
          long a = Math.abs(x-i) + Math.abs(i-j);
          if(ans > a) ans = a;
        }
      }
      for(long i: this.temple.search(x)){
        for(long j: this.shrine.search(i)) {
          long a = Math.abs(x-i) + Math.abs(i-j);
          if(ans > a) ans = a;
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

    public long[] search(long k) {
      if(this.value >= k ){
        if(this.left == null) {
          long[] ret = {this.value};
          return ret;
        } else if(this.left.value < k) {
          long[] ret = {this.left.value, this.value};
          return ret;
        } else {
          return this.left.search(k);
        }
      } else {
        if(this.right == null) {
          long[] ret = {this.value};
          return ret;
        } else if(this.right.value > k){
          long[] ret = {this.value, this.right.value};
          return ret;
        } else {
          return this.right.search(k);
        }
      }
    }
  }
}
