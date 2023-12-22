import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int[] x = new int[N];
    for (int i = 0; i < N; i++) x[i] = scanner.nextInt();
    int min = 1_000_000_000;
    for (int left = 0, right = K - 1; right < N; left++, right++) {
      int time;
      if (x[left] >= 0) {
        time = x[right];
      } else if (x[right] <= 0) {
        time = -x[left];
      } else {
        time = Math.min(-x[left], x[right]) + x[right] - x[left];
      }
      min = Math.min(min, time);
    }
    System.out.println(min);
  }
}
