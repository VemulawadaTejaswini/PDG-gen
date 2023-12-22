import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) a[i] = scanner.nextInt();

    Arrays.sort(a);
    boolean[] used = new boolean[N];
    int cnt = 0;
    for (int i = N - 1; i >= 0; i--) {
      if (used[i]) continue;
      int b = (Integer.highestOneBit(a[i]) << 1) - a[i];
      int j = upperBound(a, -1, i, b);
      if (j >= 0 && a[j] == b) {
        cnt++;
        used[j] = true;
      }
    }
    System.out.println(cnt);
  }

  public static int upperBound(int[] a, int left, int right, int k) {
    while (right - left > 1) {
      int mid = (left + right) / 2;
      if (a[mid] <= k) {
        left = mid;
      } else {
        right = mid;
      }
    }
    return left;
  }
}
