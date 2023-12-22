import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long ans = 0;
		Long[] t = new Long[n];
		for (int i = 0; i < n; i++) {
			t[i] = scan.nextLong();
		}
		Arrays.sort(t, Comparator.reverseOrder());
		ans = lcm(t[0], t[1]);
		for (int i = 2; i < n; i++) {
			ans = lcm(ans, t[i]);
		}
		System.out.println(ans);
	}
	public static long gcd(long a, long b) {
		long temp;
		while (a % b != 0) {
			temp = b;
			b = a % b;
			a = temp;
		}
		return b;
	}
	public static long lcm(long a, long b) {
		long g = gcd(a, b);
		return a / g * b;
	}
}
