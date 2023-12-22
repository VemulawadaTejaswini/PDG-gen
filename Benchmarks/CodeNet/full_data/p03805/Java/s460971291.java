import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
    private static int cnt = 0;
    private static Graph g;

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		g = new Graph(N);
		for (int i=0; i<M; i++) {
		    g.add(sc.nextInt(), sc.nextInt());
		}
		boolean[] history = new boolean[N+1];
		Arrays.fill(history, false);
		search(1, history);
		System.out.println(cnt);
		sc.close();
	}
    
    public static void search(int current, boolean[] history) {
        history[current] = true;
        if (finish(history)) {
            cnt++;
            return;
        }
        for (int next: g.getNeighbors(current)) {
            if (history[next]) continue;
            search(next, Arrays.copyOf(history, history.length));
        }
    }
    
    public static boolean finish(boolean[] history) {
        for (int i=1; i<history.length; i++) {
            if (!history[i]) return false;
        }
        return true;
    }
	
	
    public static class Graph {
        private final Map<Integer, List<Edge>> graph = new HashMap<>();
        
        public Graph(int num) {
            for (int i=0; i<=num; i++) graph.put(i, new ArrayList<Edge>());
        }
        
        public void add (int v1, int v2) {
            graph.get(v1).add(new Edge(v1, v2));
            graph.get(v2).add(new Edge(v2, v1));
        }
        
        public List<Integer> getNeighbors(int v) {
            List<Integer> neighbors = new ArrayList<>();
            for (Edge e: graph.get(v)) {
                neighbors.add(e.to());
            }
            return neighbors;
        }
    }
    
    public static class Edge implements Comparable<Edge> {
        private final int _v1;
        private final int _v2;
        
        public Edge(int v1, int v2) { this._v1 = v1; this._v2 = v2; }
        public int from() { return _v1; }
        public int to() { return _v2; }
        
        @Override
        public int compareTo(Edge o) {
            if (from()!=o.from()) return Integer.compare(this.from(), o.from());
            return Integer.compare(this.to(), o.to());
        }
    }
}
