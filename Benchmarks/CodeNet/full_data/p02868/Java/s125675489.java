import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Node {
		int id;
		Map<Integer, Long> edges;

		Node(int id) {
			this.id = id;
			this.edges = new HashMap<>();
		}

		void setEdge(int dst, long c) {
			if (!this.edges.containsKey(dst)) {
				this.edges.put(dst, c);
			} else if (this.edges.get(dst) > c) {
				this.edges.put(dst, c);
			}
		}

		Set<Edge> getEdges() {
			Set<Edge> set = new HashSet<>();
			for (Integer dst : this.edges.keySet()) {
				set.add(new Edge(this.id, dst, this.edges.get(dst)));
			}
			this.edges.clear();
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
		for( int i = 1; i < N; ++i) {
			nodes[i].setEdge(i-1, 0L);
		}
		for (int i = 0; i < M; ++i) {
			tokens = in.readLine().split(" ");
			int src = Integer.parseInt(tokens[0]) - 1;
			int dst = Integer.parseInt(tokens[1]) - 1;
			long c = Long.parseLong(tokens[2]);
			nodes[src].setEdge(dst, c);
		}
		Queue<Edge> queue = new PriorityQueue<>(new Comparator<Edge>() {
			@Override
			public int compare(Edge o1, Edge o2) {
				return Integer.compare(o1.dst, o2.dst);
			}
		});
		// queueにrootから出ているedgeを追加する
		queue.addAll(nodes[0].getEdges());
		long[] distances = new long[N];
		Arrays.fill(distances, Long.MAX_VALUE / 2);
		distances[0] = 0;
		while (!queue.isEmpty()) {
			Edge edge = queue.poll();
			distances[edge.dst] = Math.min(distances[edge.dst], distances[edge.src] + edge.c);
			queue.addAll(nodes[edge.dst].getEdges());
		}
		if (distances[N - 1] >= Long.MAX_VALUE / 2) {
			System.out.println(-1);
		} else {
			System.out.println(distances[N - 1]);
		}
	}
}
