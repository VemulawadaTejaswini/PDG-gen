import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Ribhav
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DEvenRelation solver = new DEvenRelation();
        solver.solve(1, in, out);
        out.close();
    }

    static class DEvenRelation {
        public void solve(int testNumber, FastReader s, PrintWriter out) {
            int n = s.nextInt();
            HashMap<Integer, ArrayList<DEvenRelation.pair>> map = new HashMap<>();
            for (int i = 0; i < n - 1; i++) {
                int from = s.nextInt();
                int to = s.nextInt();
                int wt = s.nextInt();
                ArrayList<DEvenRelation.pair> list = map.getOrDefault(from, new ArrayList<>());
                list.add(new DEvenRelation.pair(to, wt));
                map.put(from, list);
                list = map.getOrDefault(to, new ArrayList<>());
                list.add(new DEvenRelation.pair(from, wt));
                map.put(to, list);
            }

            HashSet<Integer> blacks = new HashSet<>();
            HashSet<Integer> whites = new HashSet<>();
            boolean[] visited = new boolean[n];
            whites.add(1);
            dfs(1, visited, blacks, whites, map);
            StringBuilder ans = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                if (whites.contains(i)) {
                    ans.append("0\n");
                } else {
                    ans.append("1\n");
                }
            }
            out.println(ans);
//        out.println(blacks);
        }

        private void dfs(int num, boolean[] visited, HashSet<Integer> blacks, HashSet<Integer> whites, HashMap<Integer, ArrayList<DEvenRelation.pair>> map) {
            visited[num - 1] = true;
            ArrayList<DEvenRelation.pair> list = map.get(num);
            for (DEvenRelation.pair p : list) {
                if (!visited[p.dest - 1]) {
                    if (p.weight % 2 == 0) {
                        if (blacks.contains(num)) {
                            blacks.add(p.dest);
                        } else {
                            whites.add(p.dest);
                        }
                    } else {
                        if (blacks.contains(num)) {
                            whites.add(p.dest);
                        } else {
                            blacks.add(p.dest);
                        }
                    }
                    dfs(p.dest, visited, blacks, whites, map);
                }
            }
        }

        private static class pair {
            int dest;
            int weight;

            public pair(int dest, int weight) {
                this.dest = dest;
                this.weight = weight;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (!(o instanceof DEvenRelation.pair)) return false;
                DEvenRelation.pair pair = (DEvenRelation.pair) o;
                return dest == pair.dest &&
                        weight == pair.weight;
            }

            public int hashCode() {
                return Objects.hash(dest, weight);
            }

            public String toString() {
                final StringBuilder sb = new StringBuilder("pair{");
                sb.append("dest=").append(dest);
                sb.append(", weight=").append(weight);
                sb.append('}');
                return sb.toString();
            }

        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
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

        public int nextInt() {
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
}

