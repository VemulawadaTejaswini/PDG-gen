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
        DConnectivity solver = new DConnectivity();
        solver.solve(1, in, out);
        out.close();
    }

    static class DConnectivity {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int N = in.nextInt();
            int K = in.nextInt();
            int L = in.nextInt();
            UnionFindTree ufk = new UnionFindTree(N + 1);
            UnionFindTree ufl = new UnionFindTree(N + 1);
            for (int i = 0; i < K; i++) {
                ufk.union(in.nextInt(), in.nextInt());
            }
            for (int i = 0; i < L; i++) {
                ufl.union(in.nextInt(), in.nextInt());
            }
            for (int i = 1; i < N + 1; i++) {
                int ans = 1;
                for (int j = 1; j < N + 1; j++) {
                    if (i == j) continue;
                    if (ufk.same(i, j) && ufl.same(i, j)) ans++;
                }
                out.println(ans);
            }
        }

        class UnionFindTree {
            int[] parent;
            int[] rank;

            public UnionFindTree(int size) {
                this.parent = new int[size];
                this.rank = new int[size];

                for (int i = 0; i < size; i++) {
                    makeSet(i);
                }
            }

            public void makeSet(int i) {
                parent[i] = i;
                rank[i] = 0; //集合の高さ
            }

            public void union(int x, int y) {
                int xRoot = find(x);
                int yRoot = find(y);

                //xが属する木の方が大きい場合
                if (rank[xRoot] > rank[yRoot]) {
                    parent[yRoot] = xRoot; //yの親をxに更新

                } else if (rank[xRoot] < rank[yRoot]) {
                    parent[xRoot] = yRoot;

                } else if (xRoot != yRoot) {
                    parent[yRoot] = xRoot;
                    rank[xRoot]++; //同じ高さの木がルートの子として着くから大きさ++;
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

