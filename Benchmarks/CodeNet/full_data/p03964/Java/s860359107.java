import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[]T = new long[N];
		long[]A = new long[N];
		for(int i = 0; i < N; i++) {
			T[i] = sc.nextLong();
			A[i] = sc.nextLong();
		}
		sc.close();
		long k = gcd(T[0], A[0]);
		long x = T[0] / k;
		long y = A[0] / k;
		for(int i = 1; i < N; i++) {
			long g = gcd(T[i], A[i]);
			long n1 = T[i] / g;
			long n2 = A[i] / g;
			long k1 = n2 - x;
			long k2 = n1 - y;
			if(k1 == 0 && k2 == 0) continue;
			long m = 1;
			long l = 0;
			long r = 1000000000000l;
			long mid = 0;
			while(Math.abs(r - l) > 1) {
				mid = (r + l) / 2;
				k1 = n1 * mid - x;
				k2 = n2 * mid - y;
				if(k1 == 0 && k2 == 0) {
					//System.out.println("a");
					break;
				}
				if(k1 >= 0 && k2 >= 0) {
					r = mid;
				}else {
					l = mid;
				}
			}
//			while(k1 < 0 || k2 < 0) {
//				k1 = n2 * m - x;
//				k2 = n1 * m - y;
//				m++;
//			}
			if(k1 < 0 || k2 < 0) {
				mid++;
			}
			k1 = n1 * mid - x;
			k2 = n2 * mid - y;
			x += k1;
			y += k2;
			//System.out.printf("%d %d %d %d %d \n", x, y, k1, k2, mid);
		}
		long ans = x + y;
		System.out.println(ans);
	}
	static long gcd(long n, long m) {
		if(n > m) {
			return gcd(m, n);
		}
		long k = m % n;
		if(k == 0) {
			return n;
		}else {
			return gcd(n, k);
		}
	}
}