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
        int N = Integer.parseInt(scanner.nextLine());
        long[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
        int[][] bits = new int[N + 1][63];
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            long n = nums[i];
            for (int j = 0; j <= 62; j++) {
                if ((n & (1L << j)) > 0) {
                    bits[i + 1][j] = bits[i][j] + 1;
                    max = Math.max(max, j);
                } else {
                    bits[i + 1][j] = bits[i][j];
                }
            }

        }

        long ans = 0;
        for (int i = 0; i < nums.length; i++) {
            long n = nums[i];
            for (int j = 0; j <= max; j++) {
                int cnt = bits[N][j] - bits[i + 1][j];
                if ((n & (1L << j)) > 0) {
                    ans = (ans + ((((1L << j) % MOD) * (N - i - 1 - cnt)) % MOD)) % MOD;
                } else {
                    ans = (ans + ((((1L << j) % MOD) * cnt) % MOD)) % MOD;
                }
            }
        }

        System.out.println(ans);
    }

}
