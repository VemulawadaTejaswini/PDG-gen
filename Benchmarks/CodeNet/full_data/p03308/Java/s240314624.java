import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		long max = 0;
		int m = 1;
		for (int i = 1; i < n; i++) {
			m = m*i;
		}
		long[] abs = new long[m];
		int o = 0;
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
					abs[o] = Math.abs(a[i] -a[j]);
					o++;
			}
		}
		for (int i = 0; i < m; i++) {
			if (abs[i] > max) {
				max = abs[i];
			}
		}
		System.out.println(max);
	}
}
