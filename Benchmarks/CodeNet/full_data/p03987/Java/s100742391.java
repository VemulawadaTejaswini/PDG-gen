import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.TreeSet;

public class Main {
	int N;
	int[] a,b;
	TreeSet<Integer> set;
	public void solve() {
		N = nextInt();
		a = new int[N];
		b = new int[N + 1];
		for(int i = 0;i < N;i++){
			a[i] = nextInt();
			b[a[i]] = i;
		}

		set = new TreeSet<Integer>();

		long ans = 0;

		for(int i = 1;i <= N;i++){
			set.add(b[i]);
			int index = b[i];

			//indexより大きく、最小のインデックスを持つiより小さい要素のインデックス
			Integer right = set.higher(index);
			//indexより小さく、最大のインデックスを持つiより小さい要素のインデックス
			Integer left = set.lower(index);


			if(right == null){
				right = N;
			}
			right = right - index;

			if(left == null){
				left = -1;
			}
			left = index - left;

			ans += (long)right * left * i;
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