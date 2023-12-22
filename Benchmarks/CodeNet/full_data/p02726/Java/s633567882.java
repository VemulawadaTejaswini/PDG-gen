import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;
    static final int ALF = 26;

    Main() {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        long ans = 0;
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int[] ks = new int[N];
        Graph g = new Graph(N, false);
        for (int i = 2; i <= N; i++) {
            g.doubleConnect(i - 1, i);
        }
        g.doubleConnect(X, Y);

        for (int i = 1; i <= N; i++) {
            HashMap<Vertex, Integer> map = g.dijkstraMap(g.vertexAt(i));
            for (int val : map.values()) {
                ks[val]++;
            }
        }
        for (int i = 1; i < N; i++) {
            pw.println(ks[i] / 2);
        }
        pw.flush();
    }

    public static void main(String[] args) {
        new Main();
    }
}

class Graph {
    int size;
    boolean zero;
    HashMap<Integer, Vertex> vertexMap;
    ArrayList<Edge> edges;

    Graph(int size, boolean zero) {
        this.size = size;
        this.zero = zero;
        vertexMap = new HashMap<Integer, Vertex>(size);
        edges = new ArrayList<Edge>(size * 3);
        if (zero)
            for (int id = 0; id < size; id++) {
                vertexMap.put(id, new Vertex(id));
            }
        else
            for (int id = 1; id <= size; id++) {
                vertexMap.put(id, new Vertex(id));
            }
    }

    void singleConnect(int f, int d) {
        Vertex from = vertexAt(f);
        Vertex dest = vertexAt(d);
        Edge edge = new Edge(from, dest);
        from.addEdge(edge);
        edges.add(edge);
    }

    void singleConnect(int f, int d, int len) {
        Vertex from = vertexAt(f);
        Vertex dest = vertexAt(d);
        Edge edge = new Edge(from, dest, len);
        from.addEdge(edge);
        edges.add(edge);
    }

    void doubleConnect(int f, int d) {
        Vertex from = vertexAt(f);
        Vertex dest = vertexAt(d);
        Edge edge = new Edge(from, dest);
        from.addEdge(edge);
        dest.addEdge(edge.reversed());
        edges.add(edge);
        // edges.add(edge.reversed());
        // union(from, dest);
    }

    void doubleConnect(int f, int d, int len) {
        Vertex from = vertexAt(f);
        Vertex dest = vertexAt(d);
        Edge edge = new Edge(from, dest, len);
        from.addEdge(edge);
        dest.addEdge(edge.reversed());
        edges.add(edge);
        // edges.add(edge.reversed());
        // union(from, dest);
    }

    Vertex vertexAt(int v) {
        return vertexMap.get(v);
    }

    HashMap<Vertex, HashMap<Vertex, Integer>> dijkstraMap = new HashMap<Vertex, HashMap<Vertex, Integer>>();
    HashMap<Vertex, HashMap<Vertex, Edge>> dijkstraPvevMap = new HashMap<Vertex, HashMap<Vertex, Edge>>();

    HashMap<Vertex, Integer> dijkstraMap(Vertex rootVertex) {
        HashMap<Vertex, Integer> reached = new HashMap<Vertex, Integer>();
        HashMap<Vertex, Edge> prev = new HashMap<Vertex, Edge>();
        PriorityQueue<Edge> queue = new PriorityQueue<Edge>((e1, e2) -> {
            return (reached.get(e1.getFromVertex()) + e1.getLength())
                    - (reached.get(e2.getFromVertex()) + e2.getLength());
        });

        reached.put(rootVertex, 0);
        queue.addAll(rootVertex.edgeMap.values());

        while (!queue.isEmpty() && reached.size() < vertexMap.size()) {
            Edge peekEdge = queue.poll();
            Vertex from = peekEdge.getFromVertex();
            Vertex dest = peekEdge.getDestVertex();
            if (reached.containsKey(dest))
                continue;
            reached.put(dest, reached.get(from) + peekEdge.getLength());
            prev.put(dest, peekEdge);
            queue.addAll(dest.edgeMap.values());
        }
        dijkstraMap.put(rootVertex, reached);
        dijkstraPvevMap.put(rootVertex, prev);
        return reached;
    }

