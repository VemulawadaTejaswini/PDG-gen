import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] a = new double[n];
		double[] b = new double[n];
		double[] c = new double[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int idx1 = -1 - Arrays.binarySearch(a, b[i] - 0.1);
			int idx2 = n + 1 + Arrays.binarySearch(c, b[i] + 0.1);
			ans += idx1 * idx2;
		}

		System.out.print(ans);
	}
}