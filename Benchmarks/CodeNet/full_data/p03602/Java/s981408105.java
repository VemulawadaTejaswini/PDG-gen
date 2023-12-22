
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    int n;
    long[][] A;
    PriorityQueue<Edge> es;
    long[][] ans;
    long[][] dp;
    final static long INF = 1000000007;

    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        es = new PriorityQueue<>((e1, e2) -> Long.compare(e1.cost, e2.cost));
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        )) {
            String line = br.readLine();
            String[] elems;
            n = Integer.parseInt(line);
            A = new long[n][n];
            for (int i = 0; i < n; i++) {
                elems = br.readLine().split(" ");
                for (int j = 0; j < n; j++) {
                    A[i][j] = Long.parseLong(elems[j]);
                    if (j < i)
                        es.add(new Edge(i, j, A[i][j]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void solve() {
        ans = new long[n][n];
        dp = new long[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(ans[i], INF);
            Arrays.fill(dp[i], INF);
            ans[i][i] = dp[i][i] = 0;
        }
        Edge firstEdge = es.poll();
        add(firstEdge);
        while (!es.isEmpty()) {
            Edge e = es.poll();
            if (e.cost == dp[e.a][e.b])
                continue;
            if (e.cost > dp[e.a][e.b]) {
                es.add(e);
                break;
            }
            else
                add(e);
        }
        if (!es.isEmpty()) {
            System.out.println(-1);
        }
        else {
            long ret = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++)
                    if (ans[i][j] != INF)
                        ret += ans[i][j];
            }
            System.out.println(ret);
        }
    }

    private void add(Edge e) {
        ans[e.a][e.b] = ans[e.b][e.a] = e.cost;
        for (int i = 0; i < n; i++) {
            dp[i][e.b] = dp[e.b][i] =
                    Math.min(dp[i][e.b], dp[i][e.a] + e.cost);
            dp[i][e.a] = dp[e.a][i] =
                    Math.min(dp[i][e.a], dp[i][e.b] + e.cost);
        }
    }

    private void print() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (ans[i][j] == INF)
                    System.out.printf("INF ");
                else
                    System.out.printf("%2d ", ans[i][j]);
            }
            System.out.println();
        }
    }

    private class Edge {
        int a, b;
        long cost;
        Edge (int a, int b, long c) {
            this.a = a;
            this.b = b;
            this.cost = c;
        }

        @Override
        public String toString() {
            return String.format("%3d <-> %3d: %d", a, b, cost);
        }
    }
}
