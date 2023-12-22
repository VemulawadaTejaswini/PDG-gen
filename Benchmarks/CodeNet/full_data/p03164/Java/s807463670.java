import java.util.Arrays;
import java.util.Scanner;

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
        int W = Integer.parseInt(scanner.next());
        int[][] n = new int[N][2];
        for (int i = 0; i < N; i++) {
            n[i][0] = Integer.parseInt(scanner.next());
            n[i][1] = Integer.parseInt(scanner.next());
        }
        long[][] dp = new long[N + 1][100001];
        for (int i = 0; i <= N; i++) {
            Arrays.fill(dp[i], Long.MAX_VALUE / 2);
        }
        dp[0][0] = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 100001; j++) {
                if (j + n[i][1] <= 100000) {
                    dp[i + 1][j + n[i][1]] = Math.min(dp[i + 1][j + n[i][1]], dp[i][j] + n[i][0]);
                }
                dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j]);
            }
        }

        long ans = 0;
        for (int j = 100000; j >= 0; j--) {
            if (dp[N][j] <= W) {
                ans = j;
                break;
            }
        }

        System.out.println(ans);
    }

}

