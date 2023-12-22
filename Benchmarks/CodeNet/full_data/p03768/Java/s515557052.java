import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        int n = 0, m = 0, q = 0;
        boolean[][] edges = null;
        operator[] ops = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] elems = br.readLine().split(" ");
            n = Integer.parseInt(elems[0]);
            m = Integer.parseInt(elems[1]);
            edges = new boolean[n][n];
            int v1, v2;
            for (int i = 0; i < m; i++) {
                elems = br.readLine().split(" ");
                v1 = Integer.parseInt(elems[0]) - 1;
                v2 = Integer.parseInt(elems[1]) - 1;
                edges[v1][v2] = edges[v2][v1] = true;
            }
            elems = br.readLine().split(" ");
            q = Integer.parseInt(elems[0]);
            ops = new operator[q];
            int v, d, c;
            for (int i = 0; i < q; i++) {
                elems = br.readLine().split(" ");
                v = Integer.parseInt(elems[0]) - 1;
                d = Integer.parseInt(elems[1]);
                c = Integer.parseInt(elems[2]);
                ops[i] = new operator(v, d, c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        int[] colors = new int[n];
        Queue<node> queue = new PriorityQueue<>((s1, s2) ->
                Integer.compare(s1.cost, s2.cost));
        int[][] memo = new int[n][n];
        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo.length; j++) {
                memo[i][j] = n + 1;
            }
        }
        for (int i = 0; i < n; i++) {
            queue.clear();
            int[] dist = new int[n];
            for (int j = 0; j < n; j++){
                dist[j] = Integer.MAX_VALUE;
            }
            dist[i] = 0;
            node start = new node(i, 0, 0);
            queue.add(start);
            while (!queue.isEmpty()) {
                node trg = queue.poll();
                if (dist[trg.current] != trg.cost)
                    continue;
                int current = trg.current;
                for (int j = 0; j < n; j++){
                    if(edges[current][j] == false)
                        continue;
                    int tmp = trg.cost + 1;
                    if (dist[j] > tmp) {
                        queue.add(new node(j, current, tmp));
                        dist[j] = tmp;
                    }
                }
            }
            for (int k = 0; k < dist.length; k++) {
                memo[i][k] = dist[k];
            }
        }
        for (operator o : ops) {
            for (int i = 0; i < n; i++) {
                if (memo[o.vertex][i] <= o.dist)
                    colors[i] = o.color;
            }
        }
        for (int c : colors)
            System.out.println(c);
    }

    static class operator {
        int vertex;
        int dist;
        int color;
        operator(int v, int d, int c) {
            vertex = v;
            dist = d;
            color = c;
        }
    }

    static class node {
        int prev;
        int current;
        int cost;
        node (int current, int prev, int cost) {
            this.prev = prev;
            this.current = current;
            this.cost = cost;
        }
    }
}
