import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static final int INF = 1_000_000_000;
   	public int knapsack(int n, int capacity, int[] weights, int[] values) {
        int totalValue = 0;
        for (int val: values) {
            totalValue += val;
        }
        // System.out.println("total value: " + totalValue);
        int[] dp = new int[totalValue + 1];
        Arrays.fill(dp, INF);
        dp[0] = 0;
        for (int i = 0; i < n; i++) {
            // for (int v = totalValue - values[i]; v >= 0; v--) {
            for (int v = totalValue; v >= 0; v--) {
                int skip = dp[v];
                int take = INF;
                if (values[i] <= v) {
                    take = dp[v - values[i]] + weights[i];
                }
                // System.out.println(String.format("Item %d. Value %d, weight %d. Skip: %d, take: %d", i, v, weights[i], skip, take));
                dp[v] = Math.min(skip, take);
            }
            // System.out.println(Arrays.toString(dp));
        }
        int result = 0;
        for (int i = 0; i < dp.length; i++) {
            if (dp[i] <= capacity) {
                result = Math.max(result, i);
            } 
        }
        return result;
    }
    public static void main(String[] args)  {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] split = br.readLine().split(" ");
            int n = Integer.parseInt(split[0]);
            int w = Integer.parseInt(split[1]);
          	int[] weights = new int[n];
          	int[] values = new int[n];
            for (int i = 0; i < n; i++) {
                split = br.readLine().split(" ");
                weights[i] = Integer.parseInt(split[0]);
                values[i] = Integer.parseInt(split[1]);
            }
          	Main app = new Main();
            int result = app.knapsack(n, w, weights, values);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
