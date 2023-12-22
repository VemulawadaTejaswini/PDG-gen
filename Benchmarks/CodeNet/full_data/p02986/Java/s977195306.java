import java.util.*;
import java.io.*;

public class Main {
	static ArrayList<Route>[] tree;
	static Node[] nodes;
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] first = br.readLine().split(" ", 2);
		int n = Integer.parseInt(first[0]);
		int q = Integer.parseInt(first[1]);
		tree = new ArrayList[n];
		nodes = new Node[n];
		for (int i = 0; i < n; i++) {
			tree[i] = new ArrayList<Route>();
		}
		for (int i = 0; i < n - 1; i++) {
			String[] line = br.readLine().split(" ", 4);
			int a = Integer.parseInt(line[0]) - 1;
			int b = Integer.parseInt(line[1]) - 1;
			int c = Integer.parseInt(line[2]);
			int d = Integer.parseInt(line[3]);
			Route route = new Route(c, d, a, b);
			tree[a].add(route);
			tree[b].add(route);
		}
		addNode(0, new ArrayList<Route>());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
			String[] line = br.readLine().split(" ", 4);
			int x = Integer.parseInt(line[0]);
			int y = Integer.parseInt(line[1]);
			int u = Integer.parseInt(line[2]) - 1;
			int v = Integer.parseInt(line[3]) - 1;
			int idx = 0;
			while (idx < nodes[u].fromRoot.size() && idx < nodes[v].fromRoot.size() && nodes[u].fromRoot.get(idx).equals(nodes[v].fromRoot.get(idx))) {
				idx++;
			}
			int total = 0;
			for (int j = idx; j < nodes[u].fromRoot.size(); j++) {
				Route r = nodes[u].fromRoot.get(j);
				if (r.color == x) {
					total += y;
				} else {
					total += r.dist;
				}
			}
			for (int j = idx; j < nodes[v].fromRoot.size(); j++) {
				Route r = nodes[v].fromRoot.get(j);
				if (r.color == x) {
					total += y;
				} else {
					total += r.dist;
				}
			}
			sb.append(total).append("\n");
		}
		System.out.print(sb);
	}
	
	static void addNode(int idx, ArrayList<Route> fromRoot) {
		nodes[idx] = new Node(idx, fromRoot);
		for (Route r : tree[idx]) {
			int to;
			if (r.to == idx) {
				to = r.from;
			} else {
				to = r.to;
			}
			if (nodes[to] == null) {
				ArrayList<Route> next = (ArrayList<Route>)(fromRoot.clone());
				next.add(r);
				addNode(to, next);
			}
		}
	}
	
	
	static class Node {
		int id;
		ArrayList<Route> fromRoot;
		
		public Node(int id, ArrayList<Route> fromRoot) {
			this.id = id;
			this.fromRoot = fromRoot;
		}
	}
	
	static class Route {
		int color;
		int dist;
		int from;
		int to;
		
		public Route(int color, int dist, int from, int to) {
			this.color = color;
			this.dist = dist;
			this.from = from;
			this.to = to;
		}
		
		public boolean equals(Object o) {
			Route another = (Route) o;
			return this.color == another.color && this.dist == another.dist && ((this.from == another.from && this.to == another.to) || (this.from == another.to && this.to == another.from));
		}
	}
}
