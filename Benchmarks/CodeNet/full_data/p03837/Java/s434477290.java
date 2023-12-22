
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskX solver = new TaskX();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskX {
		public void solve(int testNumber, InputReader in, PrintWriter out) {

			int n = in.nextInt();
			int m = in.nextInt();
			List<Edge>[] list = new ArrayList[1001];
			for (int i = 0; i <= 1000; i++) {
				list[i] = new ArrayList<>();
			}
			Node[] nodes = new Node[n+1];
			Set<Integer> s = new HashSet<>();
			for (int i = 1; i <= m; i++) {
				int a = in.nextInt();
				int b = in.nextInt();
				int c = in.nextInt();
				list[a].add(new Edge(b, c));
				s.add(a * 1000 + b);
			}
			for (int i = 1; i <= n; i++) {
				nodes[i] = new Node(i, Integer.MAX_VALUE);
			}

			// solve
			PriorityQueue<Node> pq = new PriorityQueue<Node>(new MyComparator());

			for (int l = 1; l <= n; l++) {
				nodes[l].cost = 0;
				pq.add(nodes[l]);
				Node fromNode = null;

				while (!pq.isEmpty()) {

					Node node = pq.remove();
					// calc edge
					if (fromNode != null) {
						s.remove(fromNode.nodeNum*1000+node.nodeNum);
					}

					fromNode = node;
					for (int i = 0; i < list[node.nodeNum].size(); i++) {
						int toNodeNum = list[node.nodeNum].get(i).toNodeNum;
						int moveWeight = list[node.nodeNum].get(i).weight;
						if (node.cost + moveWeight < nodes[toNodeNum].cost) {
							nodes[toNodeNum].cost = node.cost + moveWeight;
							pq.add(nodes[toNodeNum]);
						}
					}
				}
			}

			out.println(s.size());

		}
	}

	@SuppressWarnings("rawtypes")
	/**
	 * 昇順ソート
	 * */
	static class MyComparator implements Comparator {

		public int compare(Object o1, Object o2) {

			Node n1 = (Node) o1;
			Node n2 = (Node) o2;

			int cost1 = n1.cost;
			int cost2 = n2.cost;

			if (cost1 > cost2) {
				return 1;
			} else if (cost1 < cost2) {
				return -1;
			} else {
				return 0;
			}
		}
	}

	static class Node {
		int nodeNum;
		int cost;

		public Node(int nodeNum, int weight) {
			this.nodeNum = nodeNum;
			this.cost = weight;
		}
	}
	static class Edge {
		int toNodeNum;
		int weight;

		public Edge(int nodeNum, int weight) {
			this.toNodeNum = nodeNum;
			this.weight = weight;
		}
	}

	static class ArrayUtils {
		public static Map<Integer, Integer> getCountMap(int[] array) {
			Map<Integer, Integer> map = new TreeMap<>();
			for (int x : array)
				map.merge(x, 1, Integer::sum);
			return map;
		}
	}

	static class InputReader {
		BufferedReader in;
		StringTokenizer tok;

		public String nextString() {
			while (!tok.hasMoreTokens()) {
				try {
					tok = new StringTokenizer(in.readLine(), " ");
				} catch (IOException e) {
					throw new InputMismatchException();
				}
			}
			return tok.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextString());
		}

		public long nextLong() {
			return Long.parseLong(nextString());
		}

		public int[] nextIntArray(int n) {
			int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextInt();
			}
			return res;
		}

		public long[] nextLongArray(int n) {
			long[] res = new long[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextLong();
			}
			return res;
		}

		public InputReader(InputStream inputStream) {
			in = new BufferedReader(new InputStreamReader(inputStream));
			tok = new StringTokenizer("");
		}

	}

}
