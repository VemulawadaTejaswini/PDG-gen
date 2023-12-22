import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.util.Random;
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
            FountainWalk solver = new FountainWalk();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class FountainWalk {
        public void solve(int testNumber, FastInput in, PrintWriter out) {
            int[][] ranges = new int[2][3];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    ranges[i][j] = in.readInt();
                }
            }

            int n = in.readInt();
            int[][] pts = new int[n + 2][3];
            pts[n] = ranges[0];
            pts[n + 1] = ranges[1];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 2; j++) {
                    pts[i][j] = in.readInt();
                }
            }

            if (pts[n][0] > pts[n + 1][0]) {
                for (int i = 0; i < n + 2; i++) {
                    pts[i][0] = -pts[i][0];
                }
            }

            if (pts[n][1] > pts[n + 1][1]) {
                for (int i = 0; i < n + 2; i++) {
                    pts[i][1] = -pts[i][1];
                }
            }


            double ans = (pts[n + 1][0] - pts[n][0] + pts[n + 1][1] - pts[n][1]) * 100;
            double circle = 0.5 * Math.PI * 10;
            if (pts[n][0] == pts[n + 1][0] || pts[n][1] == pts[n + 1][1]) {
                boolean exist = false;
                for (int i = 0; i < n; i++) {
                    if (pts[i][0] >= pts[n][0] && pts[i][0] <= pts[n + 1][0] && pts[i][1] >= pts[n][1]
                                    && pts[i][1] <= pts[n + 1][1]) {
                        exist = true;
                    }
                }

                if (exist) {
                    ans = ans + circle * 2 - 10 * 2;
                }

                out.printf("%.15f", ans);
                return;
            }

            IntList xs = new IntList(n + 2);
            for (int i = 0; i < n + 2; i++) {
                xs.add(pts[i][0]);
            }

            DiscreteMap dm = new DiscreteMap(xs.toArray(), 0, xs.size());
            for (int i = 0; i < n + 2; i++) {
                pts[i][0] = dm.rankOf(pts[i][0]);
            }



            Segment seg = new Segment(dm.minRank(), dm.maxRank());

            Arrays.sort(pts, (a, b) -> a[1] == b[1] ? -(a[0] - b[0]) : -(a[1] - b[1]));
            for (int[] pt : pts) {
                if (pt[0] < ranges[0][0] || pt[0] > ranges[1][0] || pt[1] < ranges[0][1] || pt[1] > ranges[1][1]) {
                    continue;
                }
                pt[2] = seg.query(pt[0], dm.maxRank(), dm.minRank(), dm.maxRank());
                if (pt != ranges[0] && pt != ranges[1]) {
                    pt[2]++;
                }
                seg.update(pt[0], pt[0], dm.minRank(), dm.maxRank(), pt[2]);
            }

            ans = ans + circle * ranges[0][2] - 10 * 2 * ranges[0][2];
            out.printf("%.15f", ans);
        }

    }
    static class Randomized {
        static Random random = new Random();

        public static void randomizedArray(int[] data, int from, int to) {
            to--;
            for (int i = from; i <= to; i++) {
                int s = nextInt(i, to);
                int tmp = data[i];
                data[i] = data[s];
                data[s] = tmp;
            }
        }

        public static int nextInt(int l, int r) {
            return random.nextInt(r - l + 1) + l;
        }

    }
    static class Segment implements Cloneable {
        private Segment left;
        private Segment right;
        private int max;

        private void update(int v) {
            max = Math.max(max, v);
        }

        public void pushUp() {
            max = Math.max(left.max, right.max);
        }

        public void pushDown() {}

        public Segment(int l, int r) {
            if (l < r) {
                int m = (l + r) >> 1;
                left = new Segment(l, m);
                right = new Segment(m + 1, r);
                pushUp();
            } else {

            }
        }

        private boolean covered(int ll, int rr, int l, int r) {
            return ll <= l && rr >= r;
        }

        private boolean noIntersection(int ll, int rr, int l, int r) {
            return ll > r || rr < l;
        }

        public void update(int ll, int rr, int l, int r, int v) {
            if (noIntersection(ll, rr, l, r)) {
                return;
            }
            if (covered(ll, rr, l, r)) {
                update(v);
                return;
            }
            pushDown();
            int m = (l + r) >> 1;
            left.update(ll, rr, l, m, v);
            right.update(ll, rr, m + 1, r, v);
            pushUp();
        }

        public int query(int ll, int rr, int l, int r) {
            if (noIntersection(ll, rr, l, r)) {
                return 0;
            }
            if (covered(ll, rr, l, r)) {
                return max;
            }
            pushDown();
            int m = (l + r) >> 1;
            return Math.max(left.query(ll, rr, l, m), right.query(ll, rr, m + 1, r));
        }

    }
    static class IntList {
        private int size;
        private int cap;
        private int[] data;
        private static final int[] EMPTY = new int[0];

        public IntList(int cap) {
            this.cap = cap;
            if (cap == 0) {
                data = EMPTY;
            } else {
                data = new int[cap];
            }
        }

        public IntList(IntList list) {
            this.size = list.size;
            this.cap = list.cap;
            this.data = Arrays.copyOf(list.data, size);
        }

        public IntList() {
            this(0);
        }

        private void ensureSpace(int need) {
            int req = size + need;
            if (req > cap) {
                while (cap < req) {
                    cap = Math.max(cap + 10, 2 * cap);
                }
                data = Arrays.copyOf(data, cap);
            }
        }

        public void add(int x) {
            ensureSpace(1);
            data[size++] = x;
        }

        public int size() {
            return size;
        }

        public int[] toArray() {
            return Arrays.copyOf(data, size);
        }

        public String toString() {
            return Arrays.toString(toArray());
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
                    bufLen = -1;
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
    static class DiscreteMap {
        int[] val;
        int f;
        int t;

        public DiscreteMap(int[] val, int f, int t) {
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

        public int rankOf(int x) {
            return Arrays.binarySearch(val, f, t, x) - f;
        }

        public int minRank() {
            return 0;
        }

        public int maxRank() {
            return t - f - 1;
        }

        public String toString() {
            return Arrays.toString(Arrays.copyOfRange(val, f, t));
        }

    }
}

