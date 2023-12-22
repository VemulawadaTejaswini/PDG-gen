import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int K = scanner.nextInt();
    if (possible(N, M, K)) System.out.println("Yes");
    else System.out.println("No");
  }

  private static boolean possible(int N, int M, int K) {
    for (int x = 0; x <= N; x++) {
      int a = N - x * 2;
      int b = K - M * x;
      if (a == 0) return b == 0;
      if (b % a == 0 && b / a >= 0 && b / a <= M) return true;
    }
    return false;
  }
}
