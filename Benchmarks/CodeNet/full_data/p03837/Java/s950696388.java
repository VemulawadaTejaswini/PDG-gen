import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        int n = 0, m = 0;
        Edge[][] edges = new Edge[0][0];
        String[] elems;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            elems = br.readLine().split(" ");
            n = Integer.parseInt(elems[0]);
            m = Integer.parseInt(elems[1]);
            edges = new Edge[n][n];
            for (int i = 0; i < m; i++) {
                elems = br.readLine().split(" ");
                int from = Integer.parseInt(elems[0]);
                int to = Integer.parseInt(elems[1]);
                int cost = Integer.parseInt(elems[2]);
                Edge e = new Edge(cost);
                edges[from-1][to-1] = e;
                edges[to-1][from-1] = e;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < n; i++) {
            Queue<Node> queue = new PriorityQueue<>((s1, s2) ->
                    Integer.compare(s1.totalCost, s2.totalCost));
            int[] dist = new int[n];
            for (int j = 0; j < n; j++){
                dist[j] = Integer.MAX_VALUE;
            }
            dist[i] = 0;
            Node start = new Node(i, 0, 0);
            Node[] result = new Node[n];
            queue.add(start);
            while (!queue.isEmpty()) {
                Node trg = queue.poll();
                if (dist[trg.current] != trg.totalCost)
                    continue;
                int current = trg.current;
                result[current] = trg;
                for (int j = 0; j < n; j++){
                    if(edges[current][j] == null)
                        continue;
                    int tmp = trg.totalCost + edges[current][j].cost;
                    if (dist[j] > tmp) {
                        queue.add(new Node(j, current, tmp));
                        dist[j] = tmp;
                    }
                }
            }
            for (Node node:result) {
                int current = node.current;
                int prev = node.prev;
                if (prev == 0)
                    continue;
                edges[prev][current].check = true;
            }
        }
        int sum = 0;
        for (Edge[] es:edges)
            for (Edge e:es) {
                if (e == null) continue;
                if (!e.check) sum++;
            }
        System.out.println(sum / 2);
    }
}

class Node {
    int prev;
    int current;
    int totalCost;
    Node (int i, int prev, int totalCost) {
        this.prev = prev;
        current = i;
        this.totalCost = totalCost;
    }

    Node (int current) {
        this.current = current;
    }
}

class Edge {
    int cost;
    boolean check;
    public Edge (int cost) {
        this.cost = cost;
        check = false;
    }
}
