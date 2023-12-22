import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] a = new int[N];
    int[] b = new int[N];

    for (int i = 0; i < N; i++) a[i] = scanner.nextInt();
    for (int i = 0; i < N; i++) b[i] = scanner.nextInt();

    int res = 0;

    for (int k = 0; k < 30; k++) {
      int m = (1 << (k + 1)) - 1;

      int[] br = new int[N];
      for (int i = 0; i < N; i++) br[i] = b[i] & m;
      Arrays.sort(br);

      int t = 1 << k;
      long count = 0;
      for (int j = 1; j < 4; j += 2) {
        for (int i = 0; i < N; i++) {
          int ar = a[i] & m;
          int left = find(br, t * j - ar);
          int right = find(br, t * (j + 1) - ar);
          count += right - left;
        }
      }
      if (count % 2 == 1) res += 1 << k;
    }

    System.out.println(res);
  }

  private static int find(int[] b, int t) {
    int left = -1;
    int right = b.length;
    while (right - left > 1) {
      int mid = (left + right) / 2;
      if (b[mid] < t) {
        left = mid;
      } else {
        right = mid;
      }
    }
    return left;
  }
}
