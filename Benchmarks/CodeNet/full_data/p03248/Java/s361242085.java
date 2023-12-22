import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	public void run() throws Exception {
		Scanner sc = new Scanner();
		String str = "0" + sc.next();
		int n = str.length() - 1;
		boolean ok = true;
		for (int i = 0; i < n + 1; ++i) {
			ok &= str.charAt(i) == str.charAt(n - i);
		}
		ok &= str.charAt(0) == '0';
		ok &= str.charAt(1) == '1';
		if (!ok) {
			System.out.println(-1);
			return;
		}
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i <= n; ++i) {
			if (str.charAt(i) == '1') {
				list.add(i);
			}
		}
		int sz = 1;
		int tail = 1;// 010
		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 1; i < list.size(); ++i) {
			pw.println(tail + " " + (sz + 1));
			++sz;
			tail = sz;
			int diff = list.get(i) - sz;
			for (int j = 0; j < diff; ++j) {
				pw.println(tail + " " + (sz + 1));
				++sz;
			}
		}
		pw.println(tail + " " + (sz + 1));
		pw.close();
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