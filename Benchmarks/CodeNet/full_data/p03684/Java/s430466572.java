import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            IntPair[] a = new IntPair[n], b = new IntPair[n];
            for (int i = 0; i < n; ++i) {
                int x = in.nextInt(), y = in.nextInt();
                a[i] = new IntPair(x, i);
                b[i] = new IntPair(y, i);
            }
            Arrays.sort(a);
            Edge[] edges = new Edge[2 * (n - 1)];
            for (int i = 0; i + 1 < a.length; ++i) {
                edges[i] = new Edge(a[i].second, a[i + 1].second, a[i + 1].first - a[i].first);
            }
            Arrays.sort(b);
            for (int i = 0; i + 1 < b.length; ++i) {
                edges[(n - 1) + i] = new Edge(b[i].second, b[i + 1].second, b[i + 1].first - b[i].first);
            }
            Arrays.sort(edges, (o1, o2) -> o1.cost - o2.cost);
            long ans = 0;
            DSU f = new DSU(n);
            for (Edge e : edges) {
                if (f.find(e.x) != f.find(e.y)) {
                    ans += e.cost;
                    f.union(e.x, e.y);
                }
            }
            out.println(ans);
        }

        class Edge {
            int x;
            int y;
            int cost;

            Edge(int x, int y, int cost) {
                this.x = x;
                this.y = y;
                this.cost = cost;
            }

        }

        class DSU {
            int[] father;

            DSU(int n) {
                father = new int[n];
                for (int i = 0; i < n; ++i) {
                    father[i] = i;
                }
            }

            int find(int x) {
                int y = x, p;
                while (father[y] != y) {
                    y = father[y];
                }
                for (; x != y; x = p) {
                    p = father[x];
                    father[x] = y;
                }
                return y;
            }

            void union(int x, int y) {
                father[find(x)] = find(y);
            }

        }

    }

    static class IntPair implements Comparable<IntPair> {
        public int first;
        public int second;

        public IntPair() {
        }

        public IntPair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public int compareTo(IntPair other) {
            if (first != other.first) return first < other.first ? -1 : 1;
            if (second != other.second) return second < other.second ? -1 : 1;
            return 0;
        }

        public boolean equals(Object other) {
            if (!(other instanceof IntPair)) return false;
            return compareTo((IntPair) other) == 0;
        }

        public int hashCode() {
            return first * 31 + second;
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
}

