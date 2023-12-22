
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();

        final Map<Integer, List<Integer>> graph = new HashMap<>();
        final Set<Integer> startVertex = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            int parent = makeVertex(i, scanner.nextInt(), n);
            startVertex.add(parent);
            for (int j = 2; j <= n - 1; j++) {
                final int current = makeVertex(i, scanner.nextInt(), n);
                startVertex.remove(current);
                graph.computeIfAbsent(parent, v -> new ArrayList<>()).add(current);
                parent = current;
            }
        }

        int max = -1;
        for (final int vertex : startVertex) {
            final int depth = dfs(graph, vertex, new boolean[2_000_000]);
            if (depth == -1) {
                System.out.println(-1);
                return;
            }
            max = Math.max(max, depth);
        }
        System.out.println(max);
    }

    private static final int[] memo = new int[2_000_000];

    private static int dfs(final Map<Integer, List<Integer>> graph, final int current, final boolean[] isVisited) {
        isVisited[current] = true;
        final List<Integer> children = graph.get(current);
        if (children == null) {
            memo[current] = 1;
            return 1;
        }
        if (memo[current] > 0) {
            return memo[current];
        }

        int max = -1;
        for (final int child : children) {
            if (isVisited[child]) {
                return -1;
            }
            final int depth = dfs(graph, child, Arrays.copyOf(isVisited, 2_000_000));
            if (depth == -1) {
                return -1;
            }
            max = Math.max(max, depth);
        }

        memo[current] = max + 1;
        return max + 1;
    }

    private static int makeVertex(final int a, final int b, final int n) {
        return Math.min(a, b) * (n + 1) + Math.max(a, b);
    }
}
