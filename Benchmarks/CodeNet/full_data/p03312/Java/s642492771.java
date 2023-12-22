import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) A[i] = scanner.nextInt();
    long[] csum = new long[N];
    csum[0] = A[0];
    for (int i = 1; i < N; i++) csum[i] = csum[i - 1] + A[i];

    int i = 0;
    int j = 2;
    long min = csum[N - 1];
    for (int k = 1; k < N - 2; k++) {
      if (j == k) j++;
      while (i + 1 < k && Math.abs(csum[k] - csum[i] * 2) > Math.abs(csum[k] - csum[i + 1] * 2)) {
        i++;
      }
      long ck = csum[N - 1] + csum[k];
      while (j < N - 2 && Math.abs(ck - csum[j] * 2) > Math.abs(ck - csum[j + 1] * 2)) {
        j++;
      }
      min = Math.min(min, diff(csum[i], csum[k] - csum[i], csum[j] - csum[k], csum[N - 1]- csum[j]));
    }
    System.out.println(min);
  }

  private static long diff(long a, long b, long c, long d) {
    return max(a, b, c, d) - min(a, b, c, d);
  }

  private static long max(long a, long b, long c, long d) {
    return Math.max(a, Math.max(b, Math.max(c, d)));
  }

  private static long min(long a, long b, long c, long d) {
    return Math.min(a, Math.min(b, Math.min(c, d)));
  }
}
