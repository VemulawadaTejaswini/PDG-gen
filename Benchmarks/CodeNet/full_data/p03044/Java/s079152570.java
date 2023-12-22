
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main implements Runnable { // クラス名はMain1

	PrintWriter out = new PrintWriter(System.out);
	InputReader sc = new InputReader(System.in);

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 1024 * 1024 * 1024).start(); // 16MBスタックを確保して実行
	}

	public void run() {

		try {
			int N = sc.nextInt();
			Node[] nodes = new Node[N + 1];
			Edge[] edges = new Edge[N + 1];

			for (int i = 0; i <= N; i++) {
				Node each = new Node();
				each.v = i;
				each.next = new ArrayList<Edge>();
				nodes[i] = each;
			}

			for (int i = 1; i < N; i++) {
				int u = sc.nextInt();
				int v = sc.nextInt();
				int w = sc.nextInt();
				Edge e1 = new Edge(u, v, w);
				Edge e2 = new Edge(v, u, w);
				nodes[u].next.add(e1);
				nodes[v].next.add(e2);
			}

			boolean[] visit = new boolean[N + 1];
			PriorityQueue<Integer> pq = new PriorityQueue<>();//昇順
			pq.add(1);
			nodes[1].color = 0;

			while (pq.size() > 0) {
				int now = pq.poll();
				for (int i = 0; i < nodes[now].next.size(); i++) {
					int next = nodes[now].next.get(i).target;
					if (nodes[nodes[now].next.get(i).target].color == Integer.MAX_VALUE) {
						if (nodes[now].next.get(i).cost % 2 == 0) {
							nodes[nodes[now].next.get(i).target].color = nodes[now].color == 0 ? 0 : 1;
						} else {
							nodes[nodes[now].next.get(i).target].color = nodes[now].color == 0 ? 1 : 0;
						}
						pq.add(nodes[now].next.get(i).target);
					}
				}
			}

			Arrays.parallelSort(nodes);

			for (int i = 1; i <= N; i++) {
				out.println(nodes[i].color);
			}

		} catch (ArithmeticException ae) {
			//ae.printStackTrace();
			throw new RuntimeException();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		} finally {
			out.flush();
			out.close();
		}

	}

	class Node implements Comparable<Node> {
		int v;
		int color = Integer.MAX_VALUE;
		ArrayList<Edge> next = new ArrayList<>();

		@Override
		public int compareTo(Node o) {
			return Integer.compare(this.v, o.v); //重みの小さい順
		}
	}

	//辺情報の構造体
	class Edge implements Comparable<Edge> {
		public int source = 0; //接続元ノード
		public int target = 0; //接続先ノード
		public long cost = 0; //重み

		public Edge(int source, int target, long cost) {
			this.source = source;
			this.target = target;
			this.cost = cost;
		}

		@Override
		public int compareTo(Edge o) {
			return Long.compare(this.cost, o.cost); //重みの小さい順
		}

		@Override
		public String toString() { //デバッグ用
			return "source = " + source + ", target = " + target + ", cost = " + cost;
		}
	}

	///////////////////////////////////////////////////////////
	//Ignore
	///////////////////////////////////////////////////////////
	static class InputReader {
		private InputStream in;
		private byte[] buffer = new byte[1024];
		private int curbuf;
		private int lenbuf;

		public InputReader(InputStream in) {
			this.in = in;
			this.curbuf = this.lenbuf = 0;
		}

		public boolean hasNextByte() {
			if (curbuf >= lenbuf) {
				curbuf = 0;
				try {
					lenbuf = in.read(buffer);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return false;
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[curbuf++];
			else
				return -1;
		}

		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}

		private void skip() {
			while (hasNextByte() && isSpaceChar(buffer[curbuf]))
				curbuf++;
		}

		public boolean hasNext() {
			skip();
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public int nextInt() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		public char[][] nextCharMap(int n, int m) {
			char[][] map = new char[n][m];
			for (int i = 0; i < n; i++)
				map[i] = next().toCharArray();
			return map;
		}
	}
}
