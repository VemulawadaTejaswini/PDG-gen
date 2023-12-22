import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[M];
		int[] B = new int[M];
		Vertice[] vs = new Vertice[N];
		for (int i = 0; i < N; ++i) {
			vs[i] = new Vertice(i);
		}
		for (int i = 0; i < M; ++i) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
			--A[i];
			--B[i];
			addEdge(vs[A[i]], vs[B[i]]);
		}
		vs[0].dfs(null);
		if (vs[0].deg == 1) {
			System.out.println(-1);
		} else {
			for (int i = 0; i < N; ++i) {
				for (Edge e : vs[i].outgo) {
					if (e.direction == 1) {
						System.out.println((i + 1) + " " + (e.dst.id + 1));
					}
				}
			}
		}
	}

	void addEdge(Vertice a, Vertice b) {
		Edge ab = new Edge();
		Edge ba = new Edge();
		ab.dst = b;
		ba.dst = a;
		ab.rev = ba;
		ba.rev = ab;
		a.outgo.add(ab);
		b.outgo.add(ba);
	}

	class Vertice {
		int id;
		int deg = 0;
		ArrayList<Edge> outgo = new ArrayList<>();
		boolean visited = false;

		public Vertice(int id_) {
			id = id_;
		}

		void dfs(Edge toParent) {
			visited = true;
			for (Edge e : outgo) {
				if (e == toParent) {
					continue;
				}
				if (!e.dst.visited) {
					e.dst.dfs(e.rev);
				} else if (e.direction < 0) {
					e.direction = 1;
					e.rev.direction = 0;
				}
				deg ^= e.direction;
			}
			if (toParent == null)
				return;
			toParent.direction = deg;
			toParent.rev.direction = 1 ^ deg;
			deg = 0;
		}
	}

	class Edge {
		Vertice dst;
		Edge rev;
		int direction = -1;
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}