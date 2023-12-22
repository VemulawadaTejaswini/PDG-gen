import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.io.IOException;
import java.util.Random;
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
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 27);
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
            CThREE solver = new CThREE();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class CThREE {
        List<UndirectedEdge>[] g;
        XorDeltaDSU dsu;
        int[] depths;
        int[] parent;
        int[] merged;

        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            g = Graph.createUndirectedGraph(n);
            for (int i = 1; i < n; i++) {
                int a = in.readInt() - 1;
                int b = in.readInt() - 1;
                Graph.addUndirectedEdge(g, a, b);
            }
            dsu = new XorDeltaDSU(n);
            depths = new int[n];
            parent = new int[n];
            merged = new int[n];
            Arrays.fill(merged, -1);

            TreeDiameter diameter = new TreeDiameter(g, n);
            int root = diameter.getEnds().get(0);
            dfs(root, -1, 0);

            for (int i = 0; i < n; i++) {
                if (depths[i] <= 1) {
                    continue;
                }
                if (depths[i] >= 3) {
                    dsu.merge(i, findAncestor(i, depths[i] - 3), 1);
                }
                int ff = findAncestor(i, depths[i] - 2);
                if (merged[ff] == -2 || merged[ff] == parent[i]) {
                    for (UndirectedEdge e : g[ff]) {
                        if (e.to == parent[ff] || e.to == merged[ff]) {
                            continue;
                        }
                        dsu.merge(i, e.to, 1);
                        break;
                    }
                } else if (merged[ff] == -1) {
                    merged[ff] = parent[i];
                    for (UndirectedEdge e : g[ff]) {
                        if (e.to == parent[ff] || e.to == merged[ff]) {
                            continue;
                        }
                        dsu.merge(i, e.to, 1);
                    }
                } else {
                    merged[ff] = -1;
                    for (UndirectedEdge e : g[ff]) {
                        if (e.to == parent[ff]) {
                            continue;
                        }
                        dsu.merge(i, e.to, 1);
                    }
                }
            }

            int[] colors = new int[n];
            int[] cnt = new int[2];
            for (int i = 0; i < n; i++) {
                if (dsu.find(i) == dsu.find(root)) {
                    cnt[dsu.delta(i, root)]++;
                }
            }
            IntegerDequeImpl[] dqs = new IntegerDequeImpl[3];
            for (int i = 0; i < 3; i++) {
                dqs[i] = new IntegerDequeImpl(n);
            }
            for (int i = 1; i <= n; i++) {
                dqs[i % 3].addLast(i);
            }
            int[] vals = new int[2];
            vals[0] = cnt[0] > cnt[1] ? 1 : 2;
            vals[1] = 3 - vals[0];
            for (int i = 0; i < n; i++) {
                if (dsu.find(i) == dsu.find(root)) {
                    int v = vals[dsu.delta(i, root)];
                    if (dqs[v].isEmpty()) {
                        if (dqs[0].isEmpty()) {
                            out.println(-1);
                            return;
                        }
                        colors[i] = dqs[0].removeFirst();
                    } else {
                        colors[i] = dqs[v].removeFirst();
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                if (dsu.find(i) == dsu.find(root)) {
                    continue;
                }
                for (int j = 0; j < 3; j++) {
                    if (dqs[j].isEmpty()) {
                        continue;
                    }
                    colors[i] = dqs[j].removeFirst();
                    break;
                }
            }

            for (int i = 0; i < n; i++) {
                out.append(colors[i]).append(' ');
            }
        }

        public int findAncestor(int root, int d) {
            if (depths[root] == d) {
                return root;
            }
            return findAncestor(parent[root], d);
        }

        public void dfs(int root, int p, int depth) {
            depths[root] = depth;
            parent[root] = p;
            for (UndirectedEdge e : g[root]) {
                if (e.to == p) {
                    continue;
                }
                dfs(e.to, root, depth + 1);
            }
        }

    }

    static class DigitUtils {
        private DigitUtils() {
        }

        public static int floorDiv(int a, int b) {
            return a < 0 ? -ceilDiv(-a, b) : a / b;
        }

        public static int ceilDiv(int a, int b) {
            if (a < 0) {
                return -floorDiv(-a, b);
            }
            int c = a / b;
            if (c * b < a) {
                return c + 1;
            }
            return c;
        }

    }

    static class IntegerList implements Cloneable {
        private int size;
        private int cap;
        private int[] data;
        private static final int[] EMPTY = new int[0];

        public IntegerList(int cap) {
            this.cap = cap;
            if (cap == 0) {
                data = EMPTY;
            } else {
                data = new int[cap];
            }
        }

        public IntegerList(IntegerList list) {
            this.size = list.size;
            this.cap = list.cap;
            this.data = Arrays.copyOf(list.data, size);
        }

        public IntegerList() {
            this(0);
        }

        public void ensureSpace(int req) {
            if (req > cap) {
                while (cap < req) {
                    cap = Math.max(cap + 10, 2 * cap);
                }
                data = Arrays.copyOf(data, cap);
            }
        }

        private void checkRange(int i) {
            if (i < 0 || i >= size) {
                throw new ArrayIndexOutOfBoundsException();
            }
        }

        public int get(int i) {
            checkRange(i);
            return data[i];
        }

        public void add(int x) {
            ensureSpace(size + 1);
            data[size++] = x;
        }

        public void addAll(int[] x, int offset, int len) {
            ensureSpace(size + len);
            System.arraycopy(x, offset, data, size, len);
            size += len;
        }

        public void addAll(IntegerList list) {
            addAll(list.data, 0, list.size);
        }

        public void sort() {
            if (size <= 1) {
                return;
            }
            Randomized.shuffle(data, 0, size);
            Arrays.sort(data, 0, size);
        }

        public void unique() {
            if (size <= 1) {
                return;
            }

            sort();
            int wpos = 1;
            for (int i = 1; i < size; i++) {
                if (data[i] != data[wpos - 1]) {
                    data[wpos++] = data[i];
                }
            }
            size = wpos;
        }

        public int[] toArray() {
            return Arrays.copyOf(data, size);
        }

        public String toString() {
            return Arrays.toString(toArray());
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof IntegerList)) {
                return false;
            }
            IntegerList other = (IntegerList) obj;
            return SequenceUtils.equal(data, 0, size - 1, other.data, 0, other.size - 1);
        }

        public int hashCode() {
            int h = 1;
            for (int i = 0; i < size; i++) {
                h = h * 31 + Integer.hashCode(data[i]);
            }
            return h;
        }

        public IntegerList clone() {
            IntegerList ans = new IntegerList();
            ans.addAll(this);
            return ans;
        }

    }

    static class DirectedEdge {
        public int to;

        public DirectedEdge(int to) {
            this.to = to;
        }

        public String toString() {
            return "->" + to;
        }

    }

    static class UndirectedEdge extends DirectedEdge {
        public UndirectedEdge rev;

        public UndirectedEdge(int to) {
            super(to);
        }

    }

    static class IntegerDequeImpl implements IntegerDeque {
        private int[] data;
        private int bpos;
        private int epos;
        private static final int[] EMPTY = new int[0];
        private int n;

        public IntegerDequeImpl(int cap) {
            if (cap == 0) {
                data = EMPTY;
            } else {
                data = new int[cap];
            }
            bpos = 0;
            epos = 0;
            n = cap;
        }

        private void expandSpace(int len) {
            while (n < len) {
                n = Math.max(n + 10, n * 2);
            }
            int[] newData = new int[n];
            if (bpos <= epos) {
                if (bpos < epos) {
                    System.arraycopy(data, bpos, newData, 0, epos - bpos);
                }
            } else {
                System.arraycopy(data, bpos, newData, 0, data.length - bpos);
                System.arraycopy(data, 0, newData, data.length - bpos, epos);
            }
            epos = size();
            bpos = 0;
            data = newData;
        }

        public IntegerIterator iterator() {
            return new IntegerIterator() {
                int index = bpos;


                public boolean hasNext() {
                    return index != epos;
                }


                public int next() {
                    int ans = data[index];
                    index = IntegerDequeImpl.this.next(index);
                    return ans;
                }
            };
        }

        public int removeFirst() {
            int ans = data[bpos];
            bpos = next(bpos);
            return ans;
        }

        public void addLast(int x) {
            ensureMore();
            data[epos] = x;
            epos = next(epos);
        }

        private int next(int x) {
            return x + 1 >= n ? 0 : x + 1;
        }

        private void ensureMore() {
            if (next(epos) == bpos) {
                expandSpace(n + 1);
            }
        }

        public int size() {
            int ans = epos - bpos;
            if (ans < 0) {
                ans += data.length;
            }
            return ans;
        }

        public boolean isEmpty() {
            return bpos == epos;
        }

        public String toString() {
            StringBuilder builder = new StringBuilder();
            for (IntegerIterator iterator = iterator(); iterator.hasNext(); ) {
                builder.append(iterator.next()).append(' ');
            }
            return builder.toString();
        }

    }

    static interface IntegerIterator {
        boolean hasNext();

        int next();

    }

    static class XorDeltaDSU {
        int[] p;
        int[] rank;
        int[] delta;

        public XorDeltaDSU(int n) {
            p = new int[n];
            rank = new int[n];
            delta = new int[n];
            reset();
        }

        public void reset() {
            for (int i = 0; i < p.length; i++) {
                p[i] = i;
                rank[i] = 0;
                delta[i] = 0;
            }
        }

        public int find(int a) {
            if (p[a] == p[p[a]]) {
                return p[a];
            }
            find(p[a]);
            delta[a] ^= delta[p[a]];
            return p[a] = find(p[a]);
        }

        public int delta(int a, int b) {
            find(a);
            find(b);
            return delta[a] ^ delta[b];
        }

        public void merge(int a, int b, int d) {
            find(a);
            find(b);
            d = d ^ delta[a] ^ delta[b];
            a = find(a);
            b = find(b);
            if (a == b) {
                return;
            }
            if (rank[a] == rank[b]) {
                rank[a]++;
            }
            if (rank[a] > rank[b]) {
                p[b] = a;
                delta[b] = d;
            } else {
                p[a] = b;
                delta[a] = d;
            }
        }

    }

    static class TreeDiameter {
        private List<UndirectedEdge>[] edges;
        private int[] depth;
        private int[] parents;
        private int diameter;
        private IntegerList centers;
        private IntegerList ends;

        public IntegerList getEnds() {
            return ends;
        }

        public TreeDiameter(List<UndirectedEdge>[] edges, int n) {
            this.edges = edges;
            depth = new int[n];
            centers = new IntegerList(2);
            ends = new IntegerList(2);
            parents = new int[n];

            dfsForDepth(0, -1);
            int end = 0;
            for (int i = 0; i < n; i++) {
                if (depth[i] > depth[end]) {
                    end = i;
                }
            }
            dfsForDepth(end, -1);
            int another = 0;
            for (int i = 0; i < n; i++) {
                if (depth[i] > depth[another]) {
                    another = i;
                }
            }

            ends.add(end);
            ends.add(another);

            diameter = depth[another];
            for (int i = another; i != -1; i = parents[i]) {
                if (depth[i] == DigitUtils.ceilDiv(diameter, 2) ||
                        depth[i] == DigitUtils.floorDiv(diameter, 2)) {
                    centers.add(i);
                }
            }

            ends.unique();
            centers.unique();
        }

        private void dfsForDepth(int root, int p) {
            parents[root] = p;
            depth[root] = p != -1 ? depth[p] + 1 : 0;
            for (UndirectedEdge e : edges[root]) {
                int node = e.to;
                if (node == p) {
                    continue;
                }
                dfsForDepth(node, root);
            }
        }

    }

    static class FastInput {
        private final InputStream is;
        private byte[] buf = new byte[1 << 20];
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

    static interface IntegerDeque extends IntegerStack {
    }

    static class Randomized {
        private static Random random = new Random();

        public static void shuffle(int[] data, int from, int to) {
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

    static class SequenceUtils {
        public static boolean equal(int[] a, int al, int ar, int[] b, int bl, int br) {
            if ((ar - al) != (br - bl)) {
                return false;
            }
            for (int i = al, j = bl; i <= ar; i++, j++) {
                if (a[i] != b[j]) {
                    return false;
                }
            }
            return true;
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

    static interface IntegerStack {
    }

    static class Graph {
        public static void addUndirectedEdge(List<UndirectedEdge>[] g, int s, int t) {
            UndirectedEdge toT = new UndirectedEdge(t);
            UndirectedEdge toS = new UndirectedEdge(s);
            toT.rev = toS;
            toS.rev = toT;
            g[s].add(toT);
            g[t].add(toS);
        }

        public static List<UndirectedEdge>[] createUndirectedGraph(int n) {
            List<UndirectedEdge>[] ans = new List[n];
            for (int i = 0; i < n; i++) {
                ans[i] = new ArrayList<>();
            }
            return ans;
        }

    }
}

