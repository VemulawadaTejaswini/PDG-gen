import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);
		int n = sc1.nextInt();
		long[] a = new long[n];
		long temp = 0;

		a[0] = sc1.nextInt();
		temp = a[0];

		for ( int i = 1 ; i < n ; i++ ) {
			a[i] = sc1.nextLong();
			temp = lcm(a[i],temp);
		}

		temp -= 1;
		long ans = 0;
		for ( int i = 0 ; i < n ; i++ ) {
			ans += temp % a[i];
		}

		System.out.println(ans);

		sc1.close();
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
