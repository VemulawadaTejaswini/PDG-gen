import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<Integer, Integer>[] graph = new HashMap[n + 1];

        for(int i = 1; i <= n; i++)
            graph[i] = new HashMap<>();

        for(int i = 0; i < m; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            int w = sc.nextInt();
            graph[from].put(to, w);
        }

        boolean[] visited = new boolean[n + 1];
        long[] weights = new long[n + 1];

        for(int i = 1; i <= n; i++) {
            if(visited[i]) continue;
            if(!dfs(graph, visited, weights, i, 0)) {
                System.out.println("No");
                return;
            }
        }
        
        System.out.println("Yes");
    }

    private static boolean dfs(Map<Integer, Integer>[] graph, boolean[] visited, long[] weights, int node, int prevWeight) {
        if(visited[node]) {
            return weights[node] == prevWeight;
        }

        weights[node] = prevWeight;
        visited[node] = true;

        for(Map.Entry<Integer, Integer> entry : graph[node].entrySet()) {
            int to = entry.getKey();
            int w = entry.getValue();

            if(!dfs(graph, visited, weights, to, w + prevWeight))
                return false;
        }
        return true;
    }
}
