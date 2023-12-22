import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Node {
		int id;
		Deque<Edge> edges = new ArrayDeque<>();
		Deque<Edge> invEdges = new ArrayDeque<>();
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
			graph[b - 1].invEdges.add(edge);
			edges.add(edge);
		}
		// 順方向にたどった時の到達するnodesetを取得
		Set<Integer> reachableNodes = new HashSet<>();
		reachableNodes.add(0);
		Deque<Edge> queue = new ArrayDeque<>();
		while (!graph[0].edges.isEmpty()) {
			queue.add(graph[0].edges.poll());
		}
		while (!queue.isEmpty()) {
			Edge edge = queue.poll();
			reachableNodes.add(edge.dst);
			while (!graph[edge.dst].edges.isEmpty()) {
				queue.add(graph[edge.dst].edges.poll());
			}
		}
		Set<Integer> invReachableNodes = new HashSet<>();
		invReachableNodes.add(N - 1);
		queue.clear();
		while (!graph[N - 1].invEdges.isEmpty()) {
			queue.add(graph[N - 1].invEdges.poll());
		}
		while (!queue.isEmpty()) {
			Edge edge = queue.poll();
			invReachableNodes.add(edge.src);
			while (!graph[edge.src].invEdges.isEmpty()) {
				queue.add(graph[edge.src].invEdges.poll());
			}
		}
		// node, edgeの数を絞る
		Set<Integer> useNodes = new HashSet<>();
		for(Integer node: reachableNodes) {
			if(invReachableNodes.contains(node)) {
				useNodes.add(node);
			}
		}
		List<Edge> useEdges = new ArrayList<>();
		for(Edge edge: edges) {
			if(useNodes.contains(edge.src) && useNodes.contains(edge.dst)) {
				useEdges.add(edge);
			}
		}
		
		// 開始ノードの距離は0
		graph[0].dist = 0;
		for (int i = 0; i < useNodes.size(); ++i) {
			for (int j = 0; j < useEdges.size(); ++j) {
				Edge edge = useEdges.get(j);
				if (graph[edge.dst].dist < graph[edge.src].dist + edge.length) {
					graph[edge.dst].dist = graph[edge.src].dist + edge.length;
				}
			}
		}

		// 閉路チェック
		boolean hasNegativeLoop = false;
		for (Edge edge : useEdges) {
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
