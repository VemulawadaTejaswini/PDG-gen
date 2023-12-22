import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int X = scan.nextInt();
		long[] x = new long[n+1];
		for (int i = 0; i < n; i++) {
			x[i] = scan.nextLong();
		}
		x[n] = X;
		Arrays.sort(x);
		if (x.length == 2) {
			System.out.println(x[1]-x[0]);
			return;
		}
		long[] s = new long[n];
		for (int i = 0; i < n-1; i++) {
			s[i] = x[i+1]-x[i];
		}
		long g = gcd(s[0], s[1]);
		for (int i = 1; i < n-1; i++) {
			g = gcd(g, s[i+1]);
		}
		System.out.println(g);
	}
	public static long gcd(long a, long b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a%b);
	}
}
