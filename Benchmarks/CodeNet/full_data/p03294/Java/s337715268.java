import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		long []a = new long[N];
		for(int i = 0; i < N; i++) {
			a[i] = scan.nextLong();
		}
		scan.close();
		if(N >= 2) {
			long ans = 0;
			for(int i = 0; i < N; i++) {
				ans += a[i];
			}
			ans -= N;
			System.out.println(ans);
			System.exit(0);
		}
		long c =  lcm(a[0], a[1]);
		if(N == 2) {
			long ans = (c - 1) % a[0] + (c - 1) % a[1];
			System.out.println(ans);
			System.exit(0);
		}
		for(int i = 2; i < N; i++) {
			c = lcm(c, a[i]);
		}
		long ans1 = 0;
		for(int i = 0; i < N; i++) {
			ans1 += (c - 1) % a[i];
		}

		long ans2 = 0;
		for(int i = 0; i < N; i++) {
			ans2 += (c + 1) % a[i];
		}

		long k = Math.max(ans1, ans2);
		System.out.println(k);


	}
	static long gcd(long a, long b) {
		long v0 = a, v1 = b, v2 = a % b;
		  while (v2 != 0) {
		    v0 = v1;
		    v1 = v2;
		    v2 = v0 % v1;
		  };
		  return v1;
		}

	static	long lcm(long a, long b) {
		  return a * b / gcd(a, b);
		}
}