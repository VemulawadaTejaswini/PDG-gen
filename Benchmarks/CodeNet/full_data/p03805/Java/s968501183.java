import java.util.*;

public class Main {

    static  boolean[] visited;
    static boolean[][] adjMatrix;
    static int res;

    static {
        res = 0;
    }

    static boolean visitedAll() {
        for (boolean b : visited)
            if (!b)
                return false;
        return true;
    }

    static void dfsSolve(int vertex) {
        visited[vertex] = true;
        for (int nextVertex = 1; nextVertex < adjMatrix[vertex].length; ++nextVertex) {
            if (adjMatrix[vertex][nextVertex] && !visited[nextVertex]) {
                dfsSolve(nextVertex);
            }
        }
        if (visitedAll())
            res += 1;
        visited[vertex] = false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        visited = new boolean[n + 1];
        visited[0] = true; // indexing from 1
        adjMatrix = new boolean[n + 1][n + 1];
        for (int i = 0; i < m; ++i) {
            int a = in.nextInt();
            int b = in.nextInt();
            adjMatrix[a][b] = true;
            adjMatrix[b][a] = true;
        }
        dfsSolve(1);
        System.out.println(res);
    }
}
