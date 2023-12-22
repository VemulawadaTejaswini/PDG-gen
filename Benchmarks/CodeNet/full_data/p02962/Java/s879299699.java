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
import java.io.Writer;
import java.io.OutputStreamWriter;
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
        FStringsOfEternity solver = new FStringsOfEternity();
        solver.solve(1, in, out);
        out.close();
    }

    static class FStringsOfEternity {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            String s = in.readString();
            String t = in.readString();

            StringBuilder sb = new StringBuilder();
            while (sb.length() < s.length() + t.length()) sb.append(s);

            sb.insert(0, "$");
            sb.insert(0, t);

            int[] a = StringUtils.zAlgorithm(sb);
            UnionFind uf = new UnionFind(s.length());
            for (int i = 0; i < s.length(); i++) {
                if (a[t.length() + 1 + i] == t.length()) {
                    if (!uf.union(i, (i + t.length()) % s.length())) {
                        out.printLine(-1);
                        return;
                    }
                }
            }

            int ans = 0;
            for (int i = 0; i < s.length(); i++) {
                ans = Math.max(ans, uf.size(i) - 1);
            }
            out.printLine(ans);
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

        public String readString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                if (Character.isValidCodePoint(c)) {
                    res.appendCodePoint(c);
                }
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
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

    static class StringUtils {
        public static int[] zAlgorithm(CharSequence s) {
            int length = s.length();
            int[] z = new int[length];
            int left = 0, right = 0;
            for (int i = 1; i < length; i++) {
                if (i > right) {
                    int j;
                    //noinspection StatementWithEmptyBody
                    for (j = 0; i + j < length && s.charAt(i + j) == s.charAt(j); j++) {
                        ;
                    }
                    z[i] = j;
                    left = i;
                    right = i + j - 1;
                } else if (z[i - left] < right - i + 1) {
                    z[i] = z[i - left];
                } else {
                    int j;
                    //noinspection StatementWithEmptyBody
                    for (j = 1; right + j < length && s.charAt(right + j) == s.charAt(right - i + j); j++) {
                        ;
                    }
                    z[i] = right - i + j;
                    left = i;
                    right = right + j - 1;
                }
            }
            return z;
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

    static class UnionFind {
        protected int[] parent;

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

        public int root(int x) {
            return parent[x] < 0 ? x : (parent[x] = root(parent[x]));
        }

        public int size(int x) {
            return -parent[root(x)];
        }

        public List<List<Integer>> getGroups() {
            int n = parent.length;
            List<List<Integer>> groups = new ArrayList<>();
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

