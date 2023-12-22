import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	static class Node {
		int id;
		boolean hasReached;
		Set<Integer> conns;

		Node(int id) {
			this.id = id;
			this.hasReached = false;
			this.conns = new HashSet<>();
		}
	}

	static class Edge {
		int src, dst;

		Edge(int src, int dst) {
			this.src = src;
			this.dst = dst;
		}
	}

	int N, M;
	Node[] nodes;
	Edge[] edges;
	int count = 0;

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		M = Integer.parseInt(tokens[1]);
		nodes = new Node[N];
		for (int i = 0; i < N; ++i) {
			nodes[i] = new Node(i);
		}
		edges = new Edge[M];
		for (int i = 0; i < M; ++i) {
			tokens = in.readLine().split(" ");
			int src = Integer.parseInt(tokens[0]) - 1;
			int dst = Integer.parseInt(tokens[1]) - 1;
			edges[i] = new Edge(src, dst);
			nodes[src].conns.add(dst);
			nodes[dst].conns.add(src);
		}
	}

	void search(int current, int parent) {
		if (nodes[current].hasReached) {
			return;
		}
		nodes[current].hasReached = true;
		for (Integer child : nodes[current].conns) {
			if (child != parent) {
				search(child, current);
			}
		}
	}

	boolean isBridge(Edge edge) {
		nodes[edge.src].conns.remove(edge.dst);
		nodes[edge.dst].conns.remove(edge.src);
		search(0, -1);
		boolean isOK = true;
		for (int i = 0; i < N; ++i) {
			if (!nodes[i].hasReached) {
				isOK = false;
				break;
			}
		}
		for (int i = 0; i < N; ++i) {
			nodes[i].hasReached = false;
		}
		nodes[edge.src].conns.add(edge.dst);
		nodes[edge.dst].conns.add(edge.src);
		return !isOK;
	}

	void calc() {
		for (Edge edge : edges) {
			if (isBridge(edge)) {
				++count;
			}
		}
	}

	void showResult() {
		System.out.println(count);
	}
}
