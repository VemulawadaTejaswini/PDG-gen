import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long mod = (long) (Math.pow(10.0, 9.0) + 7);
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long k = in.nextInt();
		int a[] = new int[n];

		for ( int i = 0; i < a.length; i++ ) {
			a[i] = in.nextInt();
		}

		long inner = 0; // 内部で成立する転倒数の個数
		long outer = 0; // 他のｎとの関係で成立しうる転倒数の個数
		for ( int i1 = 0; i1 < n; i1++ ) {
			for ( int i2 = 0; i2 < n; i2++ ) {
				if ( a[i1] > a[i2] ) {
					outer++;
					if ( i1 < i2 ) {
						inner++;
					}
				}
			}
		}
		long kk = (k - 1) * k / 2 % mod;
		long ans = (inner * k) % mod + (outer * kk) % mod;
		System.out.println(ans);
		in.close();
	}
}