    ArrayList<Edge> shortestPath(Vertex from, Vertex dest) {
        ArrayList<Edge> path = new ArrayList<Edge>();
        HashMap<Vertex, Edge> prev = dijkstraPvevMap.get(from);
        Edge edge;
        Vertex tmpDest = dest;
        while ((edge = prev.get(tmpDest)) != null) {
            path.add(edge);
            tmpDest = edge.getFromVertex();
        }
        Collections.reverse(path);
        return path;
    }

    HashSet<Edge> kruskalSet() {
        HashSet<Edge> set = new HashSet<Edge>();
        Collections.sort(edges, Comparator.comparing(Edge::getLength));
        UnionFindTree uf = new UnionFindTree(size);
        for (Edge edge : edges) {
            Vertex va = edge.getFromVertex();
            Vertex vb = edge.getDestVertex();
            if (!uf.same(va.id, vb.id)) {
                uf.union(va.id, vb.id);
                set.add(edge);
            }
        }
        return set;
    }
}

class UnionFindTree {
    int[] parent;
    int[] rank;

    public UnionFindTree(int size) {
        this.parent = new int[size + 1];
        this.rank = new int[size + 1];
        for (int i = 0; i <= size; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    public void union(int x, int y) {
        int xRoot = find(x);
        int yRoot = find(y);

        if (rank[xRoot] > rank[yRoot]) {
            parent[yRoot] = xRoot;
        } else if (rank[xRoot] < rank[yRoot]) {
            parent[xRoot] = yRoot;
        } else if (xRoot != yRoot) {
            parent[yRoot] = xRoot;
            rank[xRoot]++;
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

class Vertex {
    int id;
    int score = -1;
    Vertex parentVertex = null;
    int rootDistance = -1;
    Vertex ufRoot;
    int ufRank = 0;
    HashMap<Vertex, Edge> edgeMap = new HashMap<Vertex, Edge>();

    Vertex(int id) {
        this.id = id;
        ufRoot = this;
    }

    public void addEdge(Edge edge) {
        edgeMap.put(edge.getDestVertex(), edge);
    }

    public boolean isLeaf() {
        return edgeMap.size() <= 1;
    }

    public void treeExpand(Vertex pVertex, int dist) {
        if (rootDistance != -1)// distance < dist
            return;
        parentVertex = pVertex;
        for (Edge edge : edgeMap.values()) {
            if (edge.getDestVertex().equals(parentVertex))
                continue;
            edge.getDestVertex().treeExpand(this, rootDistance + edge.getLength());
        }
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

class Edge {
    private Vertex fromVertex;
    private Vertex destVertex;
    private int length = 1;

    Edge(Vertex fVertex, Vertex dVertex) {
        fromVertex = fVertex;
        destVertex = dVertex;
    }

    Edge(Vertex fVertex, Vertex dVertex, int len) {
        fromVertex = fVertex;
        destVertex = dVertex;
        length = len;
    }

    public Vertex getFromVertex() {
        return fromVertex;
    }

    public Vertex getDestVertex() {
        return destVertex;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Edge reversed() {
        return new Edge(getDestVertex(), getFromVertex(), getLength());
    }

    public Edge normalized() {
        if (getDestVertex().id < getFromVertex().id) {
            return new Edge(getDestVertex(), getFromVertex(), getLength());
        } else {
            return new Edge(getFromVertex(), getDestVertex(), getLength());
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Edge) {
            Edge edge = (Edge) obj;
            return edge.destVertex == destVertex && edge.fromVertex == fromVertex && edge.length == length;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return fromVertex.id + "~" + destVertex.id + " len:" + length;
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }
}