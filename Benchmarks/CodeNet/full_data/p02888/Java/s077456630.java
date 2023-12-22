import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] l = new int[N];
    for (int i = 0; i < N; i++) l[i] = scanner.nextInt();
    Arrays.sort(l);

    long count = 0;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < i; j++) {
        int k = lowerBound(l, j, i, l[i] - l[j]);
        count += i - k;
      }
    }
    System.out.println(count);
  }

  public static int lowerBound(int[] a, int left, int right, int k) {
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
