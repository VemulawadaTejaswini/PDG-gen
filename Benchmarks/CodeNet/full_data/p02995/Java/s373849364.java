import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long A = scan.nextLong() - 1;
		long B = scan.nextLong();
		long C = scan.nextLong();
		long D = scan.nextLong();

		long tmp = (C * D) / gcd(C, D);
		long n = ((B - (B / C + B / D)) + (B / tmp));
		long m = ((A - (A / C + A / D)) + (A / tmp));

		System.out.println(n - m);
	}

	static long gcd(long a, long b) {
		if (b == 0) {
			return a;
		}
		a = a % b;
		return gcd(b, a);
	}
}