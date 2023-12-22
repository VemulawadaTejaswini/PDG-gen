import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Closeable;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author HBonsai
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DWeLikeAGC solver = new DWeLikeAGC();
        solver.solve(1, in, out);
        out.close();
    }

    static class DWeLikeAGC {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            // AGCT 0123
            int N = in.nextInt();
            final long MOD = (long) 1e9 + 7;
            long[][][][] dp = new long[101][4][4][4];
            // [1][ACG][T][T] = [0][T][T][T]
            dp[0][3][3][3] = 1;
            for (int len = 0; len < N; len++) {
                for (int c1 = 0; c1 < 4; c1++) {
                    for (int c2 = 0; c2 < 4; c2++) {
                        for (int c3 = 0; c3 < 4; c3++) {
                            if (dp[len][c1][c2][c3] == 0) continue;
                            for (int a = 0; a < 4; a++) {
                                if (a == 0 && c1 == 1 && c2 == 2) continue;
                                if (a == 1 && c1 == 0 && c2 == 2) continue;
                                if (a == 0 && c1 == 2 && c2 == 1) continue;
                                if (a == 0 && c2 == 1 && c3 == 2) continue;
                                if (a == 0 && c1 == 1 && c3 == 2) continue;
                                dp[len + 1][a][c1][c2] += dp[len][c1][c2][c3];
                                dp[len + 1][a][c1][c2] %= MOD;
                            }
                        }
                    }
                }
            }
            long ans = 0;
            for (int c1 = 0; c1 < 4; c1++) {
                for (int c2 = 0; c2 < 4; c2++) {
                    for (int c3 = 0; c3 < 4; c3++) {
                        ans += dp[N][c1][c2][c3];
                        ans %= MOD;
                    }
                }
            }
            out.println(ans);
        }

    }

    static class FastScanner implements Closeable {
        private final InputStream in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        public FastScanner(InputStream in) {
            this.in = in;
        }

        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
            return hasNextByte();
        }

        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) {
                throw new NumberFormatException();
            }
            while (true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }

        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }

        public void close() {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

