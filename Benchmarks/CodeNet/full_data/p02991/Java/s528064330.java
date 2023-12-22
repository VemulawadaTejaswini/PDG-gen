import java.util.*;

public class Main {
	static class Pair {
		int a, b;

		public Pair(int a, int b) {
			this.a = a;
			this.b = b;
		}
		
	}
	static class Graph {
		int N;
		ArrayList<ArrayList<Integer>> node;
		public Graph(int N) {
			this.N = N;
			node = new ArrayList<>();
			for(int i=0; i<N; i++)
				node.add(new ArrayList<Integer>());
		}
		
		public void addEdge(int from, int to) {
			node.get(from).add(to);
		}
		
		public int distance(int s, int t) {
			boolean[] visited = new boolean[N];
			LinkedList<Pair> q = new LinkedList<>();
			q.add(new Pair(s, 0));
			
			while(q.size()>0) {
				Pair p = q.poll();
				if(p.a==t)
					return p.b;
				if(visited[p.a])
					continue;
				for(int to : node.get(p.a)) {
					if(!visited[to])
						q.add(new Pair(to, p.b+1));
				}
				visited[p.a] = true;
			}
			
			return -3;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Graph g = new Graph(N*3);
		for(int i=0; i<M; i++) {
			int u = sc.nextInt()-1;
			int v = sc.nextInt()-1;
			g.addEdge(u*3, v*3+1);
			g.addEdge(u*3+1, v*3+2);
			g.addEdge(u*3+2, v*3);
		}
		int S = sc.nextInt()-1;
		int T = sc.nextInt()-1;
		
		System.out.println(g.distance(S*3, T*3)/3);

		sc.close();
	}
}
