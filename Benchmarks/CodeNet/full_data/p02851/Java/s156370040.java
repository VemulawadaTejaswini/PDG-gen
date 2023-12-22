import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.TreeMap;
import java.util.Map;
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
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ERemOfSumIsNum solver = new ERemOfSumIsNum();
        solver.solve(1, in, out);
        out.close();
    }

    static class ERemOfSumIsNum {
        PrintWriter out;
        InputReader in;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            this.out = out;
            this.in = in;
            int n = ni();
            long k = nl();
            TreeMap<Long, Long> tmap = new TreeMap<>();
            int i = 0;
            long[] pf = new long[n + 1];
            tmap.put(0l, 1l);
            long ans = 0;
            int curr = 0;
            for (i = 1; i <= n; i++) {
                pf[i] = (pf[i - 1] + nl()) % k;
                //pn(pf[i]);
                ans += tmap.getOrDefault(pf[i] - i, 0l);
                if (pf[i] + k - i >= 0)
                    ans += tmap.getOrDefault(pf[i] + k - i, 0l);
                tmap.put(pf[i] - i, tmap.getOrDefault(pf[i] - i, 0l) + 1l);
                if (curr + k == i) {
                    long x = tmap.get(pf[curr] - curr);
                    tmap.put(pf[curr] - curr, --x);
                    curr++;
                }
                //pn(tmap +" "+ans+" "+i+" "+pf[i]);
            }
            pn(ans);

        }

        int ni() {
            return in.nextInt();
        }

        long nl() {
            return in.nextLong();
        }

        void pn(long zx) {
            out.println(zx);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new UnknownError();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new UnknownError();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public String next() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuffer res = new StringBuffer();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));

            return res.toString();
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

