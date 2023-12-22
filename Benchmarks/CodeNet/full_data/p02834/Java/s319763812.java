import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
    static final class Edge {
        public final int src;
        public final int dest;
        public final long weight;
        public Edge(int src, int dest, long weight) {
            if (src < 0 || dest < 0) {
                throw new IllegalArgumentException();
            }
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
        public Edge reverse() {
            return new Edge(dest, src, weight);
        }
        public static List<Edge> newEdges(int[] oneBasedSrc,
                                          int[] oneBasedDest,
                                          boolean directedGraph) {
            return newEdges(oneBasedSrc, oneBasedDest, null, directedGraph);
        }
        public static List<Edge> newEdges(int[] oneBasedSrc,
                                          int[] oneBasedDest,
                                          int[] weight,
                                          boolean directedGraph) {
            if (oneBasedSrc.length != oneBasedDest.length
                || (weight != null && oneBasedSrc.length != weight.length)) {
                throw new IllegalArgumentException();
            }
            List<Edge> result = new ArrayList<>(oneBasedSrc.length
                                                * (directedGraph ? 1 : 2));
            for (int i = 0; i < oneBasedDest.length; i++) {
                if (oneBasedSrc[i] <= 0 || oneBasedDest[i] <= 0) {
                    throw new IllegalArgumentException();
                }
                Edge e = new Edge(oneBasedSrc[i] - 1,
                                  oneBasedDest[i] - 1,
                                  weight == null ? 1 : weight[i]);
                result.add(e);
                if (!directedGraph) {
                    result.add(e.reverse());
                }
            }
            return result;
        }
        public static List<List<Edge>> newSrcToEdges(int vertexCount,
                                                     Collection<Edge> edges) {
            int[] edgeCount = new int[vertexCount];
            for (Edge e : edges) {
                edgeCount[e.src]++;
            }
            List<List<Edge>> result =
                    new ArrayList<>(Collections.nCopies(vertexCount, null));
            for (int i = 0; i < vertexCount; i++) {
                result.set(i, new ArrayList<>(edgeCount[i]));
            }
            for (Edge e : edges) {
                result.get(e.src).add(e);
            }
            return result;
        }
    }
    static void countNumOfMoves(List<List<Edge>> srcToEdges,
                                int[] numOfMoves,
                                int vertexId,
                                int count) {
        numOfMoves[vertexId] = count;
        for (Edge e : srcToEdges.get(vertexId)) {
            if (numOfMoves[e.dest] == -1) {
                countNumOfMoves(srcToEdges, numOfMoves, e.dest, count + 1);
            }
        }
    }
    static int maxNumOfMoves(List<List<Edge>> srcToEdges,
                             int[] numOfMoves,
                             int parentVertexId,
                             int vertexId,
                             int count) {
        int result = numOfMoves[vertexId];
        for (Edge e : srcToEdges.get(vertexId)) {
            if (e.dest == parentVertexId) {
                continue;
            }
            if (numOfMoves[e.dest] <= count + 1) {
                continue;
            }
            int r = maxNumOfMoves(srcToEdges,
                                  numOfMoves,
                                  vertexId,
                                  e.dest,
                                  count + 1);
            result = Math.max(result, r);
        }
        return result;
    }
    static void solve(MyScanner in, MyWriter out) {
        int n = in.nextInt();
        int u = in.nextInt();
        int v = in.nextInt();
        int[][] ab = in.nextVerticalIntArrays(2, n - 1);
        int[] a = ab[0];
        int[] b = ab[1];

        List<Edge> edges = Edge.newEdges(a, b, false);
        List<List<Edge>> srcToEdges = Edge.newSrcToEdges(n, edges);

        int[] numOfMoves = new int[n];
        Arrays.fill(numOfMoves, -1);
        countNumOfMoves(srcToEdges, numOfMoves, v - 1, 0);
        out.println(maxNumOfMoves(srcToEdges, numOfMoves, -1, u - 1, 0) - 1);
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
        private byte readByte() {
            if (point < readLength) {
                byte result = buffer[point];
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
        private static boolean isPrintableCharExceptSpace(byte c) {
            return 33 <= c && c <= 126;
        }
        public char nextChar() {
            byte c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            return (char)c;
        }
        public String next() {
            return next(16);
        }
        public String next(int n) {
            byte c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            StringBuilder b = new StringBuilder(n);
            do {
                b.append((char)c);
                c = readByte();
            } while (c != -1 && isPrintableCharExceptSpace(c));
            return b.toString();
        }
        public long nextLong() {
            byte c = readByte();
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
        public int nextInt() {
            long n = nextLong();
            if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE) {
                throw new InputMismatchException();
            }
            return (int)n;
        }
        public double nextDouble() {
            return Double.parseDouble(next());
        }
        public int[] nextIntArray(int n) {
            int[] result = new int[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextInt();
            }
            return result;
        }
        public long[] nextLongArray(int n) {
            long[] result = new long[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextLong();
            }
            return result;
        }
        public char[] nextCharArray(int n) {
            char[] result = new char[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextChar();
            }
            return result;
        }
        public char[][] next2dCharArray(int n, int m) {
            char[][] result = new char[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    result[i][j] = nextChar();
                }
            }
            return result;
        }
        public int[][] nextVerticalIntArrays(int arrayCount, int arrayLength) {
            int[][] result = new int[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextInt();
                }
            }
            return result;
        }
        public long[][] nextVerticalLongArrays(int arrayCount,
                                               int arrayLength) {
            long[][] result = new long[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextLong();
                }
            }
            return result;
        }
        public char[][] nextVerticalCharArrays(int arrayCount,
                                               int arrayLength) {
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
        public void joinAndPrintln(int[] x) {
            joinAndPrintln(x, " ");
        }
        public void joinAndPrintln(int[] x, String delimiter) {
            StringBuilder b = new StringBuilder();
            if (x.length > 0) {
                b.append(x[0]);
                for (int i = 1; i < x.length; i++) {
                    b.append(delimiter).append(x[i]);
                }
            }
            println(b.toString());
        }
        public void joinAndPrintln(long[] x) {
            joinAndPrintln(x, " ");
        }
        public void joinAndPrintln(long[] x, String delimiter) {
            StringBuilder b = new StringBuilder();
            if (x.length > 0) {
                b.append(x[0]);
                for (int i = 1; i < x.length; i++) {
                    b.append(delimiter).append(x[i]);
                }
            }
            println(b.toString());
        }
        public void joinAndPrintln(Iterable<?> iterable) {
            joinAndPrintln(iterable, " ");
        }
        public void joinAndPrintln(Iterable<?> iterable, String delimiter) {
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
