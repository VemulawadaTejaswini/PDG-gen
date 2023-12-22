import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        Map<Integer, Map<Integer, Long>> edges = new HashMap<>();
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            long c = sc.nextLong();

            Map<Integer, Long> destCost = new HashMap<>();
            if (edges.containsKey(a)) {
                destCost = edges.get(a);
            }
            destCost.put(b, c);
            edges.put(a, destCost);
        }


        int[] vertices = new int[N];
        for (int i = 0; i < N; i++) {
            vertices[i] = i + 1;
        }

        long[] distances = new long[N + 1];

        if (bellmanFord(vertices, edges, 1, distances) != -1) {
            out.print(distances[N]);
        } else {
            out.print("inf");
        }


    }

    // ベルマン・フォード法の応用(最小ではなく、最大を求める)
    // 正の重みの閉路が存在したら、-1を返す
    // https://ja.wikipedia.org/wiki/%E3%83%99%E3%83%AB%E3%83%9E%E3%83%B3%E2%80%93%E3%83%95%E3%82%A9%E3%83%BC%E3%83%89%E6%B3%95
    public static int bellmanFord(int[] vertices, Map<Integer, Map<Integer, Long>> edges, int start, long[] distances) {

        // 初期化
        long MINCOST = -1_000_000_000_000_000L;
        for (int v : vertices) {
            if (v == start) {
                distances[v] = 0;
            } else {
                // 最大を求める
                distances[v] = MINCOST;
            }
        }

        // 辺の緩和
        for (int src : vertices) {
            if (edges.containsKey(src)) {
                for (Map.Entry entry : edges.get(src).entrySet()) {
                    int dest = (int) entry.getKey();
                    long dist = (long) entry.getValue();

                    // 大きい方を採用する
                    if (distances[dest] < distances[src] + dist) {
                        distances[dest] = distances[src] + dist;
                    }
                }
            }
        }

        // 正の重みの閉路がないかの確認
        for (int src : vertices) {
            if (edges.containsKey(src)) {
                for (Map.Entry entry : edges.get(src).entrySet()) {
                    int dest = (int) entry.getKey();
                    long dist = (long) entry.getValue();

                    if (distances[src] + dist > distances[dest]) {
                        return -1;
                    }
                }
            }
        }
        return 0;
    }
}

