
import java.util.Scanner;

public class Main {

  static long[][] dp;
  static boolean[][] isPresent;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] arr = new int[N];
    dp = new long[N + 1][N + 1];
    isPresent = new boolean[N + 1][N + 1];
    long[] prefixSum = new long[N];
    long sum = 0;
    for (int i = 0; i < N; i++) {
      arr[i] = scanner.nextInt();
      sum += arr[i];
      prefixSum[i] = sum;
    }
    System.out.println(solve(arr, prefixSum, 0, arr.length));
  }

  private static long solve(int[] arr, long[] prefixSum, int start, int end) {
    long solve = Long.MAX_VALUE;
//    System.out.println(start + ", " + end);
    if (start == end - 1) {
      solve = 0;
    } else {
      for (int i = start + 1; i < end; i++) {
        if (!isPresent[start][i]) {
          dp[start][i] = solve(arr, prefixSum, start, i);
          isPresent[start][i] = true;
        }
        if (!isPresent[i][end]) {
          dp[i][end] = solve(arr, prefixSum, i, end);
          isPresent[i][end] = true;
        }
        long solve1 = dp[start][i];
        long solve2 = dp[i][end];
        solve =
            Math.min(solve, solve1 + solve2 + prefixSum[end - 1] - prefixSum[start] + arr[start]);
      }
      dp[start][end] = solve;
      isPresent[start][end] = true;
    }
    return solve;
  }

}
