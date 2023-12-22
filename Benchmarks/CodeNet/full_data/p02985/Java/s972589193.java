
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long k = scanner.nextLong();
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int i = 1; i <= n - 1; ++i) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            Set<Integer> nextA = graph.getOrDefault(a, new HashSet<>());
            nextA.add(b);
            graph.put(a, nextA);
            Set<Integer> nextB = graph.getOrDefault(b, new HashSet<>());
            nextB.add(a);
            graph.put(b, nextB);
        }
        long m = 1000000007L;
        int[] visited = new int[n + 1];
        visited[1] = 1;
        long[] sum = new long[1];
        int[] color = new int[n + 1];
        sum[0] = 1L;
        dfs(new HashSet<>(), new HashSet<>(), graph, 1, visited, sum, color, m, k);
        System.out.println(sum[0]);


    }

    public static void dfs(
            Set<Integer> fatherColor,
            Set<Integer> grandFatherColor,
            Map<Integer, Set<Integer>> graph,
            int current,
            int[] visited,
            long []sum,
            int[] color,
            long m,
            long k
    ) {
        sum[0] *= (k - fatherColor.size() - grandFatherColor.size());
        sum[0] %= m;
        Set<Integer> newFather = new HashSet<>();

        for (int i = 1; i <= k; ++i) {
            if (!fatherColor.contains(i) && !grandFatherColor.contains(i)) {
                newFather.add(i);
                color[current] = i;
                break;
            }
        }
        Set<Integer> newGrandFather = new HashSet<>(fatherColor);
        Set<Integer> nexts = graph.getOrDefault(current, new HashSet<>());

        for (Integer next: nexts) {
            if (visited[next] == 0) {
                visited[next] = 1;
                dfs(newFather, newGrandFather, graph, next, visited, sum, color, m, k);
                newGrandFather.add(color[next]);
            }
        }

    }
}
