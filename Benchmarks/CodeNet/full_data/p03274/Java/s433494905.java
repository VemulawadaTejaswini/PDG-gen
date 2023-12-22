import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int N = scanner.nextInt();
    int K = scanner.nextInt();
    long[] x = new long[N];
    for (int i = 0; i < N; i++) x[i] = scanner.nextInt();

    long min = 1_000_000_000;
    for (int left = 0; left + K - 1 < N; left++) {
      int right = left + K - 1;
      if (x[right] < 0) {
        min = Math.min(min, -x[left]);
      } else if (x[left] > 0) {
        min = Math.min(min, x[right]);
      } else {
        min = Math.min(min, Math.min(-x[left] * 2 + x[right], -x[left] + x[right] * 2));
      }
    }
    System.out.println(min);
  }
}
