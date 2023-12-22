import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.AbstractQueue;
import java.util.Deque;
import java.util.ArrayList;
import java.util.AbstractCollection;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.util.Collection;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.List;
import java.io.Closeable;
import java.io.Writer;
import java.util.ArrayDeque;
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
            EYoungMaids solver = new EYoungMaids();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class EYoungMaids {
        RMQ[] rmqs = new RMQ[2];

        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            int[] p = new int[n];
            in.populate(p);
            int[] even = new int[n];
            int[] odd = new int[n];
            int inf = (int) 1e9;
            Arrays.fill(even, inf);
            Arrays.fill(odd, inf);
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    even[i] = p[i];
                } else {
                    odd[i] = p[i];
                }
            }

            rmqs[0] = new RMQ(n);
            rmqs[1] = new RMQ(rmqs[0]);
            rmqs[0].reset(0, n - 1, (a, b) -> Integer.compare(even[a], even[b]));
            rmqs[1].reset(0, n - 1, (a, b) -> Integer.compare(odd[a], odd[b]));
            Node root = build(0, n - 1, 0, null);

            PriorityQueue<Node> pq = new PriorityQueue<>(n, (a, b) -> Integer.compare(p[a.first], p[b.first]));
            pq.add(root);

            List<Node> ordered = new ArrayList<>(n);
            while (!pq.isEmpty()) {
                Node top = pq.remove();
                ordered.add(top);
                pq.addAll(top.next);
            }

            for (Node node : ordered) {
                out.append(p[node.first]).append(' ').append(p[node.second]).append(' ');
            }
        }

        public Node build(int l, int r, int xor, Node top) {
            if (l >= r) {
                return null;
            }
            Node node = new Node();
            node.p = top;
            if (top != null) {
                top.next.add(node);
            }
            node.first = rmqs[0 ^ xor].query(l, r);
            node.second = rmqs[1 ^ xor].query(node.first + 1, r);
            build(l, node.first - 1, xor, node);
            build(node.first + 1, node.second - 1, xor ^ 1, node);
            build(node.second + 1, r, xor, node);

            return node;
        }

    }

    static class Node {
        Node p;
        List<Node> next = new ArrayList<>();
        int first;
        int second;

    }

    static interface IntegerIterator {
        boolean hasNext();

        int next();

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

    static interface IntegerComparator {
        public int compare(int a, int b);

    }

    static class Log2 {
        public static int floorLog(int x) {
            return 31 - Integer.numberOfLeadingZeros(x);
        }

    }

    static class IntegerMultiWayStack {
        private int[] values;
        private int[] next;
        private int[] heads;
        private int alloc;
        private int stackNum;

        public IntegerIterator iterator(final int queue) {
            return new IntegerIterator() {
                int ele = heads[queue];


                public boolean hasNext() {
                    return ele != 0;
                }


                public int next() {
                    int ans = values[ele];
                    ele = next[ele];
                    return ans;
                }
            };
        }

        private void doubleCapacity() {
            int newSize = Math.max(next.length + 10, next.length * 2);
            next = Arrays.copyOf(next, newSize);
            values = Arrays.copyOf(values, newSize);
        }

        public void alloc() {
            alloc++;
            if (alloc >= next.length) {
                doubleCapacity();
            }
            next[alloc] = 0;
        }

        public void clear() {
            alloc = 0;
            Arrays.fill(heads, 0, stackNum, 0);
        }

        public boolean isEmpty(int qId) {
            return heads[qId] == 0;
        }

        public void expandStackNum(int qNum) {
            if (qNum <= stackNum) {
            } else if (qNum <= heads.length) {
                Arrays.fill(heads, stackNum, qNum, 0);
            } else {
                Arrays.fill(heads, stackNum, heads.length, 0);
                heads = Arrays.copyOf(heads, qNum);
            }
            stackNum = qNum;
        }

        public IntegerMultiWayStack(int qNum, int totalCapacity) {
            values = new int[totalCapacity + 1];
            next = new int[totalCapacity + 1];
            heads = new int[qNum];
            stackNum = qNum;
        }

        public void addLast(int qId, int x) {
            alloc();
            values[alloc] = x;
            next[alloc] = heads[qId];
            heads[qId] = alloc;
        }

        public String toString() {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < stackNum; i++) {
                if (isEmpty(i)) {
                    continue;
                }
                builder.append(i).append(": ");
                for (IntegerIterator iterator = iterator(i); iterator.hasNext(); ) {
                    builder.append(iterator.next()).append(",");
                }
                if (builder.charAt(builder.length() - 1) == ',') {
                    builder.setLength(builder.length() - 1);
                }
                builder.append('\n');
            }
            return builder.toString();
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

        public void populate(int[] data) {
            for (int i = 0; i < data.length; i++) {
                data[i] = readInt();
            }
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

    static class RMQ {
        private IntegerMultiWayStack stack;
        private RMQ.LcaOnTree lca;
        private Deque deque;
        private RMQ.Node[] nodes;
        private int offset;

        public RMQ(RMQ model) {
            this.stack = model.stack;
            this.deque = model.deque;
            this.nodes = model.nodes;
            this.lca = new RMQ.LcaOnTree(this.nodes.length);
        }

        public RMQ(int n) {
            stack = new IntegerMultiWayStack(n, n - 1);
            lca = new RMQ.LcaOnTree(n);
            deque = new ArrayDeque(n);
            nodes = new RMQ.Node[n];
            for (int i = 0; i < n; i++) {
                nodes[i] = new RMQ.Node();
            }
        }

        public <T> void reset(int l, int r, IntegerComparator comp) {
            int len = r - l + 1;
            stack.expandStackNum(len);
            stack.clear();
            deque.clear();
            offset = l;

            for (int i = 0; i < len; i++) {
                nodes[i].index = i;
                nodes[i].left = nodes[i].right = null;
            }
            Deque<RMQ.Node> deque = new ArrayDeque<>(len);
            for (int i = 0; i < len; i++) {
                while (!deque.isEmpty() && comp.compare(deque.peekLast().index + offset,
                        nodes[i].index + offset) > 0) {
                    RMQ.Node tail = deque.removeLast();
                    tail.right = nodes[i].left;
                    nodes[i].left = tail;
                }
                deque.addLast(nodes[i]);
            }
            while (deque.size() > 1) {
                RMQ.Node tail = deque.removeLast();
                deque.peekLast().right = tail;
            }
            RMQ.Node root = deque.removeLast();
            for (int i = 0; i < len; i++) {
                if (nodes[i].left != null) {
                    stack.addLast(i, nodes[i].left.index);
                }
                if (nodes[i].right != null) {
                    stack.addLast(i, nodes[i].right.index);
                }
            }

            lca.reset(stack, root.index);
        }

        public int query(int l, int r) {
            l -= offset;
            r -= offset;
            return lca.lca(l, r) + offset;
        }

        private static class LcaOnTree {
            int[] parent;
            int[] preOrder;
            int[] i;
            int[] head;
            int[] a;
            int time;

            void dfs1(IntegerMultiWayStack tree, int u, int p) {
                parent[u] = p;
                i[u] = preOrder[u] = time++;
                for (IntegerIterator iterator = tree.iterator(u); iterator.hasNext(); ) {
                    int v = iterator.next();
                    if (v == p) continue;
                    dfs1(tree, v, u);
                    if (Integer.lowestOneBit(i[u]) < Integer.lowestOneBit(i[v])) {
                        i[u] = i[v];
                    }
                }
                head[i[u]] = u;
            }

            void dfs2(IntegerMultiWayStack tree, int u, int p, int up) {
                a[u] = up | Integer.lowestOneBit(i[u]);
                for (IntegerIterator iterator = tree.iterator(u); iterator.hasNext(); ) {
                    int v = iterator.next();
                    if (v == p) continue;
                    dfs2(tree, v, u, a[u]);
                }
            }

            public void reset(IntegerMultiWayStack tree, int root) {
                time = 0;
                dfs1(tree, root, -1);
                dfs2(tree, root, -1, 0);
            }

            public LcaOnTree(int n) {
                preOrder = new int[n];
                i = new int[n];
                head = new int[n];
                a = new int[n];
                parent = new int[n];
            }

            private int enterIntoStrip(int x, int hz) {
                if (Integer.lowestOneBit(i[x]) == hz)
                    return x;
                int hw = 1 << Log2.floorLog(a[x] & (hz - 1));
                return parent[head[i[x] & -hw | hw]];
            }

            public int lca(int x, int y) {
                int hb = i[x] == i[y] ? Integer.lowestOneBit(i[x]) : (1 << Log2.floorLog(i[x] ^ i[y]));
                int hz = Integer.lowestOneBit(a[x] & a[y] & -hb);
                int ex = enterIntoStrip(x, hz);
                int ey = enterIntoStrip(y, hz);
                return preOrder[ex] < preOrder[ey] ? ex : ey;
            }

        }

        private static class Node {
            public int index;
            public RMQ.Node left;
            public RMQ.Node right;

            public String toString() {
                return "" + index;
            }

        }

    }
}

