import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] A = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                A[i] = sc.nextInt();
            }

            int c1 = 0, c2 = 0, c3 = 0;
            for (int a : A) {
                if (a == 1) {
                    c1++;
                } else if (a == 2) {
                    c2++;
                } else if (a == 3) {
                    c3++;
                }
            }

            double[][][] dp = new double[N + 1][N + 1][N + 1];

            double ans = solve(N, dp, c1, c2, c3);

            System.out.println(ans);
        }
    }

    static double solve(int N, double[][][] dp, int c1, int c2, int c3) {
        if (dp[c1][c2][c3] != 0) {
            return dp[c1][c2][c3];
        }

        if (c1 + c2 + c3 == 0) {
            return 0;
        }

        int c = c1 + c2 + c3;

        dp[c1][c2][c3] = (double) N / c;

        if (c1 > 0) {
            dp[c1][c2][c3] += solve(N, dp, c1 - 1, c2, c3) * c1 / c;
        }

        if (c2 > 0) {
            dp[c1][c2][c3] += solve(N, dp, c1 + 1, c2 - 1, c3) * c2 / c;
        }

        if (c3 > 0) {
            dp[c1][c2][c3] += solve(N, dp, c1, c2 + 1, c3 - 1) * c3 / c;
        }

        return dp[c1][c2][c3];
    }

}
