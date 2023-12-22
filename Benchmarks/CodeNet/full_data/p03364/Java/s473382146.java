import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.NoSuchElementException;

public class Main {

	void run() {
		Scanner sc = new Scanner();
		int n = (int) sc.nextLong();
		char[][] map = new char[n][n];
		for (int i = 0; i < n; ++i) {
			map[i] = sc.next().toCharArray();
		}

		// s(i,j)←map((i+a)%n,(j+b)%n)
		// s(i,j)=s(j,i)を満たすようにしたい
		// s(i,j)=s(j,i)⇔map((i+a)%n,(j+b)%n)==map((j+a)%n,(i+b)%n))
		// 0<=a,b<n
		//
		// map(a%n,b%n)==map((j-i)+a)%n,(i-j+b)%n))
		// これより
		// map(a,b)=map(a+k,b-k)
		int ans = 0;
		for (int a = 0; a < n; ++a) {
			block1: for (int b = 0; b < n; ++b) {
				for (int k = -(n - 1); k < n; ++k) {
					if (map[a][b] != map[(a + k + n) % n][(b - k + n)%n])
						continue block1;
				}
				++ans;
			}
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		new Main().run();
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
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
