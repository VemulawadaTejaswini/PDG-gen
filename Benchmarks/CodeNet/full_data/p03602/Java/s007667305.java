import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class road {

    static class Edge {
        int start;
        int end;
        int weight;
        public Edge(int start, int end, int weigth) {
            this.start = start;
            this.end = end;
            this.weight = weigth;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] graph = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        if (!legitGraph(graph)) {
            System.out.println(-1);
            return;
        } else {
            System.out.println(MST(graph));
            return;
        }


    }

    private static boolean legitGraph(int[][] graph) {
        int N = graph.length;
        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (graph[i][j] > graph[i][k] + graph[k][j]) {
                        return false;
                    }
                }
            }
        }

        return true;
    }


    private static long MST(int[][] graph) {
        Set<Edge> edges = new HashSet<>();
        for (int i = 0; i < graph.length; i++) {
            for (int j = i + 1; j < graph.length; j++) {
                edges.add(new Edge(i, j, graph[i][j]));
            }
        }

        long ans = 0;
        for (Edge edge : edges) {
            if (important(graph, edge)) ans += edge.weight;
        }

        return ans;
    }

    private static boolean important(int[][] graph, Edge edge) {
        int a = edge.start;
        int b = edge.end;
        int weigth = edge.weight;
        for (int i = 0; i < graph.length; i++) {
            if (weigth == graph[a][i] + graph[i][b] && a != i && i != b)
                return false;
        }
        return true;
    }
}
