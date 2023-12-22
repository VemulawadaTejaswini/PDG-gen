
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * https://atcoder.jp/contests/dp/tasks/dp_e
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int W = in.nextInt();
        int[] w = new int[N];
        int[] v = new int[N];
        for (int i = 0; i < N; i++) {
            w[i] = in.nextInt();
            v[i] = in.nextInt();
        }
        System.out.println(maxValue(N, W, w, v));
    }

    public static int maxValue(int N, int W, int[] w, int[] v) {
        int sum = Arrays.stream(v).sum();
        int[] dp = new int[sum + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i < N; i++) {
            for (int j = sum; j >= 0; j--) {
                if (j - v[i] >= 0 && dp[j - v[i]] != Integer.MAX_VALUE) {
                    dp[j] = Math.min(dp[j], dp[j - v[i]] + w[i]);
                }
            }
        }
        return IntStream.range(0, sum + 1).filter(l -> dp[l] <= W).max().getAsInt();
    }

}
