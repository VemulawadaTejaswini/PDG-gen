import java.util.ArrayList;
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
        int player = 1;
        int[] used = new int[n];
        Node[] graph = new Node[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new Node(i, es.get(i).size());
        }
        for (Edge e: es.get(0)) {
            graph[e.to].rank--;
        }
        for (Edge e: es.get(n-1)) {
            graph[e.to].rank--;
        }
        used[0] = 1;
        used[n-1] = -1;
        while (true) {
            int next = -1;
            int maxRank = -1;
            for (int i = 0; i < n; i++) {
                if (used[i] == player) {
                    for (Edge e: es.get(i)) {
                        if (used[e.to] == 0 && graph[e.to].rank > maxRank) {
                            next = e.to;
                            maxRank = graph[e.to].rank;
                        }
                    }
                }
            }
            if (next == -1)
                break;
            used[next] = player;
            for (Edge e: es.get(next))
                graph[e.to].rank--;
            player *= -1;
        }

        if (player == -1)
            System.out.println("Fennec");
        else
            System.out.println("Snuke");
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
}
