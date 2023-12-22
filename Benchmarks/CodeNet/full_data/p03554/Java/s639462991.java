import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n ; i++) {
            a[i] = in.nextInt();
        }
        int[] zeros = new int[n+1];
        int[] ones = new int[n+1];
        for (int i = 0; i < n ; i++) {
            zeros[i+1] = zeros[i] + (a[i] == 0 ? 1 : 0);
            ones[i+1] = ones[i] + (a[i] == 1 ? 1 : 0);
        }

        int q = in.nextInt();
        int[][] ranges = new int[q][2];
        for (int i = 0; i < q ; i++) {
            for (int j = 0; j < 2 ; j++) {
                ranges[i][j] = in.nextInt();
            }
        }

        Arrays.sort(ranges, Comparator.comparingInt(u -> u[0]));

        List<Integer>[] events = new List[n+1];
        for (int i = 0; i <= n ; i++) {
            events[i] = new ArrayList<>();
        }
        for (int i = 0; i < q ; i++) {
            int who = i+1;
            int l = ranges[i][0];
            int r = ranges[i][1];
            events[l].add(who);
            events[r+1].add(-who);
        }

        int[] best = new int[n+10];
        Arrays.fill(best, n+10);
        for (int i = 0; i < q ; i++) {
            best[ranges[i][0]] = Math.min(best[ranges[i][0]], ranges[i][1]);
        }
        SegmentTreePURMQ pr = new SegmentTreePURMQ(best);

        int[][] dp = new int[n+1][2];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], n+10);
        }

        dp[0][0] = 0;
        for (int i = 1; i <= n ; i++) {
            int digit = a[i-1];
            int last = Math.min(dp[i-1][0], dp[i-1][1]);
            dp[i][0] = last + digit;
            for (int id : events[i]) {
                int ri = Math.abs(id)-1;
                if (id > 0) {
                    dp[ranges[ri][1]][1] = Math.min(dp[ranges[ri][1]][1], last + zeros[ranges[ri][1]] - zeros[ranges[ri][0]-1]);
                } else {
                    int now = dp[i-1][1];
                    int from = ranges[ri][0]+1;
                    int to = i;
                    int bestTo = pr.min(from, to);
                    if (bestTo >= n) {
                        continue;
                    }
                    dp[bestTo][1] = Math.min(dp[bestTo][1], now + zeros[bestTo] - zeros[i-1]);
                }
            }
        }

        int ans = Math.min(dp[n][0], dp[n][1]);
        for (int i = 1 ; i <= n ; i++) {
            ans = Math.min(ans, dp[i][1] + ones[n] - ones[i]);
        }
        out.println(ans);
        out.flush();
    }

    /**
     * Segment tree (point update, range minimum query)
     */
    public static class SegmentTreePURMQ {
        int N;
        int M;
        int[] seg;

        public SegmentTreePURMQ(int[] data) {
            N = Integer.highestOneBit(data.length-1)<<2;
            M = (N >> 1) - 1;

            seg = new int[N];
            Arrays.fill(seg, Integer.MAX_VALUE);
            for (int i = 0 ; i < data.length ; i++) {
                seg[M+i] = data[i];
            }
            for (int i = M-1 ; i >= 0 ; i--) {
                seg[i] = compute(i);
            }
        }

        /**
         * Uodates value at position minIndexSum.
         *
         * @param idx
         * @param value
         */
        public void update(int idx, int value) {
            seg[M+idx] = value;
            int i = M+idx;
            while (true) {
                i = (i-1) >> 1;
                seg[i] = compute(i);
                if (i == 0) {
                    break;
                }
            }
        }

        private int compute(int i) {
            return Math.min(seg[i*2+1], seg[i*2+2]);
        }

        /**
         * Finds minimum value from range [l,r).
         *
         * @param l
         * @param r
         * @return minimum value
         */
        public int min(int l, int r) {
            return min(l, r, 0, 0, M+1);
        }

        private int min(int l, int r, int idx, int fr, int to) {
            if (to <= l || r <= fr) {
                return Integer.MAX_VALUE;
            }
            if (l <= fr && to <= r) {
                return seg[idx];
            }

            int med = (fr+to) / 2;
            int ret = Integer.MAX_VALUE;
            ret = Math.min(ret, min(l, r, idx*2+1, fr, med));
            ret = Math.min(ret, min(l, r, idx*2+2, med, to));
            return ret;
        }
    }

    public static void debug(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }

    public static class InputReader {
        private static final int BUFFER_LENGTH = 1 << 12;
        private InputStream stream;
        private byte[] buf = new byte[BUFFER_LENGTH];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        private int next() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public char nextChar() {
            return (char) skipWhileSpace();
        }

        public String nextToken() {
            int c = skipWhileSpace();
            StringBuilder res = new StringBuilder();
            do {
                res.append((char) c);
                c = next();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public int nextInt() {
            return (int) nextLong();
        }

        public long nextLong() {
            int c = skipWhileSpace();
            long sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = next();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = next();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble() {
            return Double.valueOf(nextToken());
        }

        int skipWhileSpace() {
            int c = next();
            while (isSpaceChar(c)) {
                c = next();
            }
            return c;
        }

        boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
    }
}