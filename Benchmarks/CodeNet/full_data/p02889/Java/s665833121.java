import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {
	static long L;

	public static void main(String[] args) {
		FastScanner fs = new FastScanner();

		int N = fs.nextInt();
		int M = fs.nextInt();
		L = fs.nextLong();

		//隣接リスト
		//iとjが距離dで接続しているとき、rinsetuList[i]はint[]型の{j ,d}を要素として持つ
		ArrayList<long[]>[] rinsetuList = new ArrayList[N];
		for (int i = 0; i < N; i++) {
			rinsetuList[i] = new ArrayList<long[]>();
		}

		for (int i = 1; i <= M; i++) {
			int A = fs.nextInt() - 1;
			int B = fs.nextInt() - 1;
			long C = fs.nextLong();
			if (C > L)
				continue;

			rinsetuList[A].add(new long[] { B, C });
			rinsetuList[B].add(new long[] { A, C });
		}

		long[][][] d = new long[N][N][2];
		for (int i = 0; i < N; i++) {
			d[i] = MyDijkstra(i, 1, N, rinsetuList);
		}

		int Q = fs.nextInt();
		for (int i = 1; i <= Q; i++) {
			int s = fs.nextInt() - 1;
			int t = fs.nextInt() - 1;
			System.out.println(d[s][t][0] == Long.MAX_VALUE ? -1 : d[s][t][0]);
		}

	}

	private static long[][] MyDijkstra(int startIndex, int goalIndex, int nodeN, ArrayList<long[]>[] rinsetuList) {
		//ノードの優先度付きキュー
		//(nodeIndex, 補給回数, 燃料量)をあれが小さい順に格納
		Comparator<long[]> comp = (x, y) -> {
			if (x[1] < y[1]) {
				return -1;
			} else if (x[1] < y[1]) {
				return 1;
			} else {
				if (x[2] < y[2]) {
					return -1;
				} else {
					return 1;
				}
			}
		};
		PriorityQueue<long[]> nodeQue = new PriorityQueue<long[]>(comp);
		nodeQue.add(new long[] { startIndex, 0 });

		//スタートノードからの道のり
		long[][] d = new long[nodeN][2];
		for (int i = 0; i < nodeN; i++) {
			d[i][0] = i == startIndex ? 0 : Long.MAX_VALUE;
			d[i][1] = i == startIndex ? 0 : Long.MAX_VALUE;
		}
		//直前に通るべきノード
		//		int[] prev = new int[nodeN];

		while (!nodeQue.isEmpty()) {
			//最も近いノード
			long[] nearestNode = nodeQue.poll();

			for (long[] node : rinsetuList[(int) nearestNode[0]]) {
				long[] dist = new long[2];
				if (L - d[(int) nearestNode[0]][1] >= node[1]) {
					dist[0] = d[(int) nearestNode[0]][0];
					dist[1] = d[(int) nearestNode[0]][1] + node[1];
				} else if (node[1] > L) {
					continue;
				} else {
					dist[0] = d[(int) nearestNode[0]][0] + 1;
					dist[1] = node[1];
				}
//				System.out.printf("%d->%d\n", nearestNode[0], node[0]);
//				System.out.printf("%d, %d\n", d[(int) node[0]][0], d[(int) node[0]][1]);
//				System.out.printf("%d, %d\n\n", dist[0], dist[1]);
				if (d[(int) node[0]][0] > dist[0]
						|| (d[(int) node[0]][0] == dist[0] && d[(int) node[0]][1] > dist[1])) {
					d[(int) node[0]][0] = dist[0];
					d[(int) node[0]][1] = dist[1];
					nodeQue.add(new long[] { node[0], dist[0], dist[1] });
				}
			}
		}

		return d;
	}
}

class ShortestPath {
	int[] dist;
	ArrayList<Integer> path;

	public ShortestPath(int[] dist, ArrayList<Integer> path) {
		this.dist = dist;
		this.path = path;
	}
}

class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}

	private int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
		return hasNextByte();
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}

	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
