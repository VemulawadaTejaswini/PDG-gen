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

	int N, K, Q;
	int[] x, y;
	Node[] nodes;

	static class Node {
		int id;
		long dist;
		Map<Integer, Long> conns;

		Node(int id) {
			this.id = id;
			this.dist = 0L;
			this.conns = new HashMap<>();
		}
	}

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		this.nodes = new Node[N];
		for (int i = 0; i < N; ++i) {
			nodes[i] = new Node(i);
		}
		for (int i = 0; i < N - 1; ++i) {
			String[] tokens = in.readLine().split(" ");
			int a = Integer.parseInt(tokens[0]) - 1;
			int b = Integer.parseInt(tokens[1]) - 1;
			long c = Long.parseLong(tokens[2]);
			nodes[a].conns.put(b, c);
			nodes[b].conns.put(a, c);
		}
		String[] tokens = in.readLine().split(" ");
		Q = Integer.parseInt(tokens[0]);
		K = Integer.parseInt(tokens[1]) - 1;
		x = new int[Q];
		y = new int[Q];
		for (int i = 0; i < Q; ++i) {
			tokens = in.readLine().split(" ");
			x[i] = Integer.parseInt(tokens[0]) - 1;
			y[i] = Integer.parseInt(tokens[1]) - 1;
		}
	}

	void calcDist(int current, int parent) {
		if (parent < 0) {
			nodes[current].dist = 0L;
		} else {
			nodes[current].dist = nodes[parent].dist + nodes[parent].conns.get(current);
		}
		for (Integer next : nodes[current].conns.keySet()) {
			int n = next;
			if (n != parent) {
				calcDist(n, current);
			}
		}
	}

	void calc() {
		calcDist(K, -1);
		for (int i = 0; i < Q; ++i) {
			long dist = nodes[x[i]].dist + nodes[y[i]].dist;
			System.out.println(dist);
		}
	}

	void showResult() {
	}
}