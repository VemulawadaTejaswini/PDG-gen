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
        long K = Integer.parseInt(scanner.next());
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(scanner.next());
        }

        int[] bitCnt = new int[60];
        for (long n: A) {
            for (int i = 0; i < 60; i++) {
                if ((n & (1L << i)) > 0) {
                    bitCnt[i]++;
                }
            }
        }

        long[][] dp = new long[60][2];
        boolean started = false;
        for (int i = 58; i >= 0; i--) {
            long mask = 1L << i;
            if (started) {
                dp[i][1] = Math.max(dp[i][1], dp[i + 1][1] + mask * (N - bitCnt[i]));
                dp[i][1] = Math.max(dp[i][1], dp[i + 1][1] + mask * bitCnt[i]);
            }
            if ((K & mask) > 0) {
                dp[i][0] = dp[i + 1][0] + mask * (N - bitCnt[i]);
                dp[i][1] = Math.max(dp[i][1], dp[i + 1][0] + mask * bitCnt[i]);
                started = true;
            } else {
                dp[i][0] = dp[i + 1][0] + mask * bitCnt[i];
            }
        }
        System.out.println(Math.max(dp[0][0], dp[0][1]));
    }
}

