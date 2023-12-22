// package arc.arc088;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);


        char[] s = in.nextToken().toCharArray();
        int n = s.length;
        int[] cnt = new int[26];
        for (int i = 0; i < s.length ; i++) {
            cnt[s[i]-'a']++;
        }
        out.println(solve(s));
        out.flush();
    }

    private static long solve(char[] s) {
        List<Integer>[] que = new List[26];
        for (int i = 0; i < 26; i++) {
            que[i] = new ArrayList<>();
        }

        int n = s.length;
        int[] cnt = new int[26];
        for (int i = 0; i < s.length ; i++) {
            cnt[s[i]-'a']++;
            que[s[i]-'a'].add(i);
        }
        int odd = 0;


        char oc = ' ';
        for (int i = 0; i < 26; i++) {
            if (cnt[i] % 2 == 1) {
                odd++;
                if (odd == 1) {

                    oc = (char)('a' + i);
                }
            }
        }
        if (odd >= 2) {
            return -1;
        }


        SegmentTreeRARMQ seg = new SegmentTreeRARMQ(new int[n+10]);

        int[] head = new int[26];

        int l = 0;
        int r = n-1;
        int done = 0;

        long cost = 0;
        while (done < n/2) {
            int ci = s[l]-'a';
            // debug(l,r,ci,s[l],cost,done,head[ci],cnt[ci]);
            if (head[ci] == cnt[ci]) {
                l++;
                continue;
            }

            int pos = que[ci].get(head[ci]++);
            int L = pos + seg.min(pos, pos+1);
            if (head[ci] >= cnt[ci]) {
                cost += Math.abs(L - n / 2);
                seg.add(L+1, n/2+1, -1);
                // it's center
                l++;
                done++;
            } else {
                int last = que[ci].get(cnt[ci]-1);
                cnt[ci]--;
                int R = last + seg.min(last, last+1);
                // debug("=>", s[l], last, R, r);

                cost += Math.abs(R - r);
                seg.add(R+1, n, -1);
                l++;
                r--;
                done++;
            }
        }
        return cost;
    }



    /**
     * Segment tree (range add, range minimum query).
     */
    public static class SegmentTreeRARMQ {
        int N;
        int M;
        int[] segMin;
        int[] segAdd;

        public SegmentTreeRARMQ(int[] data) {
            N = Integer.highestOneBit(data.length-1)<<2;
            M = (N >> 1) - 1;

            segMin = new int[N];
            segAdd = new int[N];
            Arrays.fill(segMin, 0);
            for (int i = 0 ; i < data.length ; i++) {
                segMin[M+i] = data[i];
            }
            for (int i = M-1 ; i >= 0 ; i--) {
                segMin[i] = compute(i);
            }
        }

        public int compute(int i) {
            return Math.min(segMin[i*2+1], segMin[i*2+2]) + segAdd[i];
        }

        public void add(int l, int r, long k) {
            add(l, r, k, 0, 0, M+1);
        }

        public void add(int l, int r, long x, int idx, int fr, int to) {
            if (to <= l || r <= fr) {
                return;
            }
            if (l <= fr && to <= r) {
                segAdd[idx] += x;
                while (idx >= 1) {
                    idx = (idx - 1) / 2;
                    segMin[idx] = Math.min(segMin[idx*2+1] + segAdd[idx*2+1], segMin[idx*2+2] + segAdd[idx*2+2]);
                }
                return;
            }

            int med = (fr + to) / 2;
            add(l, r, x, idx*2+1, fr, med);
            add(l, r, x, idx*2+2, med, to);
        }

        public int min(int l, int r) {
            return min(l, r, 0, 0, M+1);
        }

        public int min(int l, int r, int idx, int fr, int to) {
            if (to <= l || r <= fr) {
                return 0;
            }
            if (l <= fr && to <= r) {
                return segMin[idx] + segAdd[idx];
            }

            int med = (fr+to) / 2;
            int ret = 0;
            ret = Math.min(ret, min(l, r, idx*2+1, fr, med));
            ret = Math.min(ret, min(l, r, idx*2+2, med, to));
            return ret + segAdd[idx];
        }
    }


    public static class FenwickTree {
        long N;
        int[] data;

        public FenwickTree(int n) {
            N = n;
            data = new int[n + 1];
        }

        /**
         * Computes value of [1, i].
         * <p>
         * O(logn)
         *
         * @param i
         * @return
         */
        public int sum(int i) {
            int s = 0;
            while (i > 0) {
                s += data[i];
                i -= i & (-i);
            }
            return s;
        }

        /**
         * Computes value of [i, j].
         * <p>
         * O(logn)
         *
         * @param i
         * @param j
         * @return
         */
        public int range(int i, int j) {
            return sum(j) - sum(i - 1);
        }

        /**
         * Sets value x into i-th position.
         * <p>
         * O(logn)
         *
         * @param i
         * @param x
         */
        public void set(int i, int x) {
            add(i, x - range(i, i));
        }

        /**
         * Adds value x into i-th position.
         * <p>
         * O(logn)
         *
         * @param i
         * @param x
         */
        public void add(int i, int x) {
            while (i <= N) {
                data[i] += x;
                i += i & (-i);
            }
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