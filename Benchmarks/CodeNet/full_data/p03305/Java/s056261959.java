import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

/*
 * SoundHound Inc. Programming Contest 2018 -Masters Tournament- D "Saving Snuuk"
 *   https://soundhound2018-summer-qual.contest.atcoder.jp/tasks/soundhound2018_summer_qual_d/
 */
public class Main {

	public static void main(String[] args) {

		InputScanner in = new InputScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int n = in.nextInt();
		int m = in.nextInt();
		int s = in.nextInt();
		int t = in.nextInt();

		Main main = new Main();
		Graph aGraph = main.new Graph();
		Graph bGraph = main.new Graph();
		for (int i = 1; i <= n; i++) {
			aGraph.addVertex(i);
			bGraph.addVertex(i);
		}
		for (int i = 1; i <= m; i++) {
			int u = in.nextInt();
			int v = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();
			aGraph.addEdge(u, v, a);
			bGraph.addEdge(u, v, b);
		}

		long[] aCost = dijkstra(aGraph, s);
		long[] bCost = dijkstra(bGraph, t);

		long[] totalCost = new long[n];
		totalCost[n - 1] = aCost[n - 1] + bCost[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			totalCost[i] = Math.min(totalCost[i + 1], aCost[i] + bCost[i]);
		}

		for (long cost : totalCost) {
			long ans = (long) Math.pow(10, 15) - cost;
			out.println(ans);
		}

		in.close();
		out.close();
	}

	static long[] dijkstra(Graph graph, int s) {

		long[] cost = new long[graph.vertexNum];
		Arrays.fill(cost, Long.MAX_VALUE);
		cost[s - 1] = 0;

		PriorityQueue<long[]> pq = new PriorityQueue<long[]>(new Comparator<long[]>() {
			public int compare(long[] a, long[] b) {
				return Long.signum(a[1] - b[1]);
			}
		});
		pq.offer(new long[]{s, 0});

		while (!pq.isEmpty()) {

			long[] city = pq.poll();
			int currentNo = (int) city[0];
			long currentCost = city[1];

			if (cost[currentNo - 1] < currentCost) {
				continue;
			}

			Vertex cityV = graph.map.get(currentNo);
			for (Edge edge : cityV.edges) {

				Vertex nextV = edge.vertex;
				int moveCost = edge.weight;

				if (cost[nextV.id - 1] > currentCost + moveCost) {
					cost[nextV.id - 1] = currentCost + moveCost;
					pq.offer(new long[]{nextV.id, cost[nextV.id - 1]});
				}

			}

		}

		return cost;
	}

	class Edge {

		int weight;
		Vertex vertex;

		public Edge(Vertex vertex, int weight) {
			this.vertex = vertex;
			this.weight = weight;
		}
	}

	class Vertex {

		int id;
		List<Edge> edges;

		public Vertex(int id) {
			this.id = id;
			this.edges = new ArrayList<Edge>();
		}

		public void addEdge(Vertex vertex, int weight) {
			edges.add(new Edge(vertex, weight));
		}

	}

	class Graph {

		int vertexNum;
		int edgeNum;
		Map<Integer, Vertex> map;

		public Graph() {
			this.vertexNum = 0;
			this.edgeNum = 0;
			this.map = new HashMap<Integer, Vertex>();
		}

		public void addVertex(int vertex) {

			if (!map.containsKey(vertex)) {
				map.put(vertex, new Vertex(vertex));
				vertexNum++;
			}

		}

		public void addEdge(int fromVertex, int toVertex, int weight) {

			if (!map.containsKey(fromVertex)) {
				map.put(fromVertex, new Vertex(fromVertex));
				vertexNum++;
			}
			if (!map.containsKey(toVertex)) {
				map.put(toVertex, new Vertex(toVertex));
				vertexNum++;
			}

			Vertex fromV = map.get(fromVertex);
			Vertex toV = map.get(toVertex);
			fromV.addEdge(toV, weight);
			toV.addEdge(fromV, weight);
			edgeNum += 2;

		}

	}

	/*
	 * extends java.util.Scanner
	 */
	static class InputScanner {

		Scanner scanner;

		public InputScanner(InputStream inputStream) {
			this.scanner = new Scanner(inputStream);
		}

		public int nextInt() {
			return scanner.nextInt();
		}

		public long nextLong() {
			return scanner.nextLong();
		}

		public double nextDouble() {
			return scanner.nextDouble();
		}
		public String next() {
			return scanner.next();
		}

		public int[] nextIntArray(int n) {
			int[] ret = new int[n];
			for (int i = 0; i < n; i++) {
				ret[i] = scanner.nextInt();
			}
			return ret;
		}

		public int[][] nextIntArray(int h, int w) {
			int[][] ret = new int[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					ret[i][j] = scanner.nextInt();
				}
			}
			return ret;
		}

		public long[] nextLongArray(int n) {
			long[] ret = new long[n];
			for (int i = 0; i < n; i++) {
				ret[i] = scanner.nextLong();
			}
			return ret;
		}

		public long[][] nextlongArray(int h, int w) {
			long[][] ret = new long[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					ret[i][j] = scanner.nextLong();
				}
			}
			return ret;
		}

		public double[] nextDoubleArray(int n) {
			double[] ret = new double[n];
			for (int i = 0; i < n; i++) {
				ret[i] = scanner.nextDouble();
			}
			return ret;
		}

		public double[][] nextDoubleArray(int h, int w) {
			double[][] ret = new double[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					ret[i][j] = scanner.nextLong();
				}
			}
			return ret;
		}

		public String[] nextStringArray(int n) {
			String[] ret = new String[n];
			for (int i = 0; i < n; i++) {
				ret[i] = scanner.next();
			}
			return ret;
		}

		public String[] nextStringArray(String split) {
			String[] ret = scanner.next().split(split);
			return ret;
		}

		public String[][] nextStringArray(int h, int w) {
			String[][] ret = new String[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					ret[i][j] = scanner.next();
				}
			}
			return ret;
		}

		public String[][] nextStringArray(int h, String split) {
			String[][] ret = new String[h][];
			for (int i = 0; i < h; i++) {
				ret[i] = scanner.next().split(split);
			}
			return ret;
		}

		public void close() {
			scanner.close();
		}

	}

}
