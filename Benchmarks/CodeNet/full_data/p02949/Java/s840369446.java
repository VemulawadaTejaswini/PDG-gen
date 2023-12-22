import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Node {
		int id;
		List<Edge> edges = new ArrayList<>();
		/*
		 * Queue<Edge> edges = new PriorityQueue<>(new Comparator<Edge>() {
		 * 
		 * @Override public int compare(Edge o1, Edge o2) { return -1 *
		 * Integer.compare(o1.length, o2.length); } });
		 */
		Set<Edge> passedEdges = new HashSet<>();
		int dist = Integer.MIN_VALUE / 2;

		Node(int id) {
			this.id = id;
		}
	}

	static class Edge {
		int src, dst, length;

		Edge(int src, int dst, int length) {
			this.src = src;
			this.dst = dst;
			this.length = length;
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int M = Integer.parseInt(tokens[1]);
		int P = Integer.parseInt(tokens[2]);

		Node[] graph = new Node[N];
		for (int i = 0; i < N; ++i) {
			graph[i] = new Node(i);
		}
		List<Edge> edges = new ArrayList<>(M);
		for (int i = 0; i < M; ++i) {
			tokens = in.readLine().split(" ");
			int a = Integer.parseInt(tokens[0]);
			int b = Integer.parseInt(tokens[1]);
			int c = Integer.parseInt(tokens[2]);
			Edge edge = new Edge(a - 1, b - 1, c - P);
			graph[a - 1].edges.add(edge);
			edges.add(edge);
		}
		// 開始ノードの距離は0
		graph[0].dist = 0;

		for (int i = 0; i < N - 1; ++i) {
			for (int j = 0; j < edges.size(); ++j) {
				Edge edge = edges.get(j);
				if (graph[edge.dst].dist < graph[edge.src].dist + edge.length) {
					graph[edge.dst].dist = graph[edge.src].dist + edge.length;
					graph[edge.dst].passedEdges.addAll(graph[edge.src].passedEdges);
					graph[edge.dst].passedEdges.add(edge);
				}
			}
		}

		// 閉路チェック
		boolean hasNegativeLoop = false;
		for (Edge edge : graph[graph.length - 1].passedEdges) {
			if (graph[edge.src].dist + edge.length > graph[edge.dst].dist) {
				hasNegativeLoop = true;
				break;
			}
		}
		if (hasNegativeLoop) {
			System.out.println("-1");
		} else {
			int result = Math.max(0, graph[graph.length - 1].dist);
			System.out.println(result);
		}
	}
}