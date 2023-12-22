import java.util.*;

class Main {
	Scanner sc;
	int N;
	List<Edge>[] edges;
	int[] a, b, c;
	int K;
	
	static class Edge {
		int next, idx;
		Edge(int n, int i) {next = n; idx = i;}
	}
	
	@SuppressWarnings("unchecked")
	void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		edges = new ArrayList[N];
		a = new int[N];
		b = new int[N];
		c = new int[N];
		for (int i = 0; i < N; i++) edges[i] = new ArrayList<Edge>();
		for (int i = 0; i < N-1; i++) {
			a[i] = sc.nextInt() - 1;
			b[i] = sc.nextInt() - 1;
			edges[a[i]].add(new Edge(b[i], i));
		}
		K = 0;
		coloring(0, -1);
		System.out.println(K);
		for (int i = 0; i < N-1; i++) System.out.println(c[i]+1);
	}
	
	void coloring(int vidx, int startColor) {
		int n = edges[vidx].size();
		if (startColor > -1) n++;
		for (int i = 0; i < edges[vidx].size(); i++) {
			startColor = (++startColor)%n;
			c[edges[vidx].get(i).idx] = startColor;
			coloring(edges[vidx].get(i).next, startColor);
		}
		K = Math.max(K, n);
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}