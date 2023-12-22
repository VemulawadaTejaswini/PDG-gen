import java.io.PrintStream;
import java.util.Scanner;

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
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0;i<N;i++)A[i]=nextInt();
		int max_num = Math.max(A[0],A[1]);//一番大きい値
		int max_i = A[0]>=A[1]?0:1;//一番大きい数値のindex
		int second_max = Math.min(A[0],A[1]);//二番目に大きい値
		for(int i=2;i<N;i++) {
			if(A[i]>=max_num) {
				second_max = max_num;
				max_num = A[i];
				max_i=i;
			}else if(A[i]>second_max) {
				second_max = A[i];
			}
		}

		StringBuilder buf = new StringBuilder();
		for(int i=0;i<max_i;i++) {
			//out.println(max_num);
			buf.append(max_num+System.getProperty("line.separator"));
		}
		//out.println(second_max);
		buf.append(second_max+System.getProperty("line.separator"));
		for(int i=max_i+1;i<N;i++) {
			//out.println(max_num);
			buf.append(max_num+System.getProperty("line.separator"));
		}

		String res = buf.toString();
		System.out.println(res);
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