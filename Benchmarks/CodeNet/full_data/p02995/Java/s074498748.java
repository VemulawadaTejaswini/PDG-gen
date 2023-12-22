
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long A = in.nextLong();
		long B = in.nextLong();
		long C = in.nextLong();
		long D = in.nextLong();
		long cm = (B / C) - ((A - 1) / C);
		long dm = (B / D) - ((A - 1) / D);
		long lcm = C * D / gcd(Math.max(C, D), Math.min(C, D));
		long common = (B / lcm) - ((A - 1) / lcm);
		long ans = (B - (A - 1)) - cm - dm + common;
		System.out.println(ans);
		in.close();
	}

	private static long gcd(long m, long n) {
		long temp;
		while (m % n != 0) {
			temp = n;
			n = m % n;
			m = temp;
		}
		return n;
	}
}