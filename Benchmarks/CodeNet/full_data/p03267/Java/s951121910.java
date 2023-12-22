import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.PrintWriter;

import java.util.Arrays;
import java.util.ArrayList;

class Edge implements Comparable<Edge> {
    // 頂点番号 最小コスト
    int to;
    int cost;

    Edge(int to, int cost) {
        this.to = to;
        this.cost = cost;
    }

    // x.compereTo(y)
    // x は cost
    // y は Edge.cost
    @Override
    public int compareTo(Edge edge) {
        return this.cost - edge.cost;
    }
}

@SuppressWarnings("unchecked")
public class Main {
    static final String sp = " ";

    public static void main(String[] args) throws IOException {
        final String s;

        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            s = reader.readLine();
        }

        PrintWriter out = new PrintWriter(System.out);

        int L = Integer.parseInt(s);

        // log 2
        int r = (int)Math.floor(Math.log(L) / Math.log(2.0));

        int N = r + 1;

        ArrayList<Edge>[] routeList = new ArrayList[N];

        for (int i = 0; i < N; i++) routeList[i] = new ArrayList<>();

        int cnt = 0;

        // t = {0, 1, …, N - 1}
        // 頂点 t + 1 から t + 2 へ
        // コスト 2^t と 0 の辺を張る
        for (int t = 0; t < N - 1; t++) {
            // 0-indexed
            routeList[t].add(new Edge(t + 1, (int)Math.pow(2,t)));
            routeList[t].add(new Edge(t + 1, 0));
            cnt++;
            cnt++;
        }

        // t = {N - 1, N - 2, …, 1}
        // 2^r <= L - 2^(t-1) 満たすなら
        // 頂点 t から 頂点 N に対してコスト L - 2^(t-1) の辺を張る
        // L から 2^(t-1)を引く
        for (int t = N - 1; 0 < t; t--) {
            int num1 = (int)Math.pow(2, r);

            int num2 = (int)Math.pow(2, t - 1);
            if (num1 - 1 < L - num2) {
                // 0-indexed
                routeList[t - 1].add(new Edge(N - 1, L - num2));
                cnt++;
                L -= num2;
            }
        }

        // 頂点の数 辺の数
        out.println(N + sp + cnt);
        for (int i = 0; i < N; i++) {
            for (Edge e : routeList[i]) {
                // 0-indexed
                Integer from = i + 1;
                int to = e.to + 1;
                int cost = e.cost;
                out.println(from + sp + to + sp + cost);
            }
        }

        out.flush();
    }
}
