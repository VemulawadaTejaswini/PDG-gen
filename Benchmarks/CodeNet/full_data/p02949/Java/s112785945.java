import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int P = in.nextInt();
		
		ArrayList<ArrayList<Edge>> edges = new ArrayList<>();
		for(int i=0; i<N; i++) {
			edges.add(new ArrayList<Edge>());
		}
		for(int i=0; i<M; i++) {
			Edge e = new Edge();
			e.A = in.nextInt()-1;
			e.B = in.nextInt()-1;
			e.C = in.nextInt()-P;
			edges.get(e.A).add(e);
		}
		
		long[] coins = new long[N];
		for(int i=0; i<N; i++) {
			coins[i] = Integer.MIN_VALUE;
		}
		coins[0] = 0;

		for(int t = 1; t<=N-1; t++) {
			for(ArrayList<Edge> edg : edges) {
				for(Edge e: edg) {
					coins[e.B] = Math.max(coins[e.B], coins[e.A]+e.C);
				}
			}
		}
		long ans = coins[N-1];
		for(int t = 1; t<=N-1; t++) {
			for(ArrayList<Edge> edg : edges) {
				for(Edge e: edg) {
					coins[e.B] = Math.max(coins[e.B], coins[e.A]+e.C);
				}
			}
		}
		
		System.out.println(
				(ans!=coins[N-1])? -1 : 
				(ans<0)? 0 : ans);
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
	
	class Edge{
		public int A;
		public int B;
		public int C;
	}
}