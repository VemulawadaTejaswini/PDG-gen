// package other2017.codefestival2017.finale;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        char[] s = in.nextToken().toCharArray();
        int n = s.length;
        int[] diff = new int[n-1];
        for (int i = 0; i < s.length-1; i++) {
            diff[i] = (s[i+1] - s[i] + 26) % 26;
        }


        int L = n/2;
        List<Integer>[] vlist = new List[L];
        for (int i = 0; i < L ; i++) {
            vlist[i] = new ArrayList<>();
        }
        int[] vdiff = new int[L];
        for (int i = 0; i < L ; i++) {
            if (i != n-1-i-1) {
                vdiff[i] = diff[i] + diff[n-1-i-1];
            } else {
                vdiff[i] = diff[i];
            }
        }

        boolean[] arbminus = new boolean[L];

        UnionFind uf = new UnionFind(L);

        int on = in.nextInt();
        for (int i = 0; i < on ; i++) {
            int left = in.nextInt()-1;
            int right = in.nextInt()-1;
            if (left == 0 && right == n-1) {
                continue;
            }
            if (left >= 1 && right < n-1) {
                int a = kcode(n-1, left-1);
                int b = kcode(n-1, right);
                if (a != b) {
                    uf.unite(a, b);
                }
            } else if (right < n-1) {
                arbminus[kcode(n-1, right)] = true;
            } else if (left >= 1) {
                arbminus[kcode(n-1, left-1)] = true;
            }
        }

        List<Integer>[] groups = new List[L];
        for (int i = 0; i < L ; i++) {
            groups[i] = new ArrayList<>();
        }
        for (int i = 0; i < L ; i++) {
            groups[uf.find(i)].add(i);
        }

        boolean isOK = true;
        for (int i = 0; i < L ; i++) {
            boolean free = false;
            int sum = 0;
            for (int gi : groups[i]) {
                if (arbminus[gi]) {
                    free = true;
                }
                sum += vdiff[gi];
            }
            // debug(groups[i], sum, free);
            isOK &= free || sum % 26 == 0;
        }

        out.println(isOK ? "YES" : "NO");
        out.flush();
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


    static int kcode(int n, int xth) {
        return Math.min(xth, n-1-xth);
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