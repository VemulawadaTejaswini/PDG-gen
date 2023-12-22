import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static final PrintStream out = System.out;
	static Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		int N = nextInt();
		long K = nextLong();
		int[] A = new int[N];
		long sum = 0;
		for(int i=0;i<N;i++) {
			A[i] = nextInt();
			sum+=A[i];
		}

		Set<Long> candidates = new HashSet<>();

		for(int i=1;i*i<=sum;i++) {
			if(sum%i==0) {
				candidates.add((long) i);
				candidates.add((long) sum/i);
			}
		}
		long ans = 1;
		for(long x:candidates) {
			long need;
			{ // calc need
				long[] r = new long[N];
				for(int i=0;i<N;i++)r[i] = A[i]%x;
				Arrays.sort(r);
				long tot = 0;
				for(int i=0;i<N;i++)tot += r[i];
				int l = (int) (N -tot/x);
				need = 0;
				for(int i=0;i<l;i++) need += r[i];
			}
			if(need<=K)ans = Math.max(ans, x);
		}

		out.println(ans);

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

}