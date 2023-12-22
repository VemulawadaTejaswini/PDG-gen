import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.function.IntConsumer;
import java.io.IOException;
import java.util.function.IntPredicate;
import java.io.Serializable;
import java.io.UncheckedIOException;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 29);
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
            FRandomTournament solver = new FRandomTournament();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class FRandomTournament {
        Debug debug = new Debug(false);
        BitSet tmp;
        BitSet[] beats;
        BitSet[][] L;
        BitSet[][] R;
        BitSet[][] G;
        int[][] LVisited;
        int[][] RVisited;
        int[][] GVisited;

        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            beats = new BitSet[n];
            for (int i = 0; i < n; i++) {
                beats[i] = new BitSet(n);
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    if (in.readChar() == '1') {
                        beats[i].set(j);
                    } else {
                        beats[j].set(i);
                    }
                }
            }

            L = new BitSet[2][n];
            R = new BitSet[2][n];
            G = new BitSet[2][n];
            LVisited = new int[2][n];
            RVisited = new int[2][n];
            GVisited = new int[2][n];

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < n; j++) {
                    L[i][j] = new BitSet(n);
                    R[i][j] = new BitSet(n);
                    G[i][j] = new BitSet(n);
                    RVisited[i][j] = GVisited[i][j] = LVisited[i][j] = i == 0 ? j - 1 : j + 1;
                }
            }
            tmp = new BitSet(n);

            for (int i = 0; i < n; i++) {
                prepareL(0, i, n - 1);
                prepareR(0, i, n - 1);
                prepareG(0, i, n - 1);
                prepareL(1, 0, i);
                prepareR(1, 0, i);
                prepareG(1, 0, i);
            }

            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (R[0][0].get(i) && L[0][i].get(n - 1)) {
                    debug.debug("i", i);
                    ans++;
                }
            }

            out.println(ans);
        }

        public void prepareL(int i, int j, int k) {
            int step = i == 0 ? 1 : -1;
            int use = i == 0 ? j : k;
            IntPredicate breakCondition = i == 0 ? x -> x < k : x -> x > j;
            IntConsumer consumer = i == 0 ? x -> L[0][j].set(x, L(j, x)) : x -> L[1][k].set(x, L(x, k));
            while (breakCondition.test(LVisited[i][use])) {
                LVisited[i][use] += step;
                consumer.accept(LVisited[i][use]);
            }
        }

        public void prepareR(int i, int j, int k) {
            int step = i == 0 ? 1 : -1;
            int use = i == 0 ? j : k;
            IntPredicate breakCondition = i == 0 ? x -> x < k : x -> x > j;
            IntConsumer consumer = i == 0 ? x -> R[0][j].set(x, R(j, x)) : x -> R[1][k].set(x, R(x, k));
            while (breakCondition.test(RVisited[i][use])) {
                RVisited[i][use] += step;
                consumer.accept(RVisited[i][use]);
            }
        }

        public void prepareG(int i, int j, int k) {
            int step = i == 0 ? 1 : -1;
            int use = i == 0 ? j : k;
            IntPredicate breakCondition = i == 0 ? x -> x < k : x -> x > j;
            IntConsumer consumer = i == 0 ? x -> G[0][j].set(x, G(j, x)) : x -> G[1][k].set(x, G(x, k));
            while (breakCondition.test(GVisited[i][use])) {
                GVisited[i][use] += step;
                consumer.accept(GVisited[i][use]);
            }
        }

        public boolean L(int l, int r) {
            if (l == r) {
                return true;
            }
            prepareL(1, l + 1, r);
            prepareG(0, l, r);
            tmp.copy(beats[l]);
            tmp.and(L[1][r]);
            tmp.and(G[0][l]);
            return tmp.size(l, r) > 0;
        }

        public boolean R(int l, int r) {
            if (l == r) {
                return true;
            }
            prepareR(0, l, r - 1);
            prepareG(1, l, r);
            tmp.copy(beats[r]);
            tmp.and(R[0][l]);
            tmp.and(G[1][r]);
            return tmp.size(l, r) > 0;
        }

        public boolean G(int l, int r) {
            if (l == r) {
                return false;
            }
            prepareL(0, l, r - 1);
            prepareR(1, l + 1, r);
            tmp.copy(R[1][r]);
            tmp.leftShift(1);
            tmp.and(L[0][l]);
            return tmp.size(l, r - 1) > 0;
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

        public char readChar() {
            skipBlank();
            char c = (char) next;
            next = read();
            return c;
        }

    }

    static final class BitSet implements Serializable, Cloneable {
        private long[] data;
        private long tailAvailable;
        private int capacity;
        private int m;
        private static final int SHIFT = 6;
        private static final int LOW = 63;
        private static final int BITS_FOR_EACH = 64;
        private static final long ALL_ONE = ~0L;
        private static final long ALL_ZERO = 0L;
        private static final int MAX_OFFSET = 63;
        private static long[] EMPTY_ARRAY = new long[0];

        public BitSet(int n) {
            capacity = n;
            this.m = (capacity + 64 - 1) / 64;
            data = new long[m];
            tailAvailable = oneBetween(0, offset(capacity - 1));
        }

        public BitSet(BitSet bs) {
            this.data = bs.data.clone();
            this.tailAvailable = bs.tailAvailable;
            this.capacity = bs.capacity;
            this.m = bs.m;
        }

        private BitSet(BitSet bs, int l, int r) {
            this.data = EMPTY_ARRAY;
            copyInterval(bs, l, r);
        }

        public void copyInterval(BitSet bs, int l, int r) {
            capacity = r - l + 1;
            tailAvailable = oneBetween(0, offset(capacity - 1));
            int reqLength = word(r) - word(l) + 1;
            if (data.length >= word(r) - word(l) + 1) {
                System.arraycopy(bs.data, word(l), data, 0, reqLength);
            } else {
                data = Arrays.copyOfRange(bs.data, word(l), word(r) + 1);
            }
            this.m = reqLength;
            leftShift(offset(l));
            this.m = (capacity + 64 - 1) / 64;
            data[m - 1] &= tailAvailable;
            for (int i = m; i < reqLength; i++) {
                data[i] = 0;
            }
        }

        public boolean get(int i) {
            return (data[word(i)] & (1L << offset(i))) != 0;
        }

        public void set(int i) {
            data[word(i)] |= (1L << offset(i));
        }

        public void set(int i, boolean val) {
            if (val) {
                set(i);
            } else {
                clear(i);
            }
        }

        private static int word(int i) {
            return i >>> SHIFT;
        }

        private static int offset(int i) {
            return i & LOW;
        }

        private long oneBetween(int l, int r) {
            if (r < l) {
                return 0;
            }
            long lBegin = 1L << offset(l);
            long rEnd = 1L << offset(r);
            return (ALL_ONE ^ (lBegin - 1)) & ((rEnd << 1) - 1);
        }

        public void clear(int i) {
            data[word(i)] &= ~(1L << offset(i));
        }

        public int capacity() {
            return capacity;
        }

        public int size(int l, int r) {
            if (r < l) {
                return 0;
            }
            int ans = 0;
            int lWord = l >>> SHIFT;
            int rWord = r >>> SHIFT;
            for (int i = lWord + 1; i < rWord; i++) {
                ans += Long.bitCount(data[i]);
            }
            //lword
            if (lWord == rWord) {
                ans += Long.bitCount(data[lWord] & oneBetween(offset(l), offset(r)));
            } else {
                ans += Long.bitCount(data[lWord] & oneBetween(offset(l), MAX_OFFSET));
                ans += Long.bitCount(data[rWord] & oneBetween(0, offset(r)));
            }
            return ans;
        }

        public void copy(BitSet bs) {
            int n = Math.min(this.m, bs.m);
            System.arraycopy(bs.data, 0, data, 0, n);
            Arrays.fill(data, n, n, 0);
        }

        public void and(BitSet bs) {
            int n = Math.min(this.m, bs.m);
            for (int i = 0; i < n; i++) {
                data[i] &= bs.data[i];
            }
        }

        public int nextSetBit(int start) {
            int offset = offset(start);
            int w = word(start);
            if (offset != 0) {
                long mask = oneBetween(offset, MAX_OFFSET);
                if ((data[w] & mask) != 0) {
                    return Long.numberOfTrailingZeros(data[w] & mask) + w * BITS_FOR_EACH;
                }
                w++;
            }

            while (w < m && data[w] == ALL_ZERO) {
                w++;
            }
            if (w >= m) {
                return capacity();
            }
            return Long.numberOfTrailingZeros(data[w]) + w * BITS_FOR_EACH;
        }

        public void leftShift(int n) {
            int wordMove = word(n);
            int offsetMove = offset(n);
            int rshift = MAX_OFFSET - (offsetMove - 1);

            if (offsetMove != 0) {
                //slightly
                for (int i = 0; i < m; i++) {
                    if (i > 0) {
                        data[i - 1] |= data[i] << rshift;
                    }
                    data[i] >>>= offsetMove;
                }
            }
            if (wordMove > 0) {
                for (int i = 0; i < m; i++) {
                    if (i >= wordMove) {
                        data[i - wordMove] = data[i];
                    }
                    data[i] = 0;
                }
            }
        }

        public BitSet clone() {
            return new BitSet(this);
        }

        public String toString() {
            StringBuilder builder = new StringBuilder("{");
            for (int i = nextSetBit(0); i < capacity(); i = nextSetBit(i + 1)) {
                builder.append(i).append(',');
            }
            if (builder.length() > 1) {
                builder.setLength(builder.length() - 1);
            }
            builder.append("}");
            return builder.toString();
        }

        public int hashCode() {
            int ans = 1;
            for (int i = 0; i < m; i++) {
                ans = ans * 31 + Long.hashCode(data[i]);
            }
            return ans;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof BitSet)) {
                return false;
            }
            BitSet other = (BitSet) obj;
            if (other.capacity != capacity) {
                return false;
            }
            for (int i = 0; i < m; i++) {
                if (other.data[i] != data[i]) {
                    return false;
                }
            }
            return true;
        }

    }

    static class Debug {
        private boolean offline;
        private PrintStream out = System.err;

        public Debug(boolean enable) {
            offline = enable && System.getSecurityManager() == null;
        }

        public Debug debug(String name, int x) {
            if (offline) {
                debug(name, "" + x);
            }
            return this;
        }

        public Debug debug(String name, String x) {
            if (offline) {
                out.printf("%s=%s", name, x);
                out.println();
            }
            return this;
        }

    }

    static class FastOutput implements AutoCloseable, Closeable, Appendable {
        private StringBuilder cache = new StringBuilder(10 << 20);
        private final Writer os;

        public FastOutput append(CharSequence csq) {
            cache.append(csq);
            return this;
        }

        public FastOutput append(CharSequence csq, int start, int end) {
            cache.append(csq, start, end);
            return this;
        }

        public FastOutput(Writer os) {
            this.os = os;
        }

        public FastOutput(OutputStream os) {
            this(new OutputStreamWriter(os));
        }

        public FastOutput append(char c) {
            cache.append(c);
            return this;
        }

        public FastOutput append(int c) {
            cache.append(c);
            return this;
        }

        public FastOutput println(int c) {
            return append(c).println();
        }

        public FastOutput println() {
            cache.append(System.lineSeparator());
            return this;
        }

        public FastOutput flush() {
            try {
                os.append(cache);
                os.flush();
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

        public String toString() {
            return cache.toString();
        }

    }
}

