import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	private void solve() {
		int n = nextInt();
		long[]a = new long [n];
		for(int i=0;i<n;i++)a[i]=nextLong();
		long[] L = new long[n+1];
		long[] R = new long[n+1];
		long[] res = new long[n];

		for (int i=0;i<n;i++)L[i+1]=gcd(L[i],a[i]);
		for (int i=n;i>0;i--)R[i-1]=gcd(R[i],a[i-1]);
		for (int i=0;i<n;i++)res[i]=gcd(L[i],R[i+1]);
		Arrays.sort(res);
		System.out.println(res[n-1]);
	}

	static long gcd(long m,long n) {
		if (m<n) return gcd(n,m);
		if (n==0)return m;
		return gcd(n,m%n);
	}
}