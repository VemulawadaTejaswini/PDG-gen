// package arc.arc101;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    private static final long MOD = 1000000007;

    static long __startTime = System.currentTimeMillis();

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        prec(10000);

        n = in.nextInt();
        graph = buildGraph(in, n, n-1);
        dp = new long[2][2][n+1];
        r = new long[n+1];
        long[] res = dfs(0, -1);
        out.println(res[0]);
        out.flush();
    }

    static long pow(long a, long x) {
        long res = 1;
        while (x > 0) {
            if (x % 2 != 0) {
                res = (res * a) % MOD;
            }
            a = (a * a) % MOD;
            x /= 2;
        }
        return res;
    }

    static long inv(long a) {
        return pow(a, MOD - 2) % MOD;
    }

    static long[] _fact;
    static long[] _invfact;

    static long comb(long ln, long lr) {
        int n = (int) ln;
        int r = (int) lr;
        if (n < 0 || r < 0 || r > n) {
            return 0;
        }
        if (r > n / 2) {
            r = n - r;
        }
        return (((_fact[n] * _invfact[n - r]) % MOD) * _invfact[r]) % MOD;
    }

    static void prec(int n) {
        _fact = new long[n + 1];
        _invfact = new long[n + 1];
        _fact[0] = 1;
        _invfact[0] = 1;
        for (int i = 1; i <= n; i++) {
            _fact[i] = _fact[i - 1] * i % MOD;
            _invfact[i] = inv(_fact[i]);
        }
    }


    static int n;
    static int[][] graph;
    static long[][][] dp;
    static long[] r;

    static long[] dfs(int now, int par) {
        List<long[]> list = new ArrayList<>();
        for (int to : graph[now]) {
            if (to == par) {
                continue;
            }
            list.add(dfs(to, now));
        }
        if (list.size() == 0) {
            long[] w = new long[2];
            w[1] = 1;
            return w;
        }

        list.sort(Comparator.comparingInt(u -> u.length));

        for (int i = 0; i < 2 ; i++) {
            for (int j = 0; j < 2 ; j++) {
                Arrays.fill(dp[i][j], 0);
            }
        }
        dp[0][0][0] = 1;

        int nl = list.size();
        for (int i = 0; i < nl ; i++) {
            long[] wi = list.get(i);

            int till = 0;
            int fr = i % 2;
            int to = 1 - fr;
            for (int flg = 0; flg < 2 ; flg++) {
                Arrays.fill(dp[to][flg], 0);
            }
            for (int j = 0; j <= n ; j++) {
                if (dp[fr][0][j] >= 1 || dp[fr][1][j] >= 1) {
                    till = j;
                }
            }

            for (int flg = 0; flg < 2 ; flg++) {
                for (int nw = 0 ; nw <= till ; nw++) {
                    long base = dp[fr][flg][nw];
                    if (base == 0) {
                        continue;
                    }
                    for (int ci = 1 ; ci < wi.length ; ci++) {
                        long tw = wi[ci];
                        if (tw == 0) {
                            continue;
                        }

                        long ways = 1;
                        for (int pa = 0 ; pa/2 <= ci && pa/2 <= nw ; pa += 2) {
                            long mul = ways * _invfact[pa/2] % MOD;

                            if (flg == 0) {
                                if (pa/2+1 <= ci) {
                                    add(dp, to, 1, nw + ci - 1 - pa, base * tw % MOD * (ci - pa/2) % MOD * mul % MOD);
                                }
                            }
                            add(dp, to, flg, nw + ci - pa, base * tw % MOD * mul % MOD);

                            ways *= nw-pa/2;
                            ways %= MOD;
                            ways *= ci-pa/2;
                            ways %= MOD;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < r.length ; i++) {
            r[i] = dp[nl%2][1][i];
            if (i >= 1 && par != -1) {
                r[i] += dp[nl%2][0][i-1];
                r[i] %= MOD;
            }
        }
        int ma = 0;
        for (int i = 0; i <= n ; i++) {
            if (r[i] != 0) {
                ma = i;
            }
        }
        return Arrays.copyOf(r, ma+1);
    }

    static void add(long[][][] dp, int i, int j, int k, long v) {
        dp[i][j][k] += v;
        dp[i][j][k] -= (dp[i][j][k] >= MOD) ? MOD : 0;
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