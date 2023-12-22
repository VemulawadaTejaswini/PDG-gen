import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N + 1];
    int[] B = new int[N];
    for (int i = 0; i < A.length; i++) {
      A[i] = sc.nextInt();
    }
    for (int i = 0; i < B.length; i++) {
      B[i] = sc.nextInt();
    }

    long ans = 0;
//    for (int i = 0; i < N; i++) {
//      int life = B[i] - A[i];
//      if (life >= 0) {
//        ans += A[i];
//        if (A[i + 1] >= life) {
//          ans += life;
//          A[i + 1] -= life;
//        } else {
//          ans += A[i + 1];
//          A[i + 1] = 0;
//        }
//      } else {
//        ans += B[i];
//      }
//    }

    for (int i = 0; i < N; i++) {
      if (B[i] > A[i]) {
        B[i] -= A[i];
        ans += A[i];
        ans += Math.min(A[i+1], B[i]);
        A[i+1] -= Math.min(A[i+1], B[i]);
      } else {
        ans += B[i];
      }
    }
    System.out.println(ans);
  }
}