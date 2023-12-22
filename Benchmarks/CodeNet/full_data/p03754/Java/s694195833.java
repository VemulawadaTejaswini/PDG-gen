
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main{
	static class Edge{
		int dst;
		int idx;
		public Edge(int d , int i) {
			dst = d;
			idx = i;
		}
	}
	static class Vertex{
		List<Edge> adj;
		public Vertex() {
			adj = new ArrayList<Edge>();
		}
		void add(int s , int d , int i){
			adj.add(new Edge(d, i));
		}
	}
	static double rec(int parent , int cur , double memo[] , List<Integer> ordering, int adj[][] , int idx[][]){
		ordering.add(cur);
		int P = 0;
		double S = 0.0;
		for(int i = 0 ; i < adj[cur].length ; ++i){
			int dst = adj[cur][i];
			if(dst == parent){
				continue;
			}
			int id = idx[cur][i];
			if(memo[id] < 0.0){
				double p = rec(cur , dst , memo , ordering , adj , idx) + 1.0;
				memo[id] = p;
			}
			S += memo[id];
			P = P + 1;
		}
		if(P == 0){
			return 0.0;
		}
		return S / P;
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Vertex[] vs = new Vertex[N];
		for(int i = 0 ; i < N ; ++i){
			vs[i] = new Vertex();
		}
		for(int i = 0 ; i < N - 1 ; ++i){
			String line = br.readLine();
			int i0 = line.indexOf(' ');			
			int u = Integer.parseInt(line.substring(0, i0)) - 1;
			int v = Integer.parseInt(line.substring(i0 + 1)) - 1;
			vs[u].add(u , v , i * 2);
			vs[v].add(v , u , i * 2 + 1);
		}
		int adj[][] = new int[N][];
		int idx[][] = new int[N][];
		for(int i = 0 ; i < N ; ++i){
			adj[i] = new int[vs[i].adj.size()];
			idx[i] = new int[vs[i].adj.size()];			
			for(int j = 0 ; j < vs[i].adj.size() ; ++j){
				adj[i][j] = vs[i].adj.get(j).dst;
				idx[i][j] = vs[i].adj.get(j).idx;
			}
		}
		List<Integer> ordering = new ArrayList<Integer>();
		double memo[] = new double[(N - 1) * 2];
		Arrays.fill(memo, -1);
		double ans[] = new double[N];
		rec(0, 0, memo, ordering, adj , idx);
		for(int cur : ordering){
			double S = 0.0;
			for(int i = 0 ; i < adj[cur].length ; ++i){
				S += memo[idx[cur][i]];
			}
			int size = vs[cur].adj.size();
			ans[cur] = S / size;
			for(int i = 0 ; i < adj[cur].length ; ++i){
				int id = idx[cur][i];
				int redge = id % 2 == 0 ? id + 1 : id - 1;
				if(size == 1){
					memo[redge] = 1.0;
				}else{
					double v = S - memo[id];
					memo[redge] = 1.0 + v / (size - 1);
				}
			}
		}
		for(double v : ans){
			System.out.println(v);
		}
	}
}