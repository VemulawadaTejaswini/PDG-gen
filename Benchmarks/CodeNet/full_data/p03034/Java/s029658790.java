import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] s = new int[N];
    for (int i = 0; i < N; i++) s[i] = scanner.nextInt();
    long[] t = new long[N];
    for (int i = 0; i < N; i++) t[i] = (long) s[i] + s[N - i - 1];

    long[] u = new long[N];
    long[] v = new long[N];
    for (int i = 1; i < N; i++) {
      for (int j = 1; (long) j * j <= i; j++) {
        if (i % j == 0) {
          if (i >= N / 2 && (N - 1) % j == 0) continue;
          u[j] += t[i];
          v[j] = Math.max(v[j], u[j]);
          if (i / j != j) {
            u[i / j] += t[i];
            v[i / j] = Math.max(v[i / j], u[i / j]);
          }
        }
      }
    }
    long max = 0;
    for (int i = 0; i < N; i++) max = Math.max(max, v[i]);
    System.out.println(max);
  }
}
