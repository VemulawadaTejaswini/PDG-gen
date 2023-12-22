import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.StringJoiner;

class Main {

    static PrintWriter out;
    static InputReader sc;

    static final int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        sc = new InputReader(System.in);
        out = new PrintWriter(System.out);
        solve();
        out.flush();
    }

    static void solve() {
        int N = sc.nextInt();
        Dijkstra dj = new Dijkstra(N);
        for (int i = 0; i < N - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            int c = sc.nextInt();
            dj.set(a, b, c);
            dj.set(b, a, c);
        }
        int Q = sc.nextInt();
        int K = sc.nextInt() - 1;
        dj.calc(K);
        for (int i = 0; i < Q; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            out.println(dj.distance(x) + dj.distance(y));
        }
    }

    /**
     * Dijkstra法によるたんいる始点最短経路問題の実装.<br>
     * 負のコストの辺がある場合はうまく計算することはできない
     */
    public static class Dijkstra {

        private class Edge {
            long w;
            Vertex to;

            public Edge(long w, Vertex to) {
                this.w = w;
                this.to = to;
            }

        }

        private class Vertex {
            int name;
            List<Edge> adj;

            public Vertex(int name) {
                this.name = name;
                this.adj = new ArrayList<>();
            }

        }

        private class PairForDijkstra implements Comparable<PairForDijkstra> {
            long value;
            Vertex now;

            public PairForDijkstra(long value, Vertex now) {
                this.value = value;
                this.now = now;
            }

            @Override
            public int compareTo(PairForDijkstra o) {

                return Long.compare(this.value, o.value);
            }

        }

        private final long INF = Long.MAX_VALUE / 3;
        private Vertex[] g;
        private PriorityQueue<PairForDijkstra> que;
        private long[] d;

        /**
         * 初期化
         *
         * @param n 要素数
         */
        public Dijkstra(int n) {
            this.g = new Vertex[n];
            this.d = new long[n];
            this.que = new PriorityQueue<>();

            for (int i = 0; i < n; i++) {
                this.g[i] = new Vertex(i);
            }
        }

        public void set(int from, int to, long cost) {
            Vertex u = this.g[from];
            Vertex v = this.g[to];
            u.adj.add(new Edge(cost, v));
        }

        /**
         * 始点sから各頂点への最短距離を計算する O(|E|log|V|)
         *
         * @param s
         */
        public void calc(int s) {
            Arrays.fill(this.d, this.INF);
            this.d[s] = 0;
            this.que.add(new PairForDijkstra(0, this.g[s]));

            while (this.que.size() > 0) {
                PairForDijkstra t = this.que.poll();
                int from = t.now.name;
                List<Edge> toes = t.now.adj;
                if (this.d[from] < t.value) {
                    continue;
                }
                for (Edge e : toes) {
                    int to = e.to.name;
                    long cost = e.w;
                    if (this.d[to] > this.d[from] + cost) {
                        this.d[to] = this.d[from] + cost;
                        this.que.add(new PairForDijkstra(this.d[to], e.to));
                    }
                }
            }
        }

        /**
         * 始点からgまでの最短距離を返す O(1).<br>
         * 経路が存在しない場合はINF(Long.MAX_VALUE / 3)を返す
         *
         * @param g
         * @return 始点からgまでの最短距離
         */
        public long distance(int g) {
            return this.d[g];
        }
    }

    static void debug(Object... args) {
        StringJoiner j = new StringJoiner(" ");
        for (Object arg : args) {
            Class<?> type = arg.getClass();
            if (type.getComponentType().isArray()) {
                for (Object o : (Object[]) arg) {
                    debug(o);
                }
            } else if (arg instanceof int[]) {
                j.add(Arrays.toString((int[]) arg));
            } else if (arg instanceof long[]) {
                j.add(Arrays.toString((long[]) arg));
            } else if (arg instanceof double[]) {
                j.add(Arrays.toString((double[]) arg));
            } else if (arg instanceof char[]) {
                j.add(Arrays.toString((char[]) arg));
            } else if (arg instanceof boolean[]) {
                j.add(Arrays.toString((boolean[]) arg));
            } else if (arg instanceof Object[]) {
                j.add(Arrays.toString((Object[]) arg));
            } else {
                j.add(arg.toString());
            }
        }
        System.err.println(j.toString());
    }

    static class InputReader {

        private InputStream in;
        private byte[] buffer = new byte[1024];
        private int curbuf;
        private int lenbuf;

        public InputReader(InputStream in) {
            this.in = in;
            this.curbuf = this.lenbuf = 0;
        }

        public boolean hasNextByte() {
            if (this.curbuf >= this.lenbuf) {
                this.curbuf = 0;
                try {
                    this.lenbuf = this.in.read(this.buffer);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (this.lenbuf <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (this.hasNextByte()) {
                return this.buffer[this.curbuf++];
            } else {
                return -1;
            }
        }

        private boolean isSpaceChar(int c) {
            return !(c >= 33 && c <= 126);
        }

        private void skip() {
            while (this.hasNextByte() && this.isSpaceChar(this.buffer[this.curbuf])) {
                this.curbuf++;
            }
        }

        public boolean hasNext() {
            this.skip();
            return this.hasNextByte();
        }

        public String next() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            StringBuilder sb = new StringBuilder();
            int b = this.readByte();
            while (!this.isSpaceChar(b)) {
                sb.appendCodePoint(b);
                b = this.readByte();
            }
            return sb.toString();
        }

        public int nextInt() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            int c = this.readByte();
            while (this.isSpaceChar(c)) {
                c = this.readByte();
            }
            boolean minus = false;
            if (c == '-') {
                minus = true;
                c = this.readByte();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res = res * 10 + c - '0';
                c = this.readByte();
            } while (!this.isSpaceChar(c));
            return minus ? -res : res;
        }

        public long nextLong() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            int c = this.readByte();
            while (this.isSpaceChar(c)) {
                c = this.readByte();
            }
            boolean minus = false;
            if (c == '-') {
                minus = true;
                c = this.readByte();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res = res * 10 + c - '0';
                c = this.readByte();
            } while (!this.isSpaceChar(c));
            return minus ? -res : res;
        }

        public double nextDouble() {
            return Double.parseDouble(this.next());
        }

        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = this.nextInt();
            }
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = this.nextLong();
            }
            return a;
        }

        public char[][] nextCharMap(int n, int m) {
            char[][] map = new char[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = this.next().toCharArray();
            }
            return map;
        }
    }
}