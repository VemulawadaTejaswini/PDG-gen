import java.io.*;
import java.util.*;

public class Main {

    class Pair {
        int r, c;
        long value;

        public Pair(int r, int c, long value) {
            this.r = r;
            this.c = c;
            this.value = value;
        }
    }

    class Graph {
        class Edge {
            int from, to;
            long diff;

            public Edge(int from, int to, long diff) {
                this.from = from;
                this.to = to;
                this.diff = diff;
            }
        }

        List<Edge>[] graph;
        long[] vals;
        boolean[] vis;

        public Graph(int n) {
            graph = new List[n];
            for (int i = 0; i < n; i++) {
                graph[i] = new ArrayList<>();
            }
            vals = new long[n];
            Arrays.fill(vals, Long.MAX_VALUE / 3);
            vis = new boolean[n];
        }

        void run(int u, long init) {
            if (!vis[u]) {
                dfs(u, init);
            }
        }

        void dfs(int u, long cur) {
            vals[u] = cur;
            vis[u] = true;
            for (int t = 0; t < graph[u].size(); t++) {
                Edge e = graph[u].get(t);
                if (!vis[e.to]) {
                    dfs(e.to, cur + e.diff);
                }
            }
        }

        void addEdge(int from, int to, long cost) {
            graph[from].add(new Edge(from, to, cost));
            graph[to].add(new Edge(to, from, -cost));
        }
    }


    public void solve() {
        int r = in.nextInt(), c = in.nextInt();
        int n = in.nextInt();
        Pair[] p = new Pair[n];
        for (int i = 0; i < n; i++) {
            p[i] = new Pair(in.nextInt() - 1, in.nextInt() - 1, in.nextInt());
        }
        Graph rows = new Graph(r), cols = new Graph(c);

        Arrays.sort(p, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if (o1.r == o2.r) {
                    return Integer.compare(o1.c, o2.c);
                }
                return Integer.compare(o1.r, o2.r);
            }
        });
        for (int i = 0; i < n; ) {
            int j = i;
            while (j < n && p[i].r == p[j].r) {
                j++;
            }

            for (int t = i; t + 1 < j; t++) {
                cols.addEdge(p[t].c, p[t + 1].c, -p[t].value + p[t + 1].value);
            }
            i = j;
        }

        Arrays.sort(p, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if (o1.c == o2.c) {
                    return Integer.compare(o1.r, o2.r);
                }
                return Integer.compare(o1.c, o2.c);
            }
        });
        for (int i = 0; i < n; ) {
            int j = i;
            while (j < n && p[i].c == p[j].c) {
                j++;
            }

            for (int t = i; t + 1 < j; t++) {
                rows.addEdge(p[t].r, p[t + 1].r, -p[t].value + p[t + 1].value);
            }
            i = j;
        }

        for (int i = 0; i < n; i++) {
            rows.run(p[i].r, 0);
            cols.run(p[i].c, 0);
        }

        Pair[] rs = new Pair[r];
        for (int i = 0; i < r; i++) {
            rs[i] = new Pair(i, 0, rows.vals[i]);
        }
        Arrays.sort(rs, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return Long.compare(o1.value, o2.value);
            }
        });
        Arrays.fill(rows.vis, false);
        for (int i = 0; i < r; i++) {
            if (!rows.vis[rs[i].r]) {
                rows.run(rs[i].r, 0);
            }
        }
        Arrays.fill(cols.vis, false);
        for (int i = 0; i < n; i++) {
            cols.run(p[i].c, p[i].value - rows.vals[p[i].r]);
        }

        for (int i = 0; i < n; i++) {
            Pair x = p[i];
            if (rows.vals[x.r] + cols.vals[x.c] != x.value) {
                out.println("No");
                return;
            }
        }

        long min1 = Long.MAX_VALUE, min2 = Long.MAX_VALUE;
        for (int i = 0; i < r; i++) {
            min1 = Math.min(min1, rows.vals[i]);
        }
        for (int j = 0; j < c; j++) {
            min2 = Math.min(min2, cols.vals[j]);
        }
        if (min1 + min2 < 0) {
            out.println("No");
            return;
        }
        out.println("Yes");
    }

    public void run() {
        in = new FastScanner();
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }

    FastScanner in;
    PrintWriter out;

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String fileName) {
            try {
                br = new BufferedReader(new FileReader(fileName));
            } catch (FileNotFoundException e) {
            }
        }

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextToken() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(nextToken());
        }

        long nextLong() {
            return Long.parseLong(nextToken());
        }

        double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
