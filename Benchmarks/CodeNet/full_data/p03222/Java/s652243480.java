import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        final long mod = 1_000_000_007;
        final int H = in.nextInt();
        final int W = in.nextInt();
        final int K = in.nextInt();
        final long[] dp = new long[W];
        final long[] cl = new long[W]; // current line. reset every iteration.
        dp[0] = 1;
        for (int h = 0; h < H; h++) {
            for (int i = 0; i < W; i++) {
                cl[i] = 0;
            }
            for (int i = 0; i < W; i++) {
                int leftOff = count(i - 1, false);
                int leftOn = count(i - 1, true);
                int rightOff = count(W - i - 2, false);
                int rightOn = count(W - i - 2, true);
                if (dp[i] > 0) {
                    cl[i] += dp[i] * (leftOff * rightOff);
                    cl[i] %= mod;
                }
                if (i - 1 >= 0 && dp[i - 1] > 0) {
                    cl[i] += dp[i - 1] * (leftOn * rightOff);
                    cl[i] %= mod;
                }
                if (i + 1 < W && dp[i + 1] > 0) {
                    cl[i] += dp[i + 1] * (leftOff * rightOn);
                    cl[i] %= mod;
                }
            }
            for (int i = 0; i < W; i++) {
                dp[i] = cl[i];
            }
            // System.out.println(Arrays.toString(dp));
        }
        System.out.println(dp[K - 1]);
    }

    private static int count(int len, boolean on) {
        if (len <= 0) {
            return 1;
        }
        int ret = count(len - 1, false);
        if (!on) {
            ret += count(len - 1, true);
        }
        return ret;
    }
}