import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static final Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	int N;
	long K;
	int []A;
	Integer[] F;
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		N = nextInt();
		K = nextLong();
		A = new int[N];
		long S = 0;
		for (int i=0;i<N;i++) {
			A[i] = nextInt();
			S+=A[i];
		}
		F = new Integer [N];
		for (int i=0;i<N;i++) {
			F[i] = nextInt();
		}
		if(S<=K) {
			out.println(0);
			return;
		}

		Arrays.sort(A);
		Arrays.sort(F, Collections.reverseOrder());
		long mi = 1L<<60;

		for(int i=59;i>=0;i--) {
			if(ok(mi-(1L<<i))) mi-=1L<<i;
		}
		out.println(mi);
	}

	boolean ok(long v) {
		long sum=0;
		for(int i=0;i<N;i++) {
			long ma=v/F[i];
			if(ma<A[i]) sum+=A[i]-ma;
			if(sum>K) return false;
		}
		return true;
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