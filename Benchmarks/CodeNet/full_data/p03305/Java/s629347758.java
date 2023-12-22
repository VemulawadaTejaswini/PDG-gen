// package other2018.soundhoundmaster2018;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    static long __startTime = System.currentTimeMillis();

    static final long INF = (long)1e16;

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);


        int n = in.nextInt();
        int m = in.nextInt();
        int s = in.nextInt()-1;
        int t = in.nextInt()-1;

        int[][][] g = buildWeightedGraph(in, n, m);

        long[] S = doit(g, s, 1);
        long[] T = doit(g, t, 2);


        long[] total = new long[n];
        for (int i = 0; i < n ; i++) {
            total[i] = S[i] + T[i];
        }

        long initial = (long)1e15;
        long[] ans = new long[n];

        long best = INF;
        for (int i = n-1 ; i >= 0 ; i--) {
            best = Math.min(best, total[i]);
            ans[i] = initial - best;
        }
        for (int i = 0; i < n ; i++) {
            out.println(ans[i]);
        }
        out.flush();
    }

    static long[] doit(int[][][] graph, int start, int which) {
        int n = graph.length;
        long[] dp = new long[n];
        Arrays.fill(dp, INF);
        dp[start] = 0;

        Queue<State> q = new PriorityQueue<>();
        q.add(new State(start, 0));
        while (q.size() >= 1) {
            State st = q.poll();
            if (dp[st.now] < st.used) {
                continue;
            }
            for (int[] e : graph[st.now]) {
                int t = e[0];
                long cost = st.used + e[which];
                if (dp[t] > cost) {
                    dp[t] = cost;
                    q.add(new State(t, cost));
                }
            }
        }
        return dp;
    }

    static class State implements Comparable<State> {
        int now;
        long used;

        State(int n, long u) {
            now = n;
            used = u;
        }

        @Override
        public int compareTo(State o) {
            return Long.compare(used, o.used);
        }
    }

    static int[][][] buildWeightedGraph(InputReader in, int n, int m) {
        int[][] edges = new int[m][];
        int[][][] graph = new int[n][][];
        int[] deg = new int[n];
        for (int i = 0 ; i < m ; i++) {
            int a = in.nextInt()-1;
            int b = in.nextInt()-1;
            int w1 = in.nextInt();
            int w2 = in.nextInt();
            deg[a]++;
            deg[b]++;
            edges[i] = new int[]{a, b, w1, w2};
        }
        for (int i = 0 ; i < n ; i++) {
            graph[i] = new int[deg[i]][3];
        }
        for (int i = 0 ; i < m ; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            int w1 = edges[i][2];
            int w2 = edges[i][3];
            graph[a][--deg[a]][0] = b;
            graph[b][--deg[b]][0] = a;
            graph[a][deg[a]][1] = w1;
            graph[b][deg[b]][1] = w1;
            graph[a][deg[a]][2] = w2;
            graph[b][deg[b]][2] = w2;
        }
        return graph;
    }

    private static void printTime(String label) {
        debug(label, System.currentTimeMillis() - __startTime);
    }

    private static void debug(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }

    public static class InputReader {
        private static final int BUFFER_LENGTH = 1 << 12;
        private InputStream stream;
        private byte[] buf = new byte[BUFFER_LENGTH];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        private int next() {
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
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public char nextChar() {
            return (char) skipWhileSpace();
        }

        public String nextToken() {
            int c = skipWhileSpace();
            StringBuilder res = new StringBuilder();
            do {
                res.append((char) c);
                c = next();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public int nextInt() {
            return (int) nextLong();
        }

        public long nextLong() {
            int c = skipWhileSpace();
            long sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = next();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = next();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble() {
            return Double.valueOf(nextToken());
        }

        int skipWhileSpace() {
            int c = next();
            while (isSpaceChar(c)) {
                c = next();
            }
            return c;
        }

        boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
    }
}