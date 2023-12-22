import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = in.nextInt();
    }
    int[] L = new int[N], R = new int[N];
    L[0] = A[0];
    R[N - 1] = A[N - 1];
    for (int i = 1; i < N; i++) {
      L[i] = gcd(L[i - 1], A[i]);
    }
    for (int i = N - 2; i >= 0; i--) {
      R[i] = gcd(R[i + 1], A[i]);
    }
    int ans = Math.max(R[1], L[N - 2]);
    for (int i = 1; i < N - 1; i++) {
      ans = Math.max(ans, gcd(L[i - 1], R[i + 1]));
    }
    System.out.println(ans);
  }

  public static int gcd(int x, int y) {
    return y == 0 ? x : gcd(y, x % y);
  }
}