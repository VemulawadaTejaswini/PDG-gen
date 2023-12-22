import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
		List<Edge> edges = genEdges(L);
		System.out.println(N + " " + edges.size());
		for (Edge edge : edges) {
			System.out.println(edge.src + " " + edge.dst + " " + edge.length);
		}
		in.close();
	}

	public static List<Edge> genEdges(int L) {
		List<Edge> result = new ArrayList<>();
		for (int i = 2; i <= L+1; ++i) {
			result.add(new Edge(1, i + 1, 0));
		}
		for(int i = 2; i <= L+1; ++i) {
			result.add(new Edge(i, L+2, i-2));
		}

		return result;
	}
}