import java.util.Scanner;
public class Main {
  static final long LLINF = 1100000000000000000l;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int Q = sc.nextInt();
    long[] s = new long[A + 2];
    for (int i = 1; i <= A; i++) {
      s[i] = sc.nextLong();
    }
    s[0] = -LLINF;
    s[A + 1] = LLINF;
    long[] t = new long[B + 2];
    for (int i = 1; i <= B; i++) {
      t[i] = sc.nextLong();
    }
    t[0] = -LLINF;
    t[B + 1] = LLINF;
    long[] x = new long[Q];
    for (int i = 0; i < Q; i++) {
      x[i] = sc.nextLong();
    }

    for (int q = 0; q < Q; q++) {
      long ans = LLINF;
      int sl = lower_bound(s, x[q]);
      int tl = lower_bound(t, x[q]);
      for (int i = sl; i <= sl + 1; i++) {
        for (int j = tl; j <= tl + 1; j++) {
          ans = Math.min(ans, Math.abs(s[i] - x[q]) + Math.abs(t[j] - s[i]));
          ans = Math.min(ans, Math.abs(t[j] - x[q]) + Math.abs(s[i] - t[j]));
        }
      }
      System.out.println(ans);
    }
  }
  static int lower_bound(long[] a, long x) {
    int lb = 0, ub = a.length;
    while (ub - lb > 1) {
      int mid = (lb + ub) / 2;
      if (a[mid] <= x) lb = mid;
      else ub = mid;
    }
    return lb;
  }
}