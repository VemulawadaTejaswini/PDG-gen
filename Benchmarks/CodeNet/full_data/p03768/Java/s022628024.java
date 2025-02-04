// package atcoder.agc.agc012;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int m = in.nextInt();
        int[][] graph = buildGraph(in, n, m);


        int[][] dpTime = new int[11][n];
        for (int i = 0; i <= 10; i++) {
            Arrays.fill(dpTime[i], -1);
        }

        Queue<State> que = new PriorityQueue<>();
        int q = in.nextInt();
        int[][] queries = in.nextIntTable(q, 3);

        for (int i = 0; i < q; i++) {
            State st = new State(queries[i][0]-1, queries[i][1], i);
            // que.add(st);
            dpTime[st.depth][st.now] = Math.max(dpTime[st.depth][st.now], i);
        }

        for (int dep = 10 ; dep >= 1 ; dep--) {
            for (int v = 0 ; v < n ; v++) {
                if (dpTime[dep][v] == -1) {
                    continue;
                }
                int time = dpTime[dep][v];
                for (int to : graph[v]) {
                    if (dpTime[dep-1][to] < time) {
                        dpTime[dep-1][to] = time;
                    }
                }
            }
        }
//
//        while (que.size() >= 1) {
//            State st = que.poll();
//            if (dpTime[st.depth][st.now] > st.queryTime) {
//                continue;
//            }
//            if (st.depth >= 1) {
//                int td = st.depth-1;
//                for (int to : graph[st.now]) {
//                    if (dpTime[td][to] < st.queryTime) {
//                        dpTime[td][to] = st.queryTime;
//                        que.add(new State(to, td, st.queryTime));
//                    }
//                }
//            }
//        }

        for (int i = 0; i < n ; i++) {
            int maxQueryTime = -1;
            for (int j = 0; j <= 10; j++) {
                maxQueryTime = Math.max(maxQueryTime, dpTime[j][i]);
            }
            if (maxQueryTime != -1) {
                out.println(queries[maxQueryTime][2]);
            } else {
                out.println(0);
            }
        }
        out.flush();
    }

    static class State implements Comparable<State> {
        int now;
        int depth;
        int queryTime;

        public State(int a, int b, int c) {
            now = a;
            depth = b;
            queryTime = c;
        }

        @Override
        public int compareTo(State o) {
            return queryTime - o.queryTime;
        }
    }

    static int[][] buildGraph(InputReader in, int n, int m) {
        int[][] edges = new int[m][];
        int[][] graph = new int[n][];
        int[] deg = new int[n];
        for (int i = 0 ; i < m ; i++) {
            int a = in.nextInt()-1;
            int b = in.nextInt()-1;
            deg[a]++;
            deg[b]++;
            edges[i] = new int[]{a, b};
        }
        for (int i = 0 ; i < n ; i++) {
            graph[i] = new int[deg[i]];
        }
        for (int i = 0 ; i < m ; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            graph[a][--deg[a]] = b;
            graph[b][--deg[b]] = a;
        }
        return graph;
    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        private int[] nextInts(int n) {
            int[] ret = new int[n];
            for (int i = 0; i < n; i++) {
                ret[i] = nextInt();
            }
            return ret;
        }

        private int[][] nextIntTable(int n, int m) {
            int[][] ret = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    ret[i][j] = nextInt();
                }
            }
            return ret;
        }

        private long[] nextLongs(int n) {
            long[] ret = new long[n];
            for (int i = 0; i < n; i++) {
                ret[i] = nextLong();
            }
            return ret;
        }

        private long[][] nextLongTable(int n, int m) {
            long[][] ret = new long[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    ret[i][j] = nextLong();
                }
            }
            return ret;
        }

        private double[] nextDoubles(int n) {
            double[] ret = new double[n];
            for (int i = 0; i < n; i++) {
                ret[i] = nextDouble();
            }
            return ret;
        }

        private int next() {
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

        public char nextChar() {
            int c = next();
            while (isSpaceChar(c))
                c = next();
            if ('a' <= c && c <= 'z') {
                return (char) c;
            }
            if ('A' <= c && c <= 'Z') {
                return (char) c;
            }
            throw new InputMismatchException();
        }

        public String nextToken() {
            int c = next();
            while (isSpaceChar(c))
                c = next();
            StringBuilder res = new StringBuilder();
            do {
                res.append((char) c);
                c = next();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public int nextInt() {
            int c = next();
            while (isSpaceChar(c))
                c = next();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = next();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c-'0';
                c = next();
            } while (!isSpaceChar(c));
            return res*sgn;
        }

        public long nextLong() {
            int c = next();
            while (isSpaceChar(c))
                c = next();
            long sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = next();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c-'0';
                c = next();
            } while (!isSpaceChar(c));
            return res*sgn;
        }

        public double nextDouble() {
            return Double.valueOf(nextToken());
        }

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }

    static void debug(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }
}
