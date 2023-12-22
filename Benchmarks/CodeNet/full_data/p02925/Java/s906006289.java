import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        DirectedGraph g = new DirectedGraph(n);
        for (int i = 0; i < m; i++) {
            int s = sc.nextInt() - 1;
            int t = sc.nextInt() - 1;
            g.addEdge(s, t, 1);
        }
        TopologicalSort t = new TopologicalSort(g);
        int[] res = t.sort();

        if (res[0] == res[n - 1]) {
            System.out.println(-1);
        } else {
            System.out.println(n);
        }
    }
}

class TopologicalSort {
    private DirectedGraph g;
    private int[] in;
    private int n, m;

    public TopologicalSort(DirectedGraph g) {
        this.g = g;
        this.in = g.getInDimension();
        this.n = g.getV();
        this.m = g.getE();
    }

    public int[] sort() {
        int[] ret = new int[this.n];
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < this.n; i++) {
            if (in[i] == 0) {
                q.push(i);
            }
        }
        int k = 0;
        while (q.size() > 0) {
            int v = q.pollFirst();
            ret[k] = v;
            k++;
            for (Edge e : g.getEdges(v)) {
                if (--in[e.to] == 0)
                    q.push(e.to);
            }
        }
        return ret;
    }
}

class DirectedGraph extends AbstractGraph {
    private int n;
    private int m;
    private int[] ind;
    // array of edges which is connect to the node
    ArrayList<Edge>[] edges;

    public DirectedGraph(int n) {
        super(n);
        this.ind = new int[n];
    }

    public void addEdge(int from, int to, int cost) {
        Edge e = new Edge(from, to, cost);
        super.addEdge(e);
        this.m++;
        this.ind[to]++;
    }

    @Override
    public void addEdge(Edge e) {
        this.edges[e.from].add(e);
        this.m++;
        this.ind[e.to]++;
    }

    public int getV(int v) {
        return this.n;
    }

    public int getE() {
        return this.m;
    }

    public int[] getInDimension() {
        return this.ind;
    }

    public int getInDimension(int v) {
        return this.ind[v];
    }

    public boolean isBipartite() {
        // need to rewrite to work
        return false;
    }

}

class Edge {
    public int from, to;
    public long cost;

    public Edge(int from, int to, long cost) {
        this.from = from;
        this.to = to;
        this.cost = cost;
    }

    public Edge(int from, int to) {
        this.from = from;
        this.to = to;
        this.cost = 1;
    }

    public Edge reverse() {
        return new Edge(to, from, cost);
    }
}

abstract class AbstractGraph {
    int n;
    int m = 0;
    ArrayList<Edge>[] edges;

    @SuppressWarnings("unchecked")
    protected AbstractGraph(int n) {
        this.n = n;
        this.edges = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            this.edges[i] = new ArrayList<Edge>();
        }
    }

    public void addEdge(Edge e) {
        this.m++;
        this.edges[e.from].add(e);
    }

    public int getV() {
        return this.n;
    }

    public int getE() {
        return this.m;
    }

    public ArrayList<Edge> getEdges(int v) {
        return this.edges[v];
    }

    abstract public boolean isBipartite();

    public boolean isTree() {
        // require Modifying.
        return false;
    }
}