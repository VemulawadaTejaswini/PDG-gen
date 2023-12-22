
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
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
        Set<Integer> okColor = new HashSet<>();
        for (int i = 1; i <= k; ++i) {
            okColor.add(i);
        }
        int[] visited = new int[n + 1];
        visited[1] = 1;
        long[] sum = new long[1];
        int[] color = new int[n + 1];
        sum[0] = 1L;
        dfs(okColor, new HashSet<>(), new HashSet<>(), graph, 1, visited, sum, color, m);
        System.out.println(sum[0]);


    }

    public static void dfs(
            Set<Integer> okColor,
            Set<Integer> fatherColor,
            Set<Integer> grandFatherColor,
            Map<Integer, Set<Integer>> graph,
            int current,
            int[] visited,
            long []sum,
            int[] color,
            long m
    ) {
        sum[0] *= okColor.size();
        sum[0] %= m;
        Set<Integer> newOkColor = new HashSet<>(okColor);

        Set<Integer> newFather = new HashSet<>();

        for (Integer paint : okColor) {
            newFather.add(paint);
            newOkColor.remove(paint);
            color[current] = paint;
            break;
        }
        newOkColor.addAll(grandFatherColor);
        Set<Integer> newGrandFather = new HashSet<>(fatherColor);
        newOkColor.removeAll(newGrandFather);
        Set<Integer> nexts = graph.getOrDefault(current, new HashSet<>());

        for (Integer next: nexts) {
            if (visited[next] == 0) {
                visited[next] = 1;
                dfs(newOkColor, newFather, newGrandFather, graph, next, visited, sum, color, m);
                newGrandFather.add(color[next]);
                newOkColor.remove(color[next]);
            }
        }

    }
}
