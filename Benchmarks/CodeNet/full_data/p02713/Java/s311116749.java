import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		sc.close();

		long ans = 0;
		for (int a = 1; a <= k; a++) {
			for (int b = 1; b <= k; b++) {
				int gcd1 = gcd(a, b);
				for (int c = 1; c <= k; c++) {
					int gcd2 = gcd(gcd1, c);
					ans += gcd2;
				}
			}
		}
		System.out.println(ans);
	}

	static int gcd(int a, long b) {
		return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
	}
}
