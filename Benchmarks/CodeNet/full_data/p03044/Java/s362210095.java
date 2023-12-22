import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        PrintWriter w = new PrintWriter(System.out);
        InputReader in = new InputReader(System.in);
        int n  = in.nextInt();
        List<Integer>[] graph = new ArrayList[n];
        Arrays.setAll(graph, i -> new ArrayList<>());
        List<Integer>[] distance = new ArrayList[n];
        Arrays.setAll(distance, i -> new ArrayList<>());
        int[] color = new int[n];
        Arrays.fill(color, -1);
        for (int i=0; i<n-1; i++) {
            int u = in.nextInt()-1;
            int v = in.nextInt()-1;
            int dist = in.nextInt();
            graph[u].add(v);
            graph[v].add(u);
            distance[u].add(dist);
            distance[v].add(dist);
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        color[0] = 0;
        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int x=0; x<graph[u].size(); x++) {
                int d = distance[u].get(x);
                if (color[graph[u].get(x)] == -1) {
                    //w.println(u + " " + graph[u].get(x) + " " + d);
                    if (d%2==0) color[graph[u].get(x)] = color[u];
                    else color[graph[u].get(x)] = 1 - color[u];
                    queue.add(graph[u].get(x));
                }
            }
        }
        for (int i=0; i<n; i++) {
            w.println(color[i]);
        }
        w.close();
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