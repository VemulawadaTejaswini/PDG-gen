import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.io.IOException;
import java.util.Queue;
import java.util.ArrayDeque;
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
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            int n = x + y + z;
            MinCostMaxFlowNetwork g = new MinCostMaxFlowNetwork(n + 3 + 2);
            int source = n + 3;
            int sink = n + 4;
            int[] a = new int[n];
            int[] b = new int[n];
            int[] c = new int[n];
            for (int i = 0; i < n; ++i) {
                a[i] = in.nextInt();
                b[i] = in.nextInt();
                c[i] = in.nextInt();
                g.addEdge(i, sink, 1, 0);
                g.addEdge(n + 0, i, 1, -a[i]);
                g.addEdge(n + 1, i, 1, -b[i]);
                g.addEdge(n + 2, i, 1, -c[i]);
            }
            g.addEdge(source, n + 0, x, 0);
            g.addEdge(source, n + 1, y, 0);
            g.addEdge(source, n + 2, z, 0);
            long ans = g.flow(source, sink)[1];
            out.println(-ans);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new UnknownError();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new UnknownError();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String next() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuffer res = new StringBuffer();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));

            return res.toString();
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }

    static class MinCostMaxFlowNetwork {
        private static final int initialEdgeCapacity = 3;
        public static long Inf = 1L << 62;
        private long[] _capacity;
        private long[] _flow;
        private long[] _cost;
        private int[] _from;
        private int[] _to;
        private int[] _firstEdge;
        private int[] _nextEdge;
        private int nodeCount;
        private int edgeCount;
        private int edgeCapacity;

        public MinCostMaxFlowNetwork(int N, int initialEdgeCapacity) {
            nodeCount = N;
            edgeCount = 0;
            edgeCapacity = initialEdgeCapacity;
            _capacity = new long[edgeCapacity];
            _flow = new long[edgeCapacity];
            _cost = new long[edgeCapacity];
            _from = new int[edgeCapacity];
            _to = new int[edgeCapacity];
            _firstEdge = new int[nodeCount];
            _nextEdge = new int[edgeCapacity];

            Arrays.fill(_firstEdge, -1);
        }

        public MinCostMaxFlowNetwork(int N) {
            this(N, MinCostMaxFlowNetwork.initialEdgeCapacity);
        }

        public void addEdge(int from, int to, long capacity, long cost) {
            _addEdge(from, to, capacity, cost);
            _addEdge(to, from, 0, -cost);
        }

        private void _addEdge(int from, int to, long capacity, long cost) {
            ensureEdgeCapacity(edgeCount + 1);
            _from[edgeCount] = from;
            _to[edgeCount] = to;
            _capacity[edgeCount] = capacity;
            _flow[edgeCount] = 0;
            _cost[edgeCount] = cost;
            _nextEdge[edgeCount] = _firstEdge[from];
            _firstEdge[from] = edgeCount++;
        }

        private void ensureEdgeCapacity(int edgeCount) {
            if (edgeCount > edgeCapacity) {
                edgeCapacity = 2 * edgeCapacity + 1;
                _capacity = resize(_capacity, edgeCapacity);
                _flow = resize(_flow, edgeCapacity);
                _cost = resize(_cost, edgeCapacity);
                _from = resize(_from, edgeCapacity);
                _to = resize(_to, edgeCapacity);
                _nextEdge = resize(_nextEdge, edgeCapacity);
            }
        }

        private long[] resize(long[] A, int size) {
            long[] B = new long[size];
            System.arraycopy(A, 0, B, 0, A.length);
            return B;
        }

        private int[] resize(int[] A, int size) {
            int[] B = new int[size];
            System.arraycopy(A, 0, B, 0, A.length);
            return B;
        }

        public long augumentValue(int edge) {
            return _capacity[edge] - _flow[edge];
        }

        public boolean isSaturated(int edge) {
            return _flow[edge] >= _capacity[edge];
        }

        public long[] flow(int source, int sink) {
            long flow = 0, cost = 0;
            int[] prev = new int[nodeCount];
            long[] dist = new long[nodeCount];
            boolean[] inQueue = new boolean[nodeCount];

            while (bellmanFord(source, sink, prev, dist, inQueue)) {
                long add = Inf;
                for (int i = sink; i != source; i = _to[prev[i]])
                    add = Math.min(add, augumentValue(prev[i] ^ 1));
                for (int i = sink; i != source; i = _to[prev[i]]) {
                    _flow[prev[i] ^ 1] += add;
                    _flow[prev[i]] -= add;
                }
                flow += add;
                cost += dist[sink] * add;
            }
            return new long[]{flow, cost};
        }

        private boolean bellmanFord(int S, int D, int[] prev, long[] dist, boolean[] inQueue) {
            Queue<Integer> Q = new ArrayDeque<>();
            Arrays.fill(prev, -1);
            Arrays.fill(dist, Inf);
            Arrays.fill(inQueue, false);
            prev[S] = -2;
            dist[S] = 0;
            Q.add(S);
            while (!Q.isEmpty()) {
                int node = Q.poll();
                inQueue[node] = false;

                for (int p = _firstEdge[node]; p != -1; p = _nextEdge[p]) {
                    if (isSaturated(p)) continue;
                    if (dist[_to[p]] > dist[node] + _cost[p]) {
                        dist[_to[p]] = dist[node] + _cost[p];
                        prev[_to[p]] = p ^ 1;

                        if (!inQueue[_to[p]]) {
                            inQueue[_to[p]] = true;
                            Q.add(_to[p]);
                        }
                    }
                }
            }
            return prev[D] != -1;
        }

    }
}

