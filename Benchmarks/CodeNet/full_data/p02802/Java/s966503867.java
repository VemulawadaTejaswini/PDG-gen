import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static final Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	int N,M;

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		N = nextInt();
		M = nextInt();

		String [][]A = new String[M][2];
		for(int i = 0; i < M; i++) {
			A[i][0] = next();
			A[i][1] = next();
		}

		int[] waCnt = new int[N+1];
		int[] acFlag = new int[N+1];
		for(int i=0;i<M;i++) {
			int index = Integer.parseInt(A[i][0]);
			if(acFlag[index] == 1)continue;

			if(A[i][1].equals("AC")) {
				acFlag[index] = 1;
			}else if(A[i][1].equals("WA")){
				waCnt[index]++;
			}
		}
		int acSum = 0;
		int waSum = 0;
		for(int i=0;i<N+1;i++) {
			acSum += acFlag[i]==1?1:0;
			waSum += acFlag[i]==1?waCnt[i]:0;
		}

		out.println(acSum + " " + waSum);
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