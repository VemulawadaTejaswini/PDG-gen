import java.io.PrintStream;
import java.util.Arrays;
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
		int [][]XL = new int[N][2];
		for(int i=0;i<N;i++) {
			XL[i][0] = nextInt();
			XL[i][1] = nextInt();
		}
		Arrays.sort(XL,(a1,a2)->MyComparator(a1[0],a2[0],a1[1],a2[1]));

		int before_i = 0;
		int rmCnt = 0;

		for(int i=1;i<N;i++) {
			if(XL[before_i][0]+XL[before_i][1]<=XL[i][0]-XL[i][1]) {
				before_i = i;
			}else
			if(XL[before_i][0]+XL[before_i][1]>=XL[i][0]+XL[i][1]) {
				before_i = i;
				rmCnt++;
			}else {
				rmCnt++;
			}
		}
		out.println(N-rmCnt);
	}

	private int MyComparator(int a1, int a2,int b1,int b2) {
		if(a1 > a2) return 1;
		else if(a1 < a2) return -1;
		if(b1 > b2) return 1;
		else if(b1 < b2) return -1;
		return 0;
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