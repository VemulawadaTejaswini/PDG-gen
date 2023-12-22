import java.util.*;

public class Main {
    private class Edge {
        int to;
        long cost;

        public Edge(int to, long cost) {
            this.to = to;
            this.cost = cost;
        }
    }

    private class Node {
        long minCost = Long.MAX_VALUE;
        List<Edge> childs = new ArrayList<>();
        boolean isFix = false;

        public void addEdge(Edge e) {
            childs.add(e);
        }

        public void fixed() {
            isFix = true;
        }
    }

    public void main(Scanner sc) {
        int n = sc.nextInt();
        Node nodes[] = new Node[n + 1];
        for (int i = 1; i <= n; i++) {
            nodes[i] = new Node();
        }
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            long c = sc.nextLong();
            nodes[a].addEdge(new Edge(b, c));
            nodes[b].addEdge(new Edge(a, c));
        }

        int q = sc.nextInt();
        int k = sc.nextInt();
        dijkstra(k, n, nodes);

        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(nodes[x].minCost + nodes[y].minCost);
        }
    }

    public void dijkstra(int start, int n, Node nodes[]) {
        nodes[start].minCost = 0;

        Queue<Node> queue = new PriorityQueue<>((n1, n2) -> Long.compare(n1.minCost, n2.minCost));
        queue.add(nodes[start]);
        while (!queue.isEmpty()) {
            Node src = queue.poll();
            src.fixed();
            for (Edge e : src.childs) {
                Node dst = nodes[e.to];
                if (!dst.isFix) {
                    dst.minCost = Math.min(dst.minCost, src.minCost + e.cost);
                    queue.add(dst);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
