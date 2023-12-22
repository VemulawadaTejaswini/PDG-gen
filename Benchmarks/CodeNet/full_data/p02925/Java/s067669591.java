
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = in.nextInt();
        int idCount = 0;
        int[][] ids = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j) {
                    ids[i][j] = idCount;
                    idCount++;
                }
            }
        }

        final int[][] expected = new int[n][n - 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                expected[i][j] = in.nextInt() - 1;
            }
        }

        final BiFunction<Integer, Integer, Integer> toId = (from, to) -> {
            if (from < to) {
                return ids[from][to];
            }
            return ids[to][from];
        };

        final Map<Integer, List<Integer>> routes = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - 1; j++) {
                final int id = toId.apply(i, expected[i][j]);
                final int prevId = toId.apply(i, expected[i][j - 1]);
                routes.compute(id, (key, value) -> {
                    if (value == null) {
                        value = new ArrayList<>();
                    }
                    value.add(prevId);
                    return value;
                });
            }
        }
        final int[] dp = new int[(n * n - 1) / 2];
        final boolean[] visited = new boolean[(n * n - 1) / 2];
        final boolean[] computed = new boolean[(n * n - 1) / 2];

        final Function<Integer, Integer> dfs = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer node) {
                if (dp[node] != 0) {
                    return dp[node];
                }

                if (visited[node] && !computed[node]) {
                    return -1;
                }
                visited[node] = true;

                if (routes.get(node) == null) {
                    dp[node] = 1;
                } else {
                    int result = 1;
                    for (Integer id : routes.get(node)) {
                        Integer subResult = apply(id);
                        if (subResult == -1) {
                            return -1;
                        }
                        result = Math.max(result, subResult + 1);
                    }
                    dp[node] = result;
                }
                computed[node] = true;
                return dp[node];
            }
        };

        int result = Integer.MIN_VALUE;
        for (int i = 0; i < (n * n - 1) / 2; i++) {
            final int r = dfs.apply(i);
            if (r == -1) {
                System.out.println(-1);
                return;
            }
            result = Math.max(result, r);
        }
        System.out.println(result);
    }
}
