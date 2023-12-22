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
	Edge[] edges;
	boolean enable = true;

	static class Node {
		int id;
		long dist;

		Node(int id) {
			this.id = id;
			dist = Long.MAX_VALUE / 2;
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
		edges = new Edge[M];
		for (int i = 0; i < M; ++i) {
			edges[i] = new Edge(a[i], b[i], -1L * c[i]);
		}
	}

	void calc() {
		nodes[0].dist = 0;
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < M; ++j) {
				Edge edge = edges[j];
				if (nodes[edge.dst].dist > nodes[edge.src].dist + edge.value) {
					nodes[edge.dst].dist = nodes[edge.src].dist + edge.value;
				}
			}
		}
		// 閉路チェック
		for (int i = 0; i < M; ++i) {
			Edge edge = edges[i];
			if (nodes[edge.src].dist + edge.value < nodes[edge.dst].dist) {
				enable = false;
			}
		}
	}

	void showResult() {
		if (enable) {
			long result = -1L * nodes[N - 1].dist;
			System.out.println(result);
		} else {
			System.out.println("inf");
		}
	}
}