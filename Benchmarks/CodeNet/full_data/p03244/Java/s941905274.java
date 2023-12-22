import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {

		FastScanner sc = new FastScanner();
		int n = sc.nextInt();
		int[] v = new int[n];
		for (int i = 0; i < n; i++)
			v[i] = sc.nextInt();
		int[] odd = new int[n / 2];
		int[] even = new int[n / 2];
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0)
				odd[i / 2] = v[i];
			else if (i % 2 == 1)
				even[(i - 1) / 2] = v[i];
		}
		int[] a = new int[100000];
		int[] b = new int[100000];
		for (int i = 0; i < n / 2; i++) {
			a[odd[i] - 1]++;
			b[even[i] - 1]++;
		}
		int amax1 = 0;
		int bmax1 = 0;
		int amax2 = 0;
		int bmax2 = 0;
		int ak1 = 0;
		int bk1 = 0;
		int ak2 = 0;
		int bk2 = 0;

		for (int i = 0; i < 100000; i++) {
			if (amax1 <= a[i]) {
				amax1 = a[i];
				ak1 = i;
			}
		}
		for (int i = 0; i < 100000; i++) {
			if (ak1 != i) {
				if (amax2 <= a[i]) {
					amax2 = a[i];
					ak2 = i;
				}
			}
		}
		for (int i = 0; i < 100000; i++) {
			if (bmax1 <= b[i]) {
				bmax1 = b[i];
				bk1 = i;
			}
		}
		for (int i = 0; i < 100000; i++) {
			if (bk1 != i) {
				if (bmax2 <= b[i]) {
					bmax2 = b[i];
					bk2 = i;
				}
			}
		}
		if (ak1 != bk1)
			System.out.println(n - amax1 - bmax1);
		else
			System.out.println(Math.max(n - amax2 - bmax1, n - amax1 - bmax2));

	}
	//以下、自作ライブラリ

	//最大公約数
	public static long gcd(long a, long b) {
		if (a < b)
			return gcd(b, a);
		long c = 0;
		c = a % b;
		if (c == 0)
			return b;
		return gcd(b, c);
	}

	//最小公倍数
	public static long lcm(long m, long n) {
		return m * n / gcd(m, n);
	}

	//素数判定
	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		if (n == 2)
			return true;
		if (n % 2 == 0)
			return false;

		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}

//以下、高速スキャナークラス
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
