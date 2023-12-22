import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		long a = in.nextLong();
		long b = in.nextLong();
		long c = in.nextLong();
		long d = in.nextLong();

		System.out.println(countNonMultiple(b, c, d) - countNonMultiple(a - 1, c, d));

		in.close();
	}

	// 1以上limit以下の範囲でｃ、ｄの倍数でないものの個数を返す
	private static long countNonMultiple(long limit, long c, long d) {

		// cの倍数の個数
		long m_c = limit / c;

		// dの倍数の個数
		long m_d = limit / d;

		// c, dの最大公約数
		long gcd = getGCD(c, d);

		// c,dの最小公倍数
		long lcm = c * d / gcd;

		// lcm の個数
		long m_lcm = limit / lcm;

		return limit - m_c - m_d + m_lcm;
	}

	// 最大公約数を求める
	private static long getGCD(long c, long d) {
		if ( c % d == 0 ) return d;
		else return getGCD(d, c % d);
	}
}
