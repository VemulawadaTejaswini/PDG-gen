import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		long lcm = 1;
		int answer = 0;

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			lcm = lcm(lcm, a[i]);
		}

		for (int i = 0; i < N; i++) {
			answer += (lcm * 2 - 1) % a[i];
		}

		System.out.println(answer);
	}

	private static long lcm(long m, long n) {
	    return m * n / gcd(m, n);
	}

	private static long gcd(long m, long n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
}
