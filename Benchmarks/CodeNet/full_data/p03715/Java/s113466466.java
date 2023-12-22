import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {

	int H,W;

	public void solve() {
		H = nextInt();
		W = nextInt();

		if(H % 3 == 0 || W % 3 == 0){
			out.println(0);
			return;
		}


		if(H > W){
			int tmp = H;
			H = W;
			W = tmp;
		}

		long ans = Long.MAX_VALUE;

		for(int i = 1;i <= W;i++){

			long one = (long)i * H;
			long two = (long)(W - i) * (H / 2);
			long three = (long)H * W - one - two;

			long max = Math.max(one,Math.max(two,three));
			long min = Math.min(one,Math.min(two,three));
			ans = Math.min(ans, max - min);
		}

		for(int i = 1;i <= H;i++){

			long one = (long)i * W;
			long two = (long)(H - i) * (W / 2);
			long three = (long)H * W - one - two;

			long max = Math.max(one,Math.max(two,three));
			long min = Math.min(one,Math.min(two,three));
			ans = Math.min(ans, max - min);
		}

		out.println(ans);

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