import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[]T = new long[N];
		for(int i = 0; i < N; i++) {
			T[i] = sc.nextLong();
		}
		sc.close();
		if(N == 1) {
			System.out.println(T[0]);
			System.exit(0);
		}
		long l = lcm(T[0], T[1]);
		for(int i = 1; i < N; i++) {
			l = lcm(l, T[i]);
		}
		System.out.println(l);
	}
	static long gcd(long m, long n) {
		if(m < n) return gcd(n, m);
		if(n == 0) return m;
		return gcd(n, m % n);
	}
	static long lcm(long n, long m) {
		return n / gcd(n, m) * m;
	}
}