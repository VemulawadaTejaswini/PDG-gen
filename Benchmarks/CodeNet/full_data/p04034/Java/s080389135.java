import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	FastScanner sc;

	int N;
	int M;
	int[] boxes;
	boolean[] isRed;
	void run() {
		sc = new FastScanner();
		
		N = sc.nextInt();
		M = sc.nextInt();
		isRed = new boolean[N];
		
		isRed[0] = true;
		boxes = new int[N];
		for (int i = 0; i < N; i++) {
			boxes[i] = 1;
		}
		for (int i = 0; i < M; i++) {
			int now = sc.nextInt()-1;
			int next = sc.nextInt()-1;
			
			if (isRed[now]) {
				isRed[next] = true;
			}
			boxes[now] = boxes[now] - 1;
			boxes[next] = boxes[next] + 1;
			
			if (boxes[now] == 0) {
				isRed[now] = false;
			}
			
		}
		int ans  =0 ;
		for (int i = 0; i < N; i++) {
			if (isRed[i]) {
				ans++;
			}
		}
		
		System.out.println(ans);
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