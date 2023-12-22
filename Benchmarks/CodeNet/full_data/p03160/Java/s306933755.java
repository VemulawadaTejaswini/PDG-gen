import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    // 頂点番号，各頂点から出る複数のエッジ
    static List<Edge>[] graph;

    // 最短コスト
    static long mindist[];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] dist = new int[N];
        for (int i = 0; i < N; i++) {
            dist[i] = scanner.nextInt();
        }

        graph = new List[N];
        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
            if (i <= N - 2) {
                graph[i].add(new Edge(i + 1, Math.abs(dist[i] - dist[i + 1])));
            }
            if (i <= N - 3) {
                graph[i].add(new Edge(i + 2, Math.abs(dist[i] - dist[i + 2])));
            }
        }

//        debug();

        mindist = new long[N];
        solve(0);
        System.out.println(mindist[N - 1]);
    }

    static void solve(int v) {
        Arrays.fill(mindist, Long.MAX_VALUE);
        mindist[v] = 0;

        PriorityQueue<Vertex> pq = new PriorityQueue<>(
                ((v1, v2) -> v1.dist < v2.dist ? -1 : 1)
        );

        pq.add(new Vertex(v, mindist[v]));
        while (!pq.isEmpty()) {
            Vertex now = pq.poll();

            if (now.dist > mindist[now.id]) {
                continue;
            }

            for (Edge edge : graph[now.id]) {
                if (mindist[edge.to] > mindist[now.id] + edge.cost) {
                    mindist[edge.to] = mindist[now.id] + edge.cost;
                    pq.add(new Vertex(edge.to, mindist[edge.to]));
                }
            }
        }

    }

    static void debug() {
        for (int i = 0; i < graph.length; i++) {
            for (Edge edge : graph[i]) {
                System.out.println(i + " -> " + edge.to + ": " + edge.cost);
            }
            System.out.println();
        }
    }
}

// エッジに関するクラス
class Edge {
    int to, cost;

    public Edge(int to, int cost) {
        this.to = to;
        this.cost = cost;
    }
}

// 頂点に関するクラス
class Vertex {
    int id;
    long dist;

    public Vertex(int id, long dist) {
        this.id = id;
        this.dist = dist;
    }
}