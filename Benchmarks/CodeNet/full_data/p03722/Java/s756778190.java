import java.util.*;

import static java.lang.System.*;

// ベルマンフォート
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

            // ベルマンフォートは最もコストを小さくする
            // 負のコストにすることで、ベルマンフォートを使いまわす
            destCost.put(b, -c);
            edges.put(a, destCost);
        }


        int[] vertices = new int[N];
        for (int i = 0; i < N; i++) {
            vertices[i] = i + 1;
        }

        long[] distances = new long[N + 1];

        if (bellmanFord(vertices, edges, 1, distances) != -1) {
            // 負のコストで最小化したので、マイナスをかければ、最大化した答え
            out.print(-distances[N]);
        } else {
            out.print("inf");
        }


    }

    // ベルマン・フォード法
    // 負の重みの閉路が存在したら、-1を返す
    // https://ja.wikipedia.org/wiki/%E3%83%99%E3%83%AB%E3%83%9E%E3%83%B3%E2%80%93%E3%83%95%E3%82%A9%E3%83%BC%E3%83%89%E6%B3%95
    public static int bellmanFord(int[] vertices, Map<Integer, Map<Integer, Long>> edges, int start, long[] distances) {

        // 初期化
        long INF = Long.MAX_VALUE;
        Arrays.fill(distances, INF);
        distances[start] = 0;

        // 辺の緩和
        for (int src : vertices) {
            if (edges.containsKey(src)) {
                for (Map.Entry entry : edges.get(src).entrySet()) {
                    int dest = (int) entry.getKey();
                    long dist = (long) entry.getValue();
                    if (dist != INF && distances[dest] > distances[src] + dist) {
                        distances[dest] = distances[src] + dist;
                    }
                }
            }
        }

        // 負の重みの閉路がないかの確認
        for (int src : vertices) {
            if (edges.containsKey(src)) {
                for (Map.Entry entry : edges.get(src).entrySet()) {
                    int dest = (int) entry.getKey();
                    long dist = (long) entry.getValue();

                    if (dist != INF && distances[src] + dist < distances[dest]) {
                        return -1;
                    }
                }
            }
        }
        return 0;
    }
}

