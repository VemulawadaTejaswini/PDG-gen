
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

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
		int n = nextInt();
		int m = nextInt();
		long[] A = nextLongArray(n);
		long[][] BC = new long[m][2];

		for(int i=0;i<m;i++) {
			BC[i][0]=nextLong();
			BC[i][1]=nextLong();
		}
		Arrays.sort(BC,(a1,a2)->Long.compare(a1[1],a2[1]));
		Arrays.sort(A);

		int ti = 0;
		for(int i=m-1;i>=0;i--) {
			long B = BC[i][0];
			long C = BC[i][1];
			for(int j=0;j<B&&ti<n;j++) {
				if(C>A[ti]) {
					A[ti]=C;
					ti++;
				}else {
					break;
				}
			}
		}
		long sum = 0;
		for(long a:A)sum+=a;
		out.println(sum);
	}

	private static int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)a[i] = nextInt();
		return a;
	}
	private static long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)a[i] = nextLong();
		return a;
	}
	private static int nextInt() {
		return Integer.parseInt(next());
	}
	private static long nextLong() {
		return Long.parseLong(next());
	}
	private static String next() {
		return sc.next();
	}

}
