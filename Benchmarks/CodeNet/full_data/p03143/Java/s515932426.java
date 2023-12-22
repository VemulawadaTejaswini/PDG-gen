import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N, M;
	static long[] X;

	public static void main(String[] args) {
		N = sc.nextInt();
		M = sc.nextInt();
		X = new long[N];
		for (int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
		}
		Edge[] es = new Edge[M];
		for (int i = 0; i < M; i++) {
			int A = Integer.parseInt(sc.next()) - 1;
			int B = Integer.parseInt(sc.next()) - 1;
			int Y = Integer.parseInt(sc.next());
			es[i] = new Edge(A, B, Y);
		}
		Arrays.sort(es, (e1, e2) -> Integer.compare(e1.w, e2.w));
		UnionFind uf = new UnionFind(N);
		int ans = 0;
		for (int i = 0; i < M; i++) {
			uf.union(es[i].a, es[i].b, es[i].w);
//			System.err.println(uf.validEdges);
			ans = Math.max(ans, uf.validEdges);
		}
		System.out.println(M - ans);
	}

	static class Edge {
		int a, b;
		int w;

		public Edge(int a, int b, int w) {
			this.a = a;
			this.b = b;
			this.w = w;
		}
	}

	static class Node {
		int size;
		long sumNode;
		int invalidCount;

		public Node(int size, long sumNode) {
			this.size = size;
			this.sumNode = sumNode;
		}

//		int validCount() {
//			if (edges.isEmpty()) return 0;
//			if (sumNode >= edges.last()) return edges.size();
//			return edges.subSet(-1, true, (int) sumNode, true).size();
//		}
	}

	static class UnionFind {
		Node[] set;
		int validEdges = 0;

		UnionFind(int n) {
			set = new Node[n];
			for (int i = 0; i < N; i++) {
				set[i] = new Node(-1, X[i]);
			}
		}

		void union(int a, int b, int edgeWeight) {
			int rtA = root(a);
			int rtB = root(b);
			if (rtA == rtB) {
				if (edgeWeight <= set[rtA].sumNode) {
					if (set[rtA].invalidCount > 0) throw new RuntimeException();
					validEdges++;
				} else {
					set[rtA].invalidCount++;
				}
				return;
			}
			set[rtA].size += set[rtB].size;
			set[rtA].sumNode += set[rtB].sumNode;
			if (edgeWeight <= set[rtA].sumNode) {
				validEdges += set[rtA].invalidCount + set[rtB].invalidCount + 1;
				set[rtA].invalidCount = 0;
			} else {
				set[rtA].invalidCount += set[rtB].invalidCount + 1;
			}
			set[rtB].size = rtA;
		}

		boolean find(int a, int b) {
			return root(a) == root(b);
		}

		int root(int a) {
			if (set[a].size < 0) {
				return a;
			} else {
				set[a].size = root(set[a].size);
				return set[a].size;
			}
		}

		int size(int a) {
			return -set[root(a)].size;
		}
	}
}
