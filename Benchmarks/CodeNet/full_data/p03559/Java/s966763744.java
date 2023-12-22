import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] A = new int[N];
    int[] B = new int[N];
    int[] C = new int[N];
    for (int i = 0; i < N; i++) A[i] = scanner.nextInt();
    for (int i = 0; i < N; i++) B[i] = scanner.nextInt();
    for (int i = 0; i < N; i++) C[i] = scanner.nextInt();
    Arrays.sort(A);
    Arrays.sort(B);
    Arrays.sort(C);
    long res = 0;
    for (int i = 0; i < N; i++) {
      long a = upperBound(A, B[i]);
      long c = lowerBound(C, B[i]);
      res += (a + 1) * (N - c);
    }
    System.out.println(res);
  }

  public static int upperBound(int[] a, int k) {
    int left = -1;
    int right = a.length;
    while (right - left > 1) {
      int mid = (left + right) / 2;
      if (a[mid] < k) {
        left = mid;
      } else {
        right = mid;
      }
    }
    return left;
  }

  public static int lowerBound(int[] a, int k) {
    int left = -1;
    int right = a.length;
    while (right - left > 1) {
      int mid = (left + right) / 2;
      if (k < a[mid]) {
        right = mid;
      } else {
        left = mid;
      }
    }
    return right;
  }
}
