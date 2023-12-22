import java.io.PrintWriter;
import java.util.*;

public class Main {
	static class Pair {
		int index;
		long value;
		public Pair(int index, long value) {
			this.index = index;
			this.value = value;
		}
		
	}
	static class Tree {
		public class Edge {
			int to, rev;

			public Edge(int to, int rev) {
				this.to = to;
				this.rev = rev;
			}
		}
		
		int V;
		ArrayList<ArrayList<Edge>> G;
		int root;
		int[] p;
		int[] v;
		
		public Tree(int[] a, int[] b) {
			this.V = a.length+1;
			p = new int[V];
			v = new int[V];
			
			G = new ArrayList<ArrayList<Edge>>();
			for(int i=0; i<V; i++) {
				G.add(new ArrayList<Edge>());
			}
			
			for(int i=0; i<V-1; i++) {
				G.get(a[i]).add(new Edge(b[i], G.get(b[i]).size()));
				G.get(b[i]).add(new Edge(a[i], G.get(a[i]).size()-1));
			}
			setRoot(0);
		}
		
		public void setRoot(int root) {
			this.root = root;
			setRoot(root, -1);
		}
		public void setRoot(int cur, int parent) {
			p[cur] = parent;
			for(int i=0; i<G.get(cur).size(); i++) {
				int next = G.get(cur).get(i).to;
				if(next!=parent) {
					setRoot(next, cur);
				}
			}
		}
		public void add(int index, int value) {
			v[index] += value;
		}
		
		public ArrayList<Pair> traverse() {
			ArrayList<Pair> result = new ArrayList<>();
			traverse(0, 0, result);
			return result;
		}

		void traverse(int index, int value, ArrayList<Pair> result) {
			result.add(new Pair(index, value+v[index]));
			
			ArrayList<Edge> node = G.get(index);
			for(Edge e : node) {
				if(e.to != p[index])
					traverse(e.to, value + v[index], result);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		int[] a = new int[N-1];
		int[] b = new int[N-1];
		for(int i=0; i<N-1; i++) {
			a[i] = sc.nextInt()-1;
			b[i] = sc.nextInt()-1;
		}
		
		Tree tree = new Tree(a, b);
		
		for(int i=0; i<Q; i++) {
			int p = sc.nextInt()-1;
			int x = sc.nextInt();
			tree.add(p, x);
		}
		
		ArrayList<Pair> result = tree.traverse();
		
		Collections.sort(result, new Comparator<Pair>() {
			public int compare(Pair p1, Pair p2) {
				return Integer.compare(p1.index, p2.index);
			}
		});
		
		for(int i=0; i<N; i++)
			pw.print(result.get(i).value + (i==N-1 ? "\n" : " "));
		
		pw.close();
		sc.close();
	}
}