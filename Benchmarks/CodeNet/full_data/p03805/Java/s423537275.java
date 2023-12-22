import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static int[][] graph;
    static int INF = Integer.MAX_VALUE;

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        graph = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                graph[i][j] = INF;
            }
        }

        for (int i = 0; i < M; i++) {
            int from = scanner.nextInt() - 1;
            int to = scanner.nextInt() - 1;
            graph[from][to] = to;
            graph[to][from] = from;
        }

        scanner.close();

        HashSet<Integer> passed = new HashSet<>();
        passed.add(0);
        System.out.println(dfs(0, passed));
    }

    private static int dfs(int i, HashSet<Integer> passedVertexes) {
        if (N <= passedVertexes.size()) return 1;

        int ret = 0;
        for (int to: graph[i]) {
            if (to != INF && !passedVertexes.contains(to)) {
                passedVertexes.add(to);
                ret += dfs(to, passedVertexes);
                passedVertexes.remove(to);
            }
        }

        return ret;
    }
}