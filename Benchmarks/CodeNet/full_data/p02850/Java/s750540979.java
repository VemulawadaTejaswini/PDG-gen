import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        HashMap<Integer, Node> nodes = new HashMap<>();
        HashMap<Integer, Edge> edges = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            Node node = new Node(i);
            nodes.put(i, node);
        }
        for (int i = 0; i < N-1; i++){
            Edge edge = new Edge(i, scan.nextInt(), scan.nextInt());
            edges.put(i, edge);
            nodes.get(edge.from).addEdge(edge);
            nodes.get(edge.to).addEdge(edge);
        }
        Node top = null;
        int max = 0;
        for (int i = 1; i <= N; i++) {
            Node node = nodes.get(i);
            int d = node.degree();
            if (max < d) {
                top = node;
                max = d;
            }
        }
        int K = top.degree();
        PriorityQueue<Node> deque = new PriorityQueue<>(new NodeComparator());
        deque.add(top);
        while(!deque.isEmpty()) {
            Node node = deque.poll();
            node.color(K);
            node.visited = true;
            for (int id : node.edges.keySet()) {
                Edge edge = node.edges.get(id);
                if (edge.from != node.no) {
                    Node next = nodes.get(edge.from);
                    if (!next.visited) {
                        deque.add(next);
                    }
                }
                if (edge.to != node.no) {
                    Node next = nodes.get(edge.to);
                    if (!next.visited) {
                        deque.add(next);
                    }
                }
            }
        }
        System.out.println(K);
        for (int id : edges.keySet()) {
            System.out.println(edges.get(id).color);
        }
    }
    class NodeComparator implements Comparator<Node> {
        @Override
        public int compare(Node o1, Node o2) {
            int d1 = o1.degree();
            int d2 = o2.degree();
            if (d1 != d2) {
                return -Integer.compare(d1, d2);
            }
            return Integer.compare(o1.no, o2.no);
        }
    }
    class Node {
        int no;
        boolean visited = false;
        HashMap<Integer, Edge> edges = new HashMap<>();
        Node(int no) {
            this.no = no;
        }
        void addEdge(Edge edge) {
            edges.put(edge.id, edge);
        }
        int degree() {
            return edges.size();
        }
        void color(int K) {
            boolean[] colors = new boolean[K+1];
            Arrays.fill(colors, false);
            List<Integer> possible = new ArrayList<Integer>();
            for (Edge edge : edges.values()) {
                if (0 < edge.color) {
                    colors[edge.color] = true;
                }
            }
            for (int i = 1; i <= K; i++) {
                if (colors[i]) {
                    continue;
                }
                possible.add(i);
            }
            for (Edge edge : edges.values()) {
                if (0 < edge.color) {
                    continue;
                }
                edge.color = possible.remove(0);
            }
        }
    }
    class Edge {
        int id;
        int from;
        int to;
        int color;
        Edge(int id, int from, int to) {
            this.id = id;
            this.from = from;
            this.to = to;
            this.color = -1;
        }
    }
}
