import java.util.*;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 32MB stack
        Thread thread = new Thread(null, new Main(), "", 32 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.next());
        int M = Integer.parseInt(scanner.next());
        int[] cost = new int[M];
        int[] openable = new int[M];
        for (int i = 0; i < M; i++) {
            cost[i] = Integer.parseInt(scanner.next());
            int b = Integer.parseInt(scanner.next());
            for (int j = 0; j < b; j++) {
                openable[i] |= 1 << (Integer.parseInt(scanner.next()) - 1);
            }
        }

        int[][] dp = new int[M + 1][1 << N];
        for (int[] d: dp) {
            Arrays.fill(d, Integer.MAX_VALUE);
        }
        dp[0][0] = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < 1 << N; j++) {
                if (dp[i][j] != Integer.MAX_VALUE) {
                    dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j]);
                    dp[i + 1][j | openable[i]] =
                            Math.min(dp[i + 1][j | openable[i]], dp[i][j] + cost[i]);
                }
            }
        }

        System.out.println(dp[M][(1 << N) - 1] == Integer.MAX_VALUE ? -1 : dp[M][(1 << N) - 1]);
    }
}
