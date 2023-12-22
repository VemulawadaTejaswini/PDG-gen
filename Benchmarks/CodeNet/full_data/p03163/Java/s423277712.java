import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int w;
    static int[] weights;
    static long[] values;
    static long[][] dp;

    static long dp() {

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j <= w ; j++) {
                if (i==0||j==0)
                    dp[i][j]=0;
                else if (weights[i-1]<=j)
                    dp[i][j]=Math.max(values[i-1]+dp[i-1][j-weights[i-1]],dp[i-1][j]);
                else
                    dp[i][j]=dp[i-1][j];
            }
        }


        return dp[n][w];
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        dp = new long[n + 1][w + 1];

        weights = new int[n];
        values = new long[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            weights[i] = Integer.parseInt(st.nextToken());
            values[i] = Long.parseLong(st.nextToken());
        }

        System.out.println(dp());

    }
}
