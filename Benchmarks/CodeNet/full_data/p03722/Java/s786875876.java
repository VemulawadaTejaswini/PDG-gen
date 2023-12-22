import java.util.*;

public class Main {
	long INF = Long.MAX_VALUE;
	
	class Edge implements Comparable<Edge>{
		int from,to, cost;
		public Edge(int from, int to, int cost) {
			this.from = from; this.to = to; this.cost = cost;
		}
		public int compareTo(Edge o) {
			if(this.cost < o.cost)return -1;
			if(this.cost > o.cost)return 1;
			return 0;
		}
	}
	
	private boolean find_negative_loop(ArrayList<Edge> data, int n, int s){
		int [] d = new int[n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < data.size(); j++){
				Edge e = data.get(j);
				if(d[e.to] > d[e.from] + e.cost){
					d[e.to]= d[e.from] + e.cost;

					if(i == n - 1) return true;
				}
			}
		}
		return false;
	}
	
	private long [] bellman(ArrayList<Edge> data, int n, int s){
		int m = data.size();
		long [] d = new long[n];
		Arrays.fill(d, INF);
		d[s] = 0;
		while(true){
			boolean update = false;
			for(int i = 0; i < m; i++){
				Edge e = data.get(i);
				if(d[e.from] != INF && d[e.to] > d[e.from] + e.cost){
					d[e.to] = d[e.from] + e.cost;
					update = true;
				}
			}
			if(! update) break;
		}
		return d;
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			ArrayList<Edge> data = new ArrayList<>();
			for(int i = 0; i < m;i++){
				int from = sc.nextInt() - 1;
				int to = sc.nextInt() - 1;
				int cost =  sc.nextInt() * -1;
				data.add(new Edge(from, to, cost));
			}
			
			if(find_negative_loop(data, n, 0)){
				System.out.println("inf");
				continue;
			}
			
			long [] res = bellman(data, n, 0);
			System.out.println(res[n-1] * -1);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
