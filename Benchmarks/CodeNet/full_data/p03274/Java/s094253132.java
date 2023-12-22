import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int[] x = new int[N];
    int s = -1;
    for (int i = 0; i < N; i++) {
      x[i] = scanner.nextInt();
      if (x[i] >= 0 && s < 0) s = i;
    }
    long min = Long.MAX_VALUE;
    for (int i = s - K; i <= s; i++) {
      int j = i + K - 1;
      if (i < 0 || j >= N) continue;
      final long d;
      if (i == s - K) {
        d = -x[i];
      } else if (i == s) {
        d = x[j];
      } else {
        d = (long) x[j] - x[i] + Math.min(-x[i], x[j]);
      }
      if (d < min) min = d;
    }
    System.out.println(min);
  }
}
