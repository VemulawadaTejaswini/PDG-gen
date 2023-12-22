import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for(int i = 1; i <= n; i++)
            graph.put(i, new ArrayList<>());

        for(int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        Set<Integer> visited = new HashSet<>();
        visited.add(1);
        System.out.println(dfs(graph, visited, 1));
    }

    private static int dfs(Map<Integer, List<Integer>> graph, Set<Integer> visited, int cur) {
        if(visited.size() == graph.size())
            return 1;

        int sum = 0;
        for(int adj : graph.get(cur)) {
            if(visited.contains(adj)) continue;
            visited.add(adj);
            sum += dfs(graph, visited, adj);
            visited.remove(adj);
        }
        return sum;
    }

}