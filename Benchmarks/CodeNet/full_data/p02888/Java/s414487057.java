import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static final Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	int[] L;
	int N;
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		N = nextInt(); // N本の棒
		L = nextIntArray(N); // 棒の長さ

		Arrays.sort(L);
		long cnt = 0;
		for(int i=0;i<N-2;i++) {
			for(int j=i+1;j<N-1;j++) {

				int ab = L[i]+L[j];
				int c_i = Search(j+1,ab)-1;
				if(ab <= L[c_i])continue;
				cnt += (c_i-j);

			}
		}
		out.println(cnt);
	}

	//二部探索
	public int Search(int _l, int k) {
		int l = -1+_l;
		int r = N;
		while(r - l > 1) {
			int mid = (r + l) / 2;
			if(L[mid] >= k) r = mid;
			else l = mid;
		}
		return r;
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