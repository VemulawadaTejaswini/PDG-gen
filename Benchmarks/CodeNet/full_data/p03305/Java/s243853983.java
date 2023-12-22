import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    long start = 1000000000000000L;
    int n, m, s, t;
    List<List<Pair>> graph1;
    List<List<Pair>> graph2;

    public static void main(String args[]) {
        new Main().run();
    }

    void run() {
        FastReader sc = new FastReader();
        n = sc.nextInt();
        m = sc.nextInt();
        s = sc.nextInt() - 1;
        t = sc.nextInt() - 1;
        graph1 = new ArrayList<>();
        graph2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph1.add(new ArrayList<>());
            graph2.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int from = sc.nextInt() - 1;
            int to = sc.nextInt() - 1;
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph1.get(from).add(new Pair(to, a));
            graph1.get(to).add(new Pair(from, a));
            graph2.get(from).add(new Pair(to, b));
            graph2.get(to).add(new Pair(from, b));
        }
        solve();
    }

    void solve() {
        Dijkstra one = new Dijkstra(graph1);
        Dijkstra two = new Dijkstra(graph2);
        one.shortestPath(s);
        two.shortestPath(t);
        long[] viaCost = new long[n];
        for (int i = 0; i < n; i++) {
            viaCost[i] = one.distances[i] + two.distances[i];
        }
        for (int i = viaCost.length - 2; i >= 0; i--) {
            viaCost[i] = Math.min(viaCost[i], viaCost[i + 1]);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(start - viaCost[i]);
        }
    }

    class Dijkstra {
        List<List<Pair>> graph;
        long[] distances;
        long INF = 1L << 60;

        Dijkstra(List<List<Pair>> graph) {
            this.graph = graph;
            distances = new long[graph.size()];
        }

        void shortestPath(int start) {
            Arrays.fill(distances, INF);
            distances[start] = 0;
            PriorityQueue<Pair> queue = new PriorityQueue<>();
            queue.offer(new Pair(start, 0));
            while (!queue.isEmpty()) {
                Pair node = queue.poll();
                for (Pair neighbor : graph.get(node.vertex)) {
                    long newCost = distances[node.vertex] + neighbor.cost;
                    if (distances[neighbor.vertex] > newCost) {
                        distances[neighbor.vertex] = newCost;
                        queue.offer(new Pair(neighbor.vertex, newCost));
                    }
                }
            }
        }
    }

    class Pair implements Comparable<Pair>{
        int vertex;
        long cost;

        Pair(int vertex, long cost) {
            this.vertex = vertex;
            this.cost = cost;
        }

        public int compareTo(Pair p) {
            if (cost == p.cost) {
                return 0;
            } else {
                return cost < p.cost ? -1 : 1;
            }
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}
