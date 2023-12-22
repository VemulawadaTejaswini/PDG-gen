import java.util.*;

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
        long N = scanner.nextLong(), K = scanner.nextLong();
        scanner.nextLine();
        long[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
        long[] cnt = new long[60];
        for (int i = 59; i >= 0; i--) {
            long mask = 1L << i;
            for (long j: n) {
                if ((j & mask) > 0L) {
                    cnt[i]++;
                }
            }
        }

        // 0: same, 1: small
        long[][] dp = new long[60][2];
        for (long[] d: dp) {
            Arrays.fill(d, -1);
        }
        dp[59][0] = 0;
        for (int i = 58; i >= 0; i--) {
            long mask = 1L << i;
            long max = Math.max(cnt[i], N - cnt[i]);
            if (dp[i + 1][0] >= 0) {
                if ((K & mask) > 0L) {
                    dp[i][0] = dp[i + 1][0] + mask * (N - cnt[i]);
                    dp[i][1] = dp[i + 1][0] + mask * max;
                } else {
                    dp[i][0] = dp[i + 1][0] + mask * cnt[i];
                }
            }
            if (dp[i + 1][1] >= 0) {
                dp[i][1] = Math.max(dp[i][1], dp[i + 1][1] + mask * max);
            }
        }

        System.out.println(Math.max(dp[0][0], dp[0][1]));
    }

}
