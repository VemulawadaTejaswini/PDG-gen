import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.stream.LongStream;
import java.util.Collection;
import java.io.IOException;
import java.util.Random;
import java.util.ArrayList;
import java.io.UncheckedIOException;
import java.util.List;
import java.util.stream.Stream;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
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
            FastOutput out = new FastOutput(outputStream);
            TaskE solver = new TaskE();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class TaskE {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();

            Rect[] rects = new Rect[n];
            List<Long> summary = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                rects[i] = new Rect();
                for (int j = 0; j < 4; j++) {
                    rects[i].colors[j] = in.readInt();
                }
                long s = summaryOf(rects[i]);
                for (int j = 0; j < 4; j++) {
                    summary.add(s);
                    s = rotate(s);
                }
            }

            LongDiscreteMap dm = new LongDiscreteMap(summary.stream().mapToLong(Long::longValue).toArray(), 0,
                            summary.size());

            int[][] rotations = new int[dm.maxRank() + 1][4];
            for (int i = 0; i < rotations.length; i++) {
                long val = dm.iThElement(i);
                for (int j = 0; j < 4; j++) {
                    rotations[i][j] = dm.rankOf(val);
                    val = rotate(val);
                }
            }

            int[] cnts = new int[dm.maxRank() + 1];
            for (Rect rect : rects) {
                rect.summary = dm.rankOf(summaryOf(rect));
                for (int s : rotations[rect.summary]) {
                    cnts[s] += 1;
                }
            }

            int[] cols = new int[8];
            int[] faces = new int[3];

            long cnt = 0;
            for (int i = 0; i < n; i++) {
                for (int s : rotations[rects[i].summary]) {
                    cnts[s] -= 1;
                }
                cols[0] = rects[i].get(0, 0);
                cols[1] = rects[i].get(3, 0);
                cols[2] = rects[i].get(1, 0);
                cols[3] = rects[i].get(2, 0);

                for (int j = i + 1; j < n; j++) {
                    if (i == j) {
                        continue;
                    }

                    for (int s : rotations[rects[j].summary]) {
                        cnts[s] -= 1;
                    }

                    for (int rj = 0; rj < 4; rj++) {

                        if (rects[j].get(0, rj) != cols[2] || rects[j].get(3, rj) != cols[3]) {
                            continue;
                        }

                        cols[4] = rects[j].get(1, rj);
                        cols[5] = rects[j].get(2, rj);

                        for (int k = i + 1; k < n; k++) {
                            if (k == i || k == j) {
                                continue;
                            }


                            for (int rk = 0; rk < 4; rk++) {

                                if (rects[k].get(0, rk) != cols[4] || rects[k].get(3, rk) != cols[5]) {
                                    continue;
                                }

                                cols[6] = rects[k].get(1, rk);
                                cols[7] = rects[k].get(2, rk);

                                for (int s : rotations[rects[k].summary]) {
                                    cnts[s] -= 1;
                                }

                                faces[0] = dm.rankOf(summaryOf(cols[6], cols[0], cols[1], cols[7]));
                                faces[1] = dm.rankOf(summaryOf(cols[7], cols[1], cols[3], cols[5]));
                                faces[2] = dm.rankOf(summaryOf(cols[0], cols[6], cols[4], cols[2]));

                                if (faces[0] >= 0 && faces[1] >= 0 && faces[2] >= 0) {
                                    long localCnt = 1;
                                    for (int t = 0; t < 3; t++) {
                                        localCnt *= cnts[faces[t]];
                                        for (int r : rotations[faces[t]]) {
                                            cnts[r]--;
                                        }
                                    }
                                    cnt += localCnt;
                                    for (int t = 0; t < 3; t++) {
                                        for (int r : rotations[faces[t]]) {
                                            cnts[r]++;
                                        }
                                    }
                                }

                                for (int s : rotations[rects[k].summary]) {
                                    cnts[s] += 1;
                                }

                            }
                        }
                    }

                    for (int s : rotations[rects[j].summary]) {
                        cnts[s] += 1;
                    }
                }
            }

            out.println(cnt);
        }

        public long summaryOf(Rect rect) {
            return summaryOf(rect.colors[0], rect.colors[1], rect.colors[2], rect.colors[3]);
        }

        public long summaryOf(int a, int b, int c, int d) {
            long ans = a;
            ans = ans * 1000 + b;
            ans = ans * 1000 + c;
            ans = ans * 1000 + d;
            return ans;
        }

        public long rotate(long x) {
            return (x % 1000) * 1_000_000_000 + x / 1000;
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
    static class Rect {
        int[] colors = new int[4];
        int summary;

        public int get(int i, int r) {
            return colors[(i + r) & 3];
        }

    }
    static class FastOutput implements AutoCloseable, Closeable {
        private StringBuilder cache = new StringBuilder(1 << 20);
        private final Writer os;

        public FastOutput(Writer os) {
            this.os = os;
        }

        public FastOutput(OutputStream os) {
            this(new OutputStreamWriter(os));
        }

        public FastOutput println(long c) {
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
    static class LongDiscreteMap {
        long[] val;
        int f;
        int t;

        public LongDiscreteMap(long[] val, int f, int t) {
            Randomized.randomizedArray(val, f, t);
            Arrays.sort(val, f, t);
            int wpos = f + 1;
            for (int i = f + 1; i < t; i++) {
                if (val[i] == val[i - 1]) {
                    continue;
                }
                val[wpos++] = val[i];
            }
            this.val = val;
            this.f = f;
            this.t = wpos;
        }

        public int rankOf(long x) {
            return Arrays.binarySearch(val, f, t, x) - f;
        }

        public long iThElement(int i) {
            return val[f + i];
        }

        public int maxRank() {
            return t - f - 1;
        }

        public String toString() {
            return Arrays.toString(Arrays.copyOfRange(val, f, t));
        }

    }
    static class Randomized {
        static Random random = new Random();

        public static void randomizedArray(long[] data, int from, int to) {
            to--;
            for (int i = from; i <= to; i++) {
                int s = nextInt(i, to);
                long tmp = data[i];
                data[i] = data[s];
                data[s] = tmp;
            }
        }

        public static int nextInt(int l, int r) {
            return random.nextInt(r - l + 1) + l;
        }

    }
}

