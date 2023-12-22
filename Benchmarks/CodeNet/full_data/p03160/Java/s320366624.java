import java.io.*;
import java.util.*;


public class Main {

    private static InputStreamReader isr = new InputStreamReader(System.in);
    private static BufferedReader br = new BufferedReader(isr);

    private static int minCost(int[] height, int[] dp, int i) {
        if (i == height.length - 1) return 0;

        if (dp[i] != -1) return dp[i];

        if (i + 1 >= height.length) {
            dp[i] = minCost(height, dp, i);
            return dp[i];
        }

        if (i + 2 >= height.length) {
            dp[i] = Math.abs(height[i] - height[i+1]) + minCost(height, dp, i+1);
            return dp[i];
        }

        int oneStep = Math.abs(height[i] - height[i+1]) + minCost(height, dp, i+1);
        int twoStep = Math.abs(height[i] - height[i+2]) + minCost(height, dp, i+2);
        dp[i] = Math.min(oneStep, twoStep);
        return dp[i];
    }

    public static void main(String[] argv) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int height[] = Arrays.stream(br.readLine().split(" "))
            .mapToInt(Integer::parseInt).toArray();
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        System.out.println(minCost(height, dp, 0));
    }
}
