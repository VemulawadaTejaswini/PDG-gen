import java.util.*;
import java.io.*;

public class Main {
    static class MyObj {
        int x, y, z;
        MyObj(int x, int y, int z) {
            this.x = x; this.y = y; this.z = z;
        } 
    }
    static int n, m;
    static List<Integer>[] graph;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        PrintWriter w = new PrintWriter(System.out);
        InputReader in = new InputReader(System.in);
        n  = in.nextInt();
        m = in.nextInt();
        List<MyObj> list = new ArrayList<>();
        graph = new ArrayList[n];
        Arrays.setAll(graph, i -> new ArrayList<>());
        // List<Integer>[] distance = new ArrayList[n];
        // Arrays.setAll(distance, i -> new ArrayList<>());
        visited = new boolean[n];
        for (int i=0; i<m; i++) {
            int u = in.nextInt()-1;
            int v = in.nextInt()-1;
            int z = in.nextInt();
            graph[u].add(v);
            graph[v].add(u);
            // distance[u].add(z);
            // distance[v].add(z);
            // list.add(new MyObj(x, y, z));
        }
        int ans = 0;
        for (int i=0; i<n; i++) {
            if (!visited[i]) {
                //w.println("i="+(i+1));
                bfs(i);
                ans += 1;
            }
        }
        w.println(ans);
        w.close();
    }
    private static void bfs(int u) {
        visited[u] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(u);
        while (!queue.isEmpty()) {
            int uu = queue.poll();
            for (int v : graph[uu]) {
                if (!visited[v]) {
                    visited[v] =true;
                    queue.add(v);
                }
            }
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

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
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

        public long nextLong() {
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
	
        public String nextString() {
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

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

}