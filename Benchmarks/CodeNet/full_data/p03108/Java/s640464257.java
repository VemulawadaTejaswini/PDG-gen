import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.lang.Math;

public class Main {
    static class UnionFind {
        int[] parent;
        int[] size;

        public UnionFind(int N) {
            this.parent = new int[N];
            this.size   = new int[N];
            for (int i=0; i<N; i++) {
                this.parent[i] = i;
                this.size[i]   = 1;
            }
        }

        // search root and re-label parent
        public int root(int x) {
            // x is the boss
            if (x == parent[x]) return x;

            // re-label and serch parent recursively
            parent[x] = root(parent[x]);

            return parent[x];
        }

        // return success merge or not
        public boolean merge(int x, int y) {
            // no merge (already same group)
            if (isSame(x, y)) return false;

            // merge small group to large one
            if (size[x] > size[y]) {
                size[root(x)] += size[root(y)];
                parent[root(y)] = root(x);
            } else {
                size[root(y)] += size[root(x)];
                parent[root(x)] = root(y);
            }

            return true;
        }

        // return is same group or not
        public boolean isSame(int x, int y) {
            return root(x) == root(y);
        }

        // return size of group
        public int size(int x) {
            return size[root(x)];
        }

        // for debug
        public void printParent() {
            for (int i=0; i<parent.length; i++) {
                System.out.print(parent[i]+" ");
            }
            System.out.println();
        }

        // for debug
        public void printSize() {
            for (int i=0; i<size.length; i++) {
                System.out.print(size[i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        FS reader = new FS();
        // write reader
        int N = reader.nextInt();
        int M = reader.nextInt();
        int[] A = new int[M];
        int[] B = new int[M];
        for (int i=0; i<M; i++) {
            A[i] = reader.nextInt()-1;
            B[i] = reader.nextInt()-1;
        }

        UnionFind uf = new UnionFind(N);
        long[] ans = new long[M];
        ans[M-1] = N * (N-1) / 2;
        for (int i=M-1; i>0; i--) {
            // add i th bridge
            long recover = uf.size(A[i]) * uf.size(B[i]);
            if (!uf.merge(A[i], B[i])) recover = 0;
            ans[i-1] = ans[i] - recover;
        }

        for (int i=0; i<M; i++) {
            System.out.println(ans[i]);
        }
    }
    
    public static void solver() {
        // write logic
    }
    
    // Read Class
    static class FS {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
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
    
        private int readByte() { return hasNextByte() ? buffer[ptr++] : -1;}
        private boolean isPrintableChar(int c) {return 33 <= c && c <= 126;}
        private void skipUnprintable() {while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
    
        public boolean hasNext() { skipUnprintable(); return hasNextByte();}
        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while(isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }
        public int nextInt() {
            return (int)nextLong();
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
            while(true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if(b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }
    }
}

