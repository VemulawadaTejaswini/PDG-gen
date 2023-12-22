/**
 * author: derrick20
 * created: 8/27/20 3:30 PM
 */
import java.io.*;
import java.util.*;

public class Main implements Runnable {
    public static void main(String[] args) throws Exception {
        new Thread(null, new Main(), ": )", 1 << 28).start();
    }

    public void run() {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] val = new long[M];
        ArrayList<Integer>[] segs = new ArrayList[N + 2];
        Arrays.setAll(segs, i -> new ArrayList<>());
        int[] lo = new int[M];
        long total = 0;
        for (int i = 0; i < M; i++) {
            int l = sc.nextInt(), r = sc.nextInt();
            long v = sc.nextLong();
            lo[i] = l;
            val[i] = v;
            total += v;
            segs[r].add(i);
        }
        SegmentTree dp = new SegmentTree(N + 2);
        // dp[r] = minimum value of segs ignored if we add a dot here
        for (int r = 1; r <= N + 1; r++) {
            // we can always just do 0 by putting all 1's, including every seg (exlcuding none!)
            long prev = Math.min(0, dp.queryRange(0, r - 1));
            dp.updateRange(r, r, prev);
            for (int i : segs[r]) {
                dp.updateRange(0, lo[i] - 1, val[i]);
//                printDP(dp);
            }
        }
        long ans = total - dp.queryRange(N + 1, N + 1);
        out.println(ans);
        out.close();
    }

    static void printDP(SegmentTree dp) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= dp.N + 1; i++) {
            sb.append(dp.queryRange(i, i)).append(" ");
        }
        System.out.println(sb);
    }

    static class SegmentTree {
        long[] min;
        long[] delta;
        int N;
        long IDENTITY = (long) 9e18;
        public SegmentTree(int size) {
            N = size;
            min = new long[4 * size];
            delta = new long[4 * size];
        }

        public long eval(int node) {
            return min[node] + delta[node];
        }

        public void pushDown(int node) {
            delta[2 * node] += delta[node];
            delta[2 * node + 1] += delta[node];
            delta[node] = 0;
        }

        public void pullUp(int node) {
            min[node] = Math.min(eval(2 * node), eval(2 * node + 1));
        }

        public void updateRange(int l, int r, long v) {
            updateRange(1, 0, N - 1, l, r, v);
        }

        public void updateRange(int node, int sl, int sr, int l, int r, long v) {
            if (l <= sl && sr <= r) {
                delta[node] += v;
            } else if (sr < l || r < sl) {
                return;
            } else {
                int mid = (sl + sr) / 2;
                pushDown(node);
                updateRange(2 * node, sl, mid, l, r, v);
                updateRange(2 * node + 1, mid + 1, sr, l, r, v);
                pullUp(node);
            }
        }

        public long queryRange(int l, int r) {
            return queryRange(1, 0, N - 1, l, r);
        }

        public long queryRange(int node, int sl, int sr, int l, int r) {
            if (l <= sl && sr <= r) {
                return eval(node);
            } else if (sr < l || r < sl) {
                return IDENTITY;
            } else {
                int mid = (sl + sr) / 2;
                pushDown(node);
                long left = queryRange(2 * node, sl, mid, l, r);
                long right = queryRange(2 * node + 1, mid + 1, sr, l, r);
                pullUp(node);
                return Math.min(left, right);
            }
        }
    }

    static class FastScanner {
        private int BS = 1 << 16;
        private char NC = (char) 0;
        private byte[] buf = new byte[BS];
        private int bId = 0, size = 0;
        private char c = NC;
        private double cnt = 1;
        private BufferedInputStream in;

        public FastScanner() {
            in = new BufferedInputStream(System.in, BS);
        }

        public FastScanner(String s) {
            try {
                in = new BufferedInputStream(new FileInputStream(new File(s)), BS);
            } catch (Exception e) {
                in = new BufferedInputStream(System.in, BS);
            }
        }

        private char getChar() {
            while (bId == size) {
                try {
                    size = in.read(buf);
                } catch (Exception e) {
                    return NC;
                }
                if (size == -1) return NC;
                bId = 0;
            }
            return (char) buf[bId++];
        }

        public int nextInt() {
            return (int) nextLong();
        }

        public int[] nextInts(int N) {
            int[] res = new int[N];
            for (int i = 0; i < N; i++) {
                res[i] = (int) nextLong();
            }
            return res;
        }

        public long[] nextLongs(int N) {
            long[] res = new long[N];
            for (int i = 0; i < N; i++) {
                res[i] = nextLong();
            }
            return res;
        }

        public long nextLong() {
            cnt = 1;
            boolean neg = false;
            if (c == NC) c = getChar();
            for (; (c < '0' || c > '9'); c = getChar()) {
                if (c == '-') neg = true;
            }
            long res = 0;
            for (; c >= '0' && c <= '9'; c = getChar()) {
                res = (res << 3) + (res << 1) + c - '0';
                cnt *= 10;
            }
            return neg ? -res : res;
        }

        public double nextDouble() {
            double cur = nextLong();
            return c != '.' ? cur : cur + nextLong() / cnt;
        }

        public double[] nextDoubles(int N) {
            double[] res = new double[N];
            for (int i = 0; i < N; i++) {
                res[i] = nextDouble();
            }
            return res;
        }

        public String next() {
            StringBuilder res = new StringBuilder();
            while (c <= 32) c = getChar();
            while (c > 32) {
                res.append(c);
                c = getChar();
            }
            return res.toString();
        }

        public String nextLine() {
            StringBuilder res = new StringBuilder();
            while (c <= 32) c = getChar();
            while (c != '\n') {
                res.append(c);
                c = getChar();
            }
            return res.toString();
        }

        public boolean hasNext() {
            if (c > 32) return true;
            while (true) {
                c = getChar();
                if (c == NC) return false;
                else if (c > 32) return true;
            }
        }
    }
    static void ASSERT(boolean assertion, String message) {
        if (!assertion) throw new AssertionError(message);
    }
    static void ASSERT(boolean assertion) {
        if (!assertion) throw new AssertionError();
    }
}