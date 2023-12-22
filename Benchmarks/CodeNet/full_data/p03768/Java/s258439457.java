import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
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
        node[] nodes = new node[n];
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = new node(i, 0);
        }
        Queue<node> queue = new LinkedList<>();
        for (operator o : ops) {
            queue.clear();
            node src = nodes[o.vertex];
            src.depth = 0;
            queue.add(src);
            while (!queue.isEmpty()) {
                src = queue.poll();
                colors[src.nodeNum] = o.color;
                if (src.depth < o.dist) {
                    for (int i = 0; i < edges[0].length; i++) {
                        if (edges[src.nodeNum][i]) {
                            nodes[i].depth = src.depth + 1;
                            queue.add(nodes[i]);
                        }
                    }
                }
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
        int nodeNum;
        int depth;
        node (int nodeNum, int depth) {
            this.nodeNum = nodeNum;
            this.depth = depth;
        }
    }
}
