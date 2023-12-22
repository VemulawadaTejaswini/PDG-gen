import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int count = 0;
    int[][] delta = new int[K][K];
    for (int i = 0; i < N; i = Math.incrementExact(i)) {
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      char c = scanner.next().charAt(0);
      int p = Math.addExact(x / K, y / K);
      delta[x % K][y % K] = Math.incrementExact(delta[x % K][y % K]);
      if ((p % 2 == 0 && c == 'W') || (p % 2 == 1 && c == 'B')) {
        delta[x % K][y % K] = Math.subtractExact(delta[x % K][y % K], 2);
        count = Math.incrementExact(count);
      }
    }
    for (int i = 0; i < K; i = Math.incrementExact(i)) for (int j = 1; j < K; j = Math.incrementExact(j)) delta[i][j] = Math.addExact(delta[i][j], delta[i][j - 1]);
    for (int j = 0; j < K; j = Math.incrementExact(j)) for (int i = 1; i < K; i = Math.incrementExact(i)) delta[i][j] = Math.addExact(delta[i][j], delta[i - 1][j]);
    int max = count;
    for (int i = 0; i <= K; i = Math.incrementExact(i)) {
      for (int j = 0; j <= K; j = Math.incrementExact(j)) {
        int c = count;
        if (i > 0)
          c = Math.addExact(c, delta[i - 1][K - 1]);
        if (j > 0)
          c = Math.addExact(c, delta[K - 1][j - 1]);
        if (i > 0 && j > 0)
          c = Math.subtractExact(c, Math.multiplyExact(delta[i - 1][j - 1], 2));
        max = Math.max(max, c);
      }
    }
    System.out.println(max);
  }
}
