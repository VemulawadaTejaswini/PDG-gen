import java.util.*;

public class Main {
	Scanner sc;
	int N, M, P;
	final static List<Edge> EMPTY = Collections.emptyList();
	Edge[] edges;
	Node[] nodes;
	Set<Edge> validEdges;
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
	}
	
	static class Node {
		int id;
		int total = -Integer.MAX_VALUE;
		Node(int id) {
			this.id = id;
		}
	}
	
	public Main() {
		sc = new Scanner(System.in);
	}
	
	private void calc() {
		readParams();
		setValidEdges();
		searchMax();
		int max = Math.max(nodes[N].total, 0);
		if (!q.isEmpty()) max = -1;
		
		System.out.println(max);
		System.out.flush();
	}

	private void readParams() {
		N = sc.nextInt();
		M = sc.nextInt();
		P = sc.nextInt();
		nodes = new Node[N+1];
		edges = new Edge[M+1];
		for (int i = 0; i <= N; i++) nodes[i] = new Node(i);
		edges[0] = new Edge(nodes[0], nodes[1], 0);
		for (int i = 1; i <= M; i++) {
			Node s = nodes[sc.nextInt()];
			Node e = nodes[sc.nextInt()];
			edges[i] = new Edge(s, e, sc.nextInt() - P);
		}
	}

	private void setValidEdges() {
		validEdges = new HashSet<>();
		Map<Node, List<Edge>> backMap = new HashMap<>();
		for (Edge e : edges) {
			List<Edge> l = backMap.getOrDefault(e.end, new ArrayList<>());
			l.add(e);
			backMap.put(e.end, l);
		}
		Set<Node> newNodes = new HashSet<>();
		Set<Node> nextNodes = new HashSet<>();
		newNodes.add(nodes[N]);

		while (!newNodes.isEmpty()) {
			nextNodes.clear();
			for (Node v : newNodes) {
				List<Edge> l = backMap.getOrDefault(v, EMPTY);
				for (Edge e : l) {
					if (validEdges.contains(e)) continue;
					nextNodes.add(e.start);
					validEdges.add(e);
				}
			}
			Set<Node> tmp = nextNodes; nextNodes = newNodes; newNodes = tmp;
		}
	}

	private void searchMax() {
		foreMap = new HashMap<>();
		for (Edge e : validEdges) {
			List<Edge> l = foreMap.getOrDefault(e.start, new ArrayList<>());
			l.add(e);
			foreMap.put(e.start, l);
		}

		q = new HashSet<Edge>(validEdges.size()+1);
		next = new HashSet<Edge>(validEdges.size()+1);
		nodes[0].total = 0;
		q.add(edges[0]);
		for (int i = 0; i < validEdges.size()+2; i++) update();
	}
	private void update() {
		next.clear();
		for (Edge e : q) {
			int p = e.start.total;
			if (p + e.coin > e.end.total) {
				e.end.total = p + e.coin;
				List<Edge> list = foreMap.getOrDefault(e.end, EMPTY);
				next.addAll(list);
			}
		}
		Set<Edge> tmp = next; next = q; q = tmp;
	}
	public static void main(String[] args) {
		new Main().calc();
	}
}
