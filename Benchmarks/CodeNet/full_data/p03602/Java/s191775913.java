import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class Main {

    static class Edge implements Comparable<Edge>{
        int start;
        int end;
        int weight;
        public Edge(int start, int end, int weigth) {
            this.start = start;
            this.end = end;
            this.weight = weigth;
        }

        @Override
        public int compareTo(Edge o) {
            return Integer.compare(this.weight, o.weight);
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


    private static int MST(int[][] graph) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        Set<Integer> vertices = new HashSet<>();
        Set<Edge> edges = new HashSet<>();
        for (int i = 0; i < graph.length; i++) {
            for (int j = i + 1; j < graph.length; j++) {
                pq.add(new Edge(i, j, graph[i][j]));
            }
        }

        while(edges.size() < graph.length - 1) {
            edges.add(pq.remove());
        }


        int ans = 0;
        for (Edge edge : edges) {
            System.out.println(edge.start + " " + edge.end + " " + edge.weight);
            ans += edge.weight;
        }

        return ans;
    }
}
