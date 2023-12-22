import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {

	int N;
	int[] C,S,F;

	private void solve(){
		N = nextInt();
		C = new int[N];
		S = new int[N];
		F = new int[N];
		for(int i = 0;i < N-1;i++) {
			C[i] = nextInt();
			S[i] = nextInt();
			F[i] = nextInt();
		}

		for(int i = 0;i < N - 1;i++) {
			int ans = S[i];
			for(int j = i;j < N - 1;j++) {
				if (ans <= S[j]) {
					ans = S[j];
				}
				if (ans % F[j] != 0) {
					ans += F[j] - ans % F[j];
				}
				ans += C[j];
			}

			out.println(ans);
		}

		out.println(0);
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

	private boolean hasNext() {
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

	private String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = -1;
		while (isPrint((b = nextByte()))) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}

	private int nextInt() {
		return Integer.parseInt(next());
	}

	private long nextLong() {
		return Long.parseLong(next());
	}

	private double nextDouble() {
		return Double.parseDouble(next());
	}
}