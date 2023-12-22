import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	Node[] nodes;
	Edge[] edges;
	int result = 0;

	static class Edge {
		int id, src, dst, color;

		Edge(int id, int src, int dst) {
			this.id = id;
			this.src = src;
			this.dst = dst;
			this.color = -1;
		}
	}

	static class Node {
		int id;
		List<Edge> edges;

		Node(int id) {
			this.id = id;
			this.edges = new ArrayList<>();
		}

	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		this.nodes = new Node[N];
		for (int i = 0; i < N; ++i) {
			nodes[i] = new Node(i);
		}
		this.edges = new Edge[N - 1];
		for (int i = 0; i < N - 1; ++i) {
			String[] tokens = in.readLine().split(" ");
			int a = Integer.parseInt(tokens[0]) - 1;
			int b = Integer.parseInt(tokens[1]) - 1;
			this.edges[i] = new Edge(i, a, b);
			this.nodes[a].edges.add(this.edges[i]);
			this.nodes[b].edges.add(this.edges[i]);
		}
	}

	void calc() {
		colorize(nodes[0], null);
		// 最大の色を探す
		for (Edge edge : this.edges) {
			result = Math.max(result, edge.color);
		}
	}

	void colorize(Node node, Edge parent) {
		if (parent == null) {
			// 自由に塗る
			int color = 1;
			for (int i = 0; i < node.edges.size(); ++i) {
				Edge edge = node.edges.get(i);
				edge.color = color;
				++color;
			}
		} else {
			// parentと異なるcolor以外で塗る
			int color = 1;
			for (int i = 0; i < node.edges.size(); ++i) {
				Edge edge = node.edges.get(i);
				if (edge.equals(parent)) {
					continue;
				}
				if (color == parent.color) {
					++color;
				}
				edge.color = color;
				++color;
			}
		}
		// parent以外のedgeの先のnodeに対して，同様に彩色する
		for (Edge edge : node.edges) {
			if (edge.equals(parent)) {
				continue;
			}
			Node next = edge.src == node.id ? this.nodes[edge.dst] : this.nodes[edge.src];
			colorize(next, edge);
		}
	}

	void showResult() {
		System.out.println(result);
		for (int i = 0; i < edges.length; ++i) {
			System.out.println(this.edges[i].color);
		}
	}
}
