import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		long[] a = new long[n];
		long[] l = new long[n + 1];
		long[] r = new long[n + 1];

		int i;

		for(i = 0; i < n; i++)
			a[i] = scan.nextLong();

		for(i = 1; i <= n; i++) {
			l[i] = gcd(l[i - 1], a[i - 1]);
			r[n - i] = gcd(r[n - i + 1], a[n - i]);
		}

		long[] m = new long[n];

		for(i = 0; i < n; i++) {
			m[i] = gcd(l[i], r[i + 1]);
		}

		long max = Long.MIN_VALUE;

		for(i = 0; i < n; i++)
			max = Math.max(max, m[i]);

		System.out.println(max);

	}
	public static long gcd(long a, long b) {
		if(b == 0)
			return a;

		return gcd(b, a % b);
	}
}
