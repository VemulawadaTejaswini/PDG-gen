import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<ArrayList<Edge>> edges = new ArrayList<>();
    static int n, m, s, t;

    public static void main(String[] args) {
        //input
        n = sc.nextInt();
        m = sc.nextInt();
        s = sc.nextInt() - 1;
        t = sc.nextInt() - 1;
        //initialize
        for (int i = 0; i < n; i++) {
            edges.add(new ArrayList<>());
        }
        //input
        for (int i = 0; i < m; i++) {
            int u = Integer.parseInt(sc.next()) - 1;
            int v = Integer.parseInt(sc.next()) - 1;
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            edges.get(u).add(new Edge(v, a, b));
            edges.get(v).add(new Edge(u, a, b));
        }
        //solve
        long[] sd = shortest(s);
        long[] td = shortest(t);
        //ans
        long[] ans = new long[n];
        ans[n - 1] = sd[n - 1] + td[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            ans[i] = Math.min(ans[i + 1], sd[i] + td[i]);
        }
        //output
        PrintWriter writer = new PrintWriter(System.out);
        for (int i = 0; i < n; i++) {
            writer.println(1_000_000_000_000_000L - ans[i]);
        }
        writer.flush();
    }

    static long[] shortest(int from) {
        //initialize
        final long INF = (long) 1e17;
        long[] dist = new long[n];
        Arrays.fill(dist, INF);
        boolean[] visited = new boolean[n];

        PriorityQueue<State> queue = new PriorityQueue<>();
        queue.add(new State(0, from));

        while (!queue.isEmpty()) {
            State state = queue.poll();
            //guard
            if (visited[state.lookingVertex]) continue;
            //update
            dist[state.lookingVertex] = state.totalDist;
            visited[state.lookingVertex] = true;
            //QueueAdding
            for (Edge e : edges.get(state.lookingVertex)) {
                //guard
                if (visited[e.to]) continue;
                //DistUpdate
                long newDist = state.totalDist + (from == s ? e.yenCost : e.snukeCost);
                //guard
                if (dist[e.to] <= newDist) continue;
                //update
                dist[e.to] = newDist;
                //queueAdd
                queue.add(new State(newDist, e.to));
            }
        }

        return dist;
    }

    static class State implements Comparable<State> {
        long totalDist;
        int lookingVertex;

        public State(long totalDist, int lookingVertex) {
            this.totalDist = totalDist;
            this.lookingVertex = lookingVertex;
        }

        @Override
        public int compareTo(State other) {
            return Long.compare(this.totalDist, other.totalDist);
        }
    }

    static class Edge {
        int to;
        long yenCost, snukeCost;

        public Edge(int to, int yenCost, int snukeCost) {
            this.to = to;
            this.yenCost = yenCost;
            this.snukeCost = snukeCost;
        }
    }
}

