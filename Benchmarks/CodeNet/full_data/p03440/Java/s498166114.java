// package agc.apc001;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n ; i++) {
            a[i] = in.nextInt();
        }

        uf = new UnionFind(n);
        for (int i = 0; i < m ; i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            uf.unite(u, v);
        }
        long r = solve(a);
        if (r == -1) {
            out.println("Impossible");
        } else {
            out.println(r);
        }
        out.flush();
    }

    static UnionFind uf;


    static long solve(int[] a) {
        long totalCost = 0;
        int n = a.length;
        List<Integer>[] que = new ArrayList[n];

        int q1 = 0;
        int q2 = 0;
        for (int i = 0; i < n ; i++) {
            int id = uf.find(i);
            if (uf.cnt[id] == 1) {
                q1++;
                totalCost += a[i];
            } else if (uf.cnt[id] >= 2) {
                if (que[id] == null) {
                    que[id] = new ArrayList<>();
                    q2++;
                }
                que[id].add(a[i]);
            }
        }
        for (int i = 0; i < n ; i++) {
            if (que[i] != null) {
                Collections.sort(que[i]);
            }
        }

        if (q2 == 0) {
            if (n == 1) {
                return 0;
            } else if (n == 2) {
                return totalCost;
            }
            return -1;
        }
        if (q2 == 1) {
            if (n - q1 < q1) {
                return -1;
            }
            for (int i = 0; i < n ; i++) {
                if (que[i] != null) {
                    for (int j = 0; j < q1; j++) {
                        totalCost += que[i].get(j);
                    }
                    break;
                }
            }
            return totalCost;
        }

        if (n - q1 < (q2 - 1) * 2 + q1) {
            return -1;
        }


        List<Integer> left = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            if (que[i] != null) {
                totalCost += que[i].get(0);
                que[i].remove(0);
                left.addAll(que[i]);
            }
        }
        Collections.sort(left);
        for (int i = 0; i < q1 + q2 - 2 ; i++) {
            totalCost += left.get(i);
        }
        return totalCost;
    }

    static class UnionFind {
        int[] rank;
        int[] parent;
        int[] cnt;

        public UnionFind(int n) {
            rank = new int[n];
            parent = new int[n];
            cnt = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                cnt[i] = 1;
            }
        }

        public int find(int a) {
            if (parent[a] == a) {
                return a;
            }
            parent[a] = find(parent[a]);
            return parent[a];
        }

        public void unite(int a, int b) {
            a = find(a);
            b = find(b);
            if (a == b) {
                return;
            }
            if (rank[a] < rank[b]) {
                parent[a] = b;
                cnt[b] += cnt[a];
                cnt[a] = cnt[b];
            } else {
                parent[b] = a;
                cnt[a] += cnt[b];
                cnt[b] = cnt[a];
                if (rank[a] == rank[b]) {
                    rank[a]++;
                }
            }
        }

        public int groupCount(int a) {
            return cnt[find(a)];
        }

        private boolean issame(int a, int b) {
            return find(a) == find(b);
        }
    }

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