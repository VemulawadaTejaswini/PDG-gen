import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	int N, M;
	int[] a, b;
	long[] c;
	Node[] nodes;
	boolean enable = true;

	static class Node {
		int id;
		long dist;
		Map<Integer, Long> conns;
		Set<Integer> parents;

		Node(int id) {
			this.id = id;
			dist = -1L;
			conns = new HashMap<>();
			parents = new HashSet<>();
		}
	}

	static class Edge {
		int src, dst;
		long value;

		Edge(int src, int dst, long value) {
			this.src = src;
			this.dst = dst;
			this.value = value;
		}
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		M = Integer.parseInt(tokens[1]);
		a = new int[M];
		b = new int[M];
		c = new long[M];
		for (int i = 0; i < M; ++i) {
			tokens = in.readLine().split(" ");
			a[i] = Integer.parseInt(tokens[0]) - 1;
			b[i] = Integer.parseInt(tokens[1]) - 1;
			c[i] = Long.parseLong(tokens[2]);
		}
		nodes = new Node[N];
		for (int i = 0; i < N; ++i) {
			nodes[i] = new Node(i);
		}
		for (int i = 0; i < M; ++i) {
			nodes[a[i]].conns.put(b[i], c[i]);
		}
	}

	void calc() {
		Queue<Edge> que = new PriorityQueue<>(new Comparator<Edge>() {
			@Override
			public int compare(Edge o1, Edge o2) {
				return -1 * Long.compare(o1.value, o2.value);
			}
		});
		for (Integer dst : nodes[0].conns.keySet()) {
			que.add(new Edge(0, dst, nodes[0].conns.get(dst)));
		}
		nodes[0].dist = 0;
		while (!que.isEmpty()) {
			Edge edge = que.poll();
			int src = edge.src;
			int dst = edge.dst;
			long value = edge.value;
			boolean search = true;
			if (nodes[dst].dist < 0) {
				// 未到達
				nodes[dst].dist = nodes[src].dist + value;
				nodes[dst].parents.addAll(nodes[src].parents);
				nodes[dst].parents.add(src);
			} else {
				// 到達済み
				if (nodes[dst].dist >= nodes[src].dist + value) {
					// 何もしない
					search = false;
				} else {
					// 正のループがあるかチェック
					if (nodes[src].parents.contains(dst)) {
						// 正のループ
						enable = false;
						break;
					}
					nodes[dst].dist = nodes[src].dist + value;
					nodes[dst].parents.addAll(nodes[src].parents);
					nodes[dst].parents.add(src);
				}
			}
			if (search) {
				for (Integer d : nodes[dst].conns.keySet()) {
					que.add(new Edge(dst, d, nodes[dst].conns.get(d)));
				}
			}
		}
	}

	void showResult() {
		if (enable) {
			long result = nodes[N - 1].dist;
			System.out.println(result);
		} else {
			System.out.println("inf");
		}
	}
}