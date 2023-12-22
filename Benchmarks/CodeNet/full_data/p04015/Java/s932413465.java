import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int[] x = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
        }
        System.out.println(solve2(N, A, x));
    }

    private static long solve(int n, int a, int[] x) {
        int[] y = Arrays.stream(x).map(i -> i - a).toArray();
        return brute(n - 1, 0, y);
    }

    private static long brute(final int i, final int n, final int[] y) {
        if (i < 0) return 0;
        return (n + y[i] == 0 ? 1 : 0) + brute(i - 1, n, y) + brute(i - 1, n + y[i], y);
    }

    private static long solve2(int n, int a, int[] x) {
        // dp[i][j][k] := {x_1 ... x_i} から j 個選んで，和が k となる組み合わせの数 O(n^3X)
        // 平均 0 を求めるようにすると，O(n^2X)
        int X = Math.max(a, Arrays.stream(x).max().getAsInt());
        long[][][] dp = new long[n + 1][n + 1][n * X + 1];
        dp[0][0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= n * X; k++) {
                    if (k - x[i - 1] >= 0 && j - 1 >= 0) {
                        dp[i][j][k] = dp[i - 1][j][k] + dp[i - 1][j - 1][k - x[i - 1]];
                    } else {
                        dp[i][j][k] = dp[i - 1][j][k];
                    }
                }
            }
        }
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += dp[n][i][i * a];
        }
        return ans;
    }

}