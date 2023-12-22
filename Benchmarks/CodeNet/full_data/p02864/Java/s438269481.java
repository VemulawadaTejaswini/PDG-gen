//check violation of constraints

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.NoSuchElementException;

public class Main {

	void run(int N, int K, long[] H) {
		HashSet<Long> set = new HashSet<>();
		HashMap<Long, Integer> map = new HashMap<>();
		for (long h : H) {
			set.add(h);
		}
		set.add(0L);
		long[] hs = new long[set.size()];
		int p = 0;
		for (long h : set) {
			hs[p++] = h;
		}
		Arrays.sort(hs);
		for (int i = 0; i < hs.length; ++i)
			map.put(hs[i], i);
		long[][][] dp = new long[N + 1][set.size()][K + 1];
		for (int i = 0; i < N; ++i)
			for (int j = 0; j < set.size(); ++j)
				for (int k = 0; k <= K; ++k)
					dp[i][j][k] = Long.MAX_VALUE / 3;
		dp[0][map.get(H[0])][0] = H[0];
		for (int j = 0; j < set.size() && 1 <= K; ++j) {
			dp[0][j][1] = Math.min(dp[0][j][1], hs[j]);
		}
		for (int i = 1; i < N; ++i) {
			// Kを使用
			int me = map.get(H[i]);
			for (int k = 0; k + 1 <= K; ++k) {
				int mi = 0;
				for (int j = 0; j < set.size(); ++j) {
					if (dp[i - 1][mi][k] + Math.max(0, hs[j] - hs[mi]) >= dp[i - 1][j][k])
						mi = j;
					dp[i][j][k + 1] = Math.min(dp[i][j][k + 1], dp[i - 1][mi][k] + Math.max(0, hs[j] - hs[mi]));
				}
			}
			// Kを使用しない
			for (int k = 0; k <= K; ++k) {
				for (int j = 0; j < set.size(); ++j) {
					dp[i][me][k] = Math.min(dp[i][me][k], dp[i - 1][j][k] + Math.max(0, hs[me] - hs[j]));
				}
			}
		}
		long ans = Long.MAX_VALUE / 3;
		for (int k = 0; k <= K; ++k) {
			for (int j = 0; j < set.size(); ++j) {
				ans = Math.min(ans, dp[N - 1][j][k]);
			}
		}
		System.out.println(ans);
	}

	public static void main(String[] args) throws FileNotFoundException {
		FastScanner sc = new FastScanner();
		int N = sc.nextInt();
		int K = sc.nextInt();
		long[] H = new long[N];
		for (int i = 0; i < N; ++i)
			H[i] = sc.nextLong();
		new Main().run(N, K, H);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
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
