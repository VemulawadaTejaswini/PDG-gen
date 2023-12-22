import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Edge {
		int src;
		int dst;
		long length;

		Edge(int src, int dst, long length) {
			this.src = src;
			this.dst = dst;
			this.length = length;
		}
	}

	static class Path {
		int parent;
		long parentLen;

		Path(int parent, long parentLen) {
			this.parent = parent;
			this.parentLen = parentLen;
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		int Q = Integer.parseInt(in.readLine());
		for (int i = 0; i < Q; ++i) {
			String[] tokens = in.readLine().split(" ");
			int S = Integer.parseInt(tokens[0]);
			int T = Integer.parseInt(tokens[1]);
			List<Long> list = ins.getPath(S - 1, T - 1);
			if (list.size() == 0) {
				System.out.println("-1");
			} else {
				System.out.println((ins.conv(list).size() - 1));

			}
		}
	}

	Deque<Long> conv(List<Long> list) {
		Deque<Long> deque = new ArrayDeque<>();
		deque.add(list.get(0));

		for (int i = 1; i < list.size(); ++i) {
			if (list.get(i) + deque.getLast() > L) {
				deque.addLast(list.get(i));
			} else {
				Long l = deque.pollLast();
				deque.addLast(l + list.get(i));
			}
		}
		return deque;
	}

	int N, M;

	long L;

	long[][] distMatrix;

	Path[] nodes;

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		M = Integer.parseInt(tokens[1]);
		L = Long.parseLong(tokens[2]);
		distMatrix = new long[N][N];
		for (int i = 0; i < N; ++i) {
			Arrays.fill(distMatrix[i], -1);
		}
		for (int i = 0; i < M; ++i) {
			tokens = in.readLine().split(" ");
			int A = Integer.parseInt(tokens[0]);
			int B = Integer.parseInt(tokens[1]);
			long C = Long.parseLong(tokens[2]);
			if (C <= L) {
				// 燃料タンクより長い道は使えない
				distMatrix[A - 1][B - 1] = C;
				distMatrix[B - 1][A - 1] = C;
			}
		}
	}

	long getDist(int target) {
		if (nodes[target].parent < 0) {
			return 0L;
		} else {
			return getDist(nodes[target].parent) + nodes[target].parentLen;
		}
	}

	List<Edge> getEdges(int src) {
		List<Edge> list = new ArrayList<>();
		for (int i = 0; i < N; ++i) {
			if (this.distMatrix[src][i] > 0) {
				list.add(new Edge(src, i, distMatrix[src][i]));
			}
		}
		return list;
	}

	List<Long> getPath(int src, int dst) {
		this.nodes = new Path[N];
		Arrays.fill(this.nodes, null);
		this.nodes[src] = new Path(-1, 0);
		Queue<Edge> queue = new PriorityQueue<>(new Comparator<Edge>() {
			@Override
			public int compare(Edge o1, Edge o2) {
				return Long.compare(o1.length, o2.length);
			}
		});
		boolean[][] unUsedFlags = new boolean[N][N];
		for (int i = 0; i < N; ++i) {
			Arrays.fill(unUsedFlags[i], true);
		}
		List<Edge> edges = this.getEdges(src);
		for (Edge edge : edges) {
			queue.add(edge);
			unUsedFlags[edge.src][edge.dst] = false;
			unUsedFlags[edge.dst][edge.src] = false;
		}

		while (!queue.isEmpty()) {
			Edge edge = queue.poll();
			if (this.nodes[edge.dst] == null) {
				// 親とdistをセット
				this.nodes[edge.dst] = new Path(edge.src, edge.length);
			} else {
				if (getDist(edge.dst) > getDist(edge.src) + edge.length) {
					this.nodes[edge.dst].parent = edge.src;
					this.nodes[edge.dst].parentLen = edge.length;
				}
			}
			// 使っていないedgeを追加する
			List<Edge> list = this.getEdges(edge.dst);
			for (Edge e : list) {
				if (unUsedFlags[e.src][e.dst]) {
					queue.add(e);
					unUsedFlags[e.src][e.dst] = false;
					unUsedFlags[e.dst][e.src] = false;
				}
			}
		}
		List<Long> result = new ArrayList<>();
		int d = dst;
		if (this.nodes[dst] == null) {
			// 到達できなかった
			return result;
		}
		while (true) {
			Path n = this.nodes[d];
			if (n.parent < 0) {
				break;
			} else {
				result.add(n.parentLen);
				d = n.parent;
			}
		}
		Collections.reverse(result);

		return result;
	}
}
