import java.util.*;
public class Main {
	static final int N = 1000000;
	public static void main(String[] args) {
//		boolean[] sieve = new boolean[N+1];
//		Arrays.fill(sieve, true);
//		for(long i = 2; i <= N; i++) {
//			if(sieve[(int)i]) {
//				for(long j = i*i; j <= N; j += i) {
//					sieve[(int)j] = false;
//				}
//			}
//		}
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long g = gcd(a, b);
		if(g == 1) {
			System.out.println(1);
		}
		else {
			int res = 0;
			for(long i = 2; i*i <= g; i++) {
				if(g % i == 0) {
					res++;
					while(g % i == 0) g /= i;
				}
			}
			if(g > 1) res++;
			System.out.println(res+1);
		}
	}
//	static boolean isPrime(long k) {
//		for(long i = 2; i*i <= k; i++) {
//			if(k % i == 0) return false;
//		}
//		return true;
//	}
	static long gcd(long a, long b) {
		if(a < b) return gcd(b, a);
		else if(b == 0) return a;
		else return gcd(b, a % b);
	}
}
