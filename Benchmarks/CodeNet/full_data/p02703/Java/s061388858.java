import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static class Edge{
		int dst;
		long dist;
		long cost;
		Edge(int dst , long d ,long c){
			this.dst = dst;
			dist = d;
			cost = c;
		}
	}
	static class Vertex{
		List<Edge> adj;
		public Vertex() {
			adj = new ArrayList<Edge>();
		}
	}
	static class State implements Comparable<State>{
		int cur;
		int silver;
		long dist;
		public State(int c , int s , long d) {
			cur = c;
			silver = s;
			dist = d;
		}
		@Override
		public int compareTo(State o) {
			return Long.compare(dist, o.dist);
		}
	}
	static int SMax = 2500;
	static long solve(Vertex vs[] , int[] C , int[] D, int S, int target){
		PriorityQueue<State> pq = new PriorityQueue<State>();
		pq.add(new State(0 , S , 0));
		long dp[][] = new long[vs.length][SMax + 1];
		for(int i = 0 ; i < dp.length ; ++i){
			Arrays.fill(dp[i], -1);
		}
		dp[0][S] = 0;
		while(!pq.isEmpty()){
			State cur = pq.poll();
//			System.out.println(cur.cur+" "+cur.silver+" "+cur.dist);
			if(cur.cur == target){
				return cur.dist;
			}
			long changeCost = D[cur.cur];
			int nchange = cur.silver + C[cur.cur];
			if(nchange > SMax){
				nchange = SMax;
			}
			if(dp[cur.cur][nchange] == -1 || dp[cur.cur][nchange] > cur.dist + changeCost){
				pq.add(new State(cur.cur , nchange , cur.dist + changeCost));
				dp[cur.cur][nchange] = cur.dist + changeCost;
			}
			for(Edge e : vs[cur.cur].adj){
				if(e.cost <= cur.silver){
					State ns = new State(e.dst, (int)(cur.silver - e.cost), cur.dist + e.dist);					
					if(dp[ns.cur][ns.silver] == -1 || dp[ns.cur][ns.silver] > ns.dist){
						pq.add(ns);
						dp[ns.cur][ns.silver] = ns.dist;
					}
				}
			}
		}
		
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int S = sc.nextInt();
		if(S > SMax){
			S = SMax;
		}
		Vertex vs[] = new Vertex[N];
		for(int i = 0 ; i < N ; ++i){
			vs[i] = new Vertex();
		}

		for(int i = 0 ; i < M ; ++i){
			int U = sc.nextInt() - 1;
			int V = sc.nextInt() - 1;
			int A = sc.nextInt();
			int B = sc.nextInt();
			vs[U].adj.add(new Edge(V , B , A));
			vs[V].adj.add(new Edge(U , B , A));
		}
		int C[] = new int[N];
		int D[] = new int[N];
		for(int i = 0 ; i < N ; ++i){
			C[i] = sc.nextInt();
			D[i] = sc.nextInt();
		}
		for(int i = 1 ; i < N ; ++i){
			System.out.println(solve(vs , C , D, S , i));
		}
	}
}
