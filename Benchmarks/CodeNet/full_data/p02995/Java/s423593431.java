import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong() - 1;
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		sc.close();

		long ac = a / c;
		long ad = a / d;
		long acd = a / lcm(c, d);
		long aa = (a - ac) + (a - ad) - (a - acd);

		long bc = b / c;
		long bd = b / d;
		long bcd = b / lcm(c, d);
		long bb = (b - bc) + (b - bd) - (b - bcd);

		System.out.println(bb - aa);
	}

	static long lcm(long x, long y) {
		return x * y / BigInteger.valueOf(x).gcd(BigInteger.valueOf(y)).longValue();
	}
}
