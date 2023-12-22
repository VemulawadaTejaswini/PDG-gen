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
        int N = sc.nextInt();
        String s = sc.next();
        char[][] c = { { 'S', 'S' }, { 'S', 'W' }, { 'W', 'S' }, { 'W', 'W' } };
        for (int i = 0; i < 4; i++) {
            char[] ans = calc(c[i][0], c[i][1], s);
            if (ans != null) {
                out.println(String.valueOf(ans));
                return;
            }
        }
        out.println(-1);
    }

    static char[] calc(char c1, char c2, String s) {
        int N = s.length();
        char[] res = new char[N];
        res[0] = c1;
        res[1] = c2;
        for (int i = 1; i < N - 1; i++) {
            if (res[i - 1] == 'S' && res[i] == 'S') {
                if (s.charAt(i) == 'o') {
                    res[i + 1] = 'S';
                } else {
                    res[i + 1] = 'W';
                }
            } else if (res[i - 1] == 'W' && res[i] == 'S') {
                if (s.charAt(i) == 'o') {
                    res[i + 1] = 'W';
                } else {
                    res[i + 1] = 'S';
                }
            } else if (res[i - 1] == 'S' && res[i] == 'W') {
                if (s.charAt(i) == 'o') {
                    res[i + 1] = 'W';
                } else {
                    res[i + 1] = 'S';
                }
            } else if (res[i - 1] == 'W' && res[i] == 'W') {
                if (s.charAt(i) == 'o') {
                    res[i + 1] = 'S';
                } else {
                    res[i + 1] = 'W';
                }
            }
        }
        if (res[0] == 'S') {
            if (s.charAt(0) == 'o') {
                if (res[1] == 'S' && res[N - 1] == 'W' || res[1] == 'W' && res[N - 1] == 'S') {
                    return null;
                }
            } else {
                if (res[1] == 'S' && res[N - 1] == 'S' || res[1] == 'W' && res[N - 1] == 'W') {
                    return null;
                }
            }
        } else {
            if (s.charAt(0) == 'o') {
                if (res[1] == 'S' && res[N - 1] == 'S' || res[1] == 'W' && res[N - 1] == 'W') {
                    return null;
                }
            } else {
                if (res[1] == 'S' && res[N - 1] == 'W' || res[1] == 'W' && res[N - 1] == 'S') {
                    return null;
                }
            }
        }
        if (res[N - 1] == 'S') {
            if (s.charAt(N - 1) == 'o') {
                if (res[0] == 'S' && res[N - 2] == 'W' || res[0] == 'W' && res[N - 2] == 'S') {
                    return null;
                }
            } else {
                if (res[0] == 'S' && res[N - 2] == 'S' || res[0] == 'W' && res[N - 2] == 'W') {
                    return null;
                }
            }
        } else {
            if (s.charAt(N - 1) == 'o') {
                if (res[0] == 'S' && res[N - 2] == 'S' || res[0] == 'W' && res[N - 2] == 'W') {
                    return null;
                }
            } else {
                if (res[0] == 'S' && res[N - 2] == 'W' || res[0] == 'W' && res[N - 2] == 'S') {
                    return null;
                }
            }
        }
        return res;
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