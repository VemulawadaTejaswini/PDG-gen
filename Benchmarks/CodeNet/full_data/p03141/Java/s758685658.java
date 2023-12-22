import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static int N;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    int[] A = new int[N];
    int[] B = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
      B[i] = sc.nextInt();
    }

    boolean[] done = new boolean[N];
    long sum = 0;
    for (int i = 0; i < N; i++) {
      if (i % 2 == 0) {
        sum += point(A, B, done);
      } else {
        sum -= point(B, A, done);
      }
    }
    System.out.println(sum);
  }

  static int point(int[] M, int[] E, boolean[] done) {
    // find my/enemey max
    int mmax = 0;
    int mi = -1;
    int emax = 0;
    int ei = -1;
    for (int i = 0; i < N; i++) {
      if (done[i]) continue;
      if (mmax < M[i]) {
        mi = i;
        mmax = M[i];
      }
      if (emax < E[i]) {
        ei = i;
        emax = E[i];
      }
    }
    if (mmax >= emax) {
      done[mi] = true;
      return M[mi];
    } else {
      done[ei] = true;
      return M[ei];
    }
  }
}
