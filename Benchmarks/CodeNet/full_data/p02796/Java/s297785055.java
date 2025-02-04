import java.util.*;
import java.io.*;

class Robo{
	int l, r;

	public Robo(int l, int r) {
		super();
		this.l = l;
		this.r = r;
	}
}

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt();
		Robo[] robo = new Robo[n];
		for(int i=0;i<n;i++) {
			int x = fs.nextInt();//x
			int L = fs.nextInt();//L
			robo[i] = new Robo(x-L,x+L);
		}
		Arrays.sort(robo, (r1,r2)->r1.r - r2.r); //終端でソート
		//右が小さいものから取っていく。
		long INF = Long.MAX_VALUE / 2;
		long memo = -INF;
		int cnt = 0;
		for(int i=0;i<n;i++) {
			Robo now = robo[i];
			if(now.l>=memo) {
				memo = now.r;
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}

//高速なScanner
class FastScanner {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScanner(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}
}