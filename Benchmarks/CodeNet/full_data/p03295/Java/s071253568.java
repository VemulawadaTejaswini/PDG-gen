import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	public void run() {
		Scanner sc = new Scanner();
		PrintWriter pw = new PrintWriter(System.out);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] q = new int[M][2];
		for (int i = 0; i < M; ++i) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			q[i][0] = A;
			q[i][1] = B;
		}

		Arrays.sort(q, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] != o2[0])
					return Integer.compare(o1[0], o2[0]);
				else
					return Integer.compare(o1[1], o2[1]);
			}
		});
		long cur = 0, late = Long.MAX_VALUE / 3, time = Long.MAX_VALUE / 3;
		// 左を塗る
		for (int i = 0; i < M; ++i) {
			int j = i;
			while (j + 1 < M && q[j][1] == q[j + 1][1])
				++j;
			if (time <= q[j][0]) {
				late = Long.MAX_VALUE / 3;
			}
			// 左を選択
			long ncur = cur + 1;
			if (time > q[j][0]) {
				ncur = Math.min(ncur, late + 1);
			}
			if (time > q[j][1]) {
				time = q[j][1];
			}
			if (cur < late || (cur == late && time == q[j][1])) {
				time = q[j][1];
				late = cur;
			}
			cur = ncur;
			// 無視
			i = j;
		}
		pw.println(cur);
		pw.close();
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