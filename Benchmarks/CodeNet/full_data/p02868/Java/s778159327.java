import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Node {
		int id;
		Map<Integer, Long> edges;
		long dist;

		Node(int id) {
			this.id = id;
			this.edges = new HashMap<>();
			this.dist = Long.MAX_VALUE / 2;
		}

		void setEdge(int dst, long c) {
			if (!this.edges.containsKey(dst)) {
				this.edges.put(dst, c);
			} else if (this.edges.get(dst) > c) {
				this.edges.put(dst, c);
			}
		}

		Set<Edge> getEdges(Set<Integer> dones) {
			Set<Edge> set = new HashSet<>();
			for (Integer dst : this.edges.keySet()) {
				if (!dones.contains(dst)) {
					set.add(new Edge(this.id, dst, this.edges.get(dst)));
				}
			}
			return set;
		}
	}

	static class Edge {
		int src, dst;
		long c;

		Edge(int src, int dst, long c) {
			this.src = src;
			this.dst = dst;
			this.c = c;
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N, M;
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		M = Integer.parseInt(tokens[1]);
		Node[] nodes = new Node[N];
		for (int i = 0; i < N; ++i) {
			nodes[i] = new Node(i);
		}
		// 区間の中間からの処理を可能とするための便宜上の辺を追加
		for (int i = 1; i < N; ++i) {
			nodes[i].setEdge(i - 1, 0L);
		}
		for (int i = 0; i < M; ++i) {
			tokens = in.readLine().split(" ");
			int src = Integer.parseInt(tokens[0]) - 1;
			int dst = Integer.parseInt(tokens[1]) - 1;
			long c = Long.parseLong(tokens[2]);
			nodes[src].setEdge(dst, c);
		}
		Queue<Node> nodeQueue = new PriorityQueue<>(new Comparator<Node>() {
			@Override
			public int compare(Node o1, Node o2) {
				return Long.compare(o1.dist, o2.dist);
			}
		});
		nodes[0].dist = 0L;
		nodeQueue.add(nodes[0]);
		Set<Integer> dones = new HashSet<>();
		while (!nodeQueue.isEmpty()) {
			Node node = nodeQueue.poll();
			dones.add(node.id);
			Set<Edge> edges = node.getEdges(dones);
			for (Edge edge : edges) {
				long alt = node.dist + edge.c;
				if (nodes[edge.dst].dist > alt) {
					nodes[edge.dst].dist = alt;
					nodeQueue.add(nodes[edge.dst]);
				}
			}
		}
		if (nodes[N - 1].dist >= Long.MAX_VALUE / 2) {
			System.out.println(-1);
		} else {
			System.out.println(nodes[N - 1].dist);
		}
	}
}
