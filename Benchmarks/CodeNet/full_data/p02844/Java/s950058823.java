import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static final Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		int N = nextInt();
		String S = next();
		char[] C = S.toCharArray();
		int cnt = 0;
		for(int i=0;i<1000;i++) {
			String s = String.valueOf(i);
			if(i < 100) {
				s = "0" + s;
				if(i < 10) {
					s = "0" + s;
				}
			}

			char[] c = s.toCharArray();
			int ci = 0;
			for(int j=0;j<N&&ci<3;j++) {
				if(c[ci] == C[j]) {
					ci++;
				}
			}
			if(ci == 3)cnt++;
		}
		out.println(cnt);

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
}