import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static final int MOD = (int) Math.pow(10, 9) + 7;
    static final boolean TEST = true;

    static void debug(Object... os) {
        if (TEST) {
            StringBuilder sb = new StringBuilder(os.length);
            for (Object o : os)
                sb.append(o);
            System.out.println(sb);
        }
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            do {
                solve(in);
            } while (TEST);
        }
    }

    private static void solve(Scanner in) {
        int N = in.nextInt();
        DGraph G = new DGraph(N);
        for (int i = 2; i <= N; i++) {
            G.addEdge(new DEdge(in.nextInt(), i, 1));
        }
        // ShortPath SP = new ShortPath(G, 1);
        // int fukasa = Integer.MIN_VALUE;
        // for (int i = 1; i <= N; i++) {
        // fukasa = fukasa > SP.distTo[i] ? fukasa : SP.distTo[i];
        // }
        int fukasa = dfs(G, 1);
        System.out.println(fukasa);
    }

    private static int dfs(DGraph G, int i) {
        if (G.dim(i) == 0) {
            return 0;
        }
        int dim = G.dim(i);
        int maxSub = 0;
        for (DEdge e : G.adj(i)) {
            int sub = dfs(G, e.to) + 1;
            maxSub = Math.max(maxSub, sub);
        }
        int ret = Math.max(dim, maxSub);
        return ret;
    }
}

// class ShortPath {
// private static final int NA = Integer.MAX_VALUE;
// final int[] distTo;
//
// ShortPath(DGraph G, int s) {
// distTo = new int[G.V() + 1];
// for (int i = 0; i < G.V() + 1; i++) {
// distTo[i] = i == s ? 0 : NA;
// }
// PriorityQueue<DEdge> pq = new PriorityQueue<>(G.V(), new Comparator<DEdge>()
// {
// @Override
// public int compare(DEdge o1, DEdge o2) {
// return o1.weight - o2.weight;
// }
// });
// pq.add(new DEdge(s, s, 0));
// while (!pq.isEmpty()) {
// DEdge poll = pq.poll();
// if (distTo[poll.to] < poll.weight) {
// continue;
// }
// for (DEdge edge : G.adj(poll.to)) {
// if (distTo[edge.to] > distTo[edge.from] + edge.weight) {
// distTo[edge.to] = distTo[edge.from] + edge.weight;
// pq.add(new DEdge(s, edge.to, distTo[edge.to]));
// }
// }
// }
// }
//
// @Override
// public String toString() {
// StringBuilder sb = new StringBuilder();
// for (int i = 0; i < distTo.length; i++) {
// sb.append("distTo[" + i + "]=").append(distTo[i]).append("\n");
// }
// return sb.toString();
// }
// }

class DGraph {

    private final List<DEdge>[] adj;

    @SuppressWarnings("unchecked")
    DGraph(int V) {
        adj = new List[V + 1];
        for (int i = 0; i < adj.length; i++) {
            adj[i] = new ArrayList<DEdge>();
        }
    }

    int V() {
        return adj.length;
    }

    void addEdge(DEdge edge) {
        adj[edge.from].add(edge);
    }

    Iterable<DEdge> adj(int v) {
        return adj[v];
    }

    int dim(int v) {
        return adj[v].size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("V=" + V()).append("\n");
        for (int i = 0; i < V(); i++) {
            sb.append(i + ":" + adj[i]).append("\n");
        }
        return sb.toString();
    }
}

class DEdge {
    final int from, to, weight;

    DEdge(int from, int to, int weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("%d->%d(%d)", from, to, weight);
    }
}