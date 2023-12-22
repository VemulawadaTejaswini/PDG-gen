import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static boolean[][] graph;
    public static void main(String[] ans) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        graph = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(graph[i], false);
        }

        for (int i = 0; i < N; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph[a-1][b-1] = true;
            graph[b-1][a-1] = true;
        }
        boolean[] visited = new boolean[N];
        Arrays.fill(visited, false);
        System.out.println(dfs(1, N,visited ));
    }

    private static int dfs(int currentNode, int N, boolean[] visited) {
        boolean allVisited = true;
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                allVisited = false;
            }
        }
        if (allVisited) {
            return 1;
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            if(!graph[currentNode][i]) {
                continue;
            }

            if(visited[i]) {
                continue;
            }
            visited[i] = true;
            ans += dfs(i, N, visited);
            visited[i] = false;
        }

        return ans;
    }
}
