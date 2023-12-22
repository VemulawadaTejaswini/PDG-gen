import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.AbstractCollection;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.Collections;
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
        DBuilt solver = new DBuilt();
        solver.solve(1, in, out);
        out.close();
    }

    static class DBuilt {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            List<IntIntPair> xl = new ArrayList<>();
            List<IntIntPair> yl = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int x = in.readInt();
                int y = in.readInt();
                xl.add(new IntIntPair(x, i));
                yl.add(new IntIntPair(y, i));
            }

            Collections.sort(xl);
            Collections.sort(yl);

            List<IntVPair<IntIntPair>> cand = new ArrayList<>();
            for (int i = 0; i < n - 1; i++) {
                cand.add(IntVPair.makePair(xl.get(i + 1).first - xl.get(i).first, new IntIntPair(xl.get(i).second, xl.get(i + 1).second)));
                cand.add(IntVPair.makePair(yl.get(i + 1).first - yl.get(i).first, new IntIntPair(yl.get(i).second, yl.get(i + 1).second)));
            }

            Collections.sort(cand);
            UnionFind uf = new UnionFind(n);
            long ans = 0;
            for (IntVPair<IntIntPair> p : cand) {
                if (uf.isConnected(p.second.first, p.second.second)) continue;

                ans += p.first;
                uf.union(p.second.first, p.second.second);
            }

            out.printLine(ans);
        }

    }

    static class IntCharPair implements Comparable<IntCharPair> {
        public final int first;
        public final char second;

        public IntCharPair(int first, char second) {
            this.first = first;
            this.second = second;
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            IntCharPair pair = (IntCharPair) o;

            return first == pair.first && second == pair.second;
        }

        public int hashCode() {
            int result = Integer.hashCode(first);
            result = 31 * result + Character.hashCode(second);
            return result;
        }

        public String toString() {
            return "(" + first + "," + second + ")";
        }

        public int compareTo(IntCharPair o) {
            int value = Integer.compare(first, o.first);
            if (value != 0) {
                return value;
            }
            return Character.compare(second, o.second);
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

        public void printLine(long i) {
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

    static class IntVPair<V> implements Comparable<IntVPair<V>> {
        public final int first;
        public final V second;

        public static <V> IntVPair<V> makePair(int first, V second) {
            return new IntVPair<V>(first, second);
        }

        private IntVPair(int first, V second) {
            this.first = first;
            this.second = second;
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            IntCharPair pair = (IntCharPair) o;

            return first == pair.first && second.equals(pair.second);
        }

        public int hashCode() {
            int result = Integer.hashCode(first);
            result = 31 * result + second.hashCode();
            return result;
        }

        public String toString() {
            return "(" + first + "," + second + ")";
        }

        public int compareTo(IntVPair<V> o) {
            int value = Integer.compare(first, o.first);
            if (value != 0) {
                return value;
            }
            return ((Comparable<V>) second).compareTo(o.second);
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
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            IntIntPair pair = (IntIntPair) o;

            return first == pair.first && second == pair.second;
        }

        public int hashCode() {
            int result = first;
            result = 31 * result + second;
            return result;
        }

        public String toString() {
            return "(" + first + "," + second + ")";
        }

        public int compareTo(IntIntPair o) {
            int value = Integer.compare(first, o.first);
            if (value != 0) {
                return value;
            }
            return Integer.compare(second, o.second);
        }

    }

    static class UnionFind {
        int[] parent;

        public UnionFind(int size) {
            parent = new int[size];
            Arrays.fill(parent, -1);
        }

        public boolean union(int x, int y) {
            x = root(x);
            y = root(y);
            if (x != y) {
                if (parent[y] < parent[x]) {
                    int tmp = y;
                    y = x;
                    x = tmp;
                }
                parent[x] += parent[y];
                parent[y] = x;
                return true;
            }
            return false;
        }

        public boolean isConnected(int x, int y) {
            return root(x) == root(y);
        }

        public int root(int x) {
            return parent[x] < 0 ? x : (parent[x] = root(parent[x]));
        }

        public ArrayList<ArrayList<Integer>> getGroups() {
            int n = parent.length;
            ArrayList<ArrayList<Integer>> groups = new ArrayList<>();
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int r = root(i);
                if (!map.containsKey(r)) {
                    map.put(r, groups.size());
                    groups.add(new ArrayList<>());
                }
                groups.get(map.get(r)).add(i);
            }
            return groups;
        }

        public String toString() {
            return getGroups().toString();
        }

    }
}

