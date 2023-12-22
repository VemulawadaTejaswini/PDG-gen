import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		long k2 = k;
		long pn = n;
		while (n > 1) {
			n = Math.abs(n % k);
			if (pn <= n) {
				break;
			}
			if (k > n) {
				long tmp = n;
				n = k;
				k = tmp;
				if (k <= 0) {
					break;
				}
			}
			pn = n;
		}
		n %= k2;
		System.out.println(n);
	}
}
