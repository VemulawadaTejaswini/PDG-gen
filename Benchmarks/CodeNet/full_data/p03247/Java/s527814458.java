import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	public void run() throws Exception {
		Scanner sc = new Scanner();
		int n = sc.nextInt();
		ArrayList<Long> len = new ArrayList<>();
		StringBuilder[] sb = new StringBuilder[n];
		for (int i = 0; i < n; ++i)
			sb[i] = new StringBuilder();
		int[] X = new int[n];
		int[] Y = new int[n];
		for (int i = 0; i < n; ++i) {
			X[i] = sc.nextInt();
			Y[i] = sc.nextInt();
		}
		for (int i = 0; i < n; ++i) {
			if (Math.abs(X[i] + Y[i]) % 2 != Math.abs(X[0] + Y[0]) % 2) {
				System.out.println(-1);
				return;
			}
		}

		for (int i = 0; i < n; ++i) {
			if (Math.abs(X[i] + Y[i]) % 2 == 0) {
				sb[i].append("L");
				X[i]++;
			}
		}
		for (int i = 0; i < sb[0].length(); ++i) {
			len.add(1L);
		}
		for (int t = 0; t < n; ++t) {
			for (int i = 32; i >= 0; --i) {
				if (Math.abs(X[t]) > Math.abs(Y[t])) {
					sb[t].append(X[t] > 0 ? "R" : "L");
					X[t] += X[t] > 0 ? -(1L << i) : (1L << i);
				} else {
					sb[t].append(Y[t] > 0 ? "U" : "D");
					Y[t] += Y[t] > 0 ? -(1L << i) : (1L << i);
				}
			}
		}
		for (int i = 32; i >= 0; --i) {
			len.add(1L << i);
		}
		System.out.println(len.size());
		for (int i = 0; i < len.size(); ++i) {
			System.out.print(len.get(i) + (i == len.size() - 1 ? "\n" : " "));
		}
		for (int i = 0; i < n; ++i) {
			System.out.println(sb[i].toString());
		}
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
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
}