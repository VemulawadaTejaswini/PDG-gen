import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    long x = scanner.nextInt();
    long[] a = new long[N];
    for (int i = 0; i < N; i++) a[i] = scanner.nextInt();

    long count = 0;
    for (int i = 0; i < N; i += 2) {
      count += Math.max(0, a[i] - x);
      a[i] = Math.min(a[i], x);
    }
    for (int i = 1; i < N; i += 2) {
      long c;
      if (i + 1 < N) c = Math.max(0, Math.max(a[i - 1] + a[i], a[i] + a[i + 1]) - x);
      else c = Math.max(0, a[i - 1] + a[i] - x);
      count += c;
    }
    System.out.println(count);
  }
}
