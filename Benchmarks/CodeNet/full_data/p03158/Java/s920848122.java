import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int Q = scanner.nextInt();

    long[] a = new long[N];
    for (int i = 0; i < N; i++) a[i] = scanner.nextInt();

    long[] mx = new long[(N - 1) / 2];
    for (int i = 1; i <= (N - 1) / 2; i++) {
      mx[i - 1] = (a[N - i - 1] + a[N - 2 * i - 1]) / 2 + 1;
    }
    reverse(mx);
    long[] sum = new long[N];
    sum[0] = a[0];
    for (int i = 1; i < N; i++) {
      sum[i] = sum[i - 1] + a[i];
    }
    long[] sum2 = new long[N];
    sum2[0] = N % 2 == 1 ? a[0] : 0;
    for (int i = 1; i < N; i++) {
      if ((N - i) % 2 == 1) {
        sum2[i] = sum2[i - 1] + a[i];
      } else {
        sum2[i] = sum2[i - 1];
      }
    }

    for (int i = 0; i < Q; i++) {
      int x = scanner.nextInt();
      int j = upperBound(mx, x);
      if (j < 0) System.out.println(sum[N - 1] - sum[N / 2 - 1]);
      else if (j == mx.length) System.out.println(sum2[N - 1]);
      else System.out.println(sum[N - 1] - sum[N / 2 + j] + sum2[(j + 1) * 2 - 1]);
    }
  }

  public static int upperBound(long[] a, long k) {
    int left = -1;
    int right = a.length;
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

  private static void reverse(long[] a) {
    int i = 0;
    int j = a.length - 1;
        while (i < j) {
          long tmp = a[i];
          a[i] = a[j];
          a[j] = tmp;
          i++;
          j--;
        }
  }
}
