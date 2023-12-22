import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner();

		int N = sc.nextInt();
		int M = sc.nextInt();
		long[][] dist = new long[N][3];
		for (int i = 0; i < dist.length; ++i) {
			for (int j = 0; j < dist[i].length; ++j) {
				dist[i][j] = Long.MAX_VALUE / 3;
			}
		}
		class State implements Comparable<State> {
			long dist;
			int v;

			public State(long dist, int v) {
				this.dist = dist;
				this.v = v;
			}

			public int compareTo(State o) {
				return Long.compare(dist, o.dist);
			};
		}

		ArrayList<Integer>[] g = new ArrayList[N];
		for (int i = 0; i < N; ++i)
			g[i] = new ArrayList<>();
		for (int i = 0; i < M; ++i) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			--u;
			--v;
			g[u].add(v);
		}
		int s = sc.nextInt();
		int t = sc.nextInt();
		--s;
		--t;
		dist[s][0] = 0;
		PriorityQueue<State> pq = new PriorityQueue<>();
		pq.add(new State(0, s));
		while (!pq.isEmpty()) {
			State state = pq.poll();
			if (state.dist > dist[state.v][(int) (state.dist % 3)]) {
				continue;
			}
			for (int dst : g[state.v]) {
				if (dist[dst][(int) (state.dist % 3 + 1) % 3] > state.dist + 1) {
					dist[dst][(int) (state.dist % 3 + 1) % 3] = state.dist + 1;
					pq.add(new State(dist[dst][(int) (state.dist % 3 + 1) % 3], dst));
				}
			}
		}
		if (dist[t][0] == Long.MAX_VALUE / 3) {
			System.out.println(-1);
		} else {
			System.out.println(dist[t][0] / 3);
		}
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}

class Scanner {
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

	private void skipUnprintable() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
	}

	public boolean hasNext() {
		skipUnprintable();
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

	public int nextInt() {
		return (int) nextLong();
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
}