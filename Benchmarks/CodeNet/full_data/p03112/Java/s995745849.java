import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int Q = scanner.nextInt();
    long[] a = new long[A];
    long[] b = new long[B];
    long[] q = new long[Q];
    long[] r = new long[Q];
    for (int i = 0; i < A; i++) a[i] = scanner.nextLong();
    for (int i = 0; i < B; i++) b[i] = scanner.nextLong();
    for (int i = 0; i < Q; i++) q[i] = scanner.nextLong();

    int[] na = new int[2];
    int[] nb = new int[2];
    for (int i = 0; i < Q; i++) {
      long x = q[i];
      na[0] = lowerBound(a, x);
      na[1] = na[0] - 1;
      if (na[0] == A) na[0]--;
      if (na[1] < 0) na[1]++;
      nb[0] = lowerBound(b, x);
      nb[1] = nb[0] - 1;
      if (nb[0] == B) nb[0]--;
      if (nb[1] < 0) nb[1]++;

      long min = Long.MAX_VALUE;
      for (int j : na) {
        for (int k : nb) {
          long dist;
          long left = Math.min(a[j], b[k]);
          long right = Math.max(a[j], b[k]);
          if (x <= left) {
            dist = right - x;
          } else if (x >= right) {
            dist = x - left;
          } else {
            dist = Math.min(x - left, right - x) + right - left;
          }
          min = Math.min(min, dist);
        }
      }
      r[i] = min;
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < Q; i++) sb.append(r[i]).append('\n');
    System.out.println(sb.toString());
  }

  private static int lowerBound(long[] a, long k) {
    int left = -1;
    int right = a.length;
    while (right - left > 1) {
      int mid = (left + right) / 2;
      if (k <= a[mid]) {
        right = mid;
      } else {
        left = mid;
      }
    }
    return right;
  }
}
