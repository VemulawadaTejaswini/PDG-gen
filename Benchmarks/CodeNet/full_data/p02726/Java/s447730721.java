import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Arrays;
import java.util.AbstractCollection;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        LinePlus solver = new LinePlus();
        solver.solve(1, in, out);
        out.close();
    }

    static class LinePlus {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int x = in.nextInt() - 1;
            int y = in.nextInt() - 1;

            List<List<Node>> graph = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                graph.add(new ArrayList<>());
            }
            for (int i = 0; i < n - 1; i++) {
                (graph.get(i)).add(new Node(i + 1, 1));
                (graph.get(i + 1)).add(new Node(i, 1));
            }
            graph.get(x).add(new Node(y, 1));
            graph.get(y).add(new Node(x, 1));

            int[] result = new int[n];
            for (int i = 0; i < n; i++) {
                int[] d = dijkstra(i, graph);
                for (int j = i + 1; j < n; j++) {
                    result[d[j]]++;
                }
            }

            for (int i = 1; i < n; i++) {
                out.println(result[i]);
            }
        }

        int[] dijkstra(int start, List<List<Node>> graph) {
            int n = graph.size();

            LinePlus.Color[] colors = new LinePlus.Color[n];
            int[] distance = new int[n];
            Arrays.fill(colors, LinePlus.Color.WHITE);
            Arrays.fill(distance, Integer.MAX_VALUE);

            PriorityQueue<Pair> pq = new PriorityQueue<>(n, (o1, o2) -> Integer.compare(o1.weight, o2.weight));

            distance[start] = 0;
            pq.add(new Pair(0, start));
            colors[start] = LinePlus.Color.GRAY;

            while (!pq.isEmpty()) {
                Pair p = pq.poll();
                colors[p.node] = LinePlus.Color.BLACK;
                if (distance[p.node] < p.weight) {
                    continue;
                }
                for (int i = 0; i < graph.get(p.node).size(); i++) {
                    Node next = graph.get(p.node).get(i);

                    if (colors[next.dist] == LinePlus.Color.BLACK) {
                        continue;
                    }
                    int cost = distance[p.node] + next.weight;
                    if (distance[next.dist] > cost) {
                        distance[next.dist] = cost;
                        pq.add(new Pair(cost, next.dist));
                        colors[next.dist] = LinePlus.Color.GRAY;
                    }
                }
            }
            return distance;
        }

        public enum Color {
            WHITE,
            GRAY,
            BLACK,
            ;
        }

        class Node {
            public final Integer dist;
            public final Integer weight;

            Node(Integer dist, Integer weight) {
                this.dist = dist;
                this.weight = weight;
            }

        }

        class Pair {
            public final Integer weight;
            public final Integer node;

            public Pair(Integer weight, Integer node) {
                this.weight = weight;
                this.node = node;
            }

        }

    }
}

