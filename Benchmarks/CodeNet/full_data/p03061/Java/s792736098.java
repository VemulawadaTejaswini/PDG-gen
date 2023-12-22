import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		if (n == 2) {
			System.out.println(Math.max(a[0], a[1]));
			return;
		}

		int[] gcdi = new int[n];
		int[] gcda = new int[n];
		gcdi[0] = a[1];
		gcdi[1] = a[0];
		gcda[0] = a[0];
		for (int i = 1; i < n; i++) {
			int ai = a[i];
			for (int j = 0; j < i; j++) {
				gcdi[j] = BigInteger.valueOf(gcdi[j]).gcd(BigInteger.valueOf(ai)).intValue();
			}
			gcdi[i] = gcda[i - 1];
			gcda[i] = BigInteger.valueOf(gcda[i - 1]).gcd(BigInteger.valueOf(ai)).intValue();
		}

		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans = Math.max(ans, gcdi[i]);
		}
		System.out.println(ans);
	}
}
