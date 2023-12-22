import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    long[] s = new long[N];
    for (int i = 0; i < N; i++) s[i] = scanner.nextInt();

    long[] u = new long[N];
    long[] v = new long[N];
    for (int i = 1; i < N; i++) {
      long t = s[i] + s[N - i - 1];
      for (int j = 1; (long) j * j <= i; j++) {
        if (i % j == 0) {
          if ((i < N / 2 || (N - 1) % j != 0) && N - i - 1 > j) {
            u[j] += t;
            v[j] = Math.max(v[j], u[j]);
          }
          if (i != j * j) {
            int k = i / j;
            if ((i < N / 2 || (N - 1) % k != 0) && N - i - 1 > k) {
              u[k] += t;
              v[k] = Math.max(v[k], u[k]);
            }
          }
        }
      }
    }
    long max = 0;
    for (int i = 0; i < N; i++) max = Math.max(max, v[i]);
    System.out.println(max);
  }
}
