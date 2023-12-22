import java.math.BigInteger;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] arr = new int[N];
    long[] prefixSum = new long[N];
    long sum = 0;
    for (int i = 0; i < N; i++) {
      arr[i] = scanner.nextInt();
      sum += arr[i];
      prefixSum[i] = sum;
    }
    System.out.println(solve(arr, prefixSum, 0, arr.length));
  }

  private static BigInteger solve(int[] arr, long[] prefixSum, int start, int end) {
    BigInteger solve = new BigInteger("1000000000000000000000000000000000000000");
    if (start == end - 1) {
      solve = BigInteger.ZERO;
    } else {
      for (int i = start + 1; i < end; i++) {
        BigInteger solve1 = solve(arr, prefixSum, start, i);
        BigInteger solve2 = solve(arr, prefixSum, i, end);
        BigInteger add =
            solve1
                .add(solve2)
                .add(
                    new BigInteger(
                        String.valueOf(prefixSum[end - 1] - prefixSum[start] + arr[start])));

        solve = solve.min(add);
      }
    }
    return solve;
  }
}
