import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static long maxK(int[] weights, int[] values, int W){
        int[] dp = new int[W+1];
        for (int i = 0; i < weights.length; i++) {
            for (int weight = W - weights[i]; weight >= 0; weight--) {
                dp[weight+ weights[i]] = Math.max(dp[weight + weights[i]], dp[weight] + values[i]);
            }
        }
        return max(dp);
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

    private static long max(long[] a){
        long max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max){
                max = a[i];
            }
        }
        return max;
    }
}
