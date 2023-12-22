import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        try {
            String[] tmp = br.readLine().strip().split(" ");
            int N = Integer.valueOf(tmp[0]), W = Integer.valueOf(tmp[1]);
            int[] w = new int[N];
            int[] v = new int[N];
            for (int i = 0; i < N; i++) {
                tmp = br.readLine().strip().split(" ");
                w[i] = Integer.valueOf(tmp[0]);
                v[i] = Integer.valueOf(tmp[1]);
            }

            long[][] dp = new long[N + 1][W + 1];

            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= W; j++) {
                    if (j < w[i - 1]) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j], v[i - 1] + dp[i - 1][j - w[i - 1]]);
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}