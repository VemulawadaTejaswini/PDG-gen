import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
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
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int nx = 0;
        int ny = 0;
        for (int n = X / 2; n >= 0; n--) {
            if (1 * n + 2 * (X - 2 * n) == Y) {
                nx = n;
                break;
            }
        }
        for (int n = Y / 2; n >= 0; n--) {
            if (1 * n + 2 * (Y - 2 * n) == X) {
                ny = n;
                break;
            }
        }
        if (nx == 0 && ny == 0) {
            out.println(0);
            return;
        }
        Comb comb = new Comb(nx + ny, MOD);
        out.println(comb.combination(nx + ny, nx));
    }

    /**
     * コンピネーション、パーミネーションの実装
     */
    public static class Comb {
        private long[] fac, finv, inv;
        private int MOD;

        /**
         * 初期化 O(MAX)
         *
         * @param MAX 処理する数の上限
         * @param MOD
         */
        public Comb(int MAX, int MOD) {
            MAX++;
            this.fac = new long[MAX];
            this.finv = new long[MAX];
            this.inv = new long[MAX];
            this.MOD = MOD;

            this.fac[0] = this.fac[1] = 1;
            this.finv[0] = this.finv[1] = 1;
            this.inv[1] = 1;
            for (int i = 2; i < MAX; i++) {
                this.fac[i] = this.fac[i - 1] * i % MOD;
                this.inv[i] = MOD - this.inv[MOD % i] * (MOD / i) % MOD;
                this.finv[i] = this.finv[i - 1] * this.inv[i] % MOD;
            }
        }

        /**
         * nCkを求める O(1)
         *
         * @param n
         * @param k
         * @return nCk
         */
        public long combination(int n, int k) {
            if (n < k) {
                return 0;
            }
            if (n < 0 || k < 0) {
                return 0;
            }
            return this.fac[n] * (this.finv[k] * this.finv[n - k] % this.MOD) % this.MOD;
        }

        /**
         * nPkを求める O(1)
         *
         * @param n
         * @param k
         * @return nPk
         */
        public long permutation(int n, int k) {
            if (n < k) {
                return 0;
            }
            if (n < 0 || k < 0) {
                return 0;
            }
            return this.fac[n] * (this.finv[n - k] % this.MOD) % this.MOD;
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