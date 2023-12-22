import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    long M = scanner.nextInt();
    long V = scanner.nextInt();
    int P = scanner.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) A[i] = scanner.nextInt();
    Arrays.sort(A);
    reverse(A);
    long[] cum = new long[N];
    for (int i = 1; i < N; i++) cum[i] = cum[i - 1] + A[i - 1];

    int left = 0;
    int right = N;
    while (right - left > 1) {
      int mid = (right + left) / 2;
      if (possible(N, M, V, P, A, cum, mid)) {
        left = mid;
      } else {
        right = mid;
      }
    }
    System.out.println(right);
  }

  private static boolean possible(int N, long M, long V, int P, int[] A, long[] cum, int i) {
    if (i < P) return true;
    if (A[i] + M < A[P - 1]) return false;
    return M * (P - 1 + N - i) + (i - P + 1) * (A[i] + M) - (cum[i] - cum[P - 1]) >= M * V;
  }

  private static void reverse(int[] a) {
    int i = 0;
    int j = a.length - 1;
    while (i < j) {
      int tmp = a[i];
      a[i] = a[j];
      a[j] = tmp;
      i++;
      j--;
    }
  }
}
