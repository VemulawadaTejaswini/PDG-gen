// package arc.arc078;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    private static final int INF = 1000000000;

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int m = in.nextInt();
        int[][] graph = new int[n][n];
        for (int i = 0; i < n ; i++) {
            Arrays.fill(graph[i], -1);
        }
        for (int i = 0; i < m ; i++) {
            int a = in.nextInt()-1;
            int b = in.nextInt()-1;
            graph[a][b] = graph[b][a] = in.nextInt();
        }

        int[][] dp = new int[1<<n][n];
        for (int i = 0; i < 1<<n ; i++) {
            Arrays.fill(dp[i], -1);
        }
        int[][] dpFrom = new int[1<<n][n];
        dp[1][0] = 0;
        for (int p = 0 ; p < (1<<n) ; p++) {
            for (int from = 0; from < n ; from++) {
                if (dp[p][from] == -1) {
                    continue;
                }
                int base = dp[p][from];
                for (int to = 0; to < n ; to++) {
                    if ((p & (1<<to)) >= 1 || graph[from][to] == -1) {
                        continue;
                    }
                    int tp = p | (1<<to);
                    int tl = base + graph[from][to];
                    if (dp[tp][to] < tl) {
                        dp[tp][to] = tl;
                        dpFrom[to][to] = from;
                    }
                }
            }
        }

        int best = 0;
        for (int p = 0 ; p < (1<<n) ; p++) {
            if (dp[p][n-1] == -1) {
                continue;
            }
            best = Math.max(best, solve(graph, dpFrom, p) + dp[p][n-1]);
        }

        int total = 0;
        for (int i = 0; i < n ; i++) {
            for (int j = i+1 ; j < n ; j++) {
                if (graph[i][j] >= 1) {
                    total += graph[i][j];
                }
            }
        }

        out.println(total - best);
        out.flush();
    }

    private static int solve(int[][] graph, int[][] dpFrom, int p) {
        int n = graph.length;
        int[] next = new int[n];
        Arrays.fill(next, -1);
        int tail = n-1;
        int set = p;
        while (tail >= 1) {
            int from = dpFrom[set][tail];
            set ^= 1<<tail;
            next[from] = tail;
            tail = from;
        }

        int total = 0;
        List<int[]> edges = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                if (graph[i][j] == -1) {
                    continue;
                }
                if (next[i] == j) {
                } else if (i < j) {
                    edges.add(new int[]{i, j, graph[i][j]});
                }
            }
        }
        Collections.sort(edges, (e1, e2) -> e2[2] - e1[2]);

        UnionFind uf = new UnionFind(n);
        for (int[] e : edges) {
            int u = uf.findWhich(e[0], p);
            int v = uf.findWhich(e[1], p);
            if (u >= 0 && v >= 0 && u != v) {
                continue;
            }
            uf.unite(e[0], e[1]);
            total += e[2];
        }
        return total;
    }

    static class UnionFind {
        int[] rank;
        int[] parent;
        int[] cnt;

        public UnionFind(int n) {
            rank = new int[n];
            parent = new int[n];
            cnt = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                cnt[i] = 1;
            }
        }

        public int findWhich(int a, int p) {
            for (int i = 0; i < cnt.length ; i++) {
                if ((p & (1<<i)) >= 1) {
                    if (issame(a, i)) {
                        return i;
                    }
                }
            }
            return -1;
        }

        public int find(int a) {
            if (parent[a] == a) {
                return a;
            }
            parent[a] = find(parent[a]);
            return parent[a];
        }

        public void unite(int a, int b) {
            a = find(a);
            b = find(b);
            if (a == b) {
                return;
            }
            if (rank[a] < rank[b]) {
                parent[a] = b;
                cnt[b] += cnt[a];
                cnt[a] = cnt[b];
            } else {
                parent[b] = a;
                cnt[a] += cnt[b];
                cnt[b] = cnt[a];
                if (rank[a] == rank[b]) {
                    rank[a]++;
                }
            }
        }

        public int groupCount(int a) {
            return cnt[find(a)];
        }

        private boolean issame(int a, int b) {
            return find(a) == find(b);
        }
    }


    public static void debug(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }

    public static class InputReader {
        private static final int BUFFER_LENGTH = 1 << 12;
        private InputStream stream;
        private byte[] buf = new byte[BUFFER_LENGTH];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        private int next() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public char nextChar() {
            return (char) skipWhileSpace();
        }

        public String nextToken() {
            int c = skipWhileSpace();
            StringBuilder res = new StringBuilder();
            do {
                res.append((char) c);
                c = next();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public int nextInt() {
            return (int) nextLong();
        }

        public long nextLong() {
            int c = skipWhileSpace();
            long sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = next();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = next();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble() {
            return Double.valueOf(nextToken());
        }

        int skipWhileSpace() {
            int c = next();
            while (isSpaceChar(c)) {
                c = next();
            }
            return c;
        }

        boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
    }
}