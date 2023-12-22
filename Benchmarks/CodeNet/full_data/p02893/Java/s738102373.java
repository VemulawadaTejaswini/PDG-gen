import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.TreeMap;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in Actual solution is at the top
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
            PrintWriter out = new PrintWriter(outputStream);
            TaskC solver = new TaskC();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class TaskC {
        public void solve(int testNumber, FastInput in, PrintWriter out) {
            NumberTheory.Modular mod = new NumberTheory.Modular(998244353);

            int n = in.readInt();
            int[] x = new int[n];
            int[] y = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = in.readChar() - '0';
            }

            int[] prefixVal = new int[n];
            prefixVal[0] = x[0];
            for (int i = 1; i < n; i++) {
                prefixVal[i] = mod.mul(prefixVal[i - 1], 2);
                prefixVal[i] = mod.plus(prefixVal[i], x[i]);
            }

            List<Integer> factors = new ArrayList<>();
            for (int i = 1; i < n; i++) {
                if (n % i == 0 && n / i % 2 == 1) {
                    factors.add(i);
                }
            }


            TreeMap<Integer, Integer> cntMap = new TreeMap<>();
            for (int d : factors) {
                int cnt = prefixVal[d - 1];
                repeat(y, x, d);
                if (compare(x, y) >= 0) {
                    cnt = mod.plus(cnt, 1);
                }
                cntMap.put(d, cnt);
            }


            for (int d : factors) {
                int cnt = cntMap.get(d);
                for (int dd : factors) {
                    if (dd < d && d % dd == 0) {
                        cnt = mod.subtract(cnt, cntMap.get(dd));
                    }
                }
                cntMap.put(d, cnt);
            }

            int ans = 0;
            int total = mod.plus(prefixVal[n - 1], 1);
            for (int d : factors) {
                int cnt = cntMap.get(d);
                ans = mod.plus(ans, mod.mul(2 * d, cnt));
                total = mod.subtract(total, cnt);
            }

            ans = mod.plus(ans, mod.mul(total, 2 * n));

            out.println(ans);
        }

        public int compare(int[] a, int[] b) {
            int n = a.length;
            for (int i = 0; i < n; i++) {
                if (a[i] != b[i]) {
                    return a[i] - b[i];
                }
            }
            return 0;
        }

        public void repeat(int[] target, int[] s, int k) {
            for (int i = 0; i < target.length; i += k) {
                if (i / k % 2 == 0) {
                    for (int j = 0; j < k; j++) {
                        target[i + j] = s[j];
                    }
                } else {
                    for (int j = 0; j < k; j++) {
                        target[i + j] = 1 - s[j];
                    }
                }
            }
        }

    }
    static class NumberTheory {
        public static class Modular {
            int m;

            public Modular(int m) {
                this.m = m;
            }

            public int valueOf(int x) {
                x %= m;
                if (x < 0) {
                    x += m;
                }
                return x;
            }

            public int valueOf(long x) {
                x %= m;
                if (x < 0) {
                    x += m;
                }
                return (int) x;
            }

            public int mul(int x, int y) {
                return valueOf((long) x * y);
            }

            public int plus(int x, int y) {
                return valueOf(x + y);
            }

            public int subtract(int x, int y) {
                return valueOf(x - y);
            }

            public String toString() {
                return "mod " + m;
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

        public char readChar() {
            skipBlank();
            char c = (char) next;
            next = read();
            return c;
        }

    }
}

