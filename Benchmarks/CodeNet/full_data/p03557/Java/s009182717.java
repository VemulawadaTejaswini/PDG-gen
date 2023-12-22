import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] a = new int[N];
    int[] b = new int[N];
    int[] c = new int[N];
    for (int i = 0; i < N; i++) a[i] = scanner.nextInt();
    for (int i = 0; i < N; i++) b[i] = scanner.nextInt();
    for (int i = 0; i < N; i++) c[i] = scanner.nextInt();

    Arrays.sort(a);
    Arrays.sort(b);
    Arrays.sort(c);

    int total = 0;
    for (int i = 0; i < N; i++) {
      total += (findMaxSmaller(a, b[i]) + 1) * (N - findMinBigger(c, b[i]));
    }
    System.out.println(total);
  }

  public static int findMaxSmaller(int[] a, int k) {
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

  public static int findMinBigger(int[] a, int k) {
    int left = -1;
    int right = a.length;
    while (right - left > 1) {
      int mid = (left + right) / 2;
      if (a[mid] > k) {
        right = mid;
      } else {
        left = mid;
      }
    }
    return right;
  }
}
