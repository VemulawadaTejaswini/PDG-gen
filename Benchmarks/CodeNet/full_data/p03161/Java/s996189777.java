import java.util.*;

// https://atcoder.jp/contests/dp/tasks/dp_a
public class Main {
    public static void main(String args[]) {
        runCode();
    }

    private static void runCode() {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt(), k = scan.nextInt();
            int[] h = new int[n];
            for (int i = 0; i < n; i++) {
                h[i] = scan.nextInt();
            }
            System.out.println(new UsingDP().minCost(h, k));
        }
    }

    public interface Solution {
        int minCost(int[] heights, int k);
    }

    public static class UsingDP implements Solution {
        public int minCost(int[] heights, int k) {
            if (heights.length < 2) return 0;
            int[] costs = new int[heights.length];
            Arrays.fill(costs, 1, costs.length, Integer.MAX_VALUE);
            for (int i = 1; i < heights.length; i++) {
                for (int j = Math.max(0, i - k); j < i; j++) {
                    costs[i] = Math.min(costs[i], costs[j] + Math.abs(heights[j] - heights[i]));
                }
            }
            return costs[costs.length - 1];
        }
    }
}
