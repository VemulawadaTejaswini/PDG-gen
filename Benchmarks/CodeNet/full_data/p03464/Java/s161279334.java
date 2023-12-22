import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static int K;
  static long[] A;

  public static void main(String[] args) {
    K = sc.nextInt();
    A = new long[K];
    for (int i = 0; i < K; i++) {
      A[i] = sc.nextInt();
    }
    System.out.println(solve());
  }

  static String solve() {
    if (A[K - 1] != 2) return "-1";
    long min = 2;
    long max = 3;
    for (int i = K - 2; i >= 0; i--) {
      long l = (min + A[i] - 1) / A[i] * A[i];
      long r = max / A[i] * A[i];
      if (r < l) return "-1";
      min = l;
      max = r + A[i] - 1;
//      System.err.println(l + " " + r + " " + min + " " + max);
    }
    return min + " " + max;
  }

}
