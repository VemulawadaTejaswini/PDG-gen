import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	private class UnionField {
		private class Node {
			public int parent = 0;
			public long size = 1;
			
			public Node(int parent) {
				this.parent = parent;
				this.size = 1;
			}
		}
		
		private Node nodes[] = null;
		
		public UnionField(int size) {
			this.nodes = new Node[size];
			for (int i=0; i<this.nodes.length; i++) {
				this.nodes[i] = new Node(i);
			}
		}
		
		public int getRoot(int node) {
			while (this.nodes[node].parent != node) {
				node = this.nodes[node].parent;
			}
			
			return node;
		}
		
		public long getSize(int node) {
			node = getRoot(node);
			return this.nodes[node].size;
		}
		
		public void union(int from, int to) {
			from = getRoot(from);
			to = getRoot(to);
			if (from != to) {
				this.nodes[from].parent = to;
				this.nodes[to].size += this.nodes[from].size;
			}
		}
	}

	private class Way {
		public int a;
		public int b;
		
		public Way(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}
	
	public void solve() {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int M = in.nextInt();
		
		UnionField unionField = new UnionField(N);
		LinkedList<Way> ways = new LinkedList<Way>();
		
		for (int i=0; i<M; i++) {
			int a = in.nextInt();
			int b = in.nextInt();

			ways.addFirst(new Way(a, b));
		}
		in.close();

		LinkedList<Long> results = new LinkedList<Long>();
		long nowResult = (long)N * (long)(N-1) / 2;
		results.addFirst(nowResult);
		
		for (Way way : ways) {
			int aRoot = unionField.getRoot(way.a-1);
			int bRoot = unionField.getRoot(way.b-1);
			
			if (aRoot != bRoot) {
				long aSize = unionField.getSize(aRoot);
				long bSize = unionField.getSize(bRoot);
				nowResult -= aSize * bSize;
				unionField.union(aRoot, bRoot);
			}
			
			results.addFirst(nowResult);
		}
		
		results.removeFirst();
		for (Long result : results) {
			System.out.println(result);
		}
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}
}
