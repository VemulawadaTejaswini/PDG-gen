import java.util.*;

public class Main {
    private class Node {
        Integer x = null;
        List<Edge> edge = new ArrayList<>();
    }

    private class Edge {
        int src, dst, cost;

        public Edge(int src, int dst, int cost) {
            this.src = src;
            this.dst = dst;
            this.cost = cost;
        }
    }

    public void main(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        Node nodes[] = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }

        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int d = sc.nextInt();

            nodes[l - 1].edge.add(new Edge(l, r, d));
            nodes[r - 1].edge.add(new Edge(r, l, -d));
        }

        Queue<Node> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (nodes[i].x != null) {
                continue;
            }

            queue.add(nodes[i]);
            while (!queue.isEmpty()) {
                Node node = queue.poll();
                if (node.x == null) {
                    node.x = 0;
                }
                for (Edge e : node.edge) {
                    Node next = nodes[e.dst - 1];
                    if (next.x == null) {
                        next.x = node.x + e.cost;
                        queue.add(next);
                    } else if (next.x != node.x + e.cost) {
                        System.out.println("No");
                        return;
                    }
                }
            }
        }

        System.out.println("Yes");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
