import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
	static class Edge{
		int idx;
		int color;
		int src;
		int dst;
		public Edge(int i , int c , int s , int d) {
			idx = i;
			color = c;
			src = s;
			dst = d;
		}
	}
	static class Node{
		int id;
		HashMap<Integer,Edge> adj;
		public Node(int i) {
			id = i;
			adj = new HashMap<Integer,Edge>();
		}
		void add(Edge e) {
			adj.put(e.dst , e);
		}
		void paint(int root_color , int root , Node[] ns) {
			Edge er = adj.get(root);
			er.color = root_color;
			int color = 0;
			for(int e0 : adj.keySet()) {
				Edge e = adj.get(e0);
				if(e.dst == root) {
					continue;
				}
				if(color == root_color) {
					color++;
				}
				e.color = color;
				ns[e.dst].paint(color, e.src , ns);
				color++;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Node ns[] = new Node[N];
		for(int i = 0 ; i < N ; ++i) {
			ns[i] = new Node(i);
		}
		for(int i = 0 ; i < N - 1; ++i) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			Edge ab = new Edge(i, -1, a, b);
			Edge ba = new Edge(i, -1, b, a);
			ns[a].add(ab);
			ns[b].add(ba);
		}
		int color = 0;
		for(int e0 : ns[0].adj.keySet()) {
			Edge e = ns[0].adj.get(e0);
			e.color = color;
			ns[e.dst].paint(color, 0 , ns);
			color++;
		}
		int results[] = new int[N - 1];
		int C = 0;
		for(Node n : ns) {
			for(Edge e : n.adj.values()) {
				results[e.idx] = e.color + 1;
				C = Math.max(C, e.color + 1);
//				System.out.println(e.src+" "+e.dst+" "+e.idx+" "+e.color);
			}
		}
		System.out.println(C);
		for(int i = 0 ; i < results.length ; ++i) {
			System.out.println(results[i]);
		}
	}
}
