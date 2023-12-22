import java.util.Arrays;
import java.util.Scanner;

// https://atcoder.jp/contests/dp/tasks/dp_a

class Main {
    // Frog 2
    public static int forg2(int[] stones, int K) {
        int[] dp = new int[stones.length];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i < stones.length; i++) {
            for (int j = 1; j <= K; j++) {
                if (i-j >= 0) {
                    dp[i] = Math.min(dp[i], dp[i-j]+Math.abs(stones[i-j] - stones[i]));
                } else break;
            }
        }
        return dp[stones.length-1];
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        in.close();

        // call function hear
        int ret = forg2(arr, K);
        System.out.println(ret);
    }
}