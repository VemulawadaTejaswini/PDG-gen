import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		long ans = 0;
		long mod = 1000000007;
		long mod2 = 1000000005;

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] substr = str.split(" ", 0);

		int n = Integer.parseInt(substr[0]);
		int a = Integer.parseInt(substr[1]);
		int b = Integer.parseInt(substr[2]);

		scan.close();
		ans = modPow(2, n, mod) -1;
		ans = ans - conviModPow2(n, a, b, mod, mod2);
		if (ans < 0) {
			ans += mod;
		}
		if (ans < 0) {
			ans += mod;
		}
		if (ans > mod) {
			ans = ans % mod;
		}
		System.out.println(ans);
	}

	static public long conviModPow2(int n, int a, int b, long mod, long mod2)
	{
		long m1 = factorialModPow(a, mod, mod2);
		long m3 = m1 * factorialModPowN2A(b, b-a, mod, mod2) % mod;

		long m2 = factorialModN2A(n, a, mod);
		long m4 = m2 * factorialModN2A(n-a, b-a, mod) % mod;

		m2 = (m1 * m2) % mod;
		m4 = (m3 * m4) % mod;

		return m2+m4;
	}

	static long factorialModN2A (int n, int a, long mod) {
		long[] ar = new long[a];
		for (int i=0; i<a; i++) {
			ar[i] = (long)(n-a+i+1);
		}
		int t = 1;
		int length = ar.length;
		while (t <= length) {
			for (int i=0; i<length; i+=(t<<1)) {
				if (t+i < length) {
					ar[i] = ar[i] * ar[i+t] % mod;
				}
			}
			t = t<<1;
		}
		return ar[0];
	}


	static long factorialModPowN2A (int n, int a, long mod, long mod2) {
		long[] ar = new long[a];
		for (int i=0; i<a; i++) {
			ar[i] = modPow(n-a+i+1, mod2, mod);
		}
		int t = 1;
		int length = ar.length;
		while (t <= length) {
			for (int i=0; i<length; i+=(t<<1)) {
				if (t+i < length) {
					ar[i] = ar[i] * ar[i+t] % mod;
				}
			}
			t = t<<1;
		}
		return ar[0];
	}

	static long factorialModPow (int n, long mod, long mod2) {
		long [] ar = new long[n];
		for (int i=0; i<n; i++) {
			ar[i] = modPow(i+1, mod2, mod);
		}
		int t = 1;
		int length = ar.length;
		while (t <= length) {
			for (int i=0; i<length; i+=(t<<1)) {
				if (t+i < length) {
					ar[i] = ar[i] * ar[i+t] % mod;
				}
			}
			t = t<<1;
		}
		return ar[0];
	}

	public static final long modPow(long x, long n, final long mod) {
	    long sum = 1;
	    while (n > 0) {
	        if ((n & 1) == 1) {
	            sum = sum * x % mod;
	        }
	        x = x * x % mod;
	        n >>= 1;
	    }
	    return sum;
	}
}
