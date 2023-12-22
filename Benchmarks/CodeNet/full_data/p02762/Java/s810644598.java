import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import static java.util.Arrays.fill;

public class Main {
    public static void main(String[] args) {
        FastScanner fsc = new FastScanner();
        int n = fsc.nextInt();
        int m = fsc.nextInt();
        int k = fsc.nextInt();
        int[] friend = new int[n];
        int[] block = new int[n];
        Graph g = new Graph(n, m);
        for (int i = 0; i < m; i++) {
            int a = fsc.nextInt() - 1;
            int b = fsc.nextInt() - 1;
            g.addEdge(a, b);
            friend[a]++;
            friend[b]++;
        }
        for (int i = 0; i < k; i++) {
            int c = fsc.nextInt() - 1;
            int d = fsc.nextInt() - 1;
            if (g.getRoot(c) == g.getRoot(d)) {
                block[c]++;
                block[d]++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(g.getComponent(i).size() - friend[i] - block[i] - 1).append(' ');
        }
        System.out.println(sb);
    }
}


class Graph extends AbstractGraph {
    public Graph(int n, int m) {
        super(n, m);
    }
    public Graph(int n) {
        super(n);
    }

    public void addEdge(int from, int to, long cost) {
        Edge e = new Edge(from, to, cost);
        super.addEdge(e);
        super.addEdge(e.reverse());
        getEdgeList().add(e);
    }

    public void addEdge(int from, int to) {
        this.addEdge(from, to, 1);
    }

    @Override
    protected void addEdge(Edge e) {
        super.addEdge(e);
        super.addEdge(e.reverse());
        getEdgeList().add(e);
    }

    @Override
    protected void generateComponentsIfAbsent() {
        if (Objects.isNull(getNullableComponents())) {
            HashMap<Integer, ArrayList<Integer>> components = new HashMap<>();
            for (int i = 0; i < getV(); i++) {
                if (!components.containsKey(getRoot(i))) {
                    ArrayList<Integer> component = new ArrayList<>();
                    component.add(i);
                    components.put(getRoot(i), component);
                } else {
                    components.get(getRoot(i)).add(i);
                }
            }
            setComponents(components);
        }
    }

    @Override
    public boolean isBipartite() {
        int[] color = new int[getV()];
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        for (int root : getRoots()) {
            dq.add(root);
            color[root] = 1;
        }
        while (dq.size() > 0) {
            int now = dq.pollFirst();
            for (Edge e : getEdges(now)) {
                int next = e.to;
                if (color[next] == 0) {
                    color[next] = -color[now];
                    dq.add(next);
                } else if (color[now] == color[next]) {
                    return false;
                }
            }
        }
        return true;
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


abstract class AbstractGraph {
    private ArrayList<Node> nodes;
    private ArrayList<Edge> edges;
    private ArrayList<ArrayList<Edge>> adj;
    private int n;
    private int m;
    private HashMap<Integer, ArrayList<Integer>> components;
    private UnionFindTree uft;
    
    protected AbstractGraph(int n, int m) {
        this.n = n;
        this.m = m;
        this.nodes = new ArrayList<>(this.n);
        this.adj = new ArrayList<>(this.n);
        for (int i = 0; i < this.n; i++) {
            this.nodes.add(new Node(i));
            this.adj.add(new ArrayList<>());
        }
        this.edges = new ArrayList<>(this.m);
        this.uft = new UnionFindTree(this.n);
    }

    protected AbstractGraph(int n) {
        this(n, 0);
    }

    protected void addEdge(Edge e) {
        this.adj.get(e.from).add(e);
        this.nodes.get(e.to).in++;
        this.uft.unite(e.from, e.to);
    }

    public void setNodeWeight(long[] w) {
        for (int i = 0; i < n; i++) {
            this.nodes.get(i).w = w[i];
        }
    }

    public int in(int i) {
        return this.nodes.get(i).in;
    }

    public int out(int i) {
        return this.adj.get(i).size();
    }

    public Node getNode(int i) {
        return this.nodes.get(i);
    }

    public ArrayList<Node> getNodes() {
        return this.nodes;
    }

    public Edge getEdge(int from, int index) {
        return this.adj.get(from).get(index);
    }

    public ArrayList<Edge> getEdges(int i) {
        return this.adj.get(i);
    }

    public ArrayList<Edge> getEdgeList() {
        return this.edges;
    }

    public int getV() {
        return this.n;
    }

    public int getE() {
        return this.m = edges.size();
    }

    public int getRoot(int i) {
        return uft.root(i);
    }

    public HashMap<Integer, ArrayList<Integer>> getComponents() {
        generateComponentsIfAbsent();
        return this.components;
    }

    protected void setComponents(HashMap<Integer, ArrayList<Integer>> components) {
        this.components = components;
    }

    protected HashMap<Integer, ArrayList<Integer>> getNullableComponents() {
        return this.components;
    }

    public ArrayList<Integer> getComponent(int i) {
        return getComponents().get(getRoot(i));
    }

    public Set<Integer> getRoots() {
        return getComponents().keySet();
    }

    public Collection<ArrayList<Integer>> getComponentSet() {
        return getComponents().values();
    }

    public boolean isConnected() {
        return getComponents().size() == 1;
    }

    public boolean isTree() {
        return getE() == getV() - 1 && isConnected();
    }

    abstract public boolean isBipartite();

    abstract protected void generateComponentsIfAbsent();
}


class Node {
    public int id;
    public long w;
    public int in;

    public Node(int id) {
        this.id = id;
    }

    public Node(int id, long w) {
        this.id = id;
        this.w = w;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof Node)) {
            return false;
        } else {
            Node n = (Node) o;
            return n.id == id && n.w == w && n.in == in;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, w, in);
    }
}


class UnionFindTree {
    private int[] parent;
    private int[] rank;
    private int[] size;
    private int groups;

    public UnionFindTree(int n) {
        this.parent = new int[n];
        this.rank = new int[n];
        this.size = new int[n];
        this.groups = n;
        fill(this.size, 1);
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public int root(int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = root(parent[x]);
    }

    public boolean isSame(int x, int y) {
        return root(x) == root(y);
    }

    public void unite(int x, int y) {
        int xr = root(x);
        int yr = root(y);
        if (xr == yr) {
            return;
        }
        if (rank[xr] < rank[yr]) {
            parent[xr] = yr;
            size[yr] += size[xr];
        } else {
            parent[yr] = xr;
            size[xr] += size[yr];
            if (rank[xr] == rank[yr]) {
                rank[xr]++;
            }
        }
        groups--;
    }

    public int size(int x) {
        return size[root(x)];
    }

    public boolean isRoot(int x) {
        return parent[x] == x;
    }

    public int groups() {
        return groups;
    }
}

class Edge {
    public int from;
    public int to;
    public long cost;
    public long cap;
    public int rev;

    private Edge(int from, int to, long cost, long cap, int rev) {
        this.from = from;
        this.to = to;
        this.cost = cost;
        this.cap = cap;
        this.rev = rev;
    }

    protected Edge(int from, int to, long cost) {
        this(from, to, cost, -1, -1);
    }

    protected Edge(int from, int to) {
        this(from, to, 1, -1, -1);
    }

    protected Edge(int from, int to, long cap, int rev) {
        this(from, to, -1, cap, rev);
    }

    protected Edge reverse() {
        return new Edge(to, from, cost, cap, rev);
    }
}
