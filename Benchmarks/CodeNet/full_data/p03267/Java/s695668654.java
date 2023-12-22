import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static class Edge {
		public int src, dst, length;

		public Edge(int src, int dst, int length) {
			this.src = src;
			this.dst = dst;
			this.length = length;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int L = Integer.parseInt(in.nextLine());
		int N = 2 * L;
		Set<Edge> edges = genEdges(L);
		System.out.println(N + " " + edges.size());
		for (Edge edge : edges) {
			System.out.println(edge.src + " " + edge.dst + " " + edge.length);
		}
		in.close();
	}

	public static Set<Edge> genEdges(int L) {
		Set<Edge> result = new HashSet<>();
		for (int i = 1; i <= L - 1; ++i) {
			result.add(new Edge(i, i + 1, 0));
		}
		for (int i = 1; i <= L; ++i) {
			result.add(new Edge(i, i + L, 0));
		}
		for (int i = L + 1; i + 1 <= 2 * L; ++i) {
			result.add(new Edge(i, i + 1, 1));
		}

		return result;
	}
}