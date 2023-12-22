import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Main {
    private static final class Edge {
        final int src;
        final int dest;
        final int weight;
        Edge(int src, int dest, int weight) {
            if (src < 0 || dest < 0)
                throw new IllegalArgumentException();

            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }
    private static final class AdjacencyMatrix {
        final int vertexNumber;
        final boolean directedGraph;
        private final List<Map<Integer, Edge>> matrix;
        AdjacencyMatrix(int vertexNumber, boolean directedGraph) {
            if (vertexNumber < 1)
                throw new IllegalArgumentException();
            this.vertexNumber = vertexNumber;
            this.directedGraph = directedGraph;
            matrix = new ArrayList<>(Collections.nCopies(vertexNumber, null));
        }
        void setWeight(int src, int dest, int weight) {
            if (dest < 0 || dest >= vertexNumber)
                throw new IndexOutOfBoundsException();

            Map<Integer, Edge> srcMap = matrix.get(src);
            if (srcMap == null)
                matrix.set(src, srcMap = new HashMap<>());
            srcMap.put(dest, new Edge(src, dest, weight));

            if (directedGraph)
                return;

            Map<Integer, Edge> destMap = matrix.get(dest);
            if (destMap == null)
                matrix.set(dest, destMap = new HashMap<>());
            destMap.put(src, new Edge(dest, src, weight));
        }
        Collection<Edge> edges(int src) {
            Map<Integer, Edge> m = matrix.get(src);
            return m == null ? Collections.emptyList() : m.values();
        }
    }
    private static final class Vertex {
        final int id;
        final int count;
        Vertex(int id, int count) {
            this.id = id;
            this.count = count;
        }
    }
    static void solve(MyScanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        AdjacencyMatrix g = new AdjacencyMatrix(n, true);
        for (int i = 0; i < m; i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            g.setWeight(u - 1, v - 1, 1);
        }
        int s = in.nextInt() - 1;
        int t = in.nextInt() - 1;

        boolean[][] visited = new boolean[n][3];
        Queue<Vertex> queue = new ArrayDeque<>();
        queue.offer(new Vertex(s, 0));
        visited[s][0] = true;
        while (!queue.isEmpty()) {
            Vertex v = queue.poll();
            for (Edge edge : g.edges(v.id)) {
                int nextCount = v.count + 1;
                if (edge.dest == t && nextCount % 3 == 0) {
                    out.println(nextCount / 3);
                    return;
                }
                if (visited[edge.dest][nextCount % 3])
                    continue;
                visited[edge.dest][nextCount % 3] = true;
                queue.offer(new Vertex(edge.dest, nextCount));
            }
        }
        out.println(-1);
    }

    public static void main(String[] args) {
        PrintWriter w = new PrintWriter(System.out);
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
            if (readLength == -1)
                return -1;
            point = 1;
            return buffer[0];
        }
        private static boolean isPrintableCharExceptSpace(int c) {
            return 33 <= c && c <= 126;
        }
        String next() {
            int c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c)))
                c = readByte();
            if (c == -1)
                throw new NoSuchElementException();
            StringBuilder b = new StringBuilder();
            do {
                b.appendCodePoint(c);
                c = readByte();
            } while (c != -1 && isPrintableCharExceptSpace(c));
            return b.toString();
        }
        long nextLong() {
            int c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c)))
                c = readByte();
            if (c == -1)
                throw new NoSuchElementException();
            boolean minus = false;
            if (c == '-') {
                minus = true;
                c = readByte();
            }
            long result = 0L;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                result = result * 10L + (c - '0');
                c = readByte();
            } while (c != -1 && isPrintableCharExceptSpace(c));
            return minus ? -result : result;
        }
        int nextInt() {
            long n = nextLong();
            if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE)
                throw new InputMismatchException();
            return (int)n;
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        int[] nextIntArray(int n) {
            int[] result = new int[n];
            for (int i = 0; i < n; i++)
                result[i] = nextInt();
            return result;
        }
        private static boolean allSameLength(int[] a, int[] b, int[]... c) {
            if (a.length != b.length)
                return false;
            for (int[] element : c)
                if (a.length != element.length)
                    return false;
            return true;
        }
        private static boolean allSameLength(char[] a, char[] b, char[]... c) {
            if (a.length != b.length)
                return false;
            for (char[] element : c)
                if (a.length != element.length)
                    return false;
            return true;
        }
        void nextVerticalIntArrays(int[] a, int[] b, int[]... c) {
            if (!allSameLength(a, b, c))
                throw new IllegalArgumentException();
            for (int i = 0; i < a.length; i++) {
                a[i] = nextInt();
                b[i] = nextInt();
                for (int[] d : c)
                    d[i] = nextInt();
            }
        }
        long[] nextLongArray(int n) {
            long[] result = new long[n];
            for (int i = 0; i < n; i++)
                result[i] = nextLong();
            return result;
        }
        char nextChar() {
            int c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c)))
                c = readByte();
            if (c == -1)
                throw new NoSuchElementException();
            return (char)c;
        }
        char[] nextCharArray(int n) {
            char[] result = new char[n];
            for (int i = 0; i < n; i++)
                result[i] = nextChar();
            return result;
        }
        char[][] next2dCharArray(int n, int m) {
            char[][] result = new char[n][m];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < m; j++)
                    result[i][j] = nextChar();
            return result;
        }
        void nextVerticalCharArrays(char[] a, char[] b, char[]... c) {
            if (!allSameLength(a, b, c))
                throw new IllegalArgumentException();
            for (int i = 0; i < a.length; i++) {
                a[i] = nextChar();
                b[i] = nextChar();
                for (char[] d : c)
                    d[i] = nextChar();
            }
        }
    }
}
