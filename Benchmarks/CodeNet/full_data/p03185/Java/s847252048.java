import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    long C = scanner.nextLong();
    int[] h = new int[N];
    for (int i = 0; i < N; i++) h[i] = scanner.nextInt();

    long[] dp = new long[N];
    for (int i = 1; i < N; i++) {
      int left = 0;
      int right = i;
      while (right - left > 1) {
        int mid = (left + right) / 2;
        long m1 = dp[mid] + cost(i, mid, h, C);
        long m2 = dp[mid - 1] + cost(i, mid - 1, h, C);
        if (m1 < m2) {
          left = mid;
        } else {
          right = mid;
        }
      }
      dp[i] = dp[left] + cost(i, left, h, C);
    }
    System.out.println(dp[N - 1]);
  }

  private static long cost(int i, int j, int[] h, long C) {
    return (long) (h[i] - h[j]) * (h[i] - h[j]) + C;
  }
}
