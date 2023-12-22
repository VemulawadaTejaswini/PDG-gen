import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(), n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i< n;i++) {
			a[i] = sc.nextInt();
		}
		long r = 0;
		int d = 0;
		for (int i=0;i+1<n;i++) {
			d = Math.max(a[i+1] - a[i], d);
		}
		if (a[0] == 0) {
			a[0] = k;
		}
		d = Math.max(d, Math.abs(a[n-1] - a[0]));
		System.out.println(k - d);
	}
}
