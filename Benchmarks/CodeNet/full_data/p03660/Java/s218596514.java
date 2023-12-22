
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    int n;
    ArrayList<ArrayList<Edge>> es;
    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        es = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            es.add(new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            es.get(a).add(new Edge(a, b));
            es.get(b).add(new Edge(b, a));
        }
    }

    void solve() {
        int sScore = 0, fScore = 0;
        int[] fScores = getDists(0);
        int[] sScores = getDists(n-1);

        for (int i = 0; i < n; i++) {
            if (fScores[i] <= sScores[i])
                fScore++;
            else
                sScore++;
        }

        if (fScore > sScore)
            System.out.println("Fennec");
        else
            System.out.println("Snuke");
    }

    ArrayList<Integer> getPath() {
        int[] log = new int[n];
        int[] prev = new int[n];
        Arrays.fill(log, Integer.MAX_VALUE);
        PriorityQueue<Node> queue =
                new PriorityQueue<>((n1, n2) -> Integer.compare(n2.rank, n1.rank));
        log[0] = 0;
        Arrays.fill(prev, -1);
        prev[0] = 0;
        for (Edge e: es.get(0)) {
            queue.add(new Node(e.to, 1));
            prev[e.to] = 0;
        }
        while (!queue.isEmpty()) {
            Node n = queue.poll();
            if (n.rank > log[n.id])
                continue;
            log[n.id] = n.rank;
            for (Edge e: es.get(n.id)) {
                if (log[e.to] > log[n.id] + 1) {
                    prev[e.to] = n.id;
                    queue.add(new Node(e.to, log[n.id] + 1));
                }
            }
        }
        ArrayList<Integer> path = new ArrayList<>(n-1);
        int current = n - 1;
        while (current != 0) {
            path.add(0, current);
            current = prev[current];
        }
        path.add(0, 0);
        return path;
    }

    int[] getDists(int start) {
        int[] log = new int[n];
        Arrays.fill(log, Integer.MAX_VALUE);
        PriorityQueue<Node> queue =
                new PriorityQueue<>((n1, n2) -> Integer.compare(n2.rank, n1.rank));
        log[start] = 0;
        for (Edge e: es.get(start)) {
            queue.add(new Node(e.to, 1));
        }
        while (!queue.isEmpty()) {
            Node n = queue.poll();
            if (n.rank > log[n.id])
                continue;
            log[n.id] = n.rank;
            for (Edge e: es.get(n.id)) {
                if (log[e.to] > log[n.id] + 1) {
                    queue.add(new Node(e.to, log[n.id] + 1));
                }
            }
        }
        return log;
    }

    private class Edge {
        int from, to;
        Edge(int f, int t) {
            from = f;
            to = t;
        }
    }

    private class Node {
        int id;
        int rank;
        Node(int id, int rank) {
            this.id = id;
            this.rank = rank;
        }
    }

    private class UnionFind {
        int[] parent;
        UnionFind(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        int getRoot(int x) {
            if (x == parent[x])
                return x;
            return parent[x] = getRoot(parent[x]);
        }

        boolean hasSamePar(int x, int y) {
            return getRoot(x) == getRoot(y);
        }

        void unite(int x, int y) {
            int px = getRoot(x);
            int py = getRoot(y);
            if (px == py)
                return;
            parent[py] = px;
        }
    }
}
