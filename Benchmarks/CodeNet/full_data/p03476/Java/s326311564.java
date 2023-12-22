import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = 100_001;
    boolean[] isPrime = new boolean[N];
    for (int i = 2; i < N; i++) isPrime[i] = true;
    for (int i = 2; i < (int) Math.sqrt(N) + 1; i++) {
      if (isPrime[i]) for (int j = 2; i * j < N; j++) isPrime[i * j] = false;
    }

    int[] acc = new int[N];
    int sum = 0;
    for (int i = 3; i < N; i++) {
      if (isPrime[i] && isPrime[(i + 1) / 2]) sum++;
      acc[i] = sum;
    }

    int Q = scanner.nextInt();
    for (int i = 0; i < Q; i++) {
      int l = scanner.nextInt();
      int r = scanner.nextInt();
      System.out.println(acc[r] - acc[l - 1]);
    }
  }
}
