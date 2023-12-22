import java.util.*;

public class Main {
    static Integer res = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        boolean[] visited = new boolean[n];
        List<List<Integer>> g = new ArrayList<>();

        if (m == 0) {
            System.out.println(0);
            return;
        }
        for (int i = 0; i < m; i++) {
            g.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            g.get(a).add(b);
            g.get(b).add(a);
        }

        visited[0] = true;
        dfs(g, n, visited, 0);
        System.out.println(res);
    }

    private static void dfs(List<List<Integer>> graph, int n, boolean[] visited, int cur) {
        if (allVisited(n, visited)) {
            res++;
            return;
        }

        List<Integer> next = graph.get(cur);
        if (next == null || next.isEmpty()) {
            return ;
        }
        for (Integer next1 : next) {
            if (visited[next1]) {
                continue;
            }

            visited[next1] = true;
            dfs(graph, n, visited, next1);
            visited[next1] = false;
        }
    }

    private static boolean allVisited(int n, boolean[] visited) {
        for (int i = 0; i < n; i++) {
            if (!visited[i]) return false;
        }

        return true;
    }
}