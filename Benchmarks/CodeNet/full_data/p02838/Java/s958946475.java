import java.util.Scanner;

public class Main {
	public static long mod = 1000000000+7;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long ans = 0;
		long count1 = 0;
		long count0 = 0;
		boolean flag = true;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}

		for (int i = 0; i < 100; i++) {
			count1 = 0;
			count0 = 0;
			flag = true;
			for (int j = 0; j < n; j++) {
				long b = a[j];
				if(b != 0) flag = false;
				if((b&1) == 1) count1 += 1;
				else count0 += 1;
				a[j] = b>>1;
			}
			if(flag) break;
			ans += ((count0*count1)%mod)*pow(2,i);
			ans = ans%mod;
		}

		System.out.println(ans%mod);
		sc.close();
	}
	public static final long pow(long x, long n) {
	    long sum = 1;
	    while (n > 0) {
	        if ((n & 1) == 1) {
	            sum = sum * x % mod;
	        }
	        x = x*x%mod;
	        n >>= 1;
	    }
	    return sum;
	}
}