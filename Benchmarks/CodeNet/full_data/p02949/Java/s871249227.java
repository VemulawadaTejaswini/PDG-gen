import java.util.*;

public class Main {
	Scanner sc;
	int N, M, P;
	Edge[] edges;
	Node[] nodes;

	Set<Edge> rightEdges;
	Set<Edge> q, next;
	Map<Node, List<Edge>> foreMap;

	static class Edge {
		Node start, end;
		int coin;
		Edge(Node start, Node end, int coin) {
			this.start = start;
			this.end = end;
			this.coin = coin;
		}
		public String toString() {
			return "E["+start.id+"-"+end.id+"]"+coin;
		}
	}
	
	static class Node {
		int id;
		int total = -Integer.MAX_VALUE;
		Edge prev;
		Node(int id) {
			this.id = id;
		}
	}
	
	public Main() {
		sc = new Scanner(System.in);
	}
	
	private void calc() {
		readParams();
		setRightEdges();
		searchMax();

		int max = Integer.MIN_VALUE;
		for (Edge e : rightEdges) {
			if (e.end.id != N) continue;
			if (e.end.total > max) max = e.end.total;
		}
		if (max < 0) max = 0;
		if (!q.isEmpty()) max = -1;
		
		System.out.println(max);
		System.out.flush();
	}

	private void readParams() {
		N = sc.nextInt();
		M = sc.nextInt();
		P = sc.nextInt();
		nodes = new Node[M+1];
		for (int i = 0; i <= N; i++)
			nodes[i] = new Node(i);
		edges = new Edge[M+1];
		for (int i = 1; i <= M; i++) {
			Node s = nodes[sc.nextInt()];
			Node e = nodes[sc.nextInt()];
			edges[i] = new Edge(s, e, sc.nextInt() - P);
		}
		edges[0] = new Edge(nodes[0], nodes[1], 0);
		nodes[0].total = nodes[1].total = 0;
	}
	
	private void setRightEdges() {
		rightEdges = new HashSet<>();
		// 
		Map<Node, List<Edge>> backMap = new HashMap<>();
		for (Edge e : edges) {
			List<Edge> l = backMap.getOrDefault(e.end, new ArrayList<>());
			l.add(e);
			backMap.put(e.end, l);
		}
		Set<Node> newnodes = new HashSet<>();
		Set<Node> nextnodes = new HashSet<>();
		newnodes.add(nodes[N]);

		while (!newnodes.isEmpty()) {
			nextnodes.clear();
			for (Node v : newnodes) {
				List<Edge> l = backMap.getOrDefault(v, Collections.emptyList());
				for (Edge e : l)
					if (!rightEdges.contains(e)) {
						nextnodes.add(e.start);
						rightEdges.add(e);
					}
			}
			Set<Node> tmp = nextnodes; nextnodes = newnodes; newnodes = tmp;
		}
	}

	private void searchMax() {
		foreMap = new HashMap<>();
		for (Edge e : rightEdges) {
			List<Edge> l = foreMap.getOrDefault(e.start, new ArrayList<>());
			l.add(e);
			foreMap.put(e.start, l);
		}
		q = new HashSet<>(rightEdges.size()+1);
		next = new HashSet<>(rightEdges.size()+1);
		q.add(edges[0]);
		foreMap.put(nodes[0], (List<Edge>)Arrays.asList(edges[0]));
		for (int i = 0; i < rightEdges.size()+1; i++) {
			update();
			Set<Edge> tmp = next; next = q; q = tmp;
		}
	}
	
	private void update() {
		next.clear();
		for (Edge e : q) {
			int p = e.end.total;
			List<Edge> list = foreMap.getOrDefault(e.end, Collections.emptyList());
			for (Edge follow : list) {
				int v = follow.coin + p;
				if (v > follow.end.total) {
					follow.end.total = v;
					follow.end.prev = e;
					next.add(follow);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
