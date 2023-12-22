import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import static java.util.Arrays.fill;

public class Main {
    public static void main(String[] args) {
        FastScanner fsc = new FastScanner();
        int n = fsc.nextInt();
        int m = fsc.nextInt();
        Digraph g = new Digraph(n, m);
        for (int i = 0; i < m; i++) {
            int a = fsc.nextInt() - 1;
            int b = fsc.nextInt() - 1;
            g.addEdge(a, b, -1);
        }
        ArrayList<Integer> roots = g.getRoots();
        for (int root : roots) {
            long[] dst = ShortestPath.bellmanFord(g, root);
            HashSet<Integer> cycle = new HashSet<>();
            for (int i = 0; i < n; i++) {
                if (dst[i] == -Const.LINF) {
                    cycle.add(i);
                    System.out.println(i);
                }
            }
            if (cycle.isEmpty()) {
                continue;
            }
            int min = n + 1;
            int st = -1;
            for (int s : cycle) {
                ArrayDeque<Integer> dq = new ArrayDeque<>();
                int[] d = new int[n];
                int[] p = new int[n];
                fill(d, -1);
                dq.add(s);
                d[s] = 0;
                bfs: while (dq.size() > 0) {
                    int now = dq.pollFirst();
                    for (Edge e : g.adj[now]) {
                        int next = e.to;
                        if (next == s) {
                            p[next] = now;
                            d[next] = d[now] + 1;
                            break bfs;
                        }
                        if (d[next] < 0) {
                            p[next] = now;
                            d[next] = d[now] + 1;
                            dq.add(next);
                        }
                    }
                }
                if (d[s] > 0 && d[s] < min) {
                    st = s;
                    min = d[s];
                }
            }
            ArrayDeque<Integer> dq = new ArrayDeque<>();
            int[] d = new int[n];
            int[] p = new int[n];
            fill(d, -1);
            dq.add(st);
            d[st] = 0;
            bfs: while (dq.size() > 0) {
                int now = dq.pollFirst();
                for (Edge e : g.adj[now]) {
                    int next = e.to;
                    if (next == st) {
                        p[next] = now;
                        d[next] = d[now] + 1;
                        break bfs;
                    }
                    if (d[next] < 0) {
                        p[next] = now;
                        d[next] = d[now] + 1;
                        dq.add(next);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int v = st;;) {
                sb.append(v + 1).append('\n');
                v = p[v];
                if (v == st) {
                    break;
                }
            }
            System.out.println(min);
            System.out.print(sb);
            return;
        }
        System.out.println(-1);
    }
}



class Graph extends AbstractGraph {
    public Graph(int n, int m) {
        super(n, m);
    }

    @Override
    public void addEdge(int from, int to, long cost) {
        super.addEdge(from, to, cost);
        super.addEdge(to, from, cost);
        this.edges[this.edgeCounter++] = new Edge(from, to, cost);
    }

    @Override
    public void addEdge(int from, int to) {
        addEdge(from, to, 1);
    }

    @Override
    protected void addEdge(Edge e) {
        super.addEdge(e);
        super.addEdge(e.reverse());
        this.edges[this.edgeCounter++] = e;
    }

    @Override
    public ArrayList<ArrayList<Integer>> getComponents() {
        if (Objects.nonNull(this.components)) {
            return this.components;
        }
        this.components = new ArrayList<>();
        this.roots = new ArrayList<>();
        HashSet<Integer> toVisit = new HashSet<>();
        for (int i = 0; i < getV(); i++) {
            toVisit.add(i);
        }
        while (toVisit.size() > 0) {
            ArrayList<Integer> component = new ArrayList<>();
            ArrayDeque<Integer> dq = new ArrayDeque<>();
            int root = toVisit.iterator().next();
            this.roots.add(root);
            component.add(root);
            dq.add(root);
            toVisit.remove(root);
            while (dq.size() > 0) {
                int now = dq.pollFirst();
                for (Edge e : this.adj[now]) {
                    int next = e.to;
                    if (toVisit.contains(next)) {
                        component.add(next);
                        dq.add(next);
                        toVisit.remove(next);
                    }
                }
            }
            this.components.add(component);
        }
        return this.components;
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
            for (Edge e : this.adj[now]) {
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



class ShortestPath {
    public static long[] bellmanFord(AbstractGraph g, int s) {
        int n = g.getV();
        boolean negativeLoop[] = new boolean[n];
        long[] d = new long[n];
        fill(d, Const.LINF);
        d[s] = 0;
        for (int i = 0; i < n; i++) {
            for (Edge edge : g.edges) {
                int from = edge.from;
                int to = edge.to;
                long c = edge.cost;
                if (d[to] > d[from] + c) {
                    d[to] = d[from] + c;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (Edge edge : g.edges) {
                int from = edge.from;
                int to = edge.to;
                long c = edge.cost;
                if (d[to] > d[from] + c) {
                    negativeLoop[to] = true;
                    d[to] = -Const.LINF;
                }
                if (negativeLoop[from]) {
                    negativeLoop[to] = true;
                    d[to] = -Const.LINF;
                }
            }
        }
        return d;
    }

    public static PrevAndDist dijkstra(AbstractGraph g, int s) {
        Node[] nodes = g.nodes;
        int n = nodes.length;
        int[] prev = new int[n];
        long[] d = new long[n];
        Queue<Integer> pq = new PriorityQueue<>((u, v) -> Long.compare(d[u], d[v]));
        fill(d, Const.LINF);
        d[s] = 0;
        pq.add(s);
        while (pq.size() > 0) {
            int now = pq.poll();
            for (Edge e : g.adj[now]) {
                int next = e.to;
                long c = e.cost;
                if (d[now] + c < d[next]) {
                    d[next] = d[now] + c;
                    prev[next] = now;
                    pq.add(next);
                }
            }
        }
        return new PrevAndDist(prev, d);
    }

    public static int[] path(PrevAndDist pd, int from, int to) {
        ArrayList<Integer> rev = new ArrayList<>();
        for (int now = to; now != from; now = pd.prev[now])
            rev.add(now);
        rev.add(from);
        int[] path = new int[rev.size()];
        for (int i = 0; i < path.length; i++)
            path[i] = rev.get(path.length - i - 1);
        return path;
    }

    public static class PrevAndDist {
        public int[] prev;
        public long[] d;

        public PrevAndDist(int[] prev, long[] d) {
            this.prev = prev;
            this.d = d;
        }
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


class Digraph extends AbstractGraph {
    private Graph g;

    public Digraph(int n, int m) {
        super(n, m);
    }

    @Override
    public void addEdge(int from, int to, long cost) {
        super.addEdge(from, to, cost);
        this.edges[edgeCounter++] = new Edge(from, to, cost);
    }

    @Override
    public void addEdge(int from, int to) {
        this.addEdge(from, to, 1);
    }

    @Override
    protected void addEdge(Edge e) {
        super.addEdge(e);
        this.edges[edgeCounter++] = e;
    }

    @Override
    public ArrayList<ArrayList<Integer>> getComponents() {
        if (Objects.nonNull(this.components)) {
            return this.components;
        }
        generateNonDirectGraphIfAbsent();
        this.components = this.g.getComponents();
        this.roots = this.g.getRoots();
        return this.components;
    }

    @Override
    public boolean isBipartite() {
        generateNonDirectGraphIfAbsent();
        return this.g.isBipartite();
    }

    private boolean generateNonDirectGraphIfAbsent() {
        if (Objects.isNull(this.g)) {
            this.g = new Graph(getV(), getE());
            for (Edge e : this.edges) {
                this.g.addEdge(e);
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean isDAG() {
        return isConnected() && Objects.nonNull(TopologicalSort.topologicalSort(this));
    }
}


abstract class AbstractGraph {
    public Node[] nodes;
    public Edge[] edges;
    public ArrayList<Edge>[] adj;
    
    private int n;
    private int m;
    protected ArrayList<ArrayList<Integer>> components;
    protected ArrayList<Integer> roots;
    protected int edgeCounter = 0;
    
    @SuppressWarnings("unchecked")
    protected AbstractGraph(int n, int m) {
        this.n = n;
        this.m = m;
        this.nodes = new Node[n];
        this.adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            this.nodes[i] = new Node(i);
            this.adj[i] = new ArrayList<Edge>();
        }
        this.edges = new Edge[m];
    }

    protected void addEdge(int from, int to, long cost) {
        Edge e = new Edge(from, to, cost);
        this.adj[from].add(e);
        this.nodes[to].in++;
    }

    protected void addEdge(int from, int to) {
        this.addEdge(from, to, 1l);
    }

    protected void addEdge(Edge e) {
        this.adj[e.from].add(e);
        this.nodes[e.to].in++;
    }

    public void setNodeWeight(long[] w) {
        for (int i = 0; i < n; i++) {
            this.nodes[i].w = w[i];
        }
    }

    public Node[] getNodes() {
        return this.nodes;
    }

    public Edge[] getEdges() {
        return this.edges;
    }

    public int getV() {
        return this.n;
    }

    public int getE() {
        return this.m;
    }

    public ArrayList<Integer> getRoots() {
        if (Objects.isNull(this.roots)) {
            this.getComponents();
        }
        return this.roots;
    }

    public boolean isConnected() {
        return getComponents().size() == 1;
    }

    public boolean isTree() {
        return m == n - 1 && isConnected();
    }

    public boolean hasCycle() {
        return Objects.nonNull(getCycle());
    }

    public int[] getCycle() {
        ArrayList<Integer> revCycle = null;
        boolean[] visiting = new boolean[n];
        boolean[] past = new boolean[n];
        for (int root : getRoots()) {
            ArrayDeque<Integer> history = new ArrayDeque<>();
            int v = cycleDFS(visiting, past, history, root, -1);
            if (v < 0) {
                continue;
            }
            revCycle = new ArrayList<>();
            while (history.size() > 0) {
                int e = history.pollLast();
                revCycle.add(e);
                if (v == e) {
                    break;
                }
            }
            break;
        }
        if (Objects.isNull(revCycle)) {
            return null;
        }
        int size = revCycle.size();
        int[] cycle = new int[size];
        int indx = size;
        for (int e : revCycle) {
            cycle[--indx] = e;
        }
        return cycle;
    }

    private int cycleDFS(boolean[] visiting, boolean[] past, ArrayDeque<Integer> history, int now, int parent) {
        visiting[now] = true;
        history.addLast(now);
        for (Edge e : this.adj[now]) {
            int next = e.to;
            if (next == parent || past[next]) {
                continue;
            }
            if (visiting[next]) {
                return next;
            }
            int v = cycleDFS(visiting, past, history, next, now);
            if (v >= 0) {
                return v;
            }
        }
        history.pollLast();
        past[now] = true;
        return -1;
    }

    abstract public ArrayList<ArrayList<Integer>> getComponents();

    abstract public boolean isBipartite();
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

class TopologicalSort {
    public static int[] topologicalSort(Digraph g) {
        Node[] nodes = g.nodes;
        int n = g.getV();
        int[] ret = new int[n];
        IntQueue zeros = new IntQueue(n);
        for (Node node : nodes) {
            if (node.in == 0) {
                zeros.addLast(node.id);
            }
        }
        int index = 0;
        while (zeros.size() > 0) {
            int v = zeros.pollFirst();
            for (Edge e : g.adj[v]) {
                if (--nodes[e.to].in == 0) {
                    zeros.addLast(e.to);
                }
            }
            ret[index++] = v;
        }
        if (index < n) {
            return null;
        }
        return ret;
    }

    // for example (n=9)
    // [1, 8] -> [2, 5, 6] -> [3, 7] -> [4] -> [9]
    // => length:5
    public static int shortest(Digraph g) {
        Node[] nodes = g.nodes;
        int n = g.getV();
        int ret = 0;
        IntQueue zeros = new IntQueue(n);
        for (Node node : nodes) {
            if (node.in == 0) {
                zeros.addLast(node.id);
            }
        }
        int num = zeros.size();
        while (zeros.size() > 0) {
            int size = zeros.size();
            while (size > 0) {
                int v = zeros.pollFirst();
                size--;
                for (Edge e : g.adj[v]) {
                    if (--nodes[e.to].in == 0) {
                        zeros.addLast(e.to);
                        num++;
                    }
                }
            }
            ret++;
        }
        if (num < n) {
            return -1;
        }
        return ret;
    }
}

class Const {
    public static final long MOD7 = 1_000_000_007;
    public static final long MOD9 = 1_000_000_009;
    public static long MOD = MOD7;

    public static final long LINF = 1_000_000_000_000_000_000l;
    public static final int IINF = 1_000_000_000;

    public static void setMod(long mod) {
        MOD = mod;
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
        return new Edge(from, to, cost, cap, rev);
    }
}

class IntQueue {
    private int[] a;
    private int head = 0, tail = 0;

    public IntQueue(int max) {
        a = new int[max+2];
    }
    public void addLast(int x) {
        a[tail++] = x;
    }
    public int pollFirst() {
        if(tail == head) {
            try { throw new Exception("no elements."); } 
            catch (Exception e) { e.printStackTrace(); }
        }
        return a[head++];
    }
    public int pollLast() {
        if(tail == head) {
            try { throw new Exception("no elements."); } 
            catch (Exception e) { e.printStackTrace(); }
        }
        return a[--tail];
    }
    public int getFirst() {
        return a[head];
    }
    public int getLast() {
        return a[tail - 1];
    }
    public int size() {
        return tail - head;
    }
    public void init() {
        head = tail = 0;
    }
}
