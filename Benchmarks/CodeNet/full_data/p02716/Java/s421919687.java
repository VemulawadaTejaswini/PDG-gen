import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) A[i] = scanner.nextInt();

    long[] csum = new long[N + 1];
    csum[1] = A[0];
    for (int i = 3; i <= N; i += 2) {
      csum[i] = csum[i - 2];
      csum[i] += A[i - 1];
    }
    long[] dp1 = new long[N + 1];
    long[] dp2 = new long[N + 1];
    for (int i = 2; i <= N; i++) {
      if (i % 2 == 0) {
        dp2[i] = Math.max(dp2[i - 2] + A[i - 1], csum[i - 1]);
      } else {
        dp1[i] = Math.max(dp1[i - 2] + A[i - 1], dp2[i - 1]);
      }
    }
    System.out.println(N % 2 == 1 ? dp1[N] : dp2[N]);
  }
}
