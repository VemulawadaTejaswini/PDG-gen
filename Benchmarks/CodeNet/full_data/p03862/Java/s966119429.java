import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    long x = scanner.nextInt();
    long[] a = new long[N];
    for (int i = 0; i < N; i++) a[i] = scanner.nextInt();

    long count = 0;
    for (int i = 0; i < N; i++) {
      count += Math.max(0, a[i] - x);
      a[i] = Math.min(a[i], x);
    }
    for (int i = 0; i < N - 1; i++) {
      if (a[i] + a[i + 1] > x) {
        long delta = a[i] + a[i + 1] - x;
        count += delta;
        a[i + 1] -= delta;
      }
    }
    System.out.println(count);
  }
}
