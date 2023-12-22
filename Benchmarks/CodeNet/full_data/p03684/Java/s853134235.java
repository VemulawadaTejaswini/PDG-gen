import java.io.IOException;
import java.io.InputStream;
import java.util.*;

class UnionFind {
    int[] size;
    int[] id;

    public UnionFind(int N) {
        size = new int[N];
        id = new int[N];

        for (int i = 0; i < N; ++i) {
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
        while (root != p) {
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

class Edge implements Comparable<Edge> {
    int from, to, cost;

    public Edge(int from, int to, int cost) {
        this.from = from;
        this.to = to;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return cost - o.cost;
    }
}

class Pair implements Comparable<Pair> {
    int pos, id;

    public Pair(int pos, int id) {
        this.pos = pos;
        this.id = id;
    }

    @Override
    public int compareTo(Pair o) {
        return pos - o.pos;
    }
}

public class Main {

    static int kruskal() {
        int mstCost = 0;
        UnionFind uf = new UnionFind(N);
        PriorityQueue<Edge> pq = new PriorityQueue<>(edges);

        while (!pq.isEmpty()) {
            Edge e = pq.poll();
            if (uf.connected(e.from, e.to)) continue;
            uf.unify(e.from, e.to);
            mstCost += e.cost;

            if (uf.size[uf.find(0)] == N) break;
        }
        return mstCost;
    }

    static int N;
    static List<Edge> edges;

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        N = fs.nextInt();
        edges = new ArrayList<>();
        List<Pair> X = new ArrayList<>();
        List<Pair> Y = new ArrayList<>();
        for (int i = 0; i < N; ++i) {
            int x = fs.nextInt();
            int y = fs.nextInt();
            X.add(new Pair(x, i));
            Y.add(new Pair(y, i));
        }

        Collections.sort(X);
        for (int i = 0; i < N-1; ++i) {
            edges.add(new Edge(X.get(i).id, X.get(i+1).id,
                    Math.abs(X.get(i).pos - X.get(i+1).pos)));
            edges.add(new Edge(X.get(i+1).id, X.get(i).id,
                    Math.abs(X.get(i).pos - X.get(i+1).pos)));
        }

        Collections.sort(Y);
        for (int i = 0; i < N-1; ++i) {
            edges.add(new Edge(Y.get(i).id, Y.get(i+1).id,
                    Math.abs(Y.get(i).pos - Y.get(i+1).pos)));
            edges.add(new Edge(Y.get(i+1).id, Y.get(i).id,
                    Math.abs(Y.get(i).pos - Y.get(i+1).pos)));
        }

        System.out.println(kruskal());
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



























