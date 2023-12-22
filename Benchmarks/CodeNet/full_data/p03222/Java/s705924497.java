package ABC113;

import java.util.Scanner;

public class Main {
    static final long MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt(), k = sc.nextInt();
        long[][] dp = new long[h + 1][w + 2];
        dp[0][1] = 1;
        for (int i = 0; i < h; i++) {
            for (int j = 1; j <= w; j++) {
                long left = j - 2;
                long right = w - j - 1;
                long Straight = myPow(left) * myPow(right);
                long leftleft = left - 1;
                long leftright = right;
                long Left = myPow(leftleft) * myPow(leftright);
                long rightleft = left;
                long rightright = right - 1;
                long Right = myPow(rightleft) * myPow(rightright);
                dp[i + 1][j] =
                        dp[i][j] * Straight
                                + dp[i][j - 1] * Left
                                + dp[i][j + 1] * Right;
                dp[i + 1][j] %= MOD;
            }
        }
//        for (long[] arr : dp) {
//            for (long l : arr) {
//                System.out.print(l + " ");
//            }
//            System.out.println();
//        }
        System.out.println(dp[h][k]);
    }

    static long myPow(long i) {
        if (i <= 0) return 1;
        else return 1L << i;
    }
}
