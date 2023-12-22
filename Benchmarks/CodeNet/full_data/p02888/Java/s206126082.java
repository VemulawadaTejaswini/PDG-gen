import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] L = new int[N];
    for (int i = 0; i < N; i++) L[i] = scanner.nextInt();
    Arrays.sort(L);
    long res = 0;
    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j < N; j++) {
        int c = upperBound(L, L[i] + L[j]);
        res += Math.max(0, c - j);
      }
    }
    System.out.println(res);
  }

  private static int upperBound(int[] a, int k) {
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
}
