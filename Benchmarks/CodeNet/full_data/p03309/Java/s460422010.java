import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    long sum = 0;
    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = scanner.nextInt() - (i + 1);
      sum += a[i];
    }

    Arrays.sort(a);
    long m1 = compute(a, a[N / 2]);
    long m2 = compute(a, a[N / 2 + 1]);
    if (m1 < m2) {
      System.out.println(m1);
    } else {
      System.out.println(m2);
    }
  }

  public static long compute(int[] a, long b) {
    long r = 0;
    for (int i = 0; i < a.length; i++) {
      r += Math.abs(a[i] - b);
    }
    return r;
  }
}
