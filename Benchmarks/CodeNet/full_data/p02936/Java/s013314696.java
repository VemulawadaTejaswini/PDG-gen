import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static InputReader in = new InputReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    public static class Node {
        private int counter;
        private List<Integer> children;

        public Node() {
            this.children = new ArrayList<>();
        }

        public void addChild(int child) {
            this.children.add(child);
        }
    }

    private static void solve() {
        int n = in.nextInt();
        int q = in.nextInt();

        Node[] nodes = new Node[n];
        for (int i=0; i < n; i++)
            nodes[i] = new Node();

        for (int i=0; i < n-1; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            nodes[a - 1].addChild(b - 1);
            nodes[b - 1].addChild(a - 1);
        }

        for (int i=0; i < q; i++) {
            int p = in.nextInt();
            int x = in.nextInt();
            nodes[p - 1].counter += x;
        }

        /*
        boolean[] visited = new boolean[n];
        Queue<Integer> toVisit = new ArrayDeque<>();
        visited[0] = true;
        toVisit.add(0);
        while (!toVisit.isEmpty()) {
            int i = toVisit.poll();
            Node p = nodes[i];
            List<Integer> toAdd = p.children;
            for (int a : toAdd) {
                if (!visited[a]) {
                    visited[a] = true;
                    toVisit.add(a);
                    nodes[a].counter += p.counter;
                }
            }
        }
        */

        // https://atcoder.jp/contests/abc138/submissions/7003907
        dfs(nodes, -1, 0);

        out.println(
                Arrays.stream(nodes).map(p -> String.valueOf(p.counter)).collect(Collectors.joining(" "))
        );
    }

    private static void dfs(Node[] nodes, int parent, int index) {
        if (parent >= 0) {
            nodes[index].counter += nodes[parent].counter;
        }

        for (int child : nodes[index].children) {
            if (child != parent)
                dfs(nodes, index, child);
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
