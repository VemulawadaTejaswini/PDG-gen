import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
	int N;
	int[] A;

	public void solve() {
		N = nextInt();
		A = new int[N];

		for(int i = 0;i < N;i++){
			A[i] = nextInt();
		}

		int max = 1;
		int ans = (A[0] - 1);//最初の要素を1にし、A[0] - 1をカウント

		for(int i = 1;i < N;i++){
			if(A[i] > max + 1){
				//A[i] - 1は1は残さないといけないため
				//1以上を残してmax+1ずつ減らしていく
				ans += (A[i] - 1) / (max + 1);
			}else if(A[i] == max + 1){
				//A[i]はmax+1で減らすと0になってしまうので、スルー
				//次の要素からはmax = A[i] + 1にしないといけない
				max++;
			}
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