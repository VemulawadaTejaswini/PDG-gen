import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {
    static void solve(MyScanner in, MyWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        long s = in.nextInt();
        int[][] uvab = in.nextVerticalIntArrays(4, m);
        int[] u = decrement(uvab[0]);
        int[] v = decrement(uvab[1]);
        int[] a = uvab[2];
        int[] b = uvab[3];
        long[][] cd = in.nextVerticalLongArrays(2, n);
        long[] c = cd[0];
        long[] d = cd[1];

        List<Edge> bEdges = Edge.listOf(u, v, b);
        AdjacencyList g = AdjacencyList.forUndirectedGraph(n, bEdges);
        WarshallFloyd.Result r = WarshallFloyd.exec(g);

        var map = new int[n][n];
        for (int i = 0; i < m; i++) {
            map[u[i]][v[i]] = a[i];
            map[v[i]][u[i]] = a[i];
        }

        var q = new PriorityQueue<>(Comparator.comparingLong(Elem::time));
        q.offer(new Elem(0, s, 0));
        var done = new boolean[n];
        var answer = new long[n];
        while (!q.isEmpty()) {
            Elem e = q.poll();
            if (done[e.vertexId]) {
                continue;
            }
            done[e.vertexId] = true;
            answer[e.vertexId] = e.time;
            for (int i = 0; i < n; i++) {
                if (done[i]) {
                    continue;
                }
                List<Integer> p = r.path(e.vertexId, i);
                long count = 0;
                for (int j = 0; j < p.size() - 1; j++) {
                    count += map[p.get(j)][p.get(j + 1)];
                }
                long rem = e.silverCount - count;
                long time = e.time + r.distance(e.vertexId, i);
                if (rem >= 0) {
                    q.offer(new Elem(i, rem, time));
                } else {
                    long changes =
                            roundUp(count - e.silverCount, c[e.vertexId]);
                    q.offer(new Elem(i,
                                     rem + c[e.vertexId] * changes,
                                     time + d[e.vertexId] * changes));
                }
            }
        }
        out.printLines(Arrays.copyOfRange(answer, 1, answer.length));
    }
    private static long roundUp(long divident, long divisor) {
        if (divident < 0) {
            throw new IllegalArgumentException();
        }
        if (divisor <= 0) {
            throw new IllegalArgumentException();
        }
        return (divident + divisor - 1) / divisor;
    }
    static final class Elem {
        final int vertexId;
        final long silverCount;
        final long time;
        Elem(int vertexId, long silverCount, long time) {
            this.vertexId = vertexId;
            this.silverCount = silverCount;
            this.time = time;
        }
        long time() {
            return time;
        }
    }
    static final class WarshallFloyd {
        public static final class Result {
            private final long[][] distance;
            private final int[][] next;

            private Result(long[][] distance, int[][] next) {
                this.distance = distance;
                this.next = next;
            }
            public long distance(int src, int dest) {
                return distance[src][dest];
            }
            public int next(int src, int dest) {
                return next[src][dest];
            }
            public List<Integer> path(int src, int dest) {
                List<Integer> path = new ArrayList<>();
                path.add(src);
                for (int n = next(src, dest); n != -1; n = next(n, dest)) {
                    path.add(n);
                }
                return path;
            }
        }
        private static boolean isShorterPath(long[][] distance,
                                             int k,
                                             int i,
                                             int j) {
            return distance[i][k] != Long.MAX_VALUE
                   && distance[k][j] != Long.MAX_VALUE
                   && distance[i][j] > distance[i][k] + distance[k][j];
        }
        public static Result exec(AdjacencyList list) {
            int n = list.vertexCount();
            long[][] distance = new long[n][n];
            int[][] next = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    distance[i][j] = i == j ? 0 : Long.MAX_VALUE;
                    next[i][j] = -1;
                }
            }
            for (int i = 0; i < n; i++) {
                for (Edge edge : list.edgesFrom(i)) {
                    if (distance[edge.from][edge.to] > edge.weight) {
                        distance[edge.from][edge.to] = edge.weight;
                        next[edge.from][edge.to] = edge.to;
                    }
                }
            }
            for (int k = 0; k < n; k++) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (isShorterPath(distance, k, i, j)) {
                            distance[i][j] = distance[i][k] + distance[k][j];
                            next[i][j] = next[i][k];
                        }
                    }
                }
            }
            return new Result(distance, next);
        }
    }
    static final class AdjacencyList {
        private final List<List<Edge>> list;

        private AdjacencyList(List<List<Edge>> list) {
            this.list = list;
        }
        int vertexCount() {
            return list.size();
        }
        List<Edge> edgesFrom(int vertexId) {
            return list.get(vertexId);
        }
        static AdjacencyList forDirectedGraph(int vertexCount,
                                              List<Edge> edges) {
            List<List<Edge>> list =
                    new ArrayList<>(Collections.nCopies(vertexCount, null));
            list.replaceAll(e -> new ArrayList<>());
            for (Edge e : edges) {
                list.get(e.from).add(e);
            }
            return new AdjacencyList(list);
        }
        static AdjacencyList forUndirectedGraph(int vertexCount,
                                                List<Edge> edges) {
            List<List<Edge>> list =
                    new ArrayList<>(Collections.nCopies(vertexCount, null));
            list.replaceAll(e -> new ArrayList<>());
            for (Edge e : edges) {
                list.get(e.from).add(e);
                list.get(e.to).add(e.reverse());
            }
            return new AdjacencyList(list);
        }
    }
    static final class Edge {
        final int from;
        final int to;
        final long weight;
        final int id;

        Edge(int from, int to) {
            this(from, to, 1);
        }
        Edge(int from, int to, int weight) {
            this(from, to, weight, -1);
        }
        Edge(int from, int to, long weight, int id) {
            if (from < 0 || to < 0) {
                throw new IllegalArgumentException();
            }
            this.from = from;
            this.to = to;
            this.weight = weight;
            this.id = id;
        }
        int from() {
            return from;
        }
        int to() {
            return to;
        }
        long weight() {
            return weight;
        }
        Edge reverse() {
            return new Edge(to, from, weight, id);
        }
        static List<Edge> listOf(int[] from, int[] to) {
            return listOf(from, to, null);
        }
        static List<Edge> listOf(int[] from, int[] to, int[] weight) {
            if (from.length != to.length
                || (weight != null && from.length != weight.length)) {
                throw new IllegalArgumentException();
            }
            List<Edge> result = new ArrayList<>(from.length);
            for (int i = 0; i < from.length; i++) {
                result.add(new Edge(from[i],
                                    to[i],
                                    weight == null ? 1 : weight[i],
                                    i));
            }
            return result;
        }
    }
    private static int[] decrement(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i]--;
        }
        return a;
    }
    public static void main(String[] args) {
        MyWriter w = new MyWriter(System.out);
        solve(new MyScanner(System.in), w);
        w.flush();
    }
    static final class MyScanner {
        static final int BUFFER_SIZE = 8192;
        private final InputStream in;
        private final byte[] buffer = new byte[BUFFER_SIZE];
        private int point;
        private int readLength;

        MyScanner(InputStream in) {
            this.in = in;
        }
        private int readByte() {
            if (point < readLength) {
                int result = buffer[point];
                point += 1;
                return result;
            }
            try {
                readLength = in.read(buffer);
            } catch (IOException e) {
                throw new AssertionError(null, e);
            }
            if (readLength == -1) {
                return -1;
            }
            point = 1;
            return buffer[0];
        }
        private static boolean isVisibleChar(int c) {
            return 33 <= c && c <= 126;
        }
        char nextChar() {
            int c = readByte();
            while (!(c == -1 || isVisibleChar(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            return (char)c;
        }
        String next() {
            return next(16);
        }
        String next(int n) {
            int c = readByte();
            while (!(c == -1 || isVisibleChar(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            StringBuilder b = new StringBuilder(n);
            do {
                b.append((char)c);
                c = readByte();
            } while (c != -1 && isVisibleChar(c));
            return b.toString();
        }
        long nextLong() {
            int c = readByte();
            while (!(c == -1 || isVisibleChar(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            boolean minus = false;
            long limit = -Long.MAX_VALUE;
            if (c == '-') {
                minus = true;
                limit = Long.MIN_VALUE;
                c = readByte();
            }
            long n = 0L;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                if (n < limit / 10L) {
                    throw new InputMismatchException();
                }
                n *= 10L;
                int digit = c - '0';
                if (n < limit + digit) {
                    throw new InputMismatchException();
                }
                n -= digit;
                c = readByte();
            } while (c != -1 && isVisibleChar(c));
            return minus ? n : -n;
        }
        int nextInt() {
            long n = nextLong();
            if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE) {
                throw new InputMismatchException();
            }
            return (int)n;
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        int[] nextIntArray(int n) {
            int[] result = new int[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextInt();
            }
            return result;
        }
        long[] nextLongArray(int n) {
            long[] result = new long[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextLong();
            }
            return result;
        }
        char[] nextCharArray(int n) {
            char[] result = new char[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextChar();
            }
            return result;
        }
        char[][] next2dCharArray(int n, int m) {
            char[][] result = new char[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    result[i][j] = nextChar();
                }
            }
            return result;
        }
        int[][] nextVerticalIntArrays(int arrayCount, int arrayLength) {
            int[][] result = new int[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextInt();
                }
            }
            return result;
        }
        long[][] nextVerticalLongArrays(int arrayCount, int arrayLength) {
            long[][] result = new long[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextLong();
                }
            }
            return result;
        }
        char[][] nextVerticalCharArrays(int arrayCount, int arrayLength) {
            char[][] result = new char[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextChar();
                }
            }
            return result;
        }
    }
    static final class MyWriter extends PrintWriter {
        MyWriter(OutputStream out) {
            super(out);
        }
        void println(int[] x) {
            println(x, " ");
        }
        void println(int[] x, String delimiter) {
            if (x.length > 0) {
                print(x[0]);
                for (int i = 1; i < x.length; i++) {
                    print(delimiter);
                    print(x[i]);
                }
            }
            println();
        }
        void println(long[] x) {
            println(x, " ");
        }
        void println(long[] x, String delimiter) {
            if (x.length > 0) {
                print(x[0]);
                for (int i = 1; i < x.length; i++) {
                    print(delimiter);
                    print(x[i]);
                }
            }
            println();
        }
        void println(Iterable<?> iterable) {
            println(iterable, " ");
        }
        void println(Iterable<?> iterable, String delimiter) {
            Iterator<?> i = iterable.iterator();
            if (i.hasNext()) {
                print(i.next());
                while (i.hasNext()) {
                    print(delimiter);
                    print(i.next());
                }
            }
            println();
        }
        void printLines(int[] x) {
            println(x, System.lineSeparator());
        }
        void printLines(long[] x) {
            println(x, System.lineSeparator());
        }
        void printLines(Iterable<?> iterable) {
            println(iterable, System.lineSeparator());
        }
    }
}
