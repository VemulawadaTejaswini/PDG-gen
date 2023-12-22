import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	public void run() {
		Scanner sc = new Scanner();
		int N = sc.nextInt();
		int M = sc.nextInt();
		String str = sc.next();
		boolean[] col = new boolean[N];
		for (int i = 0; i < N; ++i) {
			col[i] = str.charAt(i) == 'A';
		}
		ArrayList<Integer>[] g = new ArrayList[N];
		for (int i = 0; i < N; ++i) {
			g[i] = new ArrayList<>();
		}
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		ArrayDeque<Integer> ndq = new ArrayDeque<>();
		for (int i = 0; i < M; ++i) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			g[a].add(b);
			g[b].add(a);
		}
		for (int i = 0; i < N; ++i) {
			if (col[i])
				dq.add(i);
		}
		int[] vis = new int[N];
		Arrays.fill(vis, -1);
		for (int i = 0; i <= 2 * N + 1; ++i) {
			while (!dq.isEmpty()) {
				int cur = dq.poll();
				for (int dst : g[cur]) {
					if (i % 2 == 0 && col[cur] == col[dst] && vis[dst] < i) {
						ndq.add(dst);
						vis[dst] = i;
					} else if (i % 2 == 1 && col[cur] != col[dst] && vis[dst] < i) {
						ndq.add(dst);
						vis[dst] = i;
					}
				}
			}
			dq.addAll(ndq);
			ndq.clear();
		}
		System.out.println(dq.size() > 0 ? "Yes" : "No");
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

		private boolean isPrintableChar(int c) {
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

		int nextInt() {
			return (int) nextLong();
		}
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}