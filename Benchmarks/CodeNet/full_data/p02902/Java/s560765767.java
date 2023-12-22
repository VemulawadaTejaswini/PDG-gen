import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Main {
    static final class Edge {
        final int src;
        final int dest;
        final long weight;
        Edge(int src, int dest, long weight) {
            if (src < 0 || dest < 0) {
                throw new IllegalArgumentException();
            }
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
        int src() {
            return src;
        }
        int dest() {
            return dest;
        }
        long weight() {
            return weight;
        }
        Edge reverse() {
            return new Edge(dest, src, weight);
        }
        static List<List<Edge>> newSrcToEdges(int vertexCount,
                                              List<Edge> edges,
                                              boolean directedGraph) {
            int[] edgeCount = new int[vertexCount];
            for (Edge e : edges) {
                edgeCount[e.src]++;
                if (!directedGraph) {
                    edgeCount[e.dest]++;
                }
            }
            List<List<Edge>> result =
                    new ArrayList<>(Collections.nCopies(vertexCount, null));
            for (int i = 0; i < vertexCount; i++) {
                result.set(i, new ArrayList<>(edgeCount[i]));
            }
            for (Edge e : edges) {
                result.get(e.src).add(e);
                if (!directedGraph) {
                    result.get(e.dest).add(e.reverse());
                }
            }
            return result;
        }
        @Override
        public int hashCode() {
            return Objects.hash(dest, src, weight);
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (!(obj instanceof Edge)) {
                return false;
            }
            Edge other = (Edge)obj;
            return dest == other.dest
                   && src == other.src
                   && weight == other.weight;
        }
        @Override
        public String toString() {
            return "Edge [src="
                   + src
                   + ", dest="
                   + dest
                   + ", weight="
                   + weight
                   + "]";
        }
    }
    static Optional<List<Edge>> findCircle(List<List<Edge>> srcToEdges,
                                           boolean[] parents,
                                           int from,
                                           int current) {
        parents[current] = true;
        for (Edge e : srcToEdges.get(current)) {
            if (e.dest == from) {
                List<Edge> list = new ArrayList<>();
                list.add(e);
                return Optional.of(list);
            }
            if (parents[e.dest]) {
                continue;
            }
            Optional<List<Edge>> r =
                    findCircle(srcToEdges, parents, from, e.dest);
            if (r.isPresent()) {
                r.get().add(e);
                return r;
            }
        }
        parents[current] = false;
        return Optional.empty();
    }
    static Set<Integer> vertexesOf(List<Edge> edges) {
        Set<Integer> result = new HashSet<>(edges.size());
        for (Edge e : edges) {
            result.add(e.src);
            result.add(e.dest);
        }
        return result;
    }
    static List<Edge> subedges(List<Edge> edges, Set<Integer> vertexes) {
        List<Edge> result = new ArrayList<>(edges.size());
        for (Edge e : edges) {
            if (vertexes.contains(e.src) && vertexes.contains(e.dest)) {
                result.add(e);
            }
        }
        return result;
    }
    static boolean isValid(List<Edge> edges) {
        Map<Integer, Integer> outEdgeCount = new HashMap<>();
        Map<Integer, Integer> inEdgeCount = new HashMap<>();
        for (Edge e : edges) {
            outEdgeCount.merge(e.src, 1, Integer::sum);
            inEdgeCount.merge(e.dest, 1, Integer::sum);
        }
        for (Integer i : outEdgeCount.values()) {
            if (i.intValue() != 1) {
                return false;
            }
        }
        for (Integer i : inEdgeCount.values()) {
            if (i.intValue() != 1) {
                return false;
            }
        }
        return true;
    }
    static Edge unused(List<Edge> edges, List<Edge> used) {
        Set<Edge> s = new HashSet<>(edges);
        s.removeAll(used);
        return s.iterator().next();
    }
    static Optional<List<Edge>> findNextCircle(List<List<Edge>> srcToEdges,
                                               Set<Edge> subedges,
                                               boolean[] parents,
                                               Edge unused,
                                               int i) {
        parents[i] = true;
        for (Edge e : srcToEdges.get(i)) {
            if (!subedges.contains(e)) {
                continue;
            }
            if (e.dest == unused.src) {
                List<Edge> list = new ArrayList<>();
                list.add(unused);
                list.add(e);
                return Optional.of(list);
            }
            if (parents[e.dest]) {
                continue;
            }
            Optional<List<Edge>> r = findNextCircle(srcToEdges,
                                                    subedges,
                                                    parents,
                                                    unused,
                                                    e.dest);
            if (r.isPresent()) {
                r.get().add(e);
                return r;
            }
        }
        parents[i] = false;
        return Optional.empty();
    }
    static void solve(MyScanner in, MyWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        List<Edge> e = new ArrayList<>(m);
        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            e.add(new Edge(a - 1, b - 1, 1));
        }
        List<List<Edge>> srcToEdges = Edge.newSrcToEdges(n, e, true);
        List<Edge> circleEdges = null;
        for (int i = 0; i < n; i++) {
            Optional<List<Edge>> o =
                    findCircle(srcToEdges, new boolean[n], i, i);
            if (o.isPresent()) {
                circleEdges = o.get();
                break;
            }
        }
        if (circleEdges == null) {
            out.println(-1);
            return;
        }
        List<Edge> subedges = subedges(e, vertexesOf(circleEdges));
        while (!isValid(subedges)) {
            Edge unused = unused(subedges, circleEdges);
            Optional<List<Edge>> o = findNextCircle(srcToEdges,
                                                    new HashSet<>(subedges),
                                                    new boolean[n],
                                                    unused,
                                                    unused.dest);
            if (!o.isPresent()) {
                throw new AssertionError();
            }
            circleEdges = o.get();
            subedges = subedges(subedges, vertexesOf(circleEdges));
        }
        Set<Integer> ans = vertexesOf(subedges);
        out.println(ans.size());
        for (Integer i : ans) {
            out.println(i + 1);
        }
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
        private static boolean isPrintableCharExceptSpace(int c) {
            return 33 <= c && c <= 126;
        }
        String next() {
            int c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            StringBuilder b = new StringBuilder();
            do {
                b.appendCodePoint(c);
                c = readByte();
            } while (c != -1 && isPrintableCharExceptSpace(c));
            return b.toString();
        }
        long nextLong() {
            int c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            boolean minus = false;
            if (c == '-') {
                minus = true;
                c = readByte();
            }
            long result = 0L;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                result = result * 10L + (c - '0');
                c = readByte();
            } while (c != -1 && isPrintableCharExceptSpace(c));
            return minus ? -result : result;
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
        private static boolean allSameLength(int[] a, int[] b, int[]... c) {
            if (a.length != b.length) {
                return false;
            }
            for (int[] element : c) {
                if (a.length != element.length) {
                    return false;
                }
            }
            return true;
        }
        private static boolean allSameLength(char[] a, char[] b, char[]... c) {
            if (a.length != b.length) {
                return false;
            }
            for (char[] element : c) {
                if (a.length != element.length) {
                    return false;
                }
            }
            return true;
        }
        void nextVerticalIntArrays(int[] a, int[] b, int[]... c) {
            if (!allSameLength(a, b, c)) {
                throw new IllegalArgumentException();
            }
            for (int i = 0; i < a.length; i++) {
                a[i] = nextInt();
                b[i] = nextInt();
                for (int[] d : c) {
                    d[i] = nextInt();
                }
            }
        }
        long[] nextLongArray(int n) {
            long[] result = new long[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextLong();
            }
            return result;
        }
        char nextChar() {
            int c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            return (char)c;
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
        void nextVerticalCharArrays(char[] a, char[] b, char[]... c) {
            if (!allSameLength(a, b, c)) {
                throw new IllegalArgumentException();
            }
            for (int i = 0; i < a.length; i++) {
                a[i] = nextChar();
                b[i] = nextChar();
                for (char[] d : c) {
                    d[i] = nextChar();
                }
            }
        }
    }
    static final class MyWriter extends PrintWriter {
        MyWriter(OutputStream out) {
            super(out);
        }
        void joinAndPrintln(int[] x) {
            joinAndPrintln(x, " ");
        }
        void joinAndPrintln(int[] x, String delimiter) {
            StringBuilder b = new StringBuilder();
            if (x.length > 0) {
                b.append(x[0]);
                for (int i = 1; i < x.length; i++) {
                    b.append(delimiter).append(x[i]);
                }
            }
            println(b.toString());
        }
        void joinAndPrintln(long[] x) {
            joinAndPrintln(x, " ");
        }
        void joinAndPrintln(long[] x, String delimiter) {
            StringBuilder b = new StringBuilder();
            if (x.length > 0) {
                b.append(x[0]);
                for (int i = 1; i < x.length; i++) {
                    b.append(delimiter).append(x[i]);
                }
            }
            println(b.toString());
        }
        void joinAndPrintln(Iterable<?> iterable) {
            joinAndPrintln(iterable, " ");
        }
        void joinAndPrintln(Iterable<?> iterable, String delimiter) {
            StringBuilder b = new StringBuilder();
            for (Iterator<?> i = iterable.iterator(); i.hasNext();) {
                b.append(i.next());
                while (i.hasNext()) {
                    b.append(delimiter).append(i.next());
                }
            }
            println(b.toString());
        }
    }
}
