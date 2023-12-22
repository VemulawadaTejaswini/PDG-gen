import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {

	static int N, A, B, C;
	static int[] l;
	static int inf = (int) Math.pow(10, 9);

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		N = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		l = new int[N];
		for (int i = 0; i < N; i++)
			l[i] = sc.nextInt();

		System.out.println(dfs(0, 0, 0, 0));
	}

	//dfs(深さ優先探索)
	public static int dfs(int n, int a, int b, int c) {
		if (n == N) {
			if (a > 0 && b > 0 && c > 0)
				return Math.abs(a - A) + Math.abs(b - B) + Math.abs(c - C) - 30;
			else
				return inf;
		}

		int ret0 = dfs(n + 1, a, b, c); //バツを選択
		int ret1 = dfs(n + 1, a + l[n], b, c) + 10; //Aを選択
		int ret2 = dfs(n + 1, a, b + l[n], c) + 10; //Bを選択
		int ret3 = dfs(n + 1, a, b, c + l[n]) + 10; //Cを選択

		//４つの中から最小を選ぶ
		return Math.min(ret0, Math.min(ret1, Math.min(ret2, ret3)));
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
