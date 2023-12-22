import java.io.IOException;
import java.io.InputStream;
import java.util.*;

class UnionFind {
    int[] size;
    int[] id;

    public UnionFind(int n) {
        size = new int[n];
        id = new int[n];
        for (int i = 0; i < n; ++i) {
            size[i] = 1;
            id[i] = i;
        }
    }

    void unify(int p, int q) {
        int root1 = find(p);
        int root2 = find(q);

        if (size[root1] > size[root2]) {
            size[root1] += size[root2];
            id[root2] = root1;
        } else {
            size[root2] += size[root1];
            id[root1] = root2;
        }
    }

    int find(int p) {
        int root = p;
        while (root != id[root]) root = id[root];
        while (p != root) {
            int next = id[p];
            id[p] = root;
            p = next;
        }
        return root;
    }

    boolean connected(int p, int q) {
        return find(p) == find(q);
    }
}

class Edge {
    int from, to;
    public Edge(int from, int to) {
        this.from = from;
        this.to = to;
    }
}

public class Main {

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int N = fs.nextInt();
        int M = fs.nextInt();
        List<Edge> edges = new ArrayList<>();
        for (int i = 0; i < M; ++i) {
            int a = fs.nextInt() - 1;
            int b = fs.nextInt() - 1;
            edges.add(new Edge(a, b));
        }

        int cnt = 0;
        for (int i = 0; i < M; ++i) {
            UnionFind uf = new UnionFind(N);
            for (int j = 0; j < M; ++j) {
                if (i == j) continue;
                uf.unify(edges.get(j).from, edges.get(j).to);
            }
            if (!uf.connected(edges.get(i).from, edges.get(i).to)) ++cnt;
        }

        System.out.println(cnt);
    }
}

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
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

    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}

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
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
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

    public double nextDouble() { return Double.parseDouble(next());}
}



























