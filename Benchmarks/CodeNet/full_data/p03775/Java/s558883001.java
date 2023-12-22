import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		int minDigit = 11;
		for (long a = 1; a * a <= n; a++) {
			if (n % a == 0) {
				long b = n / a;
				int digit = func("" + a, "" + b);
				if (digit < minDigit) {
					minDigit = digit;
				}
			}
		}

		System.out.println(minDigit);

		sc.close();
	}

	static int func(String a, String b) {
		return Math.max(a.length(), b.length());
	}

}
