import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.io.IOException;
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
            TaskB solver = new TaskB();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class TaskB {
        public void solve(int testNumber, FastInput in, PrintWriter out) {
            int h = in.readInt();
            int w = in.readInt();
            int n = in.readInt();
            Set<Long> set = new HashSet<>(n);
            for (int i = 0; i < n; i++) {
                set.add(DigitUtils.asLong(in.readInt(), in.readInt()));
            }
            Map<Long, Integer> cntMaps = new HashMap<>(9 * n);

            for (Long xy : set) {
                int x = DigitUtils.highBit(xy);
                int y = DigitUtils.lowBit(xy);
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        int cnt = 0;
                        int xx = x + i;
                        int yy = y + j;
                        if (cntMaps.containsKey(DigitUtils.asLong(xx, yy))) {
                            continue;
                        }
                        if (xx - 1 < 1 || xx + 1 > h || yy - 1 < 1 || yy + 1 > w) {
                            continue;
                        }
                        for (int k = -1; k <= 1; k++) {
                            for (int t = -1; t <= 1; t++) {
                                cnt += set.contains(DigitUtils.asLong(xx + k, yy + t)) ? 1 : 0;
                            }
                        }
                        cntMaps.put(DigitUtils.asLong(xx, yy), cnt);
                    }
                }
            }

            long[] numbers = new long[10];
            for (int c : cntMaps.values()) {
                numbers[c]++;
            }
            numbers[0] = (long) (h - 2) * (w - 2);
            for (int i = 1; i < 10; i++) {
                numbers[0] -= numbers[i];
            }

            for (int i = 0; i < 10; i++) {
                out.println(numbers[i]);
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
    static class DigitUtils {
        private DigitUtils() {}

        public static long asLong(int high, int low) {
            return (((long) high) << 32) | low;
        }

        public static int highBit(long x) {
            return (int) (x >> 32);
        }

        public static int lowBit(long x) {
            return (int) x;
        }

    }
}

