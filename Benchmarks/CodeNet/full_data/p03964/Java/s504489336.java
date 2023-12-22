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
		long x = T[0];
		long y = A[0];
		for(int i = 1; i < N; i++) {
			long g = gcd(T[i], A[i]);
			long n1 = T[i] / g;
			long n2 = A[i] / g;
			long k1 = -1;
			long k2 = -1;
			long m = 1;
			while(k1 < 0 || k2 < 0) {
				k1 = n1 * m - x;
				k2 = n2 * m - y;
				m++;
			}
			x += k1;
			y += k2;
			//System.out.printf("%d %d %d %d\n", x, y, k1, k2);
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