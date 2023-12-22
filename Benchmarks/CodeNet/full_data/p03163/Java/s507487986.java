import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

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
        int[][] dp = new int[N + 1][W + 1];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < W; j++) {
                if (j + n[i][0] <= W) {
                    dp[i + 1][j + n[i][0]] = Math.max(dp[i + 1][j + n[i][0]], dp[i][j] + n[i][1]);
                }
                dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j]);
            }
        }

        System.out.println(dp[N][W]);
    }

}

