import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    char[] s = scanner.next().toCharArray();

    int max = 0;
    int[] dp = new int[N + 1];
    for (int L = 1; L < N; L++) {
      Arrays.fill(dp, 0);
      for (int i = N - L; i >= 1; i--) {
        dp[i] = s[i - 1] == s[i + L - 1] ? dp[i + 1] + 1 : 0;
        max = Math.max(max, Math.min(dp[i], L));
      }
    }
    System.out.println(max);
  }
}
