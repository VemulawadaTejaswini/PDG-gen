import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Route>[] graph = new ArrayList[n + 1];
		for (int i = 1; i <= n; i++) {
		    graph[i] = new ArrayList<Route>();
		}
		for (int i = 0; i < n - 1; i++) {
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    graph[a].add(new Route(a, b, c));
		    graph[b].add(new Route(b, a, c));
		}
		int q = sc.nextInt();
		int k = sc.nextInt();
		ArrayDeque<Route> deq = new ArrayDeque<>();
		deq.add(new Route(0, k, 0));
		long[] costs = new long[n + 1];
		while (deq.size() > 0) {
	        Route r = deq.poll();
	        costs[r.to] = r.cost;
	        for (Route x : graph[r.to]) {
	            if (x.to != r.from) {
	                x.cost += r.cost;
	                deq.add(x);
	            }
	        }
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
		    sb.append(costs[sc.nextInt()] + costs[sc.nextInt()]).append("\n");
		}
	    System.out.print(sb);
   }
   
   static class Route {
       int from;
       int to;
       long cost;
       
       public Route(int from, int to, long cost) {
           this.from = from;
           this.to = to;
           this.cost = cost;
       }
   }
}


