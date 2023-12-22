import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
	int N,M;
	int[] a,b,c,d;
	public void solve() {
		N = nextInt();
		M = nextInt();
		a = new int[N];
		b = new int[N];
		for(int i = 0;i < N;i++){
			a[i] = nextInt();
			b[i] = nextInt();
		}
		c = new int[M];
		d = new int[M];
		for(int i = 0;i < M;i++){
			c[i] = nextInt();
			d[i] = nextInt();
		}

		for(int i = 0;i < N;i++){
			int min = (int)1e9+7;
			int ans = -1;
			for(int j = 0;j < M;j++){
				if(min > Math.abs(a[i]-c[j]) + Math.abs(b[i]-d[j])){
					min = Math.abs(a[i] - c[j]) + Math.abs(b[i]-d[j]);
					ans = j;
				}
			}

			out.println(ans+1);
		}
	}

	public static void main(String[] args) {
		out.flush();
		new Main().solve();
		out.close();
	}

	/* Input */
	private static final InputStream in = System.in;
	private static final PrintWriter out = new PrintWriter(System.out);
	private final byte[] buffer = new byte[2048];
	private int p = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (p < buflen)
			return true;
		p = 0;
		try {
			buflen = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (buflen <= 0)
			return false;
		return true;
	}

	public boolean hasNext() {
		while (hasNextByte() && !isPrint(buffer[p])) {
			p++;
		}
		return hasNextByte();
	}

	private boolean isPrint(int ch) {
		if (ch >= '!' && ch <= '~')
			return true;
		return false;
	}

	private int nextByte() {
		if (!hasNextByte())
			return -1;
		return buffer[p++];
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = -1;
		while (isPrint((b = nextByte()))) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}