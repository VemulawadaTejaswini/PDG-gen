import java.util.Scanner;

public class Solution {
    static Long[][] dp;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] stones = new int[N];

        dp = new Long[N + 1][N + 1];

        for (int i = 0; i < stones.length; i++) {
            stones[i] = scanner.nextInt();
        }

        System.out.printf("%d\n", recurse(stones, 0, stones.length - 1));
    }

    private static long recurse(int[] stones, int l, int r) {
        if (l == r) {
            return stones[l];
        }

        if (dp[l][r] != null) {
            return dp[l][r];
        }

        dp[l][r] = Math.max(stones[l] - recurse(stones, l + 1, r), stones[r] - recurse(stones, l, r - 1));
        return dp[l][r];
    }
}