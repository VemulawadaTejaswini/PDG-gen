import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<Integer>[] adj = (ArrayList<Integer>[]) new ArrayList[n];
        int ans[] = new int[n];

        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<Integer>();
            ans[i] = -1;
        }
        for (int i = 0; i < m; i++) {
            int x, y;
            x = scanner.nextInt();
            y = scanner.nextInt();
            adj[x - 1].add(y - 1);
            // adj[y - 1].add(x - 1);
        }
        boolean visited[] = new boolean[n];
        int maxPath = Integer.MIN_VALUE;
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                maxPath = Math.max(getPath(adj, visited, i, ans), maxPath);
            }
        }

        System.out.println(maxPath - 1);

    }

    public static int getPath(ArrayList<Integer> graph[], boolean visited[], int vertex, int ans[]) {
        if (ans[vertex] != -1) {
            return ans[vertex];
        }
        int path = Integer.MIN_VALUE;
        for (int i = 0; i < graph[vertex].size(); i++) {

            visited[graph[vertex].get(i)] = true;
            path = Math.max(1 + getPath(graph, visited, graph[vertex].get(i), ans), path);
        }

        if (path == Integer.MIN_VALUE) {
            path = 1;
        }
        ans[vertex] = path;
        return ans[vertex];

    }

}