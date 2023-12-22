
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class Edge{
		int to;
		long cost;
		Edge(int to, long cost){
			this.to=to;
			this.cost=cost;
		}
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Edge>> g = new ArrayList<ArrayList<Edge>>();
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			g.add(new ArrayList<Edge>());
		}
		for(int i=0; i<n-1; i++) {
			int a=sc.nextInt(); a--;
			int b=sc.nextInt(); b--;
			long c=sc.nextLong();
			g.get(a).add(new Edge(b, c));
			g.get(b).add(new Edge(a, c));
		}

		long d[] = new long[n];
		boolean used[] = new boolean[n];
		int q = sc.nextInt();
		int k = sc.nextInt(); k--;

		ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
		stack.push(k);
		used[k]=true;
		d[k]=0;
		while(!stack.isEmpty()) {
			int u = stack.pop();
			for(Edge e : g.get(u)) {
				if(used[e.to]) continue;
				d[e.to]=d[u] + e.cost;
				used[e.to]=true;
				stack.push(e.to);
			}
		}

		for(int i=0; i<q; i++) {
			int x = sc.nextInt();x--;
			int y = sc.nextInt();y--;
			System.out.println(d[x]+d[y]);
		}
		sc.close();
	}

}
