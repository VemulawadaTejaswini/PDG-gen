import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    // 頂点番号，各頂点から出る複数のエッジ
    static List<Edge>[] graph;

    // 最短コスト
    static int[] dist;
    static long[] mindist;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        dist = new int[1000000];
        for (int i = 0; i < N; i++) {
            dist[i] = scanner.nextInt();
        }

        mindist = new long[1000000];
        solve_0(N, K);
        System.out.println(mindist[N - 1]);
    }

    static void solve_0(int N, int K) {
        Arrays.fill(mindist, Long.MAX_VALUE);
        mindist[0] = 0;

        for (int i = 0; i < N; i++) {
            for (int k = 1; k < K + 1; k++) {
                long a = mindist[i] + Math.abs(dist[i] - dist[i + k]);
                mindist[i + k] = Math.min(a, mindist[i + k]);
            }
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
