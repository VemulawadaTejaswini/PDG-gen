import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int[] x = new int[N];
    for (int i = 0; i < N; i++) {
      x[i] = scanner.nextInt();
    }
    int min = Integer.MAX_VALUE;
    for (int i = 0; i <= N - K; i++) {
      int j = i + K - 1;
      int d = Math.abs(x[j] - x[i]) + Math.min(Math.abs(x[i]), Math.abs(x[j]));
      if (d < min) min = d;
    }
    System.out.println(min);
  }
}
