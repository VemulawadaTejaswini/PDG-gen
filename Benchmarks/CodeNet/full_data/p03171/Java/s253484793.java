import java.util.*;

public class Main {
    public static void main(String args[]) {
        System.out.println(playDeque(new int[] {1000000000, 1, 1000000000 ,1, 1000000000 ,1, 1000000000, 1, 1000000000 ,1}));
    }

    private static long playDeque(int[] A) {
        int len = A.length;
        long[][] dp = new long[len][len];

        int sign = len % 2 == 1 ? 1 : -1;

        for (int end = 0, currentSign = sign; end < len; end++, currentSign = sign) {
            for (int start = end; start >= 0; start--, currentSign *= -1) {
                long leftAcc = end > 0 ? dp[start][end - 1] : 0;       // start
                long bottomAcc = start + 1 < len ? dp [start + 1][end] : 0;// end
                if (currentSign < 0) {
                    dp[start][end] = Math.min(leftAcc + currentSign * A[end], bottomAcc + currentSign * A[start]);
                } else {
                    dp[start][end] = Math.max(leftAcc + currentSign * A[end], bottomAcc + currentSign *  A[start]);
                }
            }
        }

        return dp[0][len - 1];
    }

}