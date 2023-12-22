import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    // int N = Integer.parseInt(scanner.nextLine());
    // int N = scanner.nextInt(), M = scanner.nextInt();
    // scanner.nextLine();
    // int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    // long[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
    static void solve(Scanner scanner) {
        String s = scanner.nextLine();
        int N = s.length();
        long[][] dp = new long[N + 1][2];
        dp[0][0] = 1;

        for (int i = 0; i < N; i++) {
            int n = s.charAt(i) - '0';
            dp[i + 1][1] += 3 * dp[i][1];
            dp[i + 1][1] %= MOD;
            if (n == 1) {
                dp[i + 1][0] += 2 * dp[i][0];
                dp[i + 1][0] %= MOD;
                dp[i + 1][1] += dp[i][0];
                dp[i + 1][1] %= MOD;
            } else {
                dp[i + 1][0] = dp[i][0];
            }
        }

        System.out.println((dp[N][0] + dp[N][1]) % MOD);
    }

}
