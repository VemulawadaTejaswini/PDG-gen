import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;
/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Alex
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }
    static class C {
        int n;
        int k;
        ArrayList<Integer>[] adj;
        int vertexdfs(int cur, int prev, int moar) {
            if (moar < 0) return 0;
            int res = 1;
            for (int nxt : adj[cur])
                if (nxt != prev) {
                    res += vertexdfs(nxt, cur, moar - 1);
                }
            return res;
        }
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            n = in.readInt(); // [2, 2000]
            k = in.readInt();
            int res = Integer.MAX_VALUE;
            ArrayList<Integer>[] adj = new ArrayList[n];
            IntIntPair[] edges = new IntIntPair[n - 1];
            for (int i = 0; i < adj.length; i++)
                adj[i] = new ArrayList<>();
            for (int i = 0; i < n - 1; i++) {
                int a = in.readInt() - 1;
                int b = in.readInt() - 1;
                adj[a].add(b);
                adj[b].add(a);
                edges[i] = new IntIntPair(a, b);
            }
            this.adj = adj;
            for (int start = 0; start < n; start++) {
                res = Math.min(res, n - vertexdfs(start, -1, k / 2));
            }
            for (int start = 0; start < n - 1; start++) {
                int tmp = n - vertexdfs(edges[start].first, edges[start].second, (k - 1) / 2) -
                        vertexdfs(edges[start].second, edges[start].first, (k - 1) / 2);
                res = Math.min(res, tmp);
            }
            out.printLine(res);
        }
    }
    static class IntIntPair implements Comparable<IntIntPair> {
        public final int first;
        public final int second;
        public IntIntPair(int first, int second) {
            this.first = first;
            this.second = second;
        }
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            IntIntPair pair = (IntIntPair) o;
            return first == pair.first && second == pair.second;
        }
        public int hashCode() {
            int result = Integer.hashCode(first);
            result = 31 * result + Integer.hashCode(second);
            return result;
        }
        public String toString() {
            return "(" + first + "," + second + ")";
        }
        @SuppressWarnings ({"unchecked"})
        public int compareTo(IntIntPair o) {
            int value = Integer.compare(first, o.first);
            if (value != 0) {
                return value;
            }
            return Integer.compare(second, o.second);
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
    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;
        public InputReader(InputStream stream) {
            this.stream = stream;
        }
        public int read() {
            if (numChars == -1)
                throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }
        public int readInt() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }
        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return isWhitespace(c);
        }
        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }
}
