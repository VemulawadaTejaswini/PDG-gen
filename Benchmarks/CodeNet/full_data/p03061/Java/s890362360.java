import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		Arrays.setAll(a, i -> sc.nextInt());
		
		int[] l = new int[n];
		int[] r = new int[n];
		
		l[0] = a[0];
		r[n - 1] = a[n - 1];
		for (int i = 1; i < n; i++) {
			l[i] = gcd(l[i - 1], a[i]);
			r[n - 1 - i] = gcd(r[n - i], a[n - 1 - i]);
		}
		
		int max = 0;
		for (int i = 0; i < n; i++) {
			int m;
			if (i == 0) {
				m = r[i + 1];
			} else if (i == n - 1) {
				m = l[i - 1];
			} else {
				m = gcd(l[i - 1], r[i + 1]);
			}
			max = Math.max(max, m);
		}
		System.out.println(max);
	}
	
	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
}
