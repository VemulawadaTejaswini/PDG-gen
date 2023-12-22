import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int[] a = new int[N];
    int s = 0;
    for (int i = 0; i < N; i++) {
      a[i] = scanner.nextInt();
      s += a[i];
    }
    int max = 0;
    for (int k = 1; k * k <= s; k++) {
      if (s % k == 0) {
        if (possible(a, K, k)) max = Math.max(max, k);
        if (possible(a, K, s / k)) max = Math.max(max, s / k);
      }
    }
    System.out.println(max);
  }

  private static boolean possible(int[] a, int K, int k) {
    int N = a.length;
    int[] b = new int[N];
    for (int i = 0; i < N; i++) b[i] = a[i] % k;
    Arrays.sort(b);
    for (int i = 1; i < N; i++) b[i] += b[i - 1];
    int i = b[N - 1] / k;
    return b[N - i - 1] <= K;
  }
}
