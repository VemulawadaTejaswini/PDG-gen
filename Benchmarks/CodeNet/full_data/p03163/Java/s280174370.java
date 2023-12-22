import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String[] nw = reader.readLine().split(" ");
        int N = Integer.parseInt(nw[0]);
        int W = Integer.parseInt(nw[1]);
        int[] weights = new int[N+1];
        int[] values = new int[N+1];
        for (int i = 1; i <= N ; i++) {
            String[] wv = reader.readLine().split(" ");
            int w = Integer.parseInt(wv[0]);
            int v = Integer.parseInt(wv[1]);
            weights[i] = w;
            values[i] = v;
        }
        long[][] dp = new long[N+1][W+1];
        for (int i = 1; i <=N ; i++) {
            for (int j = 1; j <=W ; j++) {
                if(j>=weights[i]) dp[i][j] = Math.max(dp[i-1][j],values[i]+dp[i-1][j-weights[i]]);
                else dp[i][j] = dp[i-1][j];
            }
        }
        System.out.println(dp[N][W]);
    }
}
