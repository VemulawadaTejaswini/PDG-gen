import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
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

	List<Long> list = new ArrayList<Long>();
	void solve() {
		long A = nextLong();
		long B = nextLong();


		long gcd = gcd(A,B);
		int sum = 1;
		if(gcd % 2 == 0)sum++;
		for(int i=3;i<=gcd/2;i+=2){
			int k=0;
			for(int j=3;j<=Math.sqrt(i);j+=2){
				if(i%j==0){
					k=1;
					break;
				}
			}

			if(k==0 && gcd%i == 0) sum++;
		}
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