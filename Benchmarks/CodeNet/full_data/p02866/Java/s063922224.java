import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static final Scanner sc = new Scanner(System.in);
	static final long Mod = 998_244_353L;
	int N;

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve(){
		N = nextInt();
		int[] A = nextIntArray(N);
		if(A[0]!=0) {
			out.println(0);
			return;
		}
		Arrays.sort(A);
		boolean f = false;
		int max_i = A[N-1];
		int []numcnt = new int[max_i+1];
		for(int i=0;i<N;i++){
			numcnt[A[i]]++;
			if(numcnt[A[i]] < 1) {
				f = true;
				break;
			}
		}
		if(numcnt[0] > 1 || f) {
			out.println(0);
			return;
		}
		int[] R = new int[max_i+1];
		System.arraycopy(numcnt,0,R,0,numcnt.length);//[3]
		Arrays.sort(R);
		long[] r = new long[max_i+1];
		for(int i=1;i<=max_i;i++) {
			r[i] = R[i]*R[i-1];//combination(R[i],R[i-1]);//R[i]*
			if(R[i-1]>1)R[i]++;
			//out.println(r[i]);
		}
		long sum = 1;
		for(int i=1;i<=max_i;i++) {
			sum *= combination(R[i],R[i-1]);
		}

		if(f) {
			out.println(0);
			return;
		}

	    out.println(sum);

	}

	private long combination(int num1, int num2) {
		if(num1 == num2)return 1;
		int t = Math.max(num1,num2);
		int min = Math.min(num1,num2);
		long sum = t;
		t--;
		while(t > min) {
			sum *= t;
			t--;
		}
		if(sum < 1)sum = 1;
		return sum;
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