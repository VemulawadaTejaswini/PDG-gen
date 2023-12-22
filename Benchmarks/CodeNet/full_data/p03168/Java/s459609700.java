import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static double[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        double[] prob = new double[N];
        dp = new double[N+1][N/2 + 1];

        String[] input = br.readLine().split(" ");

        for(int i = 0; i < N; i++) {
            prob[i] = Double.parseDouble(input[i]);
        }

        System.out.println(calculateProbability(prob, N));
    }

    private static double calculateProbability(double[] prob, int N) {
        dp[0][0] = 1;

        for(int i=1; i<=N/2; i++) {
            dp[0][i] = dp[0][i-1] * (1 - prob[i-1]);
        }

        for(int i=1; i<=N; i++) {
            dp[i][0] = dp[i-1][0] * prob[i-1];
        }

        for(int i=1; i<=N; i++) {
            for(int j=1; j<=N/2; j++) {
                if(i + j <= N) {
                    dp[i][j] = prob[i+j-1] * dp[i-1][j] + (1- prob[i+j-1]) * dp[i][j-1];
                }
            }
        }

        double result = 0;

        for(int i=N; i>N/2; i--) {
            result += dp[i][N-i];
        }

        return result;
    }
}
