import java.util.*;
import java.util.function.Consumer;

// https://atcoder.jp/contests/dp/tasks/dp_a
public class Main {
    public static void main(String args[]) {
        runCode();
    }

    private static void runCode() {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            int[] h = new int[n];
            for (int i = 0; i < n; i++) {
                h[i] = scan.nextInt();
            }
            System.out.println(new UsingDP().minCost(h));
        }
    }

    public static void runTest() {
        List<Consumer<Solution>> testCases = Arrays.asList(
                solution -> {
                    int actual = solution.minCost(new int[]{10, 30, 40, 20});
                    assert actual == 30;
                },
                solution -> {
                    int actual = solution.minCost(new int[]{10, 10});
                    assert actual == 0;
                },
                solution -> {
                    int actual = solution.minCost(new int[]{30, 10, 60, 10, 60, 50});
                    assert actual == 40;
                }
        );
        testCases.forEach(testCase -> testCase.accept(new UsingDP()));
        testCases.forEach(testCase -> testCase.accept(new UsingDP2()));
    }

    public interface Solution {
        int minCost(int[] heights);
    }

    public static class UsingDP implements Solution {
        public int minCost(int[] heights) {
            if (heights.length < 2) return 0;
            if (heights.length == 2) return Math.abs(heights[1] - heights[0]);
            int[] costs = new int[heights.length];
            Arrays.fill(costs, 1, costs.length, Integer.MAX_VALUE);
            for (int i = 0; i < heights.length; i++) {
                for (int j = i + 1, jl = Math.min(j + 2, heights.length); j < jl; j++) {
                    costs[j] = Math.min(costs[j], costs[i] + Math.abs(heights[j] - heights[i]));
                }
            }
            return costs[costs.length - 1];
        }
    }

    public static class UsingDP2 implements Solution {
        public int minCost(int[] heights) {
            if (heights.length < 2) return 0;
            int[] costs = new int[heights.length];
            costs[1] = Math.abs(heights[1] - heights[0]);
            for (int i = 2; i < heights.length; i++) {
                costs[i] = Math.min(
                        costs[i - 2] + Math.abs(heights[i - 2] - heights[i]),
                        costs[i - 1] + Math.abs(heights[i - 1] - heights[i])
                );
            }
            return costs[costs.length - 1];
        }
    }
}
