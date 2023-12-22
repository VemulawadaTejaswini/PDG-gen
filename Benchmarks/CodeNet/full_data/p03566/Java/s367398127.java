import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] t = new int[N + 1];
    int[] v = new int[N + 2];

    for (int i = 0; i < N; i++) t[i + 1] = scanner.nextInt() * 2 + t[i];
    for (int i = 0; i < N; i++) v[i + 1] = scanner.nextInt() * 2;

    long dist = 0;

    long y = 0;
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= t[i] - t[i - 1]; j++) {
        long f = v[i];
        f = Math.min(f, v[i - 1] + j);
        f = Math.min(f, v[i + 1] + t[i] - t[i - 1] - j);
        dist += y + f;
        y = f;
      }
    }

    System.out.println(dist / 8.d);
  }
}
