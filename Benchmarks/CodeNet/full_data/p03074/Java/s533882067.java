import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DHandstand solver = new DHandstand();
        solver.solve(1, in, out);
        out.close();
    }

    static class DHandstand {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            Debug debug = new Debug();
            int n = in.nextInt();
            int K = in.nextInt();
            char[] s = in.nextString().toCharArray();
            int[] a = new int[n];
            int[] type = new int[n];
            int ptr = 0;

            for (int i = 0; i < n; ) {
                int j = i;
                while (j < n && s[i] == s[j]) ++j;
                a[ptr] = j - i;
                type[ptr] = s[i] - '0';
                ++ptr;
                i = j;
            }

            a = Arrays.copyOf(a, ptr);
            type = Arrays.copyOf(type, ptr);

            int ans1 = getAnswer(a, type, K);
            for (int i = 0; i < type.length; ++i) type[i] ^= 1;
            int ans2 = getAnswer(a, type, K - 1);

            out.println(Math.max(ans1, ans2));
        }

        private int getAnswer(int[] a, int[] type, int K) {
            int ptr = 0;
            int ans = 0;
            int n = a.length;
            int curK = K;
            int cur = 0;
            for (int i = 0; i < n; ++i) {
                cur += a[i];
                if (type[i] == 0) --curK;
                while (ptr < n && curK < 0) {
                    if (type[ptr] == 0) ++curK;
                    cur -= a[ptr++];
                }
                ans = Math.max(ans, cur);
            }
            return ans;
        }

    }

    static class Debug {
        PrintWriter out;
        boolean oj;
        long timeBegin;
        Runtime runtime;

        public Debug(PrintWriter out) {
            oj = System.getProperty("ONLINE_JUDGE") != null;
            this.out = out;
            this.timeBegin = System.currentTimeMillis();
            this.runtime = Runtime.getRuntime();
        }

        public Debug() {
            oj = System.getProperty("ONLINE_JUDGE") != null;
            OutputStream outputStream = System.err;
            this.out = new PrintWriter(outputStream);
            this.timeBegin = System.currentTimeMillis();
            this.runtime = Runtime.getRuntime();
        }

        public void finalize() {
            out.flush();
            out.close();
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[8192];
        private int curChar;
        private int pnumChars;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        private int pread() {
            if (pnumChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= pnumChars) {
                curChar = 0;
                try {
                    pnumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (pnumChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = pread();
            while (isSpaceChar(c))
                c = pread();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = pread();
            }
            int res = 0;
            do {
                if (c == ',') {
                    c = pread();
                }
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = pread();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public String nextString() {
            int c = pread();
            while (isSpaceChar(c))
                c = pread();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = pread();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

