import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Random;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyInput in = new MyInput(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        int x;
        int y;
        int z;
        long cur;
        int n;
        long[] sum;
        Timer timer = new Timer(1800);
        final TaskD.Walker walker = new AnnealingFast(timer, 100);
        final Random random = new Random(0);

        public void solve(int testNumber, MyInput in, PrintWriter out) {
            n = in.nextInt();
            int[] a = in.nextIntArray(n);
            sum = new long[n + 1];
            for (int i = 0; i < n; i++) sum[i + 1] = sum[i] + a[i];

            x = 1;
            y = 2;
            z = 3;
            cur = func(x, y, z);
            while (!timer.signal()) {
                boolean ok = false;
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        for (int k = -1; k <= 1; k++) {
                            if (improve(x + i, y + j, z + k)) {
                                ok = true;
                            }
                        }
                    }
                }
                if (!ok) break;
            }
//        dump(x, y, z);
            out.println(cur);
        }

        boolean improve(int i, int j, int k) {
            if (i <= 0 || i >= j || j >= k || k == n) return false;
            long val = func(i, j, k);
//        dump("imp", i, j, k, val, cur);
            if (walker.accept(val - cur)) {
                cur = val;
                x = i;
                y = j;
                z = k;
                return true;
            }
            return false;
        }

        long func(int i, int j, int k) {
            long max = Math.max(sum[n] - sum[k], Math.max(sum[k] - sum[j], Math.max(sum[j] - sum[i], sum[i])));
            long min = Math.min(sum[n] - sum[k], Math.min(sum[k] - sum[j], Math.min(sum[j] - sum[i], sum[i])));
            return max - min;
        }

        interface Walker {
            boolean accept(double diffLoss);

        }

        class AnnealingFast implements TaskD.Walker {
            final Timer timer;
            final double t0;
            final double[] log = new double[65536];

            public AnnealingFast(final Timer timer, double t0) {
                this.timer = timer;
                this.t0 = t0;
                for (int i = 0; i < log.length; i++) {
                    log[i] = Math.log((double) i / log.length + 0.5 / log.length);
                }
                // G.dump(Arrays.copyOf(log, 50));
            }


            public boolean accept(double diffLoss) {
                double t = t0 * timer.scaled();
                // G.dump(t0, t);
                return diffLoss <= 0 || -diffLoss >= t * log[random.nextInt() & 65535];
            }

        }

        class Timer {
            long start;
            long time;

            public Timer(long time) {
                this.start = System.currentTimeMillis();
                this.time = time;
            }

            public double scaled() {
                return (this.start + this.time - System.currentTimeMillis()) / (double) this.time;
            }

            public boolean signal() {
                return System.currentTimeMillis() >= this.start + this.time;
            }

        }

    }

    static class MyInput {
        private final BufferedReader in;
        private static int pos;
        private static int readLen;
        private static final char[] buffer = new char[1024 * 8];
        private static char[] str = new char[500 * 8 * 2];
        private static boolean[] isDigit = new boolean[256];
        private static boolean[] isSpace = new boolean[256];
        private static boolean[] isLineSep = new boolean[256];

        static {
            for (int i = 0; i < 10; i++) {
                isDigit['0' + i] = true;
            }
            isDigit['-'] = true;
            isSpace[' '] = isSpace['\r'] = isSpace['\n'] = isSpace['\t'] = true;
            isLineSep['\r'] = isLineSep['\n'] = true;
        }

        public MyInput(InputStream is) {
            in = new BufferedReader(new InputStreamReader(is));
        }

        public int read() {
            if (pos >= readLen) {
                pos = 0;
                try {
                    readLen = in.read(buffer);
                } catch (IOException e) {
                    throw new RuntimeException();
                }
                if (readLen <= 0) {
                    throw new MyInput.EndOfFileRuntimeException();
                }
            }
            return buffer[pos++];
        }

        public int nextInt() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            int i = 0;
            int ret = 0;
            if (str[0] == '-') {
                i = 1;
            }
            for (; i < len; i++) ret = ret * 10 + str[i] - '0';
            if (str[0] == '-') {
                ret = -ret;
            }
            return ret;
        }

        public char nextChar() {
            while (true) {
                final int c = read();
                if (!isSpace[c]) {
                    return (char) c;
                }
            }
        }

        int reads(int len, boolean[] accept) {
            try {
                while (true) {
                    final int c = read();
                    if (accept[c]) {
                        break;
                    }
                    if (str.length == len) {
                        char[] rep = new char[str.length * 3 / 2];
                        System.arraycopy(str, 0, rep, 0, str.length);
                        str = rep;
                    }
                    str[len++] = (char) c;
                }
            } catch (MyInput.EndOfFileRuntimeException e) {
            }
            return len;
        }

        public int[] nextIntArray(final int n) {
            final int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
        }

        static class EndOfFileRuntimeException extends RuntimeException {
        }

    }
}

