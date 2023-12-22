import javax.sql.XAConnection;
import java.util.*;

public class Main {
    static int N;
    static long[][] dp;
    static boolean[][] dpFlag;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        dp = new long[N + 1][N + 1];
        dpFlag = new boolean[N + 1][N + 1];

        long[] A = new long[N + 1];

        for (int i = 1; i <= N; i++) {
            A[i] = sc.nextLong();
        }

        long count = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = i; j <= N; j++) {
                if (solve(A, i, j) == 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    public static long solve(long[] A, int begin, int end) {
        long ans;
        if (dpFlag[begin][end]) {
            ans = dp[begin][end];
        } else if (begin == end) {
            ans = A[begin];
            dp[begin][end] = ans;
            dpFlag[begin][end] = true;
        } else {
            ans = A[end] + solve(A, begin, end - 1);
            dp[begin][end] = ans;
            dpFlag[begin][end] = true;
        }
        return ans;
    }
}