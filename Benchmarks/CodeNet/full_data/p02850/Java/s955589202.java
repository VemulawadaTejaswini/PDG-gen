import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
    }
    public void solve() throws Exception {
        FastScan scan = new FastScan(System.in);
        int N = scan.scanInt();
        Node[] nodes = new Node[N+1];
        Edge[] edges = new Edge[N-1];
        for (int i = 1; i <= N; i++) {
            nodes[i] = new Node(i);
        }
        for (int i = 0; i < N-1; i++){
            Edge edge = new Edge(i, scan.scanInt(), scan.scanInt());
            edges[i] = edge;
            nodes[edge.from].addEdge(edge);
            nodes[edge.to].addEdge(edge);
        }
        Node top = null;
        int max = 0;
        for (int i = 1; i <= N; i++) {
            Node node = nodes[i];
            int d = node.degree();
            if (max < d) {
                top = node;
                max = d;
            }
        }
        int K = top.degree();
        Deque<Node> deque = new ArrayDeque<>();
        deque.add(top);
        while(!deque.isEmpty()) {
            Node node = deque.poll();
            if (node.visited) {
                continue;
            }
            node.color(K);
            node.visited = true;
            for (int id : node.edges.keySet()) {
                Edge edge = node.edges.get(id);
                if (edge.from != node.no) {
                    Node next = nodes[edge.from];
                    if (!next.visited) {
                        deque.add(next);
                    }
                }
                if (edge.to != node.no) {
                    Node next = nodes[edge.to];
                    if (!next.visited) {
                        deque.add(next);
                    }
                }
            }
        }
        System.out.println(K);
        for (int i = 0; i < N-1; i++) {
            System.out.println(edges[i].color);
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
            Deque<Integer> possible = new ArrayDeque<>();
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
                edge.color = possible.poll();
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
    class FastScan {
        BufferedReader br;
        StringTokenizer st;
        FastScan(InputStream is) {
            InputStreamReader isr = new InputStreamReader(is);
            this.br = new BufferedReader(isr);
        }
        String next() throws IOException {
            while (this.st == null || !this.st.hasMoreTokens()) {
                this.st = new StringTokenizer(br.readLine().trim());
            }
            return st.nextToken();
        }
        long scanLong() throws IOException {
            return Long.parseLong(this.next());
        }
        int scanInt() throws IOException {
            return Integer.parseInt(this.next());
        }
        double scanDouble() throws IOException {
            return Double.parseDouble(this.next());
        }
        char scanCharacter() throws IOException {
            return this.next().charAt(0);
        }
        String nextLine() throws IOException {
            return br.readLine().trim();
        }
    }
}
