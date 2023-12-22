import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int N = scn.nextInt();

    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = scn.nextInt();
    }

    int[] L = new int[N + 1];
    L[0] = 0;
    L[1] = A[0];
    int[] R = new int[N + 1];
    R[N] = 0;
    R[N - 1] = A[N - 1];
    for (int i = 2; i < N; i++) {
      L[i] = gcd(L[i - 1], A[i - 1]);
    }
    for (int i = N - 2; i >= 0; i--) {
      R[i] = gcd(R[i + 1], A[i + 1]);
    }

    int max = 0;
    for (int i = 0; i < N; i++) {
      max = Math.max(gcd(L[i], R[i]), max);

    }
    System.out.println(max);

  }

  public static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }

}