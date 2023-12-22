import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int[] h = new int[N];
    for (int i = 0; i < N; i++) {
      h[i] = scanner.nextInt();
    }
    Arrays.sort(h);

    int diff = Integer.MAX_VALUE;
    for (int i = 0; i <= N - K; i++) {
      int d = h[i + K - 1] - h[i];
      diff = Math.min(d, diff);
    }
    System.out.println(diff);
  }
}
