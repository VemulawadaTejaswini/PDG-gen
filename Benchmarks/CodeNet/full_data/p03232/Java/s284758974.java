
import java.util.Scanner;

public class Main {
	public static long MOD = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long[] a= new long[n];
		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		long[] revArray = new long[n+1];
		for (int i=0;i<=n;i++) {
			revArray[i]=rev(i);
		}
		long[] sum = new long[n+1];
		for (int i=1;i<=n;i++) {
			sum[i]=sum[i-1]+revArray[i];
		}
		long ans = 0;
		for (int i=0;i<n;i++) {
//			System.out.println(i+" "+(sum[n-i]+sum[i+1]-1));
			ans=(ans+mult(sum[n-i]+sum[i+1]-1,a[i]))%MOD;
		}
		ans = mult(ans,fact(n));
		
		System.out.println(ans);

	}
	static long mult(long n, long m) {
		return ((n%MOD)*(m%MOD))%MOD;
	}
	static long fact (long n) {
		if (n==0) {
			return 1;
		}
		return mult(n,fact(n-1));
	}
	static long power (long n, long m) {
		if (m==0) {
			return 1;
		}
		if (m%2==0) {
			long tmp = power(n,m/2);
			return mult(tmp, tmp);
		}
		return mult(power(n,m-1),n);
	}
	static long rev (long n) {
		return power(n,MOD-2);
	}
}
