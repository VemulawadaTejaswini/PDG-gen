import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner itr = new Scanner(System.in);
        int N = itr.nextInt();
        int K = itr.nextInt();
        int[] stone = new int[N];

        for (int i = 0; i < N; i++) {
            stone[i] = itr.nextInt();
        }

        int[] dp = new int[N];
        Arrays.fill(dp, Integer.MAX_VALUE);

        int res = backtrack(dp, N - 1, N, K, stone);

        System.out.println(res);
    }

    public static int backtrack(int[] dp, int index, int N, int K, int[] stone) {
        if (index <= 0) return 0;

        if (dp[index] != Integer.MAX_VALUE)
            return dp[index];

        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= K; i++) {
            if (index - i < 0) break;
            min = Math.min(min, backtrack(dp, index - i, N, K, stone) + Math.abs(stone[index] - stone[index - i]));
        }

        dp[index] = min;
        return dp[index];
    }
}
