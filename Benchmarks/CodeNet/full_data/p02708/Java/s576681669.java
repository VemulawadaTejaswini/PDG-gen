import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long M = 1_000_000_007;
    int N = scanner.nextInt();
    long K = scanner.nextInt();
    long res = 0;
    for (long k = K; k <= N + 1; k++) {
      res += (k * (N - k + 1) % M + 1) % M;
      res %= M;
    }
    System.out.println(res);
  }
}
