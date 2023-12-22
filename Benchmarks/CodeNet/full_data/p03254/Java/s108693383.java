import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long x = scan.nextLong();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextLong();
		}
		long ans = 0;
		int b = 0;
		Arrays.sort(a);
		for (int i = 0; i < n; i++) {
			x = x-a[i];
			if (x < 0) {
				b = i;
				break;
			}
		}
		if (x > 0) {
			ans = n-1;
			System.out.println(ans);
			return;
		}
		else if (x == 0) {
			ans = n;
			System.out.println(ans);
			return;
		}
		else {
			ans = b;
			System.out.println(ans);
			return;
		}
	}
}
