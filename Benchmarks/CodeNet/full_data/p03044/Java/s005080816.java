import java.util.*;

public class Main {
    static ArrayList<Route>[] graph;
    static long[] distances;
	public static void main (String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		graph = new ArrayList[n + 1];
		distances = new long[n + 1];
		for (int i = 1; i <= n; i++) {
		    graph[i] = new ArrayList<Route>();
		}
		for (int i = 0; i < n - 1; i++) {
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int cost = sc.nextInt();
		    graph[a].add(new Route(b, cost));
		    graph[b].add(new Route(a, cost));
		}
		search(new Route(1, 1), 0);
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
		    sb.append(distances[i] % 2).append("\n");
		}
		System.out.print(sb);
	}
	
	static void search(Route r, long sum) {
	    if (distances[r.to] != 0) {
	        return;
	    }
	    distances[r.to] = r.cost + sum;
	    for (Route x : graph[r.to]) {
	        search(x, r.cost + sum);
	    }
	}
	
	static class Route {
	    int to;
	    int cost;
	    
	    public Route(int to, int cost) {
	        this.to = to;
	        this.cost = cost;
	    }
	}
}
