import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static final Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	int X,Y;

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		X = nextInt();
		Y = nextInt();

		int a = 0,b = 0;
		if(X == 3)a = 100000;
		else if(X == 2) a = 200000;
		else if(X == 1) a = 300000;

		if(Y == 3)b = 100000;
		else if(Y == 2) b = 200000;
		else if(Y == 1) b = 300000;

		int sum = a + b;
		if(X == 1 && Y == 1)sum += 400000;

		out.println(sum);
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