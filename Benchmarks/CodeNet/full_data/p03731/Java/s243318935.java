 import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int T = scanner.nextInt();

    long total = (long) N * T;
    long prev = -1;
    for (int i = 0; i < N; i++) {
      int t = scanner.nextInt();
      if (prev >= 0 && (t - prev) < T) {
        total -= T - (t - prev);
      }
      prev = t;
    }
    System.out.println(total);
  }
}
