import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] a = new long[N + 1];
        for (int i = 1; i <= N; i++) {
            a[i] = a[i - 1] + (long) sc.nextInt();
        }

        long[][] dp = new long[N + 1][N + 1];

        long res = backtrack(a, dp, 1, N);

        System.out.println(2 * res - a[N]);

    }

    public static long backtrack(long[] a, long[][] dp, int start, int end) {
        if (start > end) {
            return 0;
        } else if (start == end) {
            return a[start] - a[start - 1];
        }
        if (dp[start][end] != 0) return dp[start][end];

        long res = 0;

        long cur1 = a[start] - a[start - 1];
        res = Math.max(res, cur1 + a[end] - a[start] - backtrack(a, dp, start + 1, end));

        long cur2 = a[end] - a[end - 1];
        res = Math.max(res, cur2 + a[end - 1] - a[start - 1] - backtrack(a, dp, start, end - 1));
        dp[start][end] = res;
        return res;
    }
}
