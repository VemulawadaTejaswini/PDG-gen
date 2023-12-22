import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K= scanner.nextInt();

    long count = 0;
    long[][] delta = new long[K][K];
    for (int i = 0; i < N; i++) {
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      char c = scanner.next().charAt(0);
      int p = x / K + y / K;

      delta[x % K][y % K]++;
      if (p % 2 == 0 && c == 'W' || p % 2 == 1 && c == 'B') {
        delta[x % K][y % K] -= 2;
        count++;
      }
    }

    for (int i = 0; i < K; i++) for (int j = 1; j < K; j++) delta[i][j] += delta[i][j - 1];
    for (int j = 0; j < K; j++) for (int i = 1; i < K; i++) delta[i][j] += delta[i - 1][j];

    long max = count;
    for (int i = 0; i <= K; i++) {
      for (int j = 0; j <= K; j++) {
        long c = count;
        if (i > 0) c += delta[i - 1][K - 1];
        if (j > 0) c += delta[K - 1][j - 1];
        if (i > 0 && j > 0) c -= 2 * delta[i - 1][j - 1];
        max = Math.max(max, c);
      }
    }

    System.out.println(max);
  }
}
