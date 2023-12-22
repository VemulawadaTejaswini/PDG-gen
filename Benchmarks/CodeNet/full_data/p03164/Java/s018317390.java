import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static long maxK(int[] weights, int[] values, int W){
        int sum_value = 0;
        for (int i = 0; i < values.length; i++) {
            sum_value += values[i];
        }
        long[] dp = new long[sum_value+1];
        Arrays.fill(dp, (long) 1e18+5);
        dp[0] = 0;
        for (int i = 0; i < weights.length; i++) {
            for (int value_present = sum_value - values[i]; value_present >= 0; value_present--) {
                dp[value_present + values[i]] = Math.min(dp[value_present + values[i]], dp[value_present] + weights[i]);
            }
        }
        long res = 0;
        for (int i = 0; i < sum_value + 1; i++) {
            if (dp[i] <= W){
                res = Math.max(res, i);
            }
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int[] weights = new int[N];
        int[] values = new int[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(reader.readLine());
            weights[i] = Integer.parseInt(st.nextToken());
            values[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(maxK(weights, values, W));
    }
}
