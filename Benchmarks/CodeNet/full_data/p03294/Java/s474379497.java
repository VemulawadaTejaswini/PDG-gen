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
		long c =  lcm(a[0], a[1]);
		if(N == 2) {
			long ans = (c - 1) % a[0] + (c - 2) % a[1];
			System.out.println(ans);
			System.exit(0);
		}
		for(int i = 2; i < N; i++) {
			c = lcm(c, a[i]);
		}
		long ans = 0;
		for(int i = 0; i < N; i++) {
			ans += (c - 1) % a[i];
		}
		System.out.println(ans);


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