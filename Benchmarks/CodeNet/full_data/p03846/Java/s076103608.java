import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		long ans = 1;
		final long mod = 1000000007;
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		Arrays.sort(a);
		if (n%2 != 0 && a[0] != 0) {
			System.out.println(0);
			return;
		} else {
			for (int i = n-1; i > 0; i-=2) {
				if (a[i] != a[i-1]) {
					System.out.println(0);
					return;
				}
			}
		}
		for (int i = 0; i < n/2; i++) {
			ans = ans*2%mod;
		}
		System.out.println(ans);
	}
}
