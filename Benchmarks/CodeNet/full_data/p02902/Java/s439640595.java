import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Deque;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        FPure solver = new FPure();
        solver.solve(1, in, out);
        out.close();
    }

    static class FPure {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            // x
            int n = in.readInt();
            int m = in.readInt();
            int[] a = new int[m];
            int[] b = new int[m];
            in.readIntArrays(a, b);
            MiscUtils.decreaseByOne(a, b);

            Graph g = Graph.createGraph(n, a, b);

            int idx = -1;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                Deque<Integer> q = new ArrayDeque<>();
                int[] d = new int[n];
                Arrays.fill(d, Integer.MAX_VALUE);
                for (Edge e : g.outbound(i)) {
                    int to = e.getDestination();
                    d[to] = 1;
                    q.add(to);
                }
                while (!q.isEmpty()) {
                    int x = q.poll();
                    for (Edge e : g.outbound(x)) {
                        int to = e.getDestination();
                        if (d[to] > d[x] + 1) {
                            d[to] = d[x] + 1;
                            q.add(to);
                        }
                    }
                }
                if (d[i] < min) {
                    idx = i;
                    min = d[i];
                }
            }

            if (min == Integer.MAX_VALUE) {
                out.printLine(-1);
                return;
            }

            {
                Deque<Integer> q = new ArrayDeque<>();
                int[] d = new int[n];
                Arrays.fill(d, Integer.MAX_VALUE);
                for (Edge e : g.outbound(idx)) {
                    int to = e.getDestination();
                    d[to] = 1;
                    q.add(to);
                }
                while (!q.isEmpty()) {
                    int x = q.poll();
                    for (Edge e : g.outbound(x)) {
                        int to = e.getDestination();
                        if (d[to] > d[x] + 1) {
                            d[to] = d[x] + 1;
                            q.add(to);
                        }
                    }
                }

                out.printLine(min);
                int x = idx;
                for (int i = 0; i < min; i++) {
                    out.printLine(x + 1);
                    for (Edge e : g.inbound(x)) {
                        int to = e.getSource();
                        if (d[to] == d[x] - 1) {
                            x = to;
                            break;
                        }
                    }
                }
            }
        }

    }

    static interface Edge {
        public int getSource();

        public int getDestination();

    }

    static class Graph {
        public static final int REMOVED_BIT = 0;
        protected int vertexCount;
        protected int edgeCount;
        private int[] firstOutbound;
        private int[] firstInbound;
        private Edge[] edges;
        private int[] nextInbound;
        private int[] nextOutbound;
        private int[] from;
        private int[] to;
        private long[] weight;
        public long[] capacity;
        private int[] reverseEdge;
        private int[] flags;

        public Graph(int vertexCount) {
            this(vertexCount, vertexCount);
        }

        public Graph(int vertexCount, int edgeCapacity) {
            this.vertexCount = vertexCount;
            firstOutbound = new int[vertexCount];
            Arrays.fill(firstOutbound, -1);

            from = new int[edgeCapacity];
            to = new int[edgeCapacity];
            nextOutbound = new int[edgeCapacity];
            flags = new int[edgeCapacity];
        }

        public static Graph createGraph(int vertexCount, int[] from, int[] to) {
            Graph graph = new Graph(vertexCount, from.length);
            for (int i = 0; i < from.length; i++) {
                graph.addSimpleEdge(from[i], to[i]);
            }
            return graph;
        }

        public int addEdge(int fromID, int toID, long weight, long capacity, int reverseEdge) {
            ensureEdgeCapacity(edgeCount + 1);
            if (firstOutbound[fromID] != -1) {
                nextOutbound[edgeCount] = firstOutbound[fromID];
            } else {
                nextOutbound[edgeCount] = -1;
            }
            firstOutbound[fromID] = edgeCount;
            if (firstInbound != null) {
                if (firstInbound[toID] != -1) {
                    nextInbound[edgeCount] = firstInbound[toID];
                } else {
                    nextInbound[edgeCount] = -1;
                }
                firstInbound[toID] = edgeCount;
            }
            this.from[edgeCount] = fromID;
            this.to[edgeCount] = toID;
            if (capacity != 0) {
                if (this.capacity == null) {
                    this.capacity = new long[from.length];
                }
                this.capacity[edgeCount] = capacity;
            }
            if (weight != 0) {
                if (this.weight == null) {
                    this.weight = new long[from.length];
                }
                this.weight[edgeCount] = weight;
            }
            if (reverseEdge != -1) {
                if (this.reverseEdge == null) {
                    this.reverseEdge = new int[from.length];
                    Arrays.fill(this.reverseEdge, 0, edgeCount, -1);
                }
                this.reverseEdge[edgeCount] = reverseEdge;
            }
            if (edges != null) {
                edges[edgeCount] = createEdge(edgeCount);
            }
            return edgeCount++;
        }

        protected final GraphEdge createEdge(int id) {
            return new GraphEdge(id);
        }

        public final int addFlowWeightedEdge(int from, int to, long weight, long capacity) {
            if (capacity == 0) {
                return addEdge(from, to, weight, 0, -1);
            } else {
                int lastEdgeCount = edgeCount;
                addEdge(to, from, -weight, 0, lastEdgeCount + entriesPerEdge());
                return addEdge(from, to, weight, capacity, lastEdgeCount);
            }
        }

        protected int entriesPerEdge() {
            return 1;
        }

        public final int addWeightedEdge(int from, int to, long weight) {
            return addFlowWeightedEdge(from, to, weight, 0);
        }

        public final int addSimpleEdge(int from, int to) {
            return addWeightedEdge(from, to, 0);
        }

        public final int source(int id) {
            return from[id];
        }

        public final int destination(int id) {
            return to[id];
        }

        protected final void initEdges() {
            if (edges == null) {
                edges = new Edge[from.length];
                for (int i = 0; i < edgeCount; i++) {
                    edges[i] = createEdge(i);
                }
            }
        }

        private void initInbound() {
            if (firstInbound == null) {
                firstInbound = new int[firstOutbound.length];
                Arrays.fill(firstInbound, 0, vertexCount, -1);
                nextInbound = new int[from.length];
                for (int i = 0; i < edgeCount; i++) {
                    nextInbound[i] = firstInbound[to[i]];
                    firstInbound[to[i]] = i;
                }
            }
        }

        public final boolean flag(int id, int bit) {
            return (flags[id] >> bit & 1) != 0;
        }

        public final void setFlag(int id, int bit) {
            flags[id] |= 1 << bit;
        }

        public final void removeEdge(int id) {
            setFlag(id, REMOVED_BIT);
        }

        public final boolean isRemoved(int id) {
            return flag(id, REMOVED_BIT);
        }

        public final Iterable<Edge> outbound(final int id) {
            initEdges();
            return new Iterable<Edge>() {
                public Iterator<Edge> iterator() {
                    return new EdgeIterator(id, firstOutbound, nextOutbound);
                }
            };
        }

        public final Iterable<Edge> inbound(final int id) {
            initEdges();
            initInbound();
            return new Iterable<Edge>() {
                public Iterator<Edge> iterator() {
                    return new EdgeIterator(id, firstInbound, nextInbound);
                }
            };
        }

        protected void ensureEdgeCapacity(int size) {
            if (from.length < size) {
                int newSize = Math.max(size, 2 * from.length);
                if (edges != null) {
                    edges = resize(edges, newSize);
                }
                from = resize(from, newSize);
                to = resize(to, newSize);
                nextOutbound = resize(nextOutbound, newSize);
                if (nextInbound != null) {
                    nextInbound = resize(nextInbound, newSize);
                }
                if (weight != null) {
                    weight = resize(weight, newSize);
                }
                if (capacity != null) {
                    capacity = resize(capacity, newSize);
                }
                if (reverseEdge != null) {
                    reverseEdge = resize(reverseEdge, newSize);
                }
                flags = resize(flags, newSize);
            }
        }

        protected final int[] resize(int[] array, int size) {
            int[] newArray = new int[size];
            System.arraycopy(array, 0, newArray, 0, array.length);
            return newArray;
        }

        private long[] resize(long[] array, int size) {
            long[] newArray = new long[size];
            System.arraycopy(array, 0, newArray, 0, array.length);
            return newArray;
        }

        private Edge[] resize(Edge[] array, int size) {
            Edge[] newArray = new Edge[size];
            System.arraycopy(array, 0, newArray, 0, array.length);
            return newArray;
        }

        protected class GraphEdge implements Edge {
            protected int id;

            protected GraphEdge(int id) {
                this.id = id;
            }

            public int getSource() {
                return source(id);
            }

            public int getDestination() {
                return destination(id);
            }

        }

        public class EdgeIterator implements Iterator<Edge> {
            private int edgeID;
            private final int[] next;
            private int lastID = -1;

            public EdgeIterator(int id, int[] first, int[] next) {
                this.next = next;
                edgeID = nextEdge(first[id]);
            }

            private int nextEdge(int id) {
                while (id != -1 && isRemoved(id)) {
                    id = next[id];
                }
                return id;
            }

            public boolean hasNext() {
                return edgeID != -1;
            }

            public Edge next() {
                if (edgeID == -1) {
                    throw new NoSuchElementException();
                }
                lastID = edgeID;
                edgeID = nextEdge(next[lastID]);
                return edges[lastID];
            }

            public void remove() {
                if (lastID == -1) {
                    throw new IllegalStateException();
                }
                removeEdge(lastID);
                lastID = -1;
            }

        }

    }

    static class MiscUtils {
        public static void decreaseByOne(int[]... arrays) {
            for (int[] array : arrays) {
                for (int i = 0; i < array.length; i++) {
                    array[i]--;
                }
            }
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public void readIntArrays(int[]... arrays) {
            for (int i = 0; i < arrays[0].length; i++) {
                for (int j = 0; j < arrays.length; j++) {
                    arrays[j][i] = readInt();
                }
            }
        }

        public int read() {
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
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int readInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

        public void printLine(int i) {
            writer.println(i);
        }

    }
}

