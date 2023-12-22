import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		Node[] v = new Node[N];
		Edge[] e = new Edge[M];
		for(int i=0;i<N;i++) {
			v[i] = new Node(i);
		}
		int a,b,c;
		for(int i=0;i<M;i++) {
			a = Integer.parseInt(sc.next());
			b = Integer.parseInt(sc.next());
			c = -Integer.parseInt(sc.next());
			e[i] = new Edge(v[a-1],v[b-1],c);
			v[a-1].Connect(e[i]);
		}
		Graph map = new Graph(v,e);
		if(map.Bellman_Ford(v[0])) {
			out.println("inf");
		}
		else {
			out.println(-v[N-1].d);
		}


		out.flush();
	}
}

class Graph{
	static Node[] nodes;
	static Edge[] edges;

	public Graph(Node[] v,Edge[] e) {
		Graph.nodes = v;
		Graph.edges = e;
	}

	public static int size() {
		return nodes.length;
	}

	public boolean Bellman_Ford(Node s) {
		s.Reload_dist(0);
		for(int i=0;i<size();i++) {
			for(Node v : nodes) {
				for(Edge e : v.edges) {
					if(v.d != Integer.MAX_VALUE && e.Other_one(v).d > v.d + e.cost) {
						e.Other_one(v).Reload_dist(v.d + e.cost);
						if(i == size()-1) {
							return true;
						}
					}
				}
			}
		}
		return false;

	}

}

class Node{
	int id;
	double d;
	Node prev = null;
	ArrayList<Edge> edges = new ArrayList<>();

	public Node(int id) {
		this.id = id;
		this.d = Integer.MAX_VALUE;
	}

	public void Reset() {
		this.d = Integer.MAX_VALUE;
		this.prev = null;
	}

	public void Reload_dist(double dist) {
		this.d = dist;
	}

	public void Reload_prev(Node v) {
		this.prev = v;
	}

	@Override public Node clone() {
		return new Node(this.id);
	}

	public void Connect(Edge e) {
		edges.add(e);
	}
}

class Edge{
	Node v1, v2;
	int cost;
	public Edge(Node id1,Node id2, int c) {
		this.v1 = id1;
		this.v2 = id2;
		this.cost = c;
	}

	public Node First_one() {
		return this.v1;
	}

	public Node Second_one() {
		return this.v2;
	}

	public Node Other_one(Node v) {
		if(v.equals(this.v1)) {
			return this.v2;
		}
		else {
			return this.v1;
		}
	}
}