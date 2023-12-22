import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Closeable;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author HBonsai
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DDecayedBridges solver = new DDecayedBridges();
        solver.solve(1, in, out);
        out.close();
    }

    static class DDecayedBridges {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int N = in.nextInt();
            int M = in.nextInt();
            int[] A = new int[M];
            int[] B = new int[M];
            for (int i = 0; i < M; i++) {
                A[i] = in.nextInt() - 1;
                B[i] = in.nextInt() - 1;
            }
            UnionFindTree uf = new UnionFindTree(N);
            long[] inconvs = new long[M];
            long inc = (long) N * (N - 1) / 2;
            for (int i = M - 1; i >= 0; i--) {
                inconvs[i] = inc;
                if (!uf.same(A[i], B[i])) {
                    inc -= uf.size(A[i]) * uf.size(B[i]);
                    uf.unite(A[i], B[i]);
                }
            }
            for (int i = 0; i < M; i++) {
                out.println(inconvs[i]);
            }
        }

        class UnionFindTree {
            int[] parent;
            int[] rank;
            int[] size;
            int group;

            public UnionFindTree(int n) {
                this.parent = new int[n];
                this.rank = new int[n];
                this.size = new int[n];
                group = n;

                for (int i = 0; i < n; i++) {
                    makeSet(i);
                }
            }

            public void makeSet(int i) {
                parent[i] = i;
                rank[i] = 0; //集合の高さ
                size[i] = 1;
            }

            public void unite(int x, int y) {
                int xRoot = find(x);
                int yRoot = find(y);
                if (xRoot == yRoot) return;
                group--;
                //xが属する木の方が大きい場合
                if (rank[xRoot] > rank[yRoot]) {
                    parent[yRoot] = xRoot; //yの親をxに更新
                    size[xRoot] += size[yRoot];

                } else if (rank[xRoot] < rank[yRoot]) {
                    parent[xRoot] = yRoot;
                    size[yRoot] += size[xRoot];
                } else {
                    parent[yRoot] = xRoot;
                    rank[xRoot]++; //同じ高さの木がルートの子として着くから大きさ++;
                    size[xRoot] += size[yRoot];
                }
            }

            public int find(int i) {
                if (i != parent[i]) {
                    parent[i] = find(parent[i]);
                }
                return parent[i];
            }

            public boolean same(int x, int y) {
                return find(x) == find(y);
            }

            public int size(int i) {
                return size[find(i)];
            }

        }

    }

    static class FastScanner implements Closeable {
        private final InputStream in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        public FastScanner(InputStream in) {
            this.in = in;
        }

        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
            return hasNextByte();
        }

        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) {
                throw new NumberFormatException();
            }
            while (true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }

        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }

        public void close() {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

