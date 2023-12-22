import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long N = scanner.nextLong();

    long min = 10_000_000_000_000L;
    for (long i = 1; i * i <= N; i++) {
      if (N % i == 0) {
        long j = N / i;
        min = Math.min(min, i + j - 2);
      }
    }
    System.out.println(min);
  }
}
