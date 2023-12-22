import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Aman Kumar Singh
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DKnight solver = new DKnight();
        solver.solve(1, in, out);
        out.close();
    }

    static class DKnight {
        long mod = 1000000007;
        int MAXN = 10000005;
        PrintWriter out;
        InputReader in;
        int n;
        int m;
        long[] fact = new long[MAXN / 10];
        long[] inv_fact = new long[MAXN / 10];

        void pre() {
            int i = 0;
            fact[0] = 1;
            inv_fact[0] = 1;
            for (i = 1; i < MAXN / 10; i++) {
                fact[i] = fact[i - 1] * i;
                fact[i] %= mod;
                inv_fact[i] = power(fact[i], mod - 2);
            }
        }

        long nCr(int x, int y) {
            if (x < y)
                return 0;
            long ans = fact[x];
            ans *= inv_fact[y];
            ans %= mod;
            ans *= inv_fact[x - y];
            ans %= mod;
            return ans;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            this.out = out;
            this.in = in;
            n = ni();
            m = ni();
            pre();
            int i = 0;
            int cnt = 0;
            long ans = 0;
            while (i < MAXN) {
                if (n + m == i) {
                    int x = cnt * 2;
                    int y = cnt;
                    if (n > x || m < y)
                        ans = 0;
                    else {
                        int hola = Math.abs(n - x) + Math.abs(m - y);
                        if (hola / 2 > cnt + 1)
                            ans = 0;
                        else
                            ans = nCr(cnt, hola / 2);
                    }
                    break;
                }
                i += 3;
                cnt++;
            }
            pn(ans);
        }

        int ni() {
            return in.nextInt();
        }

        void pn(long zx) {
            out.println(zx);
        }

        long power(long x, long y) {
            if (y == 0) {
                return 1;
            }
            long p = power(x, y / 2) % mod;
            p = (p * p) % mod;
            return (y % 2 == 0) ? p : (x * p) % mod;
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

