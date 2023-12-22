import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.StringJoiner;

class Main {

    static final int MOD = (int) 1e9 + 7;
    static final long INF = Long.MAX_VALUE / 2;
    static PrintWriter out;
    static InputReader sc;

    static int N;
    static WarshallFloyd wf;
    static long[][] cost;
    static boolean[][] edge;
    static boolean[][] used;

    public static void main(String[] args) {
        sc = new InputReader(System.in);
        out = new PrintWriter(System.out);
        solve();
        out.flush();
    }

    static void solve() {
        N = sc.nextInt();
        int M = sc.nextInt();
        wf = new WarshallFloyd(N);
        cost = new long[N][N];
        edge = new boolean[N][N];
        used = new boolean[N][N];
        fill(cost, INF);
        for (int i = 0; i < N; i++) {
            cost[i][i] = 0;
        }
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            int c = sc.nextInt();
            wf.set(a, b, c);
            wf.set(b, a, c);
            cost[a][b] = cost[b][a] = c;
            edge[a][b] = edge[b][a] = true;
        }
        wf.calc();
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                restore(i, j);
            }
        }
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (edge[i][j]) {
                    cnt++;
                }
            }
        }
        out.println(cnt);
    }

    static void restore(int i, int j) {
        if (i == j) {
            return;
        }
        if (i > j) {
            int tmp = i;
            i = j;
            j = tmp;
        }
        if (used[i][j]) {
            return;
        }
        for (int k = 0; k < N; k++) {
            if (i == k) {
                continue;
            }
            if (wf.distance(i, j) == cost[i][k] + wf.distance(k, j)) {
                edge[i][k] = edge[k][i] = false;
                restore(k, j);
            }
        }
        used[i][j] = true;
    }

    /**
     * 多次元配列arrayの値をすべてvalueにする
     *
     * @param array
     * @param value
     */
    public static void fill(Object array, Object value) {

        // 第一引数が配列か判定
        Class<?> type = array.getClass();
        if (!type.isArray()) {
            throw new IllegalArgumentException("not array");
        }

        // クラスの型を判定
        String arrayClassName = array.getClass().getSimpleName().replace("[]", "").toLowerCase();
        String valueClassName = value.getClass().getSimpleName().toLowerCase().replace("character", "char")
                .replace("integer", "int");
        if (!arrayClassName.equals(valueClassName)) {
            throw new IllegalArgumentException("does not match");
        }

        // 処理
        if (type.getComponentType().isArray()) {
            for (Object o : (Object[]) array) {
                fill(o, value);
            }
        } else if (array instanceof boolean[]) {
            Arrays.fill((boolean[]) array, (boolean) value);
        } else if (array instanceof char[]) {
            Arrays.fill((char[]) array, (char) value);
        } else if (array instanceof byte[]) {
            Arrays.fill((byte[]) array, (byte) value);
        } else if (array instanceof short[]) {
            Arrays.fill((short[]) array, (short) value);
        } else if (array instanceof int[]) {
            Arrays.fill((int[]) array, (int) value);
        } else if (array instanceof long[]) {
            Arrays.fill((long[]) array, (long) value);
        } else if (array instanceof float[]) {
            Arrays.fill((float[]) array, (float) value);
        } else if (array instanceof double[]) {
            Arrays.fill((double[]) array, (double) value);
        } else {
            Arrays.fill((Object[]) array, value);
        }
    }

    /**
     * WarshallFloyd法による全点対最短経路問題の実装.<br>
     * 負の辺があっても動作する
     */
    public static class WarshallFloyd {

        private final long INF = Long.MAX_VALUE / 3;
        private long[][] d;
        private int V;

        /**
         * 初期化
         *
         * @param n 頂点の数
         */
        public WarshallFloyd(int n) {
            this.d = new long[n][n];
            for (long[] ls : this.d) {
                Arrays.fill(ls, this.INF);
            }
            for (int i = 0; i < n; i++) {
                this.d[i][i] = 0;
            }
            this.V = n;
        }

        public void set(int from, int to, long cost) {
            this.d[from][to] = cost;
        }

        /**
         * すべての2頂点間の最短距離を計算する O(|V|^3)
         */
        public void calc() {
            for (int k = 0; k < this.V; k++) {
                for (int i = 0; i < this.V; i++) {
                    for (int j = 0; j < this.V; j++) {
                        this.d[i][j] = Math.min(this.d[i][j], this.d[i][k] + this.d[k][j]);
                    }
                }
            }
        }

        /**
         * fromからtoまでの最短距離を返す O(1).<br>
         * 経路が存在しない場合はINF(Long.MAX_VALUE / 3)を返す
         *
         * @param from
         * @param to
         * @return fromからtoまでの最短距離
         */
        public long distance(int from, int to) {
            return this.d[from][to];
        }

    }

    static void debug(Object... args) {
        StringJoiner j = new StringJoiner(" ");
        for (Object arg : args) {
            Class<?> type = arg.getClass();
            if (!type.isArray()) {
                j.add(arg.toString());
            } else if (type.getComponentType().isArray()) {
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