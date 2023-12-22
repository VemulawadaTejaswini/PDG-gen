import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.io.UncheckedIOException;
import java.util.List;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author daltao
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "daltao", 1 << 27);
        thread.start();
        thread.join();
    }

    static class TaskAdapter implements Runnable {
        @Override
        public void run() {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            FastInput in = new FastInput(inputStream);
            FastOutput out = new FastOutput(outputStream);
            TaskC solver = new TaskC();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class TaskC {
        int n;
        int m;
        int[][][] dp;
        List<int[]>[] constraints;
        NumberTheory.Modular mod = new NumberTheory.Modular(1e9 + 7);

        public void solve(int testNumber, FastInput in, FastOutput out) {
            n = in.readInt();
            m = in.readInt();
            constraints = new List[n + 1];
            for (int i = 0; i <= n; i++) {
                constraints[i] = new ArrayList<>();
            }
            for (int i = 0; i < m; i++) {
                int l = in.readInt();
                int r = in.readInt();
                int x = in.readInt();
                constraints[r].add(new int[]{l, r, x});
            }
            dp = new int[n + 2][n + 1][n + 1];
            dp[1][0][0] = 3;
            for (int i = 1; i <= n; i++) {
                for (int[] c : constraints[i]) {
                    for (int j = 0; j <= n; j++) {
                        for (int k = 0; k <= n; k++) {
                            int cnt = 1;
                            if (j >= c[0]) {
                                cnt++;
                            }
                            if (k >= c[0]) {
                                cnt++;
                            }
                            if (cnt != c[2]) {
                                dp[i][j][k] = 0;
                            }
                        }
                    }
                }
                for (int j = 0; j <= n; j++) {
                    for (int k = 0; k <= n; k++) {
                        int plus = dp[i][j][k];
                        dp[i + 1][j][k] = mod.plus(dp[i + 1][j][k], plus);
                        if (j == 0) {
                            dp[i + 1][i][k] = mod.plus(dp[i + 1][i][k], plus);
                            dp[i + 1][i][k] = mod.plus(dp[i + 1][i][k], plus);
                        } else {
                            dp[i + 1][i][k] = mod.plus(dp[i + 1][i][k], plus);
                        }
                        if (j > 0) {
                            dp[i + 1][i][j] = mod.plus(dp[i + 1][i][j], plus);
                        }
                    }
                }
            }

            int ans = 0;
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    if (dp[n][i][j] == 0) {
                        continue;
                    }
                    ans = mod.plus(ans, dp[n][i][j]);
                }
            }

            out.println(ans);
        }

    }

    static class NumberTheory {
        public static class Modular {
            int m;

            public Modular(int m) {
                this.m = m;
            }

            public Modular(long m) {
                this.m = (int) m;
                if (this.m != m) {
                    throw new IllegalArgumentException();
                }
            }

            public Modular(double m) {
                this.m = (int) m;
                if (this.m != m) {
                    throw new IllegalArgumentException();
                }
            }

            public int valueOf(int x) {
                x %= m;
                if (x < 0) {
                    x += m;
                }
                return x;
            }

            public int plus(int x, int y) {
                return valueOf(x + y);
            }

            public String toString() {
                return "mod " + m;
            }

        }

    }

    static class FastOutput implements AutoCloseable, Closeable {
        private StringBuilder cache = new StringBuilder(10 << 20);
        private final Writer os;

        public FastOutput(Writer os) {
            this.os = os;
        }

        public FastOutput(OutputStream os) {
            this(new OutputStreamWriter(os));
        }

        public FastOutput println(int c) {
            cache.append(c).append('\n');
            return this;
        }

        public FastOutput flush() {
            try {
                os.append(cache);
                cache.setLength(0);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
            return this;
        }

        public void close() {
            flush();
            try {
                os.close();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }

    }

    static class FastInput {
        private final InputStream is;
        private byte[] buf = new byte[1 << 13];
        private int bufLen;
        private int bufOffset;
        private int next;

        public FastInput(InputStream is) {
            this.is = is;
        }

        private int read() {
            while (bufLen == bufOffset) {
                bufOffset = 0;
                try {
                    bufLen = is.read(buf);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if (bufLen == -1) {
                    return -1;
                }
            }
            return buf[bufOffset++];
        }

        public void skipBlank() {
            while (next >= 0 && next <= 32) {
                next = read();
            }
        }

        public int readInt() {
            int sign = 1;

            skipBlank();
            if (next == '+' || next == '-') {
                sign = next == '+' ? 1 : -1;
                next = read();
            }

            int val = 0;
            if (sign == 1) {
                while (next >= '0' && next <= '9') {
                    val = val * 10 + next - '0';
                    next = read();
                }
            } else {
                while (next >= '0' && next <= '9') {
                    val = val * 10 - next + '0';
                    next = read();
                }
            }

            return val;
        }

    }
}

