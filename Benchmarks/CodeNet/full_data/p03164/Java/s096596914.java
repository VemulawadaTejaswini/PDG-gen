import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static final int INF = 1_000_000_000;
   	public int knapsack(int n, int w, int[] weights, int[] values) {
        int totalValue = 0;
        for (int value: values) {
            totalValue += value;
        }
        int[][] memo = new int[n][totalValue + 1];
        for (int[] row: memo) {
            Arrays.fill(row, INF);
        }
        for (int i = 0; i <= totalValue; i++) {
            dfs(weights, values, i, 0, memo);
        }
        int result = 0;
        for (int j = 0; j <= totalValue; j++) {
            if (memo[0][j] <= w) {
                result = j;
            }
        }
        return result;
    }
	private int dfs(int[] weights, int[] values, int totalValue, int i, int[][] memo) {
        int n = values.length;
        if (totalValue == 0) {
            return 0;
        }
        if (i >= n) {
            return INF;
        }
        if (memo[i][totalValue] != INF) {
            return memo[i][totalValue];
        }
        int minWeight = INF;
        int take = INF;
        if (totalValue >= values[i]) {
            take = weights[i] + dfs(weights, values, totalValue - values[i], i + 1, memo);
        }
        int skip = dfs(weights, values, totalValue, i + 1, memo);
        int result = Math.min(take, skip);
        return memo[i][totalValue] = result;
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
