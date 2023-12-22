import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static final Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	int N;

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		N = nextInt();

		int[][] Acnts = new int[10][10];
		int[][] Bcnts = new int[10][10];

		for(int i=1;i<=N;i++) {
			if(i % 10 == 0)continue;

			int digit = stringSize(i);
			int first = i/(int)Math.pow(10, (digit-1));
			int end = i%10;
			Acnts[first][end]++;
			Bcnts[end][first]++;
		}

		long cnt = 0;
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				cnt += Acnts[i][j] * Bcnts[i][j];
			}
		}

		out.println(cnt);
	}

	private final int[] sizeTable = {
	        9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, Integer.MAX_VALUE
	};

	public int stringSize(int x) {
	    for (int i = 0;; i++)
	        if (x <= sizeTable[i])
	            return i + 1;
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)a[i] = nextInt();
		return a;
	}
	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)a[i] = nextLong();
		return a;
	}
	public int nextInt() {
		return Integer.parseInt(next());
	}
	public long nextLong() {
		return Long.parseLong(next());
	}
	public String next() {
		return sc.next();
	}

	long gcd(long m,long n) {
		if (m<n) return gcd(n,m);
		if (n==0)return m;
		return gcd(n,m%n);
	}

	long lcm(long m, long n) {
	        return m * n / gcd(m, n);
	}
}