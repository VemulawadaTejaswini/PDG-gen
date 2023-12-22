import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] S = new int[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.nextInt();
        }
        System.out.println( solve(N, S) );
    }

    private static int solve(int N, int[] S) {
        boolean[][] dp = new boolean[N + 1][100 + 1];
        dp[0][0] = true;

        for (int i = 1; i <= N; i++) {
            int s = S[i-1];
            for (int p = 0; p <= 100; p++) {
                if( p >= s ) {
                    dp[i][p] = dp[i-1][p-s] || dp[i-1][p];
                } else {
                    dp[i][p] = dp[i-1][p];
                }
            }
        }

        int ans = 0;
        for (int i = 0; i <= 100; i++) {
            if( dp[N][i] && i % 10 != 0 ) {
                ans = Math.max(ans, i);
            }
        }
        return ans;
    }

    private static void showPoints(boolean[] points) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            if( points[i] ) {
                result.add(i);
            }
        }
        System.err.println( result );
    }
}
