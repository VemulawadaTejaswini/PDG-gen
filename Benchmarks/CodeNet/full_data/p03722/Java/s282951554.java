import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    int n, m;
    List<List<Pair>> graph;
    boolean[] visited;
    long[] distances;

    public static void main(String args[]) {
        new Main().run();
    }

    void run() {
        FastReader sc = new FastReader();
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<>();
        visited = new boolean[n];
        distances = new long[n];
        for (int i = 0; i < n; i++) {
            graph.add(new LinkedList<>());
        }
        for (int i = 0; i < m; i++) {
            graph.get(sc.nextInt() - 1).
                    add(new Pair(sc.nextInt() - 1, sc.nextLong()));
        }
        solve();
    }

    void solve() {
        if (bellmanFord(0)) {
            System.out.println(distances[n - 1]);
        } else {
            System.out.println("inf");
        }
    }

    boolean bellmanFord(int start) {
        Arrays.fill(distances, Long.MIN_VALUE);
        distances[start] = 0;
        for (int i = 0; i < graph.size(); i++) {
            boolean update = false;
            for (int j = 0; j < graph.size(); j++) {
                for (Pair neighbor : graph.get(j)) {
                    if (distances[j] != Long.MIN_VALUE &&
                            distances[neighbor.to] < distances[j] + neighbor.cost) {
                        distances[neighbor.to] = distances[j] + neighbor.cost;
                        update = true;
                        if (i == graph.size() - 1) {
                            return false;
                        }
                    }
                }
            }
            if (!update) {
                break;
            }
        }
        return true;
    }

    boolean dijkstra(int start) {
        Arrays.fill(distances, Long.MIN_VALUE);
        distances[start] = 0;
        PriorityQueue<Pair> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer(new Pair(start, 0));
        while (!queue.isEmpty()) {
            Pair node = queue.poll();
            System.out.println(node.to);
            System.out.println(Arrays.toString(distances));
            visited[node.to] = true;
            for (Pair neighbor : graph.get(node.to)) {
                long newCost = distances[node.to] + neighbor.cost;
                if (distances[neighbor.to] < newCost) {
                    if (visited[neighbor.to]) {
                        return false;
                    } else {
                        distances[neighbor.to] = newCost;
                        queue.offer(new Pair(neighbor.to, newCost));
                    }
                }
            }
        }
        return true;
    }

    class Pair implements Comparable<Pair> {
        int to;
        long cost;

        Pair(int to, long cost) {
            this.to = to;
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
