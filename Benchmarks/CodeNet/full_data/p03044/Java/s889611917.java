import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author cplayer
 */
public class Main {
    public static void main (String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DEvenRelation solver = new DEvenRelation();
        solver.solve(1, in, out);
        out.close();
    }

    static class DEvenRelation {
        private Tree tree;
        private int[] used;
        private int[] color;

        public void solve (int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            int[] from = new int[n - 1], to = new int[n - 1];
            long[] weight = new long[n - 1];
            for (int i = 0; i < n - 1; ++i) {
                from[i] = in.readInt() - 1;
                to[i] = in.readInt() - 1;
                weight[i] = in.readLong();
            }
            tree = Tree.createWeightedTree(n, from, to, weight);
            used = new int[n];
            color = new int[n];
            search(0, 0);
            out.println(color);
        }

        private void search (int idx, int curColor) {
            color[idx] = curColor;
            used[idx] = 1;
            for (int j = tree.firstOutBound(idx); j != -1; j = tree.nextOutBound(j)) {
                if (used[tree.destination(j)] == 0) {
                    search(tree.destination(j), curColor ^ (int) (tree.weight(j) % 2));
                }
            }
        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter (OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter (Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void print (int[] array) {
            for (int i = 0; i < array.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(array[i]);
            }
        }

        public void println (int[] array) {
            print(array);
            writer.println();
        }

        public void close () {
            writer.close();
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader (InputStream stream) {
            this.stream = stream;
        }

        public int read () {
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

        public int readInt () {
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

        public long readLong () {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
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

        public boolean isSpaceChar (int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace (int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar (int ch);

        }

    }

    static class Tree {
        private int vertexCount;
        private int edgeCount;
        private int[] firstOutBound;
        private int[] nextOutBound;
        private int[] from;
        private int[] to;
        private long[] weight;
        private Edge[] edges;

        public Tree (int vertexCount, int maxEdgeCount) {
            this.vertexCount = vertexCount;
            this.edgeCount = 0;
            firstOutBound = new int[vertexCount];
            from = new int[maxEdgeCount];
            to = new int[maxEdgeCount];
            nextOutBound = new int[maxEdgeCount];
            Arrays.fill(firstOutBound, -1);
        }

        public static Tree createWeightedTree (int vertexCount, int[] from, int[] to, long[] weight) {
            Tree res = new Tree(vertexCount, from.length);
            for (int i = 0; i < from.length; ++i) {
                res.addWeightedEdge(from[i], to[i], weight[i]);
            }
            return res;
        }

        public int destination (int id) {
            return to[id];
        }

        public final int firstOutBound (int vertex) {
            return firstOutBound[vertex];
        }

        public final int nextOutBound (int vertex) {
            return nextOutBound[vertex];
        }

        public long weight (int id) {
            return weight[id];
        }

        protected TreeEdge createEdge (int id) {
            return new TreeEdge(id);
        }

        protected void ensureEdgeCapacity (int edgeSize) {
            if (from.length < edgeSize) {
                int newSize = Math.max(edgeSize, 2 * from.length);
                if (edges != null) {
                    edges = resize(edges, newSize);
                }
                from = resize(from, newSize);
                to = resize(to, newSize);
                nextOutBound = resize(nextOutBound, newSize);
                if (weight != null) {
                    weight = resize(weight, newSize);
                }
            }
        }

        public int addEdge (int fromId, int toId, long weight) {
            ensureEdgeCapacity(edgeCount + 1);
            if (firstOutBound[fromId] != -1) {
                nextOutBound[edgeCount] = firstOutBound[fromId];
            } else {
                nextOutBound[edgeCount] = -1;
            }
            firstOutBound[fromId] = edgeCount;
            this.from[edgeCount] = fromId;
            this.to[edgeCount] = toId;
            if (weight != 0) {
                if (this.weight == null) {
                    this.weight = new long[from.length];
                }
                this.weight[edgeCount] = weight;
            }
            if (edges != null) {
                edges[edgeCount] = createEdge(edgeCount);
            }
            return edgeCount++;
        }

        public int addWeightedEdge (int from, int to, long weight) {
            return addEdge(from, to, weight);
        }

        private Edge[] resize (Edge[] oriEdges, int newSize) {
            Edge[] newEdges = new Edge[newSize];
            System.arraycopy(oriEdges, 0, newEdges, 0, oriEdges.length);
            return newEdges;
        }

        private long[] resize (long[] oriArr, int newSize) {
            long[] newArr = new long[newSize];
            System.arraycopy(oriArr, 0, newArr, 0, oriArr.length);
            return newArr;
        }

        private int[] resize (int[] oriArr, int newSize) {
            int[] newArr = new int[newSize];
            System.arraycopy(oriArr, 0, newArr, 0, oriArr.length);
            return newArr;
        }

        protected class TreeEdge extends Edge {
            protected int id;

            protected TreeEdge (int id) {
                this.id = id;
            }

        }

    }

    static abstract class Edge {
    }
}

