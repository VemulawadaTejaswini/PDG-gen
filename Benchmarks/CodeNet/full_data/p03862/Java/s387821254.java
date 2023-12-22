import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long x = scan.nextLong();
		long[] a = new long[n];
		long b = 0;
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextLong();
		}
		for (int i = 1; i < n; i++) {
			if (a[i-1]+a[i] > x) {
				long c = ((a[i-1]+a[i])-x);
				b += c;
				if (((a[i-1]+a[i])-x) < a[i]) {
					a[i] -= c;
				} else {
					a[i] = 0;
				}
			}
		}
		System.out.println(b);
	}
}
