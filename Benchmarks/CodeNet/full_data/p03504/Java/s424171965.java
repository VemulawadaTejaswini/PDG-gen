import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.StringJoiner;
import java.util.TreeSet;

class Main {

    static PrintWriter out;
    static InputReader sc;

    public static void main(String[] args) {
        sc = new InputReader(System.in);
        out = new PrintWriter(System.out);
        solve();
        out.flush();
    }

    static void solve() {
        final int INF = Integer.MAX_VALUE / 3;
        int N = sc.nextInt();
        int C = sc.nextInt();
        List<List<Pair>> ps = new ArrayList<>();
        for (int i = 0; i < C; i++) {
            ps.add(new ArrayList<>());
        }
        for (int i = 0; i < N; i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            int c = sc.nextInt() - 1;
            ps.get(c).add(new Pair(s, t));
        }
        for (List<Pair> list : ps) {
            for (int i = 0; i < list.size(); i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(i).t == list.get(j).s) {
                        list.get(i).t = list.get(j).t;
                        list.get(j).s = INF;
                        N--;
                    } else if (list.get(j).t == list.get(i).s) {
                        list.get(j).t = list.get(i).t;
                        list.get(i).s = INF;
                        N--;
                    }
                }
            }
        }
        int[] s = new int[N];
        int[] t = new int[N];
        int idx = 0;
        int max = 0;
        for (List<Pair> list : ps) {
            for (Pair p : list) {
                if (p.s != INF) {
                    s[idx] = p.s - 1;
                    t[idx] = p.t;
                    max = Math.max(max, t[idx]);
                    idx++;
                }
            }
        }
        max = compress(s, t, max);
        int[] cnt = new int[max + 1];
        for (int i = 0; i < N; i++) {
            for (int j = s[i]; j < t[i]; j++) {
                cnt[j]++;
            }
        }
        int ans = 0;
        for (int i : cnt) {
            ans = Math.max(ans, i);
        }
        out.println(ans);
    }

    /**
     * C++のPairと同じ
     */
    public static class Pair implements Comparable<Pair> {
        int s;
        int t;

        public Pair(int first, int second) {
            this.s = first;
            this.t = second;
        }

        @Override
        public int hashCode() {
            return Integer.valueOf(this.s + this.t).hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pair)) {
                return false;
            }
            Pair pair = (Pair) obj;
            return this.s == pair.s && this.t == pair.t;
        }

        @Override
        public int compareTo(Pair o) {
            return Integer.compare(this.s, o.s);
        }

        @Override
        public String toString() {
            return String.format("{%d,%d}", this.s, this.t);
        }

    }

    /**
     * 座標を圧縮し、長さを返す O(n log(n)).
     *
     * <pre>
     * {@code
     * W = compress(x1, x2, W);
     * H = compress(y1, y2, H);
     *  }
     * </pre>
     *
     * みたいに使って圧縮する
     *
     * @param x1
     * @param x2
     * @param w
     * @return 座標圧縮後の長さ
     */
    public static int compress(int[] x1, int[] x2, int w) {
        int n = x1.length;
        // 自動でソートしてくれる
        TreeSet<Integer> set = new TreeSet<>();
        // 両端を入れないと端の余白が消える
//        set.add(0);
//        set.add(w);
        for (int i = 0; i < n; i++) {
            set.add(x1[i]);
            set.add(x2[i]);
        }
        int nw = set.size();
        Integer[] x = set.toArray(new Integer[nw]);
        for (int i = 0; i < n; i++) {
            x1[i] = Arrays.binarySearch(x, x1[i]);
            x2[i] = Arrays.binarySearch(x, x2[i]);
        }
        return nw - 1;
    }

    static void debug(Object... args) {
        StringJoiner j = new StringJoiner(" ");
        for (Object arg : args) {
            if (arg == null) {
                j.add("null");
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