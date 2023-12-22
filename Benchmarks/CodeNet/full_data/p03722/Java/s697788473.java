import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] d = new long[N];
        Arrays.fill(d, Long.MAX_VALUE);
        d[0] = 0;
        edge[] es = new edge[M];
        for (int i = 0; i < M; i++) {
            es[i] = new edge(sc.nextInt() - 1, sc.nextInt() - 1, -sc.nextInt());
        }
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < M; j++) {
                edge e = es[j];
                if (d[e.from] != Long.MAX_VALUE && d[e.to] > d[e.from] + e.cost) {
                    d[e.to] = d[e.from] + e.cost;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                edge e = es[j];
                if (d[e.from] != Long.MAX_VALUE && d[e.to] > d[e.from] + e.cost) {
                    if (e.to == N - 1) {
                        System.out.println("inf");
                        return;
                    }
                    d[e.to] = d[e.from] + e.cost;
                }
            }
        }
        System.out.println(-d[N - 1]);
    }

    class edge {

        int from, to, cost;

        edge(int from, int to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
    }
}
