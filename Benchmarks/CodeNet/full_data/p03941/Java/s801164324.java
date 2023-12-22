// package agc.agc007;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    static final int SIZE = 131072;

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        N = n;
        parent = new int[n];
        parent[0] = -1;

        children = new int[n][2];
        weight = new int[n][2];
        cn = new int[n];
        ptr = new int[n];
        for (int i = 0; i < n-1; i++) {
            int idx = i+1;
            int p = in.nextInt()-1;
            int w = in.nextInt();
            parent[idx] = p;
            children[p][cn[p]] = idx;
            weight[p][cn[p]] = w;
            cn[p]++;
        }

        long min = -1;
        long max = 131072L * 131072 + 100;
        while (max - min > 1) {
            long med = (max + min) / 2;
            if (isPossible(med)) {
                max = med;
            } else {
                min = med;
            }
        }
        out.println(max);
        out.flush();
    }

    private static List<long[]> dfs(long K, int vi) {
        List<long[]> ret = new ArrayList<>();
        if (cn[vi] == 0) {
            ret.add(new long[]{0, 0});
            return ret;
        }

        List<long[]>[] childPair = new List[]{ dfs(K, children[vi][0]), dfs(K, children[vi][1]) };
        long limit = K - weight[vi][0] - weight[vi][1];
        if (limit < 0) {
            return new ArrayList<>();
        }

        for (int par = 0 ; par <= 1 ; par++) {
            List<long[]> L = childPair[par];
            List<long[]> R = childPair[par^1];
            int ln = L.size();
            int rn = R.size();
            int ridx = 0;

            List<long[]> pair = new ArrayList<>();
            for (int i = 0; i < ln; i++) {
                long left = limit - L.get(i)[1];
                while (ridx < rn && R.get(ridx)[0] > left) {
                    ridx++;
                }
                if (ridx == rn) {
                    break;
                }
                pair.add(new long[]{L.get(i)[0] + weight[vi][par], R.get(ridx)[1] + weight[vi][par^1]});
            }
            ret.addAll(pair);
        }
        Collections.sort(ret, (u, v) -> u[1] != v[1] ? Long.compare(u[1], v[1]) : Long.compare(u[0], v[0]));

        List<long[]> ar = new ArrayList<>();

        long lastY = Long.MAX_VALUE;
        for (int i = 0 ; i < ret.size() ; ) {
            int j = i;
            while (j < ret.size() && ret.get(i)[1] == ret.get(j)[1]) {
                j++;
            }
            if (lastY > ret.get(i)[0]) {
                lastY = ret.get(i)[0];
                ar.add(ret.get(i));
            }
            i = j;
        }
        return ar;

    }

    private static boolean isPossible(long K) {
        return dfs(K, 0).size() >= 1;
    }

    static int[] ptr;

    static int N;
    static int[] cn;
    static int[] parent;
    static int[][] children;
    static int[][] weight;

    public static void debug(Object... o) {
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