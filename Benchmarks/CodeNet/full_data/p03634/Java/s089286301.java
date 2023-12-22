import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    int n;
    ArrayList<Edge>[] es;
    int q, k;
    int[] xs, ys;

    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        es = new ArrayList[n];
        for (int i = 0; i < n; i++)
            es[i] = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            long c = sc.nextLong();
            es[a].add(new Edge(a, b, c));
            es[b].add(new Edge(b, a, c));
        }
        q = sc.nextInt(); k = sc.nextInt()-1;
        xs = new int[q]; ys = new int[q];
        for (int i = 0; i < q; i++) {
            xs[i] = sc.nextInt() - 1;
            ys[i] = sc.nextInt() - 1;
        }
    }

    private void solve() {
        long[] ret = new long[n];
        Arrays.fill(ret, Long.MAX_VALUE);
        boolean[] used = new boolean[n];
        dfs(k, 0L, used, ret);
        long d1, d2;
        for (int i = 0; i < q; i++) {
            d1 = ret[xs[i]]; d2 = ret[ys[i]];
            System.out.println(d1+d2);
        }
    }


    private void dfs(int cur, long cost, boolean[] used, long[] path) {
        if (used[cur])
            return;
        used[cur] = true;
        path[cur] = cost;
        for (Edge e: es[cur]) {
            if (!used[e.b]) {
                dfs(e.b, cost + e.c, used, path);
            }
        }
    }

    private class Edge {
        int a, b;
        long c;
        Edge(int a, int b, long c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
