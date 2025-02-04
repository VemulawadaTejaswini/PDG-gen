import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long m = sc.nextLong();
    long[] a = new long[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
    }

    Main abc150D = new Main();
    System.out.println(abc150D.solve(m, a));
  }

  public Long solve(long m, long[] a) {
    long multi = 1L;
    for (int i = 0; i < a.length; i++) {
      multi = multiplue(multi, a[i] / 2);
    }
    for (int i = 0; i < a.length; i++) {
      if (multi % a[i] == 0) {
        return 0L;
      }
    }
    long ret = 0L;
    for (int i = 1; i <= m / multi; i++) {
      if (i % 2 == 1) {
        ret += 1L;
      }
    }
    return ret;
  }

  private long multiplue(long a, long b) {
    if (a < b) {
      multiplue(b, a);
    }
    long ret = a;
    while (ret % b != 0) {
      ret += a;
    }
    return ret;
  }
}